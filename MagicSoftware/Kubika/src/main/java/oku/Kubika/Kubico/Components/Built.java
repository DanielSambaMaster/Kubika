package oku.Kubika.Kubico.Components;

import jakarta.persistence.*;

import java.util.List;

@MappedSuperclass
public abstract class Built {


    @ManyToOne
    private Category category;

    private String description;

    @OneToOne
    private Location location;


    @ManyToMany
    private List<PaymentModality> paymentModalities;

    @Enumerated(EnumType.STRING)
    private Offer offer;

    @OneToOne
    private Status status;
    @ElementCollection
    private List<String> image;
    private String title;
    private Double price;
    private Double meters;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List<Comments> comments;
    protected Built(
            Category category,
            String description,
            Location location,
            List<PaymentModality> paymentModalities,
            Offer offer,
            Status status,
            List<String> image,
            String title,
            Double price,
            Double meters,
            List<Comments> comments
    ) {

        this.description = description;
        this.category = category;
        this.location = location;
        this.paymentModalities = paymentModalities;
        this.offer = offer;
        this.status = status;
        this.image = image;
        this.title = title;
        this.price = price;
        this.meters = meters;
        this.comments = comments;
    }

    protected Built() {
    }
}
