package designpatterns.iterator.JdbcTemplate;

import java.util.List;

// 测试类
public class SpringJdbcExample {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        System.out.println("所有用户:");
        List<User> users = userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("\nID为2的用户:");
        User user = userDao.getUserById(2);
        System.out.println(user);
    }
}