package teo.hackaton.salonetiqueta.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import teo.hackaton.salonetiqueta.domain.SalonEtiquetaService;

@RestController
public class SalonEtiquetaController {

    @Autowired
    private SalonEtiquetaService salonEtiquetaService;
    @PostMapping("/salones/{idSalon}/etiquetas/{idEtiqueta}")
    public ResponseEntity<Void> asignarEtiqueta(
            @PathVariable Long idSalon, @PathVariable Long idEtiqueta) {
        SalonEtiquetaService.save(idSalon, idEtiqueta);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/salones/{idSalon}/etiquetas/{idEtiqueta}")
    public ResponseEntity<Void> eliminarEtiqueta(
            @PathVariable Long idSalon, @PathVariable Long idEtiqueta) {
        SalonEtiquetaService.delete(idSalon, idEtiqueta);
        return ResponseEntity.noContent().build();
    }
}
