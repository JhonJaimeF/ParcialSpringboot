package com.example.demo.entyties;

import jakarta.persistence.*;

@Entity
public class Inventary {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long stockId; private Long productId;
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "productId", insertable = false, updatable = false)
    private Product product;

    public Inventary() {
    }

    public Inventary(Long stockId, Long productId, Integer quantity) {
        this.stockId = stockId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
