package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService {
    private int count;
    private List<Teacher> teachers;
    public TeacherService(int count, List<Teacher> teachers) {
        this.count = count;
        this.teachers = teachers;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    @Override
    public void create(String firstName, int age) {
        Teacher teach=new Teacher(firstName, age, count);
        count++;
        teachers.add(teach);
        
    }
    @Override
    public List<Teacher> getAll() {
       
        return teachers;
    }
    
    public void getSortByFIOStList(){
        
        teachers.sort(new PersonComparator<Teacher>());
        
    }
     
    /**
     * outputs to the console items of List<Teacher> sorted by 
     */
    public void getSortedList() {
    teachers.sort(new PersonComparator<Teacher>());
    for (Teacher teacher : teachers) {
        System.out.println(teacher);
    }
}
}

   
    

