package model;

import java.util.*;

public class Part {
    private UUID id = UUID.randomUUID();
    private String name = "";
    private String brand = "";
    private double price = 0;

    public static List<Part> parts = new ArrayList<>();
    {
        parts.add(this);
    }

    public Part(){}
    public Part(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
