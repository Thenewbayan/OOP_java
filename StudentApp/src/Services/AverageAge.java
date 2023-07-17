package Services;


import java.util.List;

import Domen.Person;

public class AverageAge <T extends Person>{
    private List<Person> pers;

    /**
     * @param pers pers is List<Person> which is passed in the constructor
     */
    public AverageAge(List<Person> pers) {
        this.pers = pers;
    }

    public List<Person> getPers() {
        return pers;
    }

    public void setPers(List<TPerson> pers) {
        this.pers = pers;
    }
    /**
     * @return average age of item List<Person> according to the formula summ of item's age / quantyty items 
     * in List, retern type is double
     */
    public double averageAge (){
        double result;
        int count=0;
        double summ=0;
        for (Person per:pers){
            summ=summ+per.getAge();
            count++;
        }
        result=summ/count;
        return result;
    }


    
    
}
