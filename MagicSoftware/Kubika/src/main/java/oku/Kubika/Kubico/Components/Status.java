package oku.Kubika.Kubico.Components;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import oku.Kubika.Kubico.Property;

@Data
@Entity(name = "status")
@Table(name = "status")
@Getter
@Setter
public class Status {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    @ManyToMany
    @JoinColumn(name = "property_id")
    private Property property;
    private States states;
    public enum States{

        DISPONIVEL,
        OCUPADO,
        VENDIDO,
        IDLE

    }

}
