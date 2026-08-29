package oku.Kubika.Kubico.Components;

import jakarta.persistence.*;
import lombok.Data;
import oku.Kubika.Kubico.Property;

@Entity(name = "location")
@Table(name="location")
@Data
public class Location {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @OneToOne
    @JoinColumn(name = "property_id")
    private Property property;

    private String latitude;

    private String longitude;

    private String googleId;
    public Location(String title, String latitude, String longitude, String googleId){
        this.googleId =googleId;
        this.latitude =latitude;
        this.longitude =longitude;
        this.title = title;
    }
}
