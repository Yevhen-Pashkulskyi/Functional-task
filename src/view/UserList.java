package view;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class UserList {
    List<User> users = new ArrayList<>();
    public List<User> usersList(){
        users.add(new User("Анна", "0671234567"));
        users.add(new User("Богдан", "0677654321"));
        users.add(new User("Віктор", "0507654321"));
        users.add(new User("Галина", "0501234567"));
        users.add(new User("Федор", "0631234567"));

        return users;
    }
    public void printUsers(List<User> users){
        Consumer<User> printUser = user ->
                System.out.println(user);

        System.out.println("Користувачі платформи:");

        users.forEach(printUser);
    }
}
