package task_9.college;

import java.util.Comparator;

public class FIOComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        return st1.getFio().compareTo(st2.getFio());
    }
}
