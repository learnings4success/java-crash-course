package org.learnings4success.day2;

import java.util.UUID;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private UUID serial;

    public Product(int id, String name, double price, int quantity, UUID serial) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UUID getSerial() {
        return serial;
    }

    public void setSerial(UUID serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", serial=" + serial +
                '}';
    }
}
