package com.ecommercewebapp.microcommercewebapp.web.controller;
//package com.ecommercewebapp.microcommercewebapp.web.dao;

import com.ecommercewebapp.microcommercewebapp.web.model.Customer;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/clients")

public class CustomerController {
    ArrayList<Customer> liste = new ArrayList<Customer>() {{
        add(new Customer(20, "BON", "Bon", new Date(), "A12345678"));
        add(new Customer(7, "STRAPPAZZON", "Philippe", new Date(), "B12345678"));
        add(new Customer(8, "BONO", "Jean", new Date(), "C12345678"));
    }};

    //Ajouter un client (POST)
    @ApiOperation(value = "Ajoute un nouveau client")
    @PostMapping
    public void addCustomer(@RequestBody Customer newCustomer) {
        liste.add(newCustomer);
    }

    //Renvoyer la liste des clients (GET)
    @GetMapping
    public ArrayList<Customer> listClient() {
        return liste;
    }

    // Renvoyer les infos du client correspondant à l'identifiant (id) choisi (GET)
    @GetMapping("/{urlid}")
    public Customer getCustomer(@PathVariable int urlid) {
        for (int index = 0; index < liste.size(); index++) {
            Customer c = liste.get(index);
            if (urlid == c.getId()) {
                return c;
            }
        }
        return null;
    }

}

