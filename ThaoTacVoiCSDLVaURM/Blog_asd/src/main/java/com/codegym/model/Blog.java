package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "`blogs`")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String describeBlog;
    private String createDate;

    public Blog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribeBlog() {
        return describeBlog;
    }

    public void setDescribeBlog(String describeBlog) {
        this.describeBlog = describeBlog;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
