package teo.hackaton.salonetiqueta.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalonEtiquetaService {

    @Autowired
    private SalonEtiquetaRepository salonEtiquetaRepository;
    @Autowired
    private SalonRepository salonRepository;
    @Autowired
    private EtiquetaRepository etiquetaRepository;
    public static void save(Long idSalon, Long idEtiqueta) {
        Etiqueta etiqueta = etiquetaRepository.findById(idEtiqueta).get();
        Salon salon = salonRepository.findById(idSalon).get();

        SalonEtiqueta salonEtiqueta = new SalonEtiqueta();
        salonEtiqueta.setEtiqueta(etiqueta);
        salonEtiqueta.setSalon(salon);
        salonEtiquetaRepository.save(salonEtiqueta);
    }

    public static void delete(Long idSalon, Long idEtiqueta) {
        salonEtiquetaRepository.deleteById()
    }
}
