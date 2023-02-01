package uic.inscripcion.inscripcionfk;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin({ "*" })
@FeignClient(name = "bff.customer.inscripcionfk", url = "http://localhost:3000/api/inscripcionfk")
public interface CustomerInscripcion {

    @GetMapping("/{id}/")
    InscripcionfkDTO findById(@PathVariable("id") Long id);

    @GetMapping("/")
    List<InscripcionfkDTO> findAll();

    @PostMapping("/")
    InscripcionfkDTO save(InscripcionfkDTO entity);

    @DeleteMapping("/{id}/")
    void deleteById(@PathVariable("id") Long id);

    @PutMapping("/{id}/")
    InscripcionfkDTO update(@PathVariable("id") Long id, InscripcionfkDTO entity);

    // @PutMapping("/{id}/completardatos/")
    // InscripcionfkDTO completardatos(@PathVariable("id") Long id);

}
