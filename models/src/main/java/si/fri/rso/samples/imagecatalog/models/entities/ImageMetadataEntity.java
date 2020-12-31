package si.fri.rso.samples.imagecatalog.models.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "image_metadata")
@NamedQueries(value =
        {
                @NamedQuery(name = "ImageMetadataEntity.getAll",
                        query = "SELECT im FROM ImageMetadataEntity im"),

                @NamedQuery(
                        name = "ImageMetadataEntity.getbyUserId",
                        query = "Select im from ImageMetadataEntity im where im.user_id = :userId"
                ),
        })
public class ImageMetadataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Column(name = "created")
    private Instant created;

    @Column(name = "uri")
    private String uri;

    @Column(name = "user_id")
    private Integer user_id;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}