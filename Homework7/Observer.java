package Homework7;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

    void receiveOffer(String nameVacancy, String companyName, Double salary);


}
