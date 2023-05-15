package menu_ct.services;

import menu_ct.model.Account;
import menu_ct.view.client.MainMenuClient;
import menu_ct.view.user.MainMenuUser;

import java.util.ArrayList;

public class LoginService {
    public static ArrayList<Account> accountList = new ArrayList<>();
    public static UserService userService = new UserService();

    public static boolean login(String username, String password) {
        accountList = userService.getUserList();
        for (Account account : accountList) {
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                System.out.println("Welcome to VN!");
                if (account.getRote() == 0 || account.getRote() == 1) {
                    MainMenuUser.mainMenuAdmin(account);
                } else
                    MainMenuClient.mainMenuClient(account.getId());
                return true;
            }
        }
        return false;
    }
}
