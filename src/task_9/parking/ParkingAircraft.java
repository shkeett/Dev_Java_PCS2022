package task_9.parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ParkingAircraft {

    List<Plane> parkingPlane = new ArrayList<>();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void planeInParking() {
        boolean chek = true;
        while (chek) {
            System.out.println("\nЧто вы хотите сделать?");
            System.out.println("\tADD       - добавить самолет на стоянку");
            System.out.println("\texitAll   - распечатать все самолеты которые покидают стоянку");
            System.out.println("\texitLast  - распечатать самолет который покидает стоянку");
            System.out.println("\tshowPlane - распечатать все самолеты на стоянке");
            System.out.println("\tEXIT      - выход");


            try {
                String str = input.readLine();
                switch (str) {
                    case "ADD":
                        if (parkingPlane.size() < 5) {
                            addPlaneInParking();
                            showPlane();
                        } else {
                            System.out.println("Стоянка заполнена, мест нет");
                        }
                        break;
                    case "exitAll":
                        showAndRemovePlaneFromParking();
                        break;
                    case "exitLast":
                        showAndRemoveLastPlaneFromParking();
                        break;
                    case "showPlane":
                        showPlane();
                        break;
                    case "EXIT":
                        System.out.println("Программа закончена EXIT");
                        chek = false;
                        break;
                    default:
                        System.out.println("Вы ввели неправильную команду");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void addPlaneInParking() {
        System.out.println("Введите название самолета");
        String planeName = null;
        try {
            planeName = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Введите номер самолета");

        String planeNumber = null;
        try {
            planeNumber = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Plane plane1 = new Plane(planeName, planeNumber);
        parkingPlane.add(plane1);

    }

    public void showPlane() {
        for (Plane plane : parkingPlane) {
            System.out.println(plane);
        }
    }

    public void showAndRemovePlaneFromParking() {
        for (int i = parkingPlane.size() - 1; i >= 0; i--) {
            System.out.println("Cамолет " + parkingPlane.get(i) + " покинул парковку.");
            parkingPlane.remove(i);
        }
    }

    public void showAndRemoveLastPlaneFromParking() {
        int i = parkingPlane.size() - 1;
        System.out.println("Cамолет " + parkingPlane.get(i) + " покинул парковку.");
        parkingPlane.remove(i);
    }
}
