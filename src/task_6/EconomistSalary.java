package task_6;

public class EconomistSalary extends BaseSalary {

    @Override
    public double getSalary() {
        return MULTIPLAING_SALARY_ECONOMIST * BASE_SALARY;
    }
}