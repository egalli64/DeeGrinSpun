package dd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Green_UtentiRepo extends CrudRepository<Green_Ristorante, Long> {
}