package oku.Kubika.User.Domain.Model;

import jakarta.persistence.*;
import oku.Kubika.Comunication.Domain.Comunication.Conversation;
import oku.Kubika.Comunication.Domain.Comunication.Message.Message;
import oku.Kubika.Immeuble.Domain.Immeuble.Immeuble;
import oku.Kubika.Comunication.Domain.VisitRequest.VisitRequest;
import oku.Kubika.User.Domain.Roles.Role;
import oku.Kubika.User.Domain.Status.Status;
import org.hibernate.annotations.CreationTimestamp;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "users")
public class Users implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(unique = true, length = 30)
    private String phone;

    @Column(nullable = false)
    private String password;

    private String profileImage;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Role role;

    private boolean verified;

    private boolean emailVerified;

    private boolean phoneVerified;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime lastLogin;




    @OneToMany(mappedBy = "proprietario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Immeuble> imoveis = new ArrayList<>();

    @OneToMany(mappedBy = "solicitante")
    private List<VisitRequest> visitasSolicitadas = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "favorites",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "property_id")
    )
    private Set<Immeuble> favoritos = new HashSet<>();

    @ManyToMany(mappedBy = "participantes")
    private Set<Conversation> conversas = new HashSet<>();

    @OneToMany(mappedBy = "remetente")
    private List<Message> mensagensEnviadas = new ArrayList<>();








    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public @Nullable String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}