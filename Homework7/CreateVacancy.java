package Homework7;

public interface CreateVacancy {

    public default String createVacancy(){
        Vacancy vac = new Vacancy();
         return vac.nameVacancy;
    }
    
}