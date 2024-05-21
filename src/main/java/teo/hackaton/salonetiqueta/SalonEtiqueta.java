package teo.hackaton.salonetiqueta;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.ManyToOne;
import teo.hackaton.etiqueta.domain.Etiqueta;
import teo.hackaton.salon.domain.Salon;

@Entity
public class SalonEtiqueta {
    @Id int id;
    @ManyToOne Etiqueta etiqueta;
    @ManyToOne Salon salon;



}
