package oku.Kubika.Kubico;


import jakarta.persistence.*;
import lombok.Data;
import oku.Kubika.Kubico.Components.*;

@Entity(name = "property")
@Table(name = "property")
@Data
public class  Property extends Built {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer numOfRooms;

    private Integer numOfToilets;






}
