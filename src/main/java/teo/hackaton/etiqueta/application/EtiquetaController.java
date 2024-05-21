package teo.hackaton.etiqueta.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teo.hackaton.etiqueta.domain.EtiquetaService;

import java.util.List;

@RequestMapping("/etiquetas")
@RestController
public class EtiquetaController {
    @Autowired
    private EtiquetaService etiquetaService;

    @GetMapping
    public ResponseEntity<List<Etiqueta>> getEtiquetas() {
        return ResponseEntity.ok(etiquetaService.getEtiquetas());
    }

    @PostMapping
    public ResponseEntity<Void> saveEtiqueta(@RequestBody Etiqueta etiqueta) {
        return ResponseEntity.ok(etiquetaService.saveEtiqueta(etiqueta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateEtiqueta(@PathVariable Long id, @RequestBody Etiqueta etiqueta) {
        return ResponseEntity.ok(etiquetaService.updateEtiqueta(etiqueta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> updateEtiqueta(@PathVariable Long id) {
        etiquetaService.deleteEtiqueta(id);
        return ResponseEntity.noContent().build();
    }
}
