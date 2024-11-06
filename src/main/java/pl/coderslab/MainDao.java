package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Arrays;

public class MainDao {
    public static void main(String[] args) {
        User[] users = UserDao.readAllUsers();

        for (User user1 : users) {
            System.out.println(user1);
        }



        User user = new User();
        user.setUserName("testUser3");
        user.setPassword("password3");
        user.setEmail("test@test3.com");
        UserDao.createUser(user);

        users = UserDao.readAllUsers();
        for (User user2 : users) {
            System.out.println(user2);
        }
    }
}
