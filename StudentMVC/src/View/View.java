package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView{
    public void printAllStudents(List<Student> students){
        System.out.println("-----------Список студентов---------");
        for (Student stud: students){
            System.out.println(stud);
        }
        System.out.println("-----------Конец---------");
    }

    @Override
    public void displayStudents(List<Student> students) {
       for (Student st:students){
        System.out.println("Информация: "+st.toString());
       }
                
    }

    @Override
    public Long getStudentIdToDelete() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void printAllStudent(List<Student> students) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String prompt(String msg) {
       Scanner in=new Scanner(System.in);
       System.out.println(msg);
        return in.nextLine();
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
