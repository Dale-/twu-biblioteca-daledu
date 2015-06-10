package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dale on 6/10/15.
 */
public class UserTest {

    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User("Dale", "0326", "customer");
    }

    @Test
    public void testBook() throws Exception {
        assertEquals("Dale", user.getName());
        assertEquals("0326", user.getPassword());
        assertEquals("customer", user.getType());
    }
}
