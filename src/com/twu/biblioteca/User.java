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

    public String printUserInfo() {
        String userInfo = "\n-----User Info-----" + "\nName: " + this.name + "\nType: " + this.type + "\n" +
                          "Email: " + this.email + "\nPhoneNumber: " + this.phoneNumber + "\n";
        System.out.println(userInfo);
        return userInfo;
    }

    public static Boolean login(Biblioteca biblioteca) {
        biblioteca.welcome();
        System.out.println("UserName: (LIB-XXXX)");
        String userName = InputReader.getInput();
        System.out.println("Password:");
        String password = InputReader.getInput();

        for(User user: User.UserCollection()) {
            if(user.getName().equals(userName) && user.getPassword().equals(password)) {
                biblioteca.setUser(user);
                System.out.println("\nLogin Success!\n");
                return true;
            }
        }
        System.out.println("----UserName Or Password Wrong----");
        return false;
    }


    public static User[] UserCollection() {
        return new User[]{
                new User("LIB-0000", "0326", "customer", "daledu@gmail.com", "18717394542"),
                new User("LIB-0001", "0326", "customer", "daledu@gmail.com", "18717394542"),
                new User("LIB-1001", "0326", "librarian", "dora@gmail.com", "18717394542"),
                new User("LIB-1000", "0326", "librarian", "dora@gmail.com", "18717394542")
        };
    }
}
