package com.example.experiment.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Publication {
    private String content;
    private int rate; //valoracion 1 a 5
    private String status;//"APPROVED", "REJECTED"
    //private Product product; se puede crear la entidad
    //private String urlImage;
    //private String location;
    //private List<Comments> comments; // --> necesitamos crear comments



    public Publication(String content, String status) {
        this.content = content;
        this.status = status;
    }
}
