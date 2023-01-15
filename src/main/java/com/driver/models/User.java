package com.driver.models;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String username;

@Column(nullable = false)
    private String password;
@Column(nullable = false)
    private String fistName;
@Column(nullable = false)
    private String lastName;


     public User(){

     }

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JoinColumn
    private List<Blog> blogList;

    public User(String username, String password, String fistName, String lastName) {
        this.username = username;
        this.password = password;
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}