package task_6;

public class DirectorSalary extends BaseSalary {
    @Override
    public double getSalary() {
        return MULTIPLAING_SALARY_DIRECTOR * BASE_SALARY;
    }
}