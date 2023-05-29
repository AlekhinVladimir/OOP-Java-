package Homework7;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameVacancy, String nameCompany, double salary);

}
