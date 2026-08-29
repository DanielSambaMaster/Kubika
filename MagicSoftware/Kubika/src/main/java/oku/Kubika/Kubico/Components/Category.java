package oku.Kubika.Kubico.Components;


import jakarta.persistence.*;
import lombok.Data;
import oku.Kubika.Kubico.Property;

import java.util.List;


@Entity(name = "category")
@Table(name ="category")
@Data
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "property_id")
    private List<Property> properties;

    private Type type;
    public enum Type{

        APARTMENT,
        HOUSE,
        DETACHED_HOUSE,
        ROOM,
        STUDIO_APARTMENT,
        LAND,
        COMMERCIAL_PROPERTY
    }


}
