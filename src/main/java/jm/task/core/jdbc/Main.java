package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("jonh", "wyuk", (byte) 21);
        userService.saveUser("woon", "kg", (byte) 23);
        userService.saveUser("dollar", "fq", (byte) 24);
        userService.saveUser("rub", "wf", (byte) 25);
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
