package com.example.nadi.services;

import com.example.nadi.entities.Publication;
import com.example.nadi.entities.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PublicationServiceTest {

    @Test
    public void testCreatePublication() {
        PublicationService publicationServiceImpl = mock(PublicationService.class);
        User mockUser = new User("consumidor@example.com", "password123", "", false);
        mockUser.setRole("Productor");
        Publication mockPublication = new Publication("Contenido de la publicación", "PENDING");

        when(publicationServiceImpl.createPublication(mockUser, "Contenido de la publicación"))
                .thenReturn(mockPublication);

        Publication publication = publicationServiceImpl.createPublication(mockUser, "Contenido de la publicación");

        assertNotNull(publication);
        verify(publicationServiceImpl).createPublication(mockUser, "Contenido de la publicación");
    }

    @Test
    public void testApprovePublication() {
        PublicationService publicationServiceImpl = mock(PublicationService.class);
        User mockAdmin = new User("consumidor@example.com", "password123", "", false);
        mockAdmin.setRole("Administrador");
        Publication mockPublication = new Publication("Contenido de la publicación", "APPROVED");

        doNothing().when(publicationServiceImpl).approvePublication(mockAdmin, mockPublication);

        publicationServiceImpl.approvePublication(mockAdmin, mockPublication);

        verify(publicationServiceImpl).approvePublication(mockAdmin, mockPublication);
    }

    @Test
    public void testRejectPublication() {
        PublicationService publicationServiceImpl = mock(PublicationService.class);
        User mockAdmin  = new User("consumidor@example.com", "password123", "", false);
        mockAdmin.setRole("Administrador");
        Publication mockPublication = new Publication("Contenido de la publicación", "REJECTED");

        doNothing().when(publicationServiceImpl).rejectPublication(mockAdmin, mockPublication);

        publicationServiceImpl.rejectPublication(mockAdmin, mockPublication);

        verify(publicationServiceImpl).rejectPublication(mockAdmin, mockPublication);
    }

    @Test
    public void testRatePublication() {
        PublicationService publicationServiceImpl = mock(PublicationService.class);
        User mockConsumer  = new User("consumidor@example.com", "password123", "", false);
        mockConsumer.setRole("Consumidor");
        Publication mockPublication = new Publication("Contenido de la publicación", "APPROVED");

        doNothing().when(publicationServiceImpl).ratePublication(mockConsumer, mockPublication, 5);

        publicationServiceImpl.ratePublication(mockConsumer, mockPublication, 5);

        verify(publicationServiceImpl).ratePublication(mockConsumer, mockPublication, 5);
    }
}
