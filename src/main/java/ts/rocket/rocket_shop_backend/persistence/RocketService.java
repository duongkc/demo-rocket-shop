package ts.rocket.rocket_shop_backend.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ts.rocket.rocket_shop_backend.model.Rocket;

import java.util.Optional;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@Service
public class RocketService {
    @Autowired
    private RocketRepository rr;

    public Rocket fetchRocketsWithId(long id) {
        Optional<Rocket> rocket0 = rr.findById(id);
        return rocket0.get();


    }
}
