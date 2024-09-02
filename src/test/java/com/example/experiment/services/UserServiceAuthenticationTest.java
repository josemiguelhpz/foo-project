package com.example.experiment.services;

import com.example.experiment.entities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceAuthenticationTest {

    @Test
    public void testLoginProductor() {
        UserServiceImpl userService = mock(UserServiceImpl.class);
        User mockUser = new User("productor@example.com", "password123", "Productor", false);

        when(userService.loginUser("productor@example.com", "password123"))
                .thenReturn(mockUser);

        User loggedInUser = userService.loginUser("productor@example.com", "password123");

        assertNotNull(loggedInUser);
        assertEquals("Productor", loggedInUser.getRole());
        verify(userService).loginUser("productor@example.com", "password123");
    }

    @Test
    public void testLoginConsumidor() {
        UserServiceImpl userService = mock(UserServiceImpl.class);
        User mockUser = new User("consumidor@example.com", "password123", "Consumidor", false);

        when(userService.loginUser("consumidor@example.com", "password123"))
                .thenReturn(mockUser);

        User loggedInUser = userService.loginUser("consumidor@example.com", "password123");

        assertNotNull(loggedInUser);
        assertEquals("Consumidor", loggedInUser.getRole());
        verify(userService).loginUser("consumidor@example.com", "password123");
    }

    @Test
    public void testLoginAdmin() {
        UserServiceImpl userService = mock(UserServiceImpl.class);
        User mockUser = new User("admin@example.com", "adminpass", "Administrador", false);

        when(userService.loginUser("admin@example.com", "adminpass"))
                .thenReturn(mockUser);

        User loggedInUser = userService.loginUser("admin@example.com", "adminpass");

        assertNotNull(loggedInUser);
        assertEquals("Administrador", loggedInUser.getRole());
        verify(userService).loginUser("admin@example.com", "adminpass");
    }
}

