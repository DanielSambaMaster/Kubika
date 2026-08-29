package oku.Kubika.RepoLayer;

import oku.Kubika.Kubico.Components.PaymentModality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRepo extends JpaRepository<PaymentModality, Integer> {
}
