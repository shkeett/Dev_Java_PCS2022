package task_9.college;

import java.util.Comparator;
import java.util.Objects;

/**
 * Сделать коллекцию студентов. Она характеризуется ФИО и средним баллом.
 * При вводе в консоль слова LIST должна выводиться информация о всех студентах и их средней оценке.
 * При вводе команды Sort необходимо спрашивать: ”По какому полю требуется сортировка”.
 * При вводе FIO – сортируем по ФИО.
 * При вводе “GRADE” – сортируем по среднему баллу.
 */

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

class FIOComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2)  {
        return st1.getFio().compareTo(st2.getFio());
    }
}

class RatingComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        if (st1.getAverageRating() == st2.getAverageRating()) {
            return 0;
        } else if (st1.getAverageRating() < st2.getAverageRating()) {
            return -1;
        } else {
            return 1;
        }
    }
}
