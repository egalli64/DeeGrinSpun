package dd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Green_ReviewsRepo extends CrudRepository<Green_Review, Long> {
}
