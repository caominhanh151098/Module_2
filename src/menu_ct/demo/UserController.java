package menu_ct.demo;

import menu_ct.user.User;

import java.io.*;
import java.util.ArrayList;

public class UserController {
    public static User userInfo = new User();
    public static ArrayList<User> userList = new ArrayList<>();

    public void getUserList() throws IOException {
        userList = new ArrayList<>();
        String url = "D:\\Zero\\CodeGym\\Module_2\\src\\menu_ct\\data\\user.txt";

        BufferedReader reader = new BufferedReader(new FileReader(url));

        String line = reader.readLine();
        while (line != null) {
            String[] user = line.split("/");
            long id = Long.parseLong(user[0]);
            String username = user[1];
            String password = user[2];
            String name = user[3];
            int role = Integer.parseInt(user[4]);
            userInfo = new User()
                    .setId(id)
                    .setUsername(username)
                    .setPassword(password)
                    .setName(name)
                    .setRote(role);
            userList.add(userInfo);
            line = reader.readLine();
        }
        reader.close();
    }

    public void userView() throws IOException {
        getUserList();
        System.out.println("-----------------------------------------------------------------");
        int i = 1;
        for (User user : userList) {
            System.out.printf("|\t%-4s|%s|%n", i, user.display());
            i++;
        }
        System.out.println("-----------------------------------------------------------------");
    }

    public void addUser(String username, String password, String name, int role) throws IOException {
        getUserList();
        userInfo = new User()
                .setUsername(username)
                .setPassword(password)
                .setName(name)
                .setRote(role);
        userList.add(userInfo);
        editData();
    }

    public void editUser(int index, String nPassword, String nName, int nRole) throws IOException {
        getUserList();
        String[] user = userList.get(index - 1).toString().split("/");
        long id = Long.parseLong(user[0]);
        String username = user[1];
        String password = nPassword;
        String name = nName;
        int role = nRole;;
        userInfo = new User()
                .setId(id)
                .setUsername(username)
                .setPassword(password)
                .setName(name)
                .setRote(role);
        userList.set(index - 1, userInfo);
        editData();
        userView();
    }

    public void deleteUser(int index) throws IOException {
        getUserList();
        userList.remove(index - 1);
        editData();
        userView();
    }

    public void editData() throws IOException {
        String url = "D:\\Zero\\CodeGym\\Module_2\\src\\menu_ct\\data\\user.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(url));
        int i = 0;
        while (i < userList.size()) {
            writer.write(userList.get(i).toString());
            writer.newLine();
            i++;
        }
        writer.close();
    }
}
