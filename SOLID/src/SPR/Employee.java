import java.util.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }


    // убираем в отдельный класс, так как выдачу и расчет ЗП производит не класс рабочий, 
    //а какая-то сервисная орг, типа бухгалтери 

    
    // public int calculateNetSalary() {
    //     int tax = (int) (baseSalary * 0.25);// calculate in otherway
    //     return baseSalary - tax;
    // }
}