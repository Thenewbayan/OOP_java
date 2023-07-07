import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s2);
        listStud2.add(s4);
        StudentSteam steam1=new StudentSteam(1);
        steam1.addStudentGroup(listStud);
        


    }
}
