package oku.Kubika.SecurityUsers.Repository;

import oku.Kubika.SecurityUsers.Model.Kubikers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface RepositoryUsersK extends JpaRepository<Kubikers, UUID> {

    UserDetails findByName(String name);
    UserDetails findByUserId(String userId);
}
