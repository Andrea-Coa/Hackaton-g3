package teo.hackaton.etiqueta.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtiquetaService {
    @Autowired
    private EtiquetaRepository etiquetaRepository;


    public List<Etiqueta> getEtiquetas() {
        return etiquetaRepository.findAll();
    }

    public void saveEtiqueta(Etiqueta etiqueta) {
        etiquetaRepository.save(etiqueta);
    }

    public void updateEtiqueta(Long id, Etiqueta etiqueta) {
        etiqueta.setId(id);
        etiquetaRepository.save(etiqueta);
    }

    public void deleteEtiqueta(Long id) {
        etiquetaRepository.deleteById(id);
    }
}
