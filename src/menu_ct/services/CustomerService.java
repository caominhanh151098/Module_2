//package menu_ct.services;
//
//import menu_ct.model.Customer;
//import menu_ct.model.Order;
//import menu_ct.model.Account;
//
//import java.util.ArrayList;
//
//public class CustomerService {
//    UserService userService = new UserService();
//    OrderService orderService = new OrderService();
//    static Customer customer = new Customer();
//
//    public Account findUserByID(long id) {
//        ArrayList<Account> accountList = userService.getUserList();
//        for (Account account : accountList) {
//            if (account.getId() == id) {
//                return account;
//            }
//        }
//        return null;
//    }
//
//
//    public ArrayList<Order> getOrderListByID(long idUser) {
//        ArrayList<Order> orderList = orderService.getOrderList();
//        ArrayList<Order> mOrderList = new ArrayList<>();
//        for (Order order : orderList) {
//            if (order.getIdUser() == idUser)
//                mOrderList.add(order);
//        }
//        return mOrderList;
//    }
//}
