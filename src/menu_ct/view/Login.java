package menu_ct.view;

import menu_ct.input.InputData;
import menu_ct.services.LoginService;
import menu_ct.services.UserService;

import java.util.Scanner;

public class Login {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String username = "";
        String password = "";
        do {
            username = InputData.getUsername();
            password = InputData.getPassword();
            if (LoginService.login(username, password) == false)
                System.out.println("Wrong Username or Password!");
        } while (true);
    }
}
