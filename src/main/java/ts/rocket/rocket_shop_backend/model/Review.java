package ts.rocket.rocket_shop_backend.model;

import javax.persistence.*;
import java.util.List;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long rating;
    private String title;
    private String user;
    private String date;
    @OneToMany
    @JoinColumn(name = "review_id")
    private List<Pros> pros;
    @OneToMany
    @JoinColumn(name = "review_id")
    private List<Cons> cons;
    private String description;
    @Column (name = "rocket_id")
    private long rocketId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Pros> getPros() {
        return pros;
    }

    public void setPros(List<Pros> pros) {
        this.pros = pros;
    }

    public List<Cons> getCons() {
        return cons;
    }

    public void setCons(List<Cons> cons) {
        this.cons = cons;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getRocketId() {
        return rocketId;
    }

    public void setRocketId(long rocketId) {
        this.rocketId = rocketId;
    }
}
