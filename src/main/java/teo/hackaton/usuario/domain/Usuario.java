package teo.hackaton.usuario.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import teo.hackaton.reserva.domain.Reserva;

import java.util.Collection;


import java.util.List;



@Entity
@Data
@NoArgsConstructor
    public class Usuario implements UserDetails {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idUsuario;
        private String nombre;
        private String correoElectronico;
        private String contrasena;
        private String telefono;

        @OneToMany(mappedBy = "usuario")
        private List<Reserva> reservas;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return contrasena ;
    }

    @Override
    public String getUsername() {
        return correoElectronico;
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


