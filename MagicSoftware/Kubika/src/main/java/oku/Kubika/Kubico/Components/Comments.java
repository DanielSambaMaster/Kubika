package oku.Kubika.Kubico.Components;

import jakarta.persistence.*;
import lombok.Data;


@Entity(name = "comments")
@Table(name = "Table")
@Data
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String comment;
}
