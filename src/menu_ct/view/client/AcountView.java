package menu_ct.view.client;

import menu_ct.input.InputData;
import menu_ct.model.Account;
import menu_ct.services.UserService;
import menu_ct.view.user.ClearScreen;

import java.util.Date;
import java.util.Scanner;

public class AcountView {
    public static Scanner scanner = new Scanner(System.in);
    public static UserService userService = new UserService();
    public static Account mUser;

    public static void menuAccount(long idUser) {
        mUser = userService.findUserByID(idUser);
        int choice;
        ClearScreen.clearScreen();
        do {
            mUser.showProfile();
            ClearScreen.clearScreen(3);
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.printf("⚃\t\t%-40s⚃%n", "Chọn trong các mục");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 1: Chỉnh sửa thông tin cá nhân");
            System.out.printf("⚃\t\t%-40s⚃%n", "Nhấn 0: Quay lại");
            System.out.println("⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃⚃");
            System.out.print("Enter number: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }
            switch (choice) {
                case 1:
                    editUser();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error! Không nằm trong mục lục. Yêu cầu chọn lại:");
            }
        } while (choice != 0);
    }

    public static void editUser() {
        String password = InputData.getPassword();
        String name = InputData.getName();
        Date dob = InputData.getDate();
        String address = InputData.getAddress();
        String email = InputData.getEmail();
        String phoneNum = InputData.getPhoneNum();

        Account accountInfo = new Account()
                .setId(mUser.getId())
                .setUsername(mUser.getUsername())
                .setPassword(password)
                .setName(name)
                .setRote(mUser.getRote())
                .setDob(dob)
                .setAddress(address)
                .setEmail(email)
                .setNumPhone(phoneNum);
        System.out.printf("Bạn muốn thay đổi thông tin Username: %s?%nPassword: %s|Name: %s|Role: %s | Date or birth: %s, " +
                        "Address: %s, Email: %s, Phone Number: %s(y/n)",
                mUser.getUsername(), password, name, mUser.getRote(), dob, address, email, phoneNum);
        if (InputData.choice()) {
            userService.editUser(accountInfo);
        }
    }
}
