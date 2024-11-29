package com.example.demo.entyties;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long saleId;
    private Long productId;
    private Long customerId;
    private Integer quantity;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "customerId", insertable = false, updatable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "productId", insertable = false, updatable = false)
    private Product product;

    public Sale() {
    }

    public Sale(Long saleId, Long productId, Long customerId, Integer quantity, LocalDate date) {
        this.saleId = saleId;
        this.productId = productId;
        this.customerId = customerId;
        this.quantity = quantity;
        this.date = date;
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
