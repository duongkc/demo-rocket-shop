package ts.rocket.rocket_shop_backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@Entity
public class Bottom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String image;
    private long rocketId;

}
