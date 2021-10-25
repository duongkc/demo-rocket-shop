package ts.rocket.rocket_shop_backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ts.rocket.rocket_shop_backend.model.Rocket;
import ts.rocket.rocket_shop_backend.model.Top;
import ts.rocket.rocket_shop_backend.persistence.RocketService;
import ts.rocket.rocket_shop_backend.persistence.TopRepository;
import ts.rocket.rocket_shop_backend.persistence.TopService;

import java.util.List;

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

    @Autowired
    private TopService ts;


    @CrossOrigin(origins = "", allowedHeaders ="")
    @GetMapping(value = "rocketbyid/{id}", produces = { MediaType.APPLICATION_JSON_VALUE})
    public Rocket rocketbyId(@PathVariable long id) {
//        sanitisation, check input
        return rs.fetchRocketsWithId(id);
    }

//    @GetMapping("trying")
//    public void trying() {
//        long idraket = 0;
//        Top top = new Top();
//        rs.addTopToRocket(top, idraket);
//    }

    @GetMapping("showrockets")
    public Iterable<Rocket> allRockets(){
        return rs.fetchAllRockets();
    }

    @CrossOrigin(origins = "", allowedHeaders ="")
    @PostMapping("topparts")
    public Iterable<Top> showTopPartsOfRocket(@RequestParam long id) {
        return ts.findByRocketId(id);
    }

    @CrossOrigin(origins = "", allowedHeaders = "")
    @GetMapping(value = "maininfo", produces = { MediaType.APPLICATION_JSON_VALUE})
    public Iterable<Rocket> showMainRocketInfo() {
        return rs.fetchMainInfo();
    }
}
