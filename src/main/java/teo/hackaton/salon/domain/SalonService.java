package teo.hackaton.salon.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonService {

    @Autowired
    private SalonRepository salonRepository;


    public List<Salon> findAll() {
        return salonRepository.findAll();
    }

    public void saveSalon(Salon salon) {
        salonRepository.save(salon);

    }

    public void deleteSalon(Long id) {
        x|salonRepository.deleteById(id);
    }

    public void updateSalon(Salon salon) {

    }
}
