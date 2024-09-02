package com.example.nadi.services;

import com.example.nadi.entities.Publication;
import com.example.nadi.entities.User;
/**
TODO: tenemos que hacer un servicion para buscar (search)
**/
public interface PublicationService {

    Publication createPublication(User user, String content);

    void approvePublication(User user, Publication publication);

    void rejectPublication(User user, Publication publication);

    void ratePublication(User user, Publication publication, int rate);

}
