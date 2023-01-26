package task_5.factory;

public class Diller {
    private String titleDiller;
    private int ageDiller;

    public Diller(String titleDiller, int ageDiller) {
        this.titleDiller = titleDiller;
        this.ageDiller = ageDiller;
    }

    void makeOrder(Factory factory, int count, String[] models) {
        Diller diller = new Diller(titleDiller, ageDiller);
        var order = new Order(factory, count, models, diller);
        order.showInfoOrder();
    }

    public String getTitleDiller() {
        return titleDiller;
    }

    public int getAgeDiller() {
        return ageDiller;
    }
}