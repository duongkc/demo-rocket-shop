package ts.rocket.rocket_shop_backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@Entity
public class Rocket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    relatie top
//    relatie middle
//    relatie bottom

    private String name;
    private LocalDateTime orderDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
