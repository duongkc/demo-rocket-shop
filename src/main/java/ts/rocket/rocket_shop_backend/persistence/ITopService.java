package ts.rocket.rocket_shop_backend.persistence;

import ts.rocket.rocket_shop_backend.model.Top;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
public interface ITopService {

    Iterable<Top> findByRocketId(long id);
}
