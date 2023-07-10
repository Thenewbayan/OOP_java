import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;
import Services.AverageAge;
import Services.StudentService;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        //ДЗ 4 начинается здесь!
        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
               

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");
        List<Teacher> ltch = new ArrayList<Teacher>();

        ltch.add(t1);
        ltch.add(t2);
        TeacherService tcs = new TeacherService(1, ltch);
        tcs.getSortedList();

        Emploee e1 = new Emploee("Petrovich", 60, "povar");
        Emploee e2=new Emploee("Fedorovich", 55, "storozh");
        List<Person> perList=new ArrayList<Person>();
        perList.add(e1);
        perList.add(e2);
        perList.add(t1);
        perList.add(t2);
        perList.add(s1);
        AverageAge avAg=new AverageAge<>(perList);
        System.out.println(avAg.averageAge());
        // и до сюдава!


        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // comS.compare(s1, s2);


        // PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        // comT.compare(t1, t2);

        
        // EmploeeController empControll=new EmploeeController();
        // empControll.paySalary(e1);
        // EmploeeController.paySalary(e1);

        // comS.compare(s1, t2);
        // PersonComparator<Person> comP = new PersonComparator<Person>();
        // comP.compare(s1, t2);

        // Student s3 = new Student("Иван", 22, 121);
        // Student s4 = new Student("Игорь", 23, 444);
        // Student s5 = new Student("Даша", 23, 171);
        // Student s6 = new Student("Лена", 23, 104);

        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);
        // List<Student> listStud2 = new ArrayList<Student>();
        // listStud2.add(s2);
        // listStud2.add(s4);
        // StudentSteam steam1=new StudentSteam(1);
        // StudentGroup sg4580=new StudentGroup(listStud2, 4580);
        // StudentGroup sg8045=new StudentGroup(listStud, 8045);

        // steam1.addStudentGroup(sg4580);
        // steam1.addStudentGroup(sg8045);

        // steam1.showContain();
        // steam1.comparationSizeGroup();
        // System.out.println("======================");
        // steam1.showContain();

    }
}
