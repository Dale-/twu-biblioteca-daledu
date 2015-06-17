package com.twu.biblioteca;

public class User {

    private String name;
    private String password;
    private String type;
    private String email;
    private String phoneNumber;

    public User(String name, String password, String type, String email, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.type = type;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {

        return this.name;
    }

    public String getPassword() {

        return this.password;
    }

    public String getType() {

        return this.type;
    }

    public static User[] UserCollection() {
        return new User[]{
                new User("Dale", "0326", "customer", "daledu@gmail.com", "18717394542"),
                new User("Dora", "0326", "librarian", "dora@gmail.com", "18717394542")
        };
    }
}
