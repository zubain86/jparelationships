package com.example.jparelationships.entity;


import jakarta.persistence.*;


@Entity
public class AddressEntity {
    @Id
    @GeneratedValue
    private Integer address_id;
    private String flatNo;
    private String societyName;
    private String localityName;

    private String cityName;
    private String stateName;


    public AddressEntity() {
    }

    public AddressEntity(int address_id, String flatNo, String societyName, String localityName, String cityName, String stateName) {
        this.address_id = address_id;
        this.flatNo = flatNo;
        this.societyName = societyName;
        this.localityName = localityName;
        this.cityName = cityName;
        this.stateName = stateName;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
