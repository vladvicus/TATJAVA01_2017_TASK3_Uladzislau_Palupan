package com.epam.catalog.bean;

import java.io.Serializable;



public class News implements Serializable {
    private Integer id;
    private Category category;
    private String title;
    private String body;

    public News() {
    }

    public News(Integer id) {
        this.id = id;
    }

    public News(Integer id, Category category, String title, String body) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.body = body;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (!getId().equals(news.getId())) return false;
        if (getCategory() != news.getCategory()) return false;
        if (!getTitle().equals(news.getTitle())) return false;
        return getBody().equals(news.getBody());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getCategory().hashCode();
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getBody().hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "com.epam.catalog.bean.News{" +
                "id=" + id +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
