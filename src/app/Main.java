package app;

import model.User;
import view.UserList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserList userList = new UserList();

        List<User> users = userList.usersList();

        userList.printUsers(users);
    }
}
