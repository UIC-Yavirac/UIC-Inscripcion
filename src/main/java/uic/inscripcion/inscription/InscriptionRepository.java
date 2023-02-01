package uic.inscripcion.inscription;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface InscriptionRepository extends CrudRepository<Inscription, Long>{

    List<Inscription> findAll();

}
