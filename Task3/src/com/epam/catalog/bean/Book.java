package com.epam.catalog.bean;

/**
 * Created by Uladzislau_Palupan on 2/1/2017.
 */
public class Book  {
    private String author;
    private String name;
    private Integer pages;
    private Double price;

    public Book(String author, String name, Integer pages, Double price) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;
        if (getName() != null ? !getName().equals(book.getName()) : book.getName() != null) return false;
        if (getPages() != null ? !getPages().equals(book.getPages()) : book.getPages() != null) return false;
        return getPrice() != null ? getPrice().equals(book.getPrice()) : book.getPrice() == null;
    }

    @Override
    public int hashCode() {
        int result = getAuthor() != null ? getAuthor().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPages() != null ? getPages().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", price=" + price +"$"+
                '}';
    }
}
