package task_5.factory;

public class Order {
    private Factory factory;   //объект завод
    private int count;         //количество авто в заказе
    private String models[];
    private int sum = 0;       //общая сумма заказа
    private Car cars[];        //фура пока пустая. Будем ее заполнять автомобилями
    private Diller diller;


    public Order(Factory factory, int count, String[] models, Diller diller) {
        this.factory = factory;
        this.count = count;
        this.models = models;
        this.cars = new Car[count];
        this.diller = diller;
        startOrder();
    }

    void showInfoOrder() {
        //iter - для foreach
        //fori - для for

        int i = 1;
        for (var car : cars) {
            if (car != null) {
                if (diller.getAgeDiller() >= 10) {
                    System.out.println(i + ") Автомобиль " + car.getTitle() + " стоит (с учетом скидки 10%) " + car.getPrice() * (0.9));
                    i++;
                } else {
                    System.out.println(i + ") Автомобиль " + car.getTitle() + " стоит " + car.getPrice());
                    i++;
                }
            }
        }
        factory.getAmountCar();
        System.out.println("------------------------------------------------------------");
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
                               // РЕШЕНИЕ ИЗ УРОКА

    void counterOfModels() {
        for (int i = 0; i < models.length; i++) {  //это цикл по моделям, которые заказали
            int countAuto = 0;
            int totalMoney = 0;
            for (int j = 0; j < cars.length; j++) {  //это цикл по всем созданным машинам
                if (cars[j] != null) {
                    if (models[i].equalsIgnoreCase((cars[j].getTitle()))) {
                        countAuto += 1;
                        totalMoney += cars[j].getPrice();
                    }
                }
            }
        }
    }
}

