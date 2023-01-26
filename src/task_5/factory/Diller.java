package task_5.factory;

public class Diller {
    private String titleDiller;
    private int ageDiller;

    public Diller(String titleDiller, int ageDiller) {
        this.titleDiller = titleDiller;
        this.ageDiller = ageDiller;
    }

    void makeOrder(Factory factory, int count, String[] models) {
        var order = new Order(factory, count, models);
        order.showInfoOrder();
    }

    public String getTitleDiller() {
        return titleDiller;
    }

    public int getAgeDiller() {
        return ageDiller;
    }
}

//1) Если диллер имеет стаж работы от 10 лет, то завод представляет скидку в 10%
//2) Перед тем как приступать к созданию авто, необходимо проверить, завод сможет изготовить
//данное авто или нет.
//3) Вывести информацию о количестве каждой созданной машины заводом
