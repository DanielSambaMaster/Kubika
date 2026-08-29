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
    private List<Property> property;

    enum Modality{

        MONTHLY,
        YEARLY,
        DAILY
    }
}
