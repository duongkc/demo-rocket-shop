package ts.rocket.rocket_shop_backend.model;

import javax.persistence.*;

/**
 * Class
 *
 * @author Kim Chau Duong
 * @version 1.0
 */
@Entity
public class Cons {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String text;
    @Column(name="review_id")
    private long reviewId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getReviewId() {
        return reviewId;
    }

    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }
}
