package Homework2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public int eat() {
        return appetite;
     }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
// Тут, основная идея, в метод eat передать экземпляр тарелки с едой и фактически расписать алгоритм кормления животного:

// /**
// * Кот
// */
// public class Cat {

//     //#region Fields

//     /**
//      * Кличка
//      */
//     private String name;

//     /**
//      * Аппетит
//      */
//     private int appetite;

//     /**
//      * Сытость
//      */
//     private boolean satiety;

//     //#endregion

//     //#region Constructors

//     /**
//      *
//      * @param name - кличка кота
//      */
//     public Cat(String name) {
//             this.name = name;
//             this.satiety = false;
//     }

//     /**
//      *
//      * @param name - кличка кота
//      * @param appetite - сытость
//      */
//     public Cat(String name, int appetite) {
//             this.name = name;
//             this.appetite = appetite;
//             this.satiety = false;
//     }

//     //#endregion


//     /**
//      * Покормить кота
//      * @param plate - тарелка с едой
//      */
//     public void eat(Plate plate) {
//             // Удаляем еду из миски в соответствии с аппетитом кота
//             if (plate.decreaseFood(this.appetite)) { // Еды оказалось достаточно
//                     System.out.println(this.name + " покушал в соответствии со своим аппетитом " + this.appetite);
//                     // Кот насытился
//                     this.satiety = true;
//             } else { // Еды оказалось недостаточно
//                     // п.4 Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
//                     // то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//                     System.out.println(this.name + " не будет есть эти крошки. Еды не хватило.");
//             }
//     }

//     /**
//      * Вернуть кличку кота
//      * @return - кличка кота
//      */
//     public String getName() {
//             return name;
//     }

//     /**
//      * Установить кличку кота
//      * @param name - кличка кота
//      */
//     public void setName(String name) {
//             this.name = name;
//     }

//     /**
//      * Вернуть признак сытости кота
//      * @return - сытость
//      */
//     public boolean isSatiety() {
//             return satiety;
//     }
// }