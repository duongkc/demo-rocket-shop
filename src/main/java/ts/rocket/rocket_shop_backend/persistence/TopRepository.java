package ts.rocket.rocket_shop_backend.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ts.rocket.rocket_shop_backend.model.Top;

import java.util.List;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@Component
public interface TopRepository extends CrudRepository<Top, Long> {

    Iterable<Top> findByName(String name);

    Iterable<Top> findByRocketId(long id);
}
