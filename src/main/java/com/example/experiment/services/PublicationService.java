package com.example.experiment.services;

import com.example.experiment.entities.Publication;
import com.example.experiment.entities.User;
/**
TODO: tenemos que hacer un servicion para buscar (search)
**/
public interface PublicationService {

    Publication createPublication(User user, String content);

    void approvePublication(User user, Publication publication);

    void rejectPublication(User user, Publication publication);

    void ratePublication(User user, Publication publication, int rate);

}
