package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{
    public void printAllStudents(List<Student> students){
        System.out.println("-----------List of Students---------");
        for (Student stud: students){
            System.out.println(stud);
        }
        System.out.println("-----------End of list of Students---------");
    }

    @Override
    public void displayStudents(List<Student> students) {
        for (Student st:students){
         System.out.println("Info: "+st.toString());
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
