package com.example.with;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ImprovedUserUnitTest {

    @Test
    public void whenUsernameNull_thenException() {
        ImprovedUser user = new ImprovedUser("testuser", "test@mail.com");

        assertThrows(NullPointerException.class, () -> user.withUserName(null));
    }

    @Test
    public void whenEmailNull_thenException() {
        ImprovedUser user = new ImprovedUser("testuser", "test@mail.com");

        assertThrows(NullPointerException.class, () -> user.withEmailAddress(null));
    }
}