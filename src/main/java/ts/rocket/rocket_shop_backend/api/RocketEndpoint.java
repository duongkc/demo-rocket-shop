package ts.rocket.rocket_shop_backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ts.rocket.rocket_shop_backend.model.Rocket;
import ts.rocket.rocket_shop_backend.persistence.RocketService;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@RestController
public class RocketEndpoint {
    @Autowired
    private RocketService rs;

    @CrossOrigin(origins = "", allowedHeaders ="")
    @GetMapping("rocketbyid/{id}")
    public Rocket rocketbyId(@PathVariable long id) {
//        sanitisation, check input
        return rs.fetchRocketsWithId(id);
    }

}
