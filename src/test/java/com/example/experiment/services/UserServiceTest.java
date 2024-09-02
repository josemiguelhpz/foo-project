package com.example.experiment.services;

import com.example.experiment.entities.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testRegisterProductor() {
        UserService userService = mock(UserService.class);
        User mockUser = new User("productor@example.com", "password123", "Productor", false);

        when(userService.registerUser("productor@example.com", "password123", "Productor"))
                .thenReturn(mockUser);

        User user = userService.registerUser("productor@example.com", "password123", "Productor");

        assertNotNull(user);
        assertEquals("Productor", user.getRole());
        verify(userService).registerUser("productor@example.com", "password123", "Productor");
    }

    @Test
    public void testRegisterConsumidor() {
        UserService userService = mock(UserService.class);
        User mockUser = new User("consumidor@example.com", "password123", "Consumidor", false);

        when(userService.registerUser("consumidor@example.com", "password123", "Consumidor"))
                .thenReturn(mockUser);

        User user = userService.registerUser("consumidor@example.com", "password123", "Consumidor");

        assertNotNull(user);
        assertEquals("Consumidor", user.getRole());
        verify(userService).registerUser("consumidor@example.com", "password123", "Consumidor");
    }

    @Test
    public void testRegisterAdmin() {
        UserService userService = mock(UserService.class);
        User mockUser = new User("admin@example.com", "adminpass", "Administrador", false);

        when(userService.registerUser("admin@example.com", "adminpass", "Administrador"))
                .thenReturn(mockUser);

        User admin = userService.registerUser("admin@example.com", "adminpass", "Administrador");

        assertNotNull(admin);
        assertEquals("Administrador", admin.getRole());
        verify(userService).registerUser("admin@example.com", "adminpass", "Administrador");
    }
}
