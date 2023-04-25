package Homework2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.printf("plate: %d\n\n",food);
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void addFood(int add) {
        this.food += add;
        System.out.printf("!!!Add %d foods\n\n", add);
    }
}
// Итак, базовый класс для тарелки с едой.
// Тут нам необходимо разработать два метода для добавления еды и для удаления еды (при кормлении животного)

// /**
// * Тарелка с едой
// */
// public class Plate {

//     private int food;

//     /**
//      * Добавление еды в тарелку
//      * @param amount  - кол-во еды (в условных единицах)
//      */
//     public void putFood(int amount) {
//             this.food += amount;
//             System.out.printf("Добавлено %d еды в тарелку, теперь в тарелке %d еды\n", amount, food);
//     }

//     /**
//      * Удаление еды из тарелки
//      * @param amount - кол-во еды (в условных единицах)
//      * @return - если в тарелке, после удаления, остается достаточно еды, возвращаем результат операции true,
//      * в противном случае, не удаляем еду, возвращаем результат операции false
//      */
//     public boolean decreaseFood(int amount) {
//             if (this.food < amount) {
//                     System.out.println("Недостаточно еды для ее удаления");
//                     return false;
//             }
//             this.food -= amount;
//             System.out.printf("Удалено %d еды из тарелки, теперь в тарелке %d еды\n", amount, food);
//             return true;
//     }

// }