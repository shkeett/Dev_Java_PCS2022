package task_9.college;

import java.util.Objects;


public class Student {
    private String fio;
    private double averageRating;

    public Student(String fio, double averageRating) {
        this.fio = fio;
        this.averageRating = averageRating;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return "Students{" +
                "fio='" + fio + '\'' +
                ", averageRating= " + averageRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.averageRating, averageRating) == 0 && Objects.equals(fio, student.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, averageRating);
    }
}