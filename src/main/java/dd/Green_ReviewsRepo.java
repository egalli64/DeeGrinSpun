package dd;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Green_ReviewsRepo extends CrudRepository<Green_Review, Long> {
	List<Green_Review> findByGreenRistorante_ristoranteId(long id);
}
