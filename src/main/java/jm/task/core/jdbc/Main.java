package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Util.getConnect();

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Deangelo", "Ioannidis", (byte)16);
        userService.saveUser("Kaleigh", "Murrufo", (byte)50);
        userService.saveUser("Quintin", "Besen", (byte)92);
        userService.saveUser("Lili", "Delavega", (byte)8);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeConnect(Util.getConnect());
    }


}
