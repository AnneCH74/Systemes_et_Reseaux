package com.ecommercewebapp.microcommercewebapp.web.dao;

import com.ecommercewebapp.microcommercewebapp.web.model.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/clients")
@RestController

public interface CustomerDao {
    List<Customer> findAll();
    Customer findById(int id);
    Customer save(Customer customer);
    Customer remove(int id);
    Customer update(int id, Customer customer);
}
