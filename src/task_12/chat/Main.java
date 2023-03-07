package task_12.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    private static List<User> listUsers;

    public static void main(String[] args) throws IOException {

        var input = new BufferedReader(new InputStreamReader(System.in));
        listUsers = new ArrayList<>();
        User user = null;
        String nickname = null;

        System.out.println("Добро пожаловать в наш чат!\n");
        System.out.println("Введите:");
        System.out.println("\tlogin - чтобы указать ваше имя");
        System.out.println("\texit - чтобы выйти из чата");

        while (true) {
            String inputMessage = input.readLine();
            if (inputMessage.equalsIgnoreCase("exit")) {
                System.out.println("До новых встреч в чате!");
                Main.getAllUsersAndHisMessages();
//                Main.getAllUsers();
                System.exit(0);
            } else if (inputMessage.equalsIgnoreCase("login")) {
                System.out.println("Введите ваше имя");
                try {
                    nickname = input.readLine();
                    System.out.println("Привет " + nickname);
                    if (listUsers.isEmpty()) {
                        user = new User();
                        user.login = nickname;
                        user.messages = new ArrayList<>();
                        listUsers.add(user);
                    } else {
                        boolean isPresent = false;
                        for (User listUser : listUsers) {
                            if (listUser.login.equals(nickname)) {
                                user = listUser;
                                isPresent = true;
                                break;
                            }
                        }
                        if (!isPresent) {
                            user = new User();
                            user.login = nickname;
                            user.messages = new ArrayList<>();
                            listUsers.add(user);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (nickname != null) {
                String str = Main.getTime() + " - " + inputMessage;
                System.out.println(nickname + " : " + str);
                user.messages.add(str);
            }
        }
    }

    public static String getTime() {
        Date time = new Date();
        SimpleDateFormat dt1 = new SimpleDateFormat("HH:mm:ss");
        return dt1.format(time);
    }

    public static void getAllUsers() {
        for (User user : listUsers) {
            System.out.println("--> " + user.getLogin());
        }
    }

    public static void getAllUsersAndHisMessages() {
        for (User user : listUsers) {
            System.out.println(user.getLogin() + " писал:");
            for (int i = 0; i < user.messages.size(); i++) {
                System.out.println("\t" + user.messages.get(i));
            }
        }
    }
}
