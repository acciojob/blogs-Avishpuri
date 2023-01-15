package com.driver.models;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table
public class Image{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(nullable = false)
    public String description;
    @Column(nullable = false)
    public String dimensions;

    public Image(){


    }

    @ManyToOne
    @JoinColumn
    private Blog blog;

    public Image(String description, String dimensions) {
        this.description = description;
        this.dimensions = dimensions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}