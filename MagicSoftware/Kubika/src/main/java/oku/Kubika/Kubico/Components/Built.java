package oku.Kubika.Kubico.Components;

import jakarta.persistence.*;

import java.util.List;

public abstract class Built {


    @ManyToOne
    private Category category;

    private String Description;

    @OneToOne
    private Location location;


    @ManyToMany
    private List<PaymentModality> paymentModality;

    @Enumerated(EnumType.STRING)
    private Offer offer;

    @OneToOne
    private Status status;
    private List<String> image;
    private String title;
    private Double price;
    private Double meters;

    private List<Comments> comments;
}
