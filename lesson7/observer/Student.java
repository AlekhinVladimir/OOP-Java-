package lesson7.observer;

public class Student implements Observer {

    private  String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f]\n", name, companyName, salary);
        }
    }
}
