package menu_ct.services;

import menu_ct.model.Manager;
import menu_ct.model.Staff;
import menu_ct.model.User;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UserService implements Convert {
    static int ROLE_STAFF = 1;
    static int MANAGER_STAFF = 0;
    public static User userInfo = new User();
    public static ArrayList<User> userList = new ArrayList<>();

    public void getUserList() {
        userList = new ArrayList<>();
        String url = "D:\\Zero\\CodeGym\\Module_2\\src\\menu_ct\\data\\user.txt";
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
                if (role == ROLE_STAFF) {
                    int timekeeping = Integer.parseInt(user[9]);
                    int dailySalary = Integer.parseInt(user[10]);
                    getStaffInfo(id, username, password, name, role, dob, address, email, phoneNum, timekeeping, dailySalary);
                } else if (role == MANAGER_STAFF) {
                    double coefficientsSalary = Double.parseDouble((user[9]));
                    getManagerInfo(id, username, password, name, role, dob, address, email, phoneNum, coefficientsSalary);
                }
                userList.add(userInfo);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! Không thấy file data!");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void showUser() {
        getUserList();
        System.out.println("-----------------------------------------------------------------");
        int i = 1;
        for (User user : userList) {
            System.out.printf("|\t%-4s|%s|%n", i, user.display());
            i++;
        }
        System.out.println("-----------------------------------------------------------------");
    }

    public void addUser(String username, String password, String name, int role, Date dob, String address, String email, String phoneNum) {
        getUserList();
        if (role == ROLE_STAFF) {
            long id = System.currentTimeMillis();
            int timekeeping = 0;
            int dailySalary = 40000;
            getStaffInfo(id, username, password, name, role, dob, address, email, phoneNum, timekeeping, dailySalary);
        } else if (role == MANAGER_STAFF) {
            long id = System.currentTimeMillis();
            double coefficientsSalary = 6.2;
            getManagerInfo(id, username, password, name, role, dob, address, email, phoneNum, coefficientsSalary);
        }
        userList.add(userInfo);
        editData();
    }

    public void editStaff(int index, String password, String name, int role, Date dob,
                          String address, String email, String phoneNum, int timekeeping, int dailySalary) {
        getUserList();
        String[] user = userList.get(index - 1).toString().split("/");
        long id = Long.parseLong(user[0]);
        String username = user[1];
        getStaffInfo(id, username, password, name, role, dob, address, email, phoneNum, timekeeping, dailySalary);

        userList.set(index - 1, userInfo);
        editData();
    }

    public void editManager(int index, String password, String name, int role, Date dob,
                            String address, String email, String phoneNum, double coefficientsSalary) {
        getUserList();
        String[] user = userList.get(index - 1).toString().split("/");
        long id = Long.parseLong(user[0]);
        String username = user[1];
        getManagerInfo(id, username, password, name, role, dob, address, email, phoneNum, coefficientsSalary);

        userList.set(index - 1, userInfo);
        editData();
    }

    public void deleteUser(int index){
        getUserList();
        userList.remove(index - 1);
        editData();
    }

    public void editData() {
        String url = "D:\\Zero\\CodeGym\\Module_2\\src\\menu_ct\\data\\user.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(url));
            int i = 0;
            while (i < userList.size()) {
                writer.write(userList.get(i++).toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error! Không thấy file data");
        }

    }

    @Override
    public Date covertDate(String textDate) throws ParseException {

            return new SimpleDateFormat("dd-MM-yyyy").parse(textDate);

    }

    private void getStaffInfo(long id, String username, String password, String name, int role, Date dob,
                              String address, String email, String phoneNum, int timekeeping, int dailySalary) {
        userInfo = new Staff()
                .setId(id)
                .setUsername(username)
                .setPassword(password)
                .setName(name)
                .setRote(role)
                .setDob(dob)
                .setAddress(address)
                .setEmail(email)
                .setNumPhone(phoneNum)
                .setTimekeeping(timekeeping)
                .setDailySalary(dailySalary);
    }

    private void getManagerInfo(long id, String username, String password, String name, int role, Date dob,
                                String address, String email, String phoneNum, double coefficientsSalary) {
        userInfo = new Manager()
                .setId(id)
                .setUsername(username)
                .setPassword(password)
                .setName(name)
                .setRote(role)
                .setDob(dob)
                .setAddress(address)
                .setEmail(email)
                .setNumPhone(phoneNum)
                .setCoefficients_salary(coefficientsSalary);
    }
}
