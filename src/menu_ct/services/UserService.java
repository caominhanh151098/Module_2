package menu_ct.services;

import menu_ct.model.Account;
import menu_ct.output.WriteFile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UserService implements Convert {
    static String path = "data\\user.csv";
    public static ArrayList<Account> accountList = new ArrayList<>();

    public ArrayList<Account> getUserList() {
        accountList.clear();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                String[] user = line.split(",");
                long id = Long.parseLong(user[0]);
                String username = user[1];
                String password = user[2];
                String name = user[3];
                int role = Integer.parseInt(user[4]);
                Date dob = covertDate(user[5]);
                String address = user[6];
                String email = user[7];
                String phoneNum = user[8];
                Account accountInfo = new Account()
                        .setId(id)
                        .setUsername(username)
                        .setPassword(password)
                        .setName(name)
                        .setRote(role)
                        .setDob(dob)
                        .setAddress(address)
                        .setEmail(email)
                        .setNumPhone(phoneNum);
                accountList.add(accountInfo);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! Không thấy file data!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return accountList;
    }

    public void addUser(Account newAccount) {
        getUserList();
        accountList.add(newAccount);
        WriteFile.editData(accountList, path);
    }

    public void editUser(int index, Account editAccount) {
        getUserList();
        accountList.set(index - 1, editAccount);
        WriteFile.editData(accountList, path);
    }

    public void editUser(Account editAccount) {
        getUserList();
        int index = 1;
        for (Account account : accountList) {
            if (account.getId() == editAccount.getId()) {
                editUser(index, editAccount);
                break;
            } else index++;
        }
    }

    public void deleteUser(int index) {
        getUserList();
        accountList.remove(index - 1);
        WriteFile.editData(accountList, path);
    }

    public Account findUserByID(long id) {
        getUserList();
        for (Account account : accountList) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public Date covertDate(String textDate) throws ParseException {

        return new SimpleDateFormat("dd-MM-yyyy").parse(textDate);

    }
}
