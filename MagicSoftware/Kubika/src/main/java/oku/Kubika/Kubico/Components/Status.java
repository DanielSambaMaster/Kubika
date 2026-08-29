package oku.Kubika.Kubico.Components;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "status")
@Table(name = "status")
public class Status {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    enum States{

        DISPONIVEL,
        OCUPADO,
        VENDIDO,
        IDLE

    }

}
