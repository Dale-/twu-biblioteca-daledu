package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User("Dale", "0326", "customer", "daledu@gmail.com", "18717394542");
    }

    @Test
    public void testBook() throws Exception {
        assertEquals("Dale", user.getName());
        assertEquals("0326", user.getPassword());
        assertEquals("customer", user.getType());
        assertEquals("daledu@gmail.com", user.getEmail());
        assertEquals("18717394542", user.getPhoneNumber());
    }

    @Test
    public void testPrintUserInfo() throws Exception {
        String userInfo = "\n-----User Info-----" + "\nName: " + user.getName() + "\nType: " + user.getType() +
                          "\nEmail: " + user.getEmail() + "\nPhoneNumber: " + user.getPhoneNumber() + "\n";
        assertEquals(userInfo, user.printUserInfo());
    }

    @Test
    public void testUserCollection() throws Exception {
        assertEquals(4, User.UserCollection().length);
        assertEquals("customer", User.UserCollection()[0].getType());
    }
}
