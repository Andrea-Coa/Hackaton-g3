package teo.hackaton.reserva.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public ResponseEntity<List<Reserva>>  getReservas() {
        return ResponseEntity.ok(reservaService.getReservas());
    }

    // vambiar al dto
    @PostMapping
    public ResponseEntity<Void> saveReserva(@RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaService.saveReserva(reserva));
    }

    @PutMapping
    public ResponseEntity<Void> updateReserva(@RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaService.updateReserva(reserva));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReserva(@PathVariable Long id) {
        return ResponseEntity.ok(reservaService.deleteReserva(reserva));
    }
}
