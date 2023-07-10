package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;

public class EmploeeService implements iPersonService<Emploee>{
    private int count;
    private List<Emploee> emploes;
    public EmploeeService(List<Emploee> emploes) {
        this.emploes = new ArrayList<Emploee>();
    }
    @Override
    public List<Emploee> getAll() {
        return emploes;
    }
    @Override
    public void create(String firstName, int age) {
        Emploee per=new Emploee(firstName, age, count);
        count++;
        emploes.add(per);
    }
    
    
    
}
