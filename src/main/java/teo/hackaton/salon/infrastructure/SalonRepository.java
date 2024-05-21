package teo.hackaton.salon.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import teo.hackaton.salon.domain.Salon;

public interface SalonRepository extends JpaRepository<Salon, Long> {
}
