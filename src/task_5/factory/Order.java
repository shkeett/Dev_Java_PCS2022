package task_5.factory;

public class Order {
    private Factory factory;   //объект завод
    private int count;         //количество авто в заказе
    private String models[];
    private int sum = 0;       //общая сумма заказа
    private Car cars[];        //фура пока пустая. Будем ее заполнять автомобилями


    public Order(Factory factory, int count, String[] models) {
        this.factory = factory;
        this.count = count;
        this.models = models;
        this.cars = new Car[count];
        startOrder();
    }

    void showInfoOrder() {
        //iter - для foreach
        //fori - для for

        int i = 1;

        for (var car : cars) {
            if (car != null) {
                System.out.println(i + ") Автомобиль " + car.getTitle() + " стоит " + car.getPrice());
                i++;
            }
        }
        System.out.println("Общая сумма заказа: " + sum);

    }

    /**
     * В данном методе будем заполнять cars готовыми машинами, полученными от завода
     */
    void startOrder() {

        for (var i = 0; i < count; i++) {
            cars[i] = factory.createCar(models[(int) (Math.random() * models.length)]);
            if (cars[i] != null) {
                sum += cars[i].getPrice();
            }
        }
        System.out.println("------------------------------------------------------------");
    }
}

