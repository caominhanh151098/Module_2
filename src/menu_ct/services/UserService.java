package menu_ct.services;

import menu_ct.model.Admin;
import menu_ct.model.User;
import menu_ct.output.WriteFile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UserService implements Convert {
    static String path = "data\\user.txt";
    public static ArrayList<User> userList = new ArrayList<>();

    public void getUserList() {
        userList = new ArrayList<>();
        String url = "data\\user.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(url));

            String line = reader.readLine();
            while (line != null) {
                String[] user = line.split("/");
                long id = Long.parseLong(user[0]);
                String username = user[1];
                String password = user[2];
                String name = user[3];
                int role = Integer.parseInt(user[4]);
                Date dob = covertDate(user[5]);
                String address = user[6];
                String email = user[7];
                String phoneNum = user[8];
                User userInfo = new Admin()
                        .setId(id)
                        .setUsername(username)
                        .setPassword(password)
                        .setName(name)
                        .setRote(role)
                        .setDob(dob)
                        .setAddress(address)
                        .setEmail(email)
                        .setNumPhone(phoneNum);
                userList.add(userInfo);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! Không thấy file data!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void addUser(User newUser) {
        getUserList();
        userList.add(newUser);
        WriteFile.editData(userList, path);
    }

    public void editUser(int index, User editUser) {
        getUserList();
        userList.set(index - 1, editUser);
        WriteFile.editData(userList, path);
    }

    public void deleteUser(int index) {
        getUserList();
        userList.remove(index - 1);
        WriteFile.editData(userList, path);
    }



    @Override
    public Date covertDate(String textDate) throws ParseException {

        return new SimpleDateFormat("dd-MM-yyyy").parse(textDate);

    }
}
