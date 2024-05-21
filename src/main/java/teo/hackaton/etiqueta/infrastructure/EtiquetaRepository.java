package teo.hackaton.etiqueta.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import teo.hackaton.etiqueta.domain.Etiqueta;

public interface EtiquetaRepository extends JpaRepository<Etiqueta, Long> {
}
