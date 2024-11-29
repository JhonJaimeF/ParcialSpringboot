package com.example.demo.entyties;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productId;

    @Column(nullable = false, length = 40)
    private String name;
    private String Description;
    private double price;
    private Integer stock;
    @OneToMany(mappedBy = "product")
    private List<Sale> sales;

    public Product() {
    }

    public Product(Long productId, String name, String description, double price, Integer stock) {
        this.productId = productId;
        this.name = name;
        Description = description;
        this.price = price;
        this.stock = stock;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
