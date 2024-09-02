package com.example.nadi.services;

import com.example.nadi.entities.Publication;
import com.example.nadi.entities.User;
import org.springframework.stereotype.Service;

@Service
public class PublicationServiceImpl implements PublicationService {

    //@Autowired
    //private PublicationRepository publicationRepository;

    @Override
    public Publication createPublication(User user, String content) {
        /*if (!"Productor".equals(user.getRole())) {
            throw new SecurityException("User does not have permission to create a publication");
        }
        Publication publication = new Publication();
        publication.setContent(content);
        publication.setStatus("PENDING");
        return publicationRepository.save(publication);
         */
        return null;
    }

    @Override
    public void approvePublication(User user, Publication publication) {
        /*if (!"Administrador".equals(user.getRole())) {
            throw new SecurityException("User does not have permission to approve a publication");
        }
        publication.setStatus("APPROVED");
        publicationRepository.save(publication);*/
    }

    @Override
    public void rejectPublication(User user, Publication publication) {
        /*if (!"Administrador".equals(user.getRole())) {
            throw new SecurityException("User does not have permission to reject a publication");
        }
        publication.setStatus("REJECTED");
        publicationRepository.save(publication);*/
    }

    @Override
    public void ratePublication(User user, Publication publication, int rate) {
        /*if (!"Consumidor".equals(user.getRole())) {
            throw new SecurityException("User does not have permission to rate a publication");
        }
        publication.setRating(rate);
        publicationRepository.save(publication);*/
    }
}
