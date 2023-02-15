package task_9.parking;

import java.util.Objects;

public class Plane {
    private String planeName;
    private String planeNumber;

    public Plane(String planeName, String planeNumber) {
        this.planeName = planeName;
        this.planeNumber = planeNumber;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(String planeNumber) {
        this.planeNumber = planeNumber;
    }

    @Override
    public String toString() {
        return "Plane " +
                "Name = " + planeName +
                ", Number = " + planeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(planeName, plane.planeName) && Objects.equals(planeNumber, plane.planeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeName, planeNumber);
    }
}
