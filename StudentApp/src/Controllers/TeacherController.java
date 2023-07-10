package Controllers;

public class TeacherController implements iPersonController{
    private  final TeacherController dataServise = new TeacherController();

    @Override
    public void create(String firstName, int age) {
        dataServise.create(firstName, age);
       
        
    }
    
}
