package oku.Kubika.Kubico;


import jakarta.persistence.*;
import lombok.Data;
import oku.Kubika.Kubico.Components.*;

import java.util.List;

@Entity(name = "property")
@Table(name = "property")
@Data
public class  Property extends Built {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer numOfRooms;

    private Integer numOfToilets;


    public Property(Integer numOfRooms, Integer numOfToilets, Category category,
                    String description, Location location,  List<PaymentModality> paymentModalities,
                   Offer offer, Status status, List<String> image, String title, Double price, Double meters,
                    List<Comments> comments){

        super(category,description, location, paymentModalities, offer, status, image, title, price, meters, comments);

        this.numOfRooms = numOfRooms;
        this.numOfToilets = numOfToilets;


    }





}
