package teo.hackaton.salon.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teo.hackaton.salon.domain.Salon;
import teo.hackaton.salon.domain.SalonService;

import java.util.List;

@RestController
@RequestMapping("/salon")
public class SalonController {
    @Autowired
    private SalonService salonService;

    // returns list
    @GetMapping
    public ResponseEntity<List<Salon>> getAll() {
        return ResponseEntity.ok(salonService.findAll());
    }

    @PostMapping
    public ResponseEntity<Void> saveSalon(@RequestBody Salon salon) {
        salonService.saveSalon(salon);
        return ResponseEntity.created(null).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalon(@PathVariable Long id) {
        salonService.deleteSalon(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/id")
    public ResponseEntity<Void> updateSalon(@RequestBody Salon salon) {
        salonService.updateSalon(salon);
        return ResponseEntity.ok().build();
    }
}
