package com.example.jparelationships.request;

import java.util.List;

public class UserReq {
    private String firstName;
    private String lastName;
    private String mobileNumber;

    private List<AddressReq> addresses;

    public List<AddressReq> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressReq> addresses) {
        this.addresses = addresses;
    }

    public UserReq(String firstName, String lastName, String mobileNumber, List<AddressReq> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.addresses = addresses;
    }

    public UserReq() {
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
}
