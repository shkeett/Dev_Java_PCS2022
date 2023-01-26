package task_5.factory;


/**
 * 1) Если диллер имеет стаж работы от 10 лет, то завод представляет скидку в 10%
 * 2) Перед тем как приступать к созданию авто, необходимо проверить, завод сможет изготовить
 * данное авто или нет.
 * 3) Вывести информацию о количестве каждой созданной машины заводом
 */


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
