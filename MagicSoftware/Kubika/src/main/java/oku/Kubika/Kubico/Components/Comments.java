package oku.Kubika.Kubico.Components;

import jakarta.persistence.*;
import lombok.Data;
import oku.Kubika.Kubico.Property;


@Entity(name = "comments")
@Table(name = "comments")
@Data
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    private String comment;
    public Comments(String comment){
        this.comment =comment;
    }
}
