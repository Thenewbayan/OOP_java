package Domen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import Interfaces.iIterable;

public class StudentSteam implements iIterable {
    private int steamnumber;
    private List<StudentGroup> studentGroups;

    public StudentSteam(int steamnumber) {
        this.steamnumber = steamnumber;
        studentGroups = new ArrayList<StudentGroup>();

    }

    public StudentSteam(int steamnumber, List<StudentGroup> studentGroups) {
        this.steamnumber = steamnumber;
        studentGroups = new ArrayList<StudentGroup>();

    }

    public int getSteamnumber() {
        return steamnumber;
    }

    public void setSteamnumber(int steamnumber) {
        this.steamnumber = steamnumber;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public void addStudentGroup(StudentGroup group) {
        studentGroups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }

    @Override
    public String toString() {
        return "StudentSteam [steamnumber=" + steamnumber + ", studentGroups=" + studentGroups + "]";
    }

    @Override
    public void showContain() {
        Iterator<StudentGroup> iterator = iterator();

        while (iterator.hasNext()) {
            StudentGroup group = iterator.next();
            System.out.println("Student Group " + group.getIdGroup() + ":");
            for (Student student : group.getGroup()) {
                System.out.println("name: " + student.getName() + "; " + "id: " + student.getId() + "; " + "age: "
                        + student.getAge());
            }
            System.out.println();
        }

    }
    @Override
    public void comparationSizeGroup() {
        List<StudentGroup> groups = new ArrayList<>();
        // Добавить студенческие группы в список groups
        
        groups.sort(Comparator.comparing(StudentGroup::getSize));
        
        for (StudentGroup group : groups) {
            System.out.println("Student Group " + group.getIdGroup() + ":");
            for (Student student : group.getGroup()) {
                System.out.println(student.getName());
            }
            
            System.out.println();
        }
    }
}


