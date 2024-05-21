package teo.hackaton.reserva.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import teo.hackaton.reserva.domain.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
