package task_5.factory;

public class Main {

    public static void main(String[] args) {
        String models[] = {"Гранта", "Веста", "Нива", "bmw"};
        String modelsFactory[] = {"Гранта", "Веста", "Нива", "X-Ray"};
        int count = (int) (Math.random() * 20 + 10);
        Diller diller = new Diller("Элвис", 8);
        var factory = new Factory("АвтоВаз", modelsFactory, diller);
        diller.makeOrder(factory, count, models);
    }
}
