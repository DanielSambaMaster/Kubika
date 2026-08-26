package oku.Kubika.SecurityUsers.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oku.Kubika.SecurityUsers.Model.Set.*;
import org.springframework.security.core.parameters.P;

import java.util.List;
import java.util.UUID;

@Entity(name = "Kubikers")
@Table(name = "Kubikers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Kubikers {


    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String userId;
    private String name;
    private String userName;
    private String linkImage;
    private String password;
    private KubicaLevel kubicaLevel;
    private List<Favorite> favorites;

    private List<Request> requests;
    private List<Properties> desejos;
    private List<Wishes> wishes;
    private Status status;
    private String email;
    private String contact;
    private String wcontact;
    private Role role;



}
