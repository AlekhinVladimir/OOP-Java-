package OOP.HW.hw_4;


import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

public static Random rand = new Random();

public static ArrayList<Apple> fillTheAppleBox(int amount) {
    ArrayList<Apple> appleList = new ArrayList<>();
    for (int i = 0; i < amount; i++) {
        appleList.add(new Apple());
    }
    return appleList;
}

public static ArrayList<Orange> fillTheOrangeBox(int amount) {
    ArrayList<Orange> orangeList = new ArrayList<>();
    for (int i = 0; i < amount; i++) {
        orangeList.add(new Orange());
    }
    return orangeList;
}

public static void boxCompare(Box<?> b1, Box<?> b2){
    System.out.printf("\nСравниваем вес коробок №%d-'%s' и №%d-'%s': ", b1.getId(), b1.getName(), b2.getId(), b2.getName());
    if(b1.compareTo(b2))
    System.out.println("вес коробок одинаковый");
    else System.out.println("вес коробок разный");
}

public static void shiftFruBox(Box<?> b1, Box<?> b2){
    System.out.printf("\nПробуем пересыпать фрукты из коробки №%d в №%d:\n", b1.getId(), b2.getId());
    if((b1.name).equals(b2.name)){
    b2.setWeight(b1.weight + b2.weight);
    b1.weight = 0;
    System.out.printf("Коробка №%d опустела, вес коробки №%d - %.2f кг\n\n", b1.getId(), b2.getId(), b1.weight + b2.weight);
    }
    else System.out.println("Это коробки с разными фруктами, пересыпать нельзя\n");
}

    public static void main(String[] args) {

Box<Apple> box1 = new Box<Apple>(fillTheAppleBox(16));
Box<Apple> box2 = new Box<Apple>(fillTheAppleBox(30));
Box<Orange> box3 = new Box<Orange>(fillTheOrangeBox(17));
Box<Orange> box4 = new Box<Orange>(fillTheOrangeBox(13));

System.out.println(box1);
System.out.println(box2);
System.out.println(box3);
System.out.println(box4);

boxCompare(box1, box4);
boxCompare(box2, box3);

shiftFruBox(box1, box4);

shiftFruBox(box3, box4);

System.out.println(box1);
System.out.println(box2);
System.out.println(box3);
System.out.println(box4);

    }

}

abstract class Fruit {
    private final float weight;
    private final String name;

    public Fruit(float weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
    

}

class Apple extends Fruit {

    public Apple() {
        super(1.0f, "Яблоки");
    }

}

class Orange extends Fruit {

    public Orange() {
        super(1.5f, "Апельсины");

    }

}

class Box<T extends Fruit> {

    private static final AtomicInteger counter = new AtomicInteger(1);
    ArrayList<T> fruits;
    String name;
    int id;
    float weight;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
        this.name = fruits.get(0).getName();
        this.id = counter.getAndIncrement();
        this.weight = getWeight();
    }

    public float getWeight() {
        return fruits.get(0).getWeight() * fruits.size();
    }

    public boolean compareTo(Box<?> box) {
        return true ? Float.compare(getWeight(), box.getWeight()) == 0 : false;
    }

    @Override
    public String toString() {

        return "Коробка №" + id + "; Фрукты: " + name + "; вес: " + weight;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}