package ts.rocket.rocket_shop_backend.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ts.rocket.rocket_shop_backend.model.Rocket;
import ts.rocket.rocket_shop_backend.model.Top;

import java.util.List;
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

    @Autowired
    private TopRepository tr;

    public Rocket fetchRocketsWithId(long id) {
        Optional<Rocket> rocket0 = rr.findById(id);
        return rocket0.orElse(null);
    }

    public void addTopToRocket(Top top, long rocketId) {
        System.out.println("test i'm in the service");
        Rocket r = rr.findById(rocketId).get();
        Top temp = tr.save(top);
        r.setTop(temp);
        rr.save(r);
    }

    public Iterable<Rocket> fetchAllRockets(){
        return rr.findAll();
    }
}
