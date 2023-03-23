package task_15.src.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Main {
    private Connection connection;
    private Statement statement;

    final String user = "postgres";
    final String password = "shket";
    final String url = "jdbc:postgresql://localhost:5432/shop";

    public Main() throws ClassNotFoundException, SQLException {
        Class.forName(Config.DRIVER);//зарегистрировали драйвер для работы с базой данных
        String url = "jdbc:postgresql://" + Config.SERVER + "/" + Config.DB;
        connection = DriverManager.getConnection(url, Config.LOGIN, Config.PASSWORD);
//        С помощью объекта connection можно создать объект класса Statement с помощью которого
//                можно создавать запросы к базе данных
        statement = connection.createStatement();
    }

    /**
     * Просмотр доступных товаров
     */

    void showData(String table) throws SQLException {
        ResultSet rs = statement.executeQuery("select * from " + table);
        while (rs.next()) {
            System.out.printf("id= %d\t %s\t цена %d\n",
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getInt("price"));
        }
        rs.close();
    }

    /**
     * Просмотр товаров в корзине
     */
    void showCount() throws SQLException {
        ResultSet rs = statement.executeQuery(
                "select title, count from shop.public.basket join goods g on g.id = basket.goods_id");
        while (rs.next()) {
            System.out.printf("%s\t количество %d\n",
                    rs.getString("title"),
                    rs.getInt("count"));
        }
        rs.close();
    }


    /**
     * В этом методе выполняется добавление товара в корзину
     */

    int insertGoodsInBasket(int goods_id) throws SQLException, IOException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO basket(goods_id, count) VALUES  ( ?, 1)");
        preparedStatement.setInt(1, goods_id);
        return preparedStatement.executeUpdate();
    }

    /**
     * В этом методе удаляем товары из корзины
     */

    void deleteCount() throws SQLException {
        ResultSet rs = statement.executeQuery("delete from shop.public.basket");
        rs.close();
    }

    /**
     * В этом методе выполняется обновление стоимости авто
     */
    int updatePrice(String title, int price) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE goods SET price = ? where title = ?");
        preparedStatement.setInt(1, price);
        preparedStatement.setString(2, title);
        return preparedStatement.executeUpdate();

//        return statement.executeUpdate("UPDATE goods " +
//                "SET price = " + price + " WHERE title ='" + title + "'");
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Main main = new Main();
        boolean flag = true;
        while (flag) {
            System.out.println("Доступный товар: ");
            main.showData("goods");
            System.out.printf("\nВведите ID товара который необходимо добавить в корзину\n" +
                    "Если нужно узнать количество товаров в корзине введите КОЛИЧЕСТВО\n" +
                    "Если нужно выйти введите ВЫХОД или EXIT\n");
            String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if (input.equalsIgnoreCase("ВЫХОД") || input.equalsIgnoreCase("EXIT")) {
                main.showCount();
//                main.deleteCount();
                System.exit(0);
            } else if (input.equalsIgnoreCase("КОЛИЧЕСТВО")) {
                System.out.println("Количество товаров в корзине:");
                main.showCount();
                System.out.println("----------------------------------------");
            } else {
                main.insertGoodsInBasket(Integer.parseInt(input));
            }
        }
        main.statement.close();
        main.connection.close();
    }
}
