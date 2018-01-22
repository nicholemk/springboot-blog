package models;

import javax.persistence.*;

@Entity
@Table(name = "Blog Table")
public class Post {
        @Id
        @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = true)
    private String description;

    public Post(String title, String Description) {
        this.title = title;
        this.description = description;
    }

    public Post() {

    }

    public String getTitle() {this.title = title; }

    public String getDescription() {this.description = description; }

}
