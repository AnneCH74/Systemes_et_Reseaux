package com.ecommercewebapp.microcommercewebapp.web.dao;

import com.ecommercewebapp.microcommercewebapp.web.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao{

    public static List<Customer> customers = new ArrayList<>();

    static{
        customers.add(new Customer(16, "BROS", "Mario", new Date(), "159A36987"));
        customers.add(new Customer(17, "BROS", "Luigi", new Date(), "159B36988"));
        customers.add(new Customer(16, "PRINCESS", "Peach", new Date(), "159C36989"));
    }


    //PUBLIC STATIC DATE BIRTHDAY ??????


    @Override
    public List<Customer> findAll() {return customers;}

    @Override
    public Customer findById(int id){
        for (Customer customer : customers){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer save(Customer customer){
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer remove(int id){
        Customer removeCustomer = findById(id);
        if(removeCustomer != null){
            customers.remove(removeCustomer);
        }
        return removeCustomer;
    }

@Override
    public Customer update(int id, Customer customer){
        Customer customerUpdate = findById(id);
        if(customerUpdate != null){
            customerUpdate.setName(customer.getName());
            customerUpdate.setFirstname(customer.getFirstname());
            customerUpdate.setBirthDate(customer.getBirthDate());
            customerUpdate.setNumberOfDriverLicense(customer.getNumberOfDriverLicense());
        }
        return customerUpdate;
}

}
