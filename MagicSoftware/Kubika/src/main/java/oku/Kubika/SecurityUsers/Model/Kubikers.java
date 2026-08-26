package oku.Kubika.SecurityUsers.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oku.Kubika.SecurityUsers.Model.Set.*;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity(name = "Kubikers")
@Table(name = "Kubikers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Kubikers implements UserDetails {


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


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public @Nullable String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
