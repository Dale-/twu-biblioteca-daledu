package com.twu.biblioteca;

/**
 * Created by Dale on 6/10/15.
 */
public class User {

    private String name;
    private String password;
    private String type;

    public User(String name, String password, String type) {
        this.name = name;
        this.password = password;
        this.type = type;
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
                new User("Dale", "0326", "customer"),
                new User("Dora", "0326", "librarian")
        };
    }
}
