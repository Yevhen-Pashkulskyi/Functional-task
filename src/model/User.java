package model;

public class User {
    private String name;
    private String phone;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Ім'я: '" + name + '\'' +
                ", телефон: " + '\'' + phone + '\'';
    }
}
