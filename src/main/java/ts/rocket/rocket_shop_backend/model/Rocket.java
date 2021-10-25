package ts.rocket.rocket_shop_backend.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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
    private String name;
    private String thumbnail;
//    relatie top
    @OneToMany
    @JoinColumn(name = "rocket_id")
    private List<Top> top;
//    relatie middle
    @OneToMany
    @JoinColumn(name = "rocket_id")
    private List<Middle> middle;
//    relatie bottom
    @OneToMany
    @JoinColumn(name = "rocket_id")
    private List<Bottom> bottom;


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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<Top> getTop() {
        return top;
    }

    public void setTop(List<Top> top) {
        this.top = top;
    }

    public List<Middle> getMiddle() {
        return middle;
    }

    public void setMiddle(List<Middle> middle) {
        this.middle = middle;
    }

    public List<Bottom> getBottom() {
        return bottom;
    }

    public void setBottom(List<Bottom> bottom) {
        this.bottom = bottom;
    }
}
