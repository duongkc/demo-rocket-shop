package ts.rocket.rocket_shop_backend.model;

import javax.persistence.*;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@Entity
public class Middle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int price;
    private String image;
    private String thumbnail;
    @Column(name = "rocket_id")
    private long rocketId;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public long getRocketId() {
        return rocketId;
    }

    public void setRocketId(long rocketId) {
        this.rocketId = rocketId;
    }
}
