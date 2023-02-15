package task_9.college;

import java.util.Comparator;

public class RatingComparator implements Comparator<Student> {

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
