package Model;

import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel{
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * @param index 
     */
    @Override
    public void deleteStudent(int index) {
        students.remove(index);
    }
        
    }

    
    
   
