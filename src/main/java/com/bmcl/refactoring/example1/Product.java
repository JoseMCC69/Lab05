package com.bmcl.refactoring.example1;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = (name != null && !name.trim().isEmpty()) ? name : "Unnamed Product";
        this.price = Math.max(price, 0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        }
    }
}
