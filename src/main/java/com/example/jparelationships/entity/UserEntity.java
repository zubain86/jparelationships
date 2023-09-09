package com.example.jparelationships.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private Integer user_id;

    private String firstName;
    private String lastName;
    private String mobileNumber;
    @OneToMany(targetEntity = AddressEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "user_id")
    private List<AddressEntity> addresses;

    public UserEntity() {
    }

    public UserEntity(Integer user_id, String firstName, String lastName, String mobileNumber, List<AddressEntity> addresses) {
        this.user_id = user_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.addresses = addresses;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<AddressEntity> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressEntity> addresses) {
        this.addresses = addresses;
    }
}
