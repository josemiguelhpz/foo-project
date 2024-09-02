package com.example.nadi.services;

import com.example.nadi.entities.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceRoleTest {

    @Test
    public void testAssignRole() {
        UserServiceImpl userService = mock(UserServiceImpl.class);
        User mockUser = new User("user@example.com", "password123", "Consumidor", false);

        doNothing().when(userService).assignRole(mockUser, "Productor");

        userService.assignRole(mockUser, "Productor");

        verify(userService).assignRole(mockUser, "Productor");
    }

    @Test
    public void testBlockUser() {
        UserServiceImpl userService = mock(UserServiceImpl.class);
        User mockUser = new User("user@example.com", "password123", "Consumidor", false);

        doNothing().when(userService).blockUser(mockUser);
        when(userService.isUserBlocked(mockUser)).thenReturn(true);

        userService.blockUser(mockUser);

        assertTrue(userService.isUserBlocked(mockUser));
        verify(userService).blockUser(mockUser);
    }

    @Test
    public void testUnblockUser() {
        UserServiceImpl userService = mock(UserServiceImpl.class);
        User mockUser = new User("user@example.com", "password123", "Consumidor", false);

        doNothing().when(userService).blockUser(mockUser);
        doNothing().when(userService).unblockUser(mockUser);
        when(userService.isUserBlocked(mockUser)).thenReturn(false);

        userService.blockUser(mockUser);
        userService.unblockUser(mockUser);

        assertFalse(userService.isUserBlocked(mockUser));
        verify(userService).unblockUser(mockUser);
    }
}
