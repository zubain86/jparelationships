package com.example.jparelationships.response;

public class AddressResponse {
    private String societyName;
    private String localityName;

    public AddressResponse(String societyName, String localityName) {
        this.societyName = societyName;
        this.localityName = localityName;
    }

    public AddressResponse() {
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
}
