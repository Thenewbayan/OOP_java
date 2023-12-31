package Domen;

public class Teacher extends Person{
    private String acadDegree;
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
    @Override
    public String toString() {
        return "Teacher [name=" + super.getName() + ", age=" + super.getAge() + ", acadDegree=" + acadDegree + "]";
    }
    public String getAcadDegree() {
        return acadDegree;
    }
    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }
}