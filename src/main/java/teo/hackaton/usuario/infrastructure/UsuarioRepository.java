package teo.hackaton.usuario.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import teo.hackaton.usuario.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByCorreoElectronico(String correoElectronico);
}

