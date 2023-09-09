package com.example.jparelationships.shared.dto;

import java.util.List;

public class UserDto {
    private int user_id;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    private List<AddressDto> addresses;

    public UserDto() {
    }

    public UserDto(int user_id, String firstName, String lastName, String mobileNumber, List<AddressDto> addresses) {
        this.user_id = user_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.addresses = addresses;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
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

    public List<AddressDto> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDto> addresses) {
        this.addresses = addresses;
    }
}
