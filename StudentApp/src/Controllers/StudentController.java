package Controllers;

import Domen.Student;
import Services.StudentService;

public class StudentController implements iPersonController<Student> {
    private  final StudentService dataServise = new StudentService(0, null);

    @Override
    public void create(String firstName, int age) {
        dataServise.create(firstName, age);
        dataServise.getSortByFIOStList();

    }

    
    
}
