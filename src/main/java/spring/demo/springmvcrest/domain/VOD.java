package spring.demo.springmvcrest.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class VOD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Link", nullable = false)
    private String link;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "Subtitles")
    private String subtitles;

    @Column(name = "Actor_Author")
    private String actor_author;

    @Column(name = "Type")
    private String type;

    @Column(name = "Type_1")
    private String type_1;

    @Column(name = "Countries")
    private String countries;

    @Column(name = "Date_Create")
    private Date date_create = new Date();

    @Column(name = "Date_Update")
    private Date date_update = new Date();

    @Column(name = "VOD_Stream")
    private int vod_stream = 1;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(String subtitles) {
        this.subtitles = subtitles;
    }

    public String getActor_author() {
        return actor_author;
    }

    public void setActor_author(String actor_author) {
        this.actor_author = actor_author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_1() {
        return type_1;
    }

    public void setType_1(String type_1) {
        this.type_1 = type_1;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }

    public int getVod_stream() {
        return vod_stream;
    }

    public void setVod_stream(int vod_stream) {
        this.vod_stream = vod_stream;
    }
}
