package com.Omnify.Assignment.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @Column
    private int id;
    @Column
    private String title;
    @Column
    private String subtitle;
    @Column
    private String content;

    public Blog(){}

    public Blog(int id, String title, String subtitle, String content) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
