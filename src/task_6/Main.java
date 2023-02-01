package task_6;

public class Main {
    public static void main(String[] args) {
        CoderSalary coder = new CoderSalary();
        EconomistSalary economist = new EconomistSalary();
        DirectorSalary director = new DirectorSalary();
        System.out.println("Зарплата программиста составляет = " + coder.getSalary());
        System.out.println("Зарплата экономиста составляет = " + economist.getSalary());
        System.out.println("Зарплата директора составляет = " + director.getSalary());
    }
}