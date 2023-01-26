package task_5.factory;

public class Factory {
    private String title;
    private String[] listModels;
    private Diller diller;
    private int[] listAmount = new int[4];


    public Factory(String title, String[] listModels, Diller diller) {
        this.title = title;
        this.listModels = listModels;
        this.diller = diller;
        System.out.print("Завод может изготовить следущие авто: ");
        for (String listModel : listModels) {
            System.out.println(listModel);
        }

        System.out.println("------------------------------------------------------------");
    }


    boolean isCanCreate(String titleCar) {
        for (String car : listModels) {
            if (car.equals(titleCar)) {
                return true;
            }
        }
        return false;
    }

    public String getTitle() {
        return title;
    }


    /**
     * В этом методе изготавливаем автомобиль
     *
     * @param titleCar - название авто, которое будет в заказе, стоимость завод устанавливает сам
     * @return готовый авто, это объект класса Car
     */


    Car createCar(String titleCar) {

        if (isCanCreate(titleCar)) {
            System.out.println("Завод " + getTitle() + " приступил к изготовлению " + titleCar);
            Car car = new Car(titleCar, (int) (Math.random() * 4000 + 1000));
            for (int i = 0; i < listModels.length; i++) {
                if (titleCar.equals(listModels[i])) {
                    listAmount[i]++;
                }
            }

            return car;
        } else {
            System.out.println("Нет возможности изготовить " + titleCar);
            return null;
        }

    }

    public void getAmountCar() {
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < listModels.length; i++) {
            System.out.println("Автомобиль модель: " + listModels[i] + " выпущен в кол-ве " + listAmount[i] + " шт.");
        }
    }
}
