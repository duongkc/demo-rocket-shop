package ts.rocket.rocket_shop_backend.model;

import javax.persistence.*;
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
    @OneToOne
    private Top top;
//    relatie middle
//    relatie bottom

    private String name;

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

    public Top getTop() {
        return top;
    }

    public void setTop(Top top) {
        this.top = top;
    }
}
