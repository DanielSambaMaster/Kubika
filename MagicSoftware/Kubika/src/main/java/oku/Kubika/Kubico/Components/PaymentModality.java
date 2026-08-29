package oku.Kubika.Kubico.Components;

import jakarta.persistence.*;
import lombok.Data;
import oku.Kubika.Kubico.Property;

import java.util.List;

@Entity(name = "paymentModality")
@Table(name = "paymentModality")
@Data
public class PaymentModality {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "property_id")

    private List<Property> property;
    private Modality modality;
    public enum Modality{

        MONTHLY,
        YEARLY,
        DAILY
    }
}
