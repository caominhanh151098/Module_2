package menu_ct.services;

import menu_ct.model.Manager;
import menu_ct.model.Staff;
import menu_ct.model.User;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StaffService implements Convert {
    static int ROLE_STAFF = 1;
    static int MANAGER_STAFF = 0;
    public static User userInfo = new User();
    public static ArrayList<User> userList = new ArrayList<>();

    public void getUserList() throws Exception {
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
            Date dob = covertDate(user[5]);
            String address = user[6];
            String email = user[7];
            long numPhone = Long.parseLong(user[8]);
            if (role == ROLE_STAFF) {
                int timekeeping = Integer.parseInt(user[9]);
                int dailySalary = Integer.parseInt(user[10]);
                userInfo = new Staff()
                        .setId(id)
                        .setUsername(username)
                        .setPassword(password)
                        .setName(name)
                        .setRote(role)
                        .setDob(dob)
                        .setAddress(address)
                        .setEmail(email)
                        .setNumPhone(numPhone)
                        .setTimekeeping(timekeeping)
                        .setDailySalary(dailySalary);
                userList.add(userInfo);
            } else if (role == MANAGER_STAFF) {
                double coefficientsSalary = Double.parseDouble((user[9]));
                userInfo = new Manager()
                        .setId(id)
                        .setUsername(username)
                        .setPassword(password)
                        .setName(name)
                        .setRote(role)
                        .setDob(dob)
                        .setAddress(address)
                        .setEmail(email)
                        .setNumPhone(numPhone)
                        .setCoefficients_salary(coefficientsSalary);
                userList.add(userInfo);
            }
            line = reader.readLine();
        }
        reader.close();

    }

    public void showUser() throws Exception {
        getUserList();
        System.out.println("-----------------------------------------------------------------");
        int i = 1;
        for (User user : userList) {
                System.out.printf("|\t%-4s|%s|%n", i, user.display());
            i++;
        }
        System.out.println("-----------------------------------------------------------------");
    }

//    public void addUser(String username, String password, String name, int role) throws Exception {
//        getStaffList();
//        staffInfo = new Staff(username, password, name, role);
//        staffList.add(staffInfo);
//        editData();
//    }
//
//    public void editUser(int index, String nPassword, String nName, int nRole) throws Exception {
//        getStaffList();
//        String[] user = staffList.get(index - 1).toString().split("/");
//        long id = Long.parseLong(user[0]);
//        String username = user[1];
//        String password = nPassword;
//        String name = nName;
//        int role = nRole;
//        userInfo = new User(id, username, password, name, role);
//        userList.set(index - 1, userInfo);
//        editData();
//        userView();
//    }
//
//    public void deleteUser(int index) throws IOException {
//        getUserList();
//        userList.remove(index - 1);
//        editData();
//        userView();
//    }
//
//    public void editData() throws IOException {
//        String url = "D:\\Zero\\CodeGym\\Module_2\\src\\menu_ct\\data\\user.txt";
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter(url));
//        int i = 0;
//        while (i < userList.size()) {
//            writer.write(userList.get(i).toString());
//            writer.newLine();
//            i++;
//        }
//        writer.close();
//    }

    @Override
    public Date covertDate(String textDate) throws Exception {
        return new SimpleDateFormat("dd-MM-yyyy").parse(textDate);
    }
}
