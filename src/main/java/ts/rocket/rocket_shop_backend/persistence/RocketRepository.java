package ts.rocket.rocket_shop_backend.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ts.rocket.rocket_shop_backend.model.Rocket;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@Component
public interface RocketRepository extends CrudRepository<Rocket, Long> {
}
