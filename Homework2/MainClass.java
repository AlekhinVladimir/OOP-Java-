package Homework2;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random rand = new Random();

        Cat cat1 = new Cat("Cat1", rand.nextInt(10, 20));
        Cat cat2 = new Cat("Cat2", rand.nextInt(10, 20));
        Cat cat3 = new Cat("Cat3", rand.nextInt(10, 20));
        Cat cat4 = new Cat("Cat4", rand.nextInt(10, 20));
        Cat cat5 = new Cat("Cat5", rand.nextInt(10, 20));

        Plate plate = new Plate(rand.nextInt(50, 100));
        
        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };
        System.out.print("Start ");
        plate.info();
        for (Cat cat : cats) {
            if (plate.getFood() > cat.getAppetite()) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.printf("%s eating %d foods\n\n", cat.getName(), cat.eat());
                cat.setSatiety(true);
                plate.info();
            }
            else if (rand.nextBoolean()){
                plate.addFood(cat.getAppetite() - plate.getFood());
                System.out.printf("%s eating %d foods\n\n", cat.getName(), cat.eat());
                cat.setSatiety(true);
                plate.setFood(plate.getFood() - cat.getAppetite());
                plate.info();
            }
            
        }
        System.out.println("---------------------------");
        for (Cat cat : cats) {
            System.out.printf("%s satiety is %b\n", cat.getName(), cat.isSatiety());
        }
    }
}

// Ну и главный метод программы, тестирование наших классов.
// Создадим несколько животных, наполним миску едой и попытаемся по очереди покормить животных.

// public static void main(String[] args) {

//     // Создаем котов
//     Cat[] cats = {
//                     new Cat("Барсик", 10),
//                     new Cat("Мурзик", 15),
//                     new Cat("Персик", 12),
//                     new Cat("Борис", 14)
//     };

//     // Создаем тарелку и наполняем ее едой
//     Plate plate = new Plate();
//     plate.putFood(35);

//     System.out.println("***");

//     // Кормим котов
//     for (Cat c : cats) {
//             c.eat(plate);
//     }

//     System.out.println("***");

//     // Результаты кормления
//     for (Cat c : cats) {
//             System.out.println("Кот " + c.getName() + " сытость: " + c.isSatiety());
//     }
// }
// А вот и сам результат:

// Добавлено 35 еды в тарелку, теперь в тарелке 35 еды
// ***
// Удалено 10 еды из тарелки, теперь в тарелке 25 еды
// Барсик покушал в соответствии со своим аппетитом 10
// Удалено 15 еды из тарелки, теперь в тарелке 10 еды
// Мурзик покушал в соответствии со своим аппетитом 15
// Недостаточно еды для ее удаления
// Персик не будет есть эти крошки. Еды не хватило.
// Недостаточно еды для ее удаления
// Борис не будет есть эти крошки. Еды не хватило.
// ***
// Кот Барсик сытость: true
// Кот Мурзик сытость: true
// Кот Персик сытость: false
// Кот Борис сытость: false