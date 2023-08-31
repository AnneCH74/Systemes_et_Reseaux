package com.ecommercewebapp.microcommercewebapp.web.model;

import java.util.Date;

public class Customer {
    private int id;
    private String name;
    private String firstname;
    private Date birthDate;
    private String numberOfDriverLicense;

    public Customer() {
    }

    public Customer(int id, String name, String firstname, Date birthDate, String numberOfDriverLicense) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.numberOfDriverLicense = numberOfDriverLicense;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNumberOfDriverLicense() {
        return numberOfDriverLicense;
    }

    public void setNumberOfDriverLicense(String numberOfDriverLicense) {
        this.numberOfDriverLicense = numberOfDriverLicense;
    }

    @Override
    public String toString(){
        return "Customer{" +
                "id" + id +
                ", nom='" + name + '\'' +
                ", prénom='" + firstname +
                ", date de naissance=" + birthDate +
                ", numéro de permis de conduire" + numberOfDriverLicense +
                '}';
    }

}
