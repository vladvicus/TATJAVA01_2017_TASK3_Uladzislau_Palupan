package com.epam.catalog.bean;

/**
 * Created by Uladzislau_Palupan on 2/1/2017.
 */
public class Disk {
    private Type type;
    private String name;
    private Integer year;
    private Double price;

    public Disk(Type type, String name, Integer year, Double price) {
        this.type = type;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

        Disk disk = (Disk) o;

        if (!getType().equals(disk.getType())) return false;
        if (!getName().equals(disk.getName())) return false;
        if (!getYear().equals(disk.getYear())) return false;
        return getPrice().equals(disk.getPrice());
    }

    @Override
    public int hashCode() {
        int result = getType().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getYear().hashCode();
        result = 31 * result + getPrice().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
