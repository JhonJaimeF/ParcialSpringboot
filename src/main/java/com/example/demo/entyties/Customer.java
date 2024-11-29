package com.example.demo.entyties;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long customerId;
    private String name;
    private String contact; // Cambiado a String
     @OneToMany(mappedBy = "customer")
  private List<Sale> sales;
     public Customer() {

     } public Customer(Long customerId, String name, String contact) {
         this.customerId = customerId;
         this.name = name;
         this.contact = contact;
     }
     public Long getCustomerId() {
         return customerId;
     }
     public void setCustomerId(Long customerId) {
         this.customerId = customerId;
     } public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     } public String getContact() {
         return contact;
     }
    public void setContact(String contact) {
         this.contact = contact;
     }
}