package com.example.demo.services;

import com.example.demo.entyties.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> readCustomers() {
        return customerRepository.findAll();
    }
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

}
