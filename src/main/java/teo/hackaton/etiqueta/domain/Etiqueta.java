package teo.hackaton.etiqueta.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import teo.hackaton.salon.domain.Salon;

import java.util.List;

@Entity
public class Etiqueta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtiqueta;
    private String nombre;

    @ManyToMany(mappedBy = "etiquetas")
    private List<Salon> salones;

    public Long getIdEtiqueta() {
        return idEtiqueta;
    }

    public void setIdEtiqueta(Long idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Salon> getSalones() {
        return salones;
    }

    public void setSalones(List<Salon> salones) {
        this.salones = salones;
    }
}
