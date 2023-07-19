package SPR;

public class SalaryService {

    /**
     * @param employee передается экземпляр класса Employee
     * @return рассчитаннуое значение по заданному алгоритму
     */
    public int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);
        return employee.getBaseSalary() - tax;
    }
}