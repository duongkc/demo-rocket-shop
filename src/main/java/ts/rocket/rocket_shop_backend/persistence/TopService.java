package ts.rocket.rocket_shop_backend.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ts.rocket.rocket_shop_backend.model.Top;

import java.util.List;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@Service
public class TopService {
    @Autowired
    private TopRepository ts;

    public Iterable<Top> getPartsbyRocketId(Long id) {
        return ts.findAll();
    }
}
