package com.example.jparelationships.shared.dto;

public class AddressDto {
    private int address_id;
    private String flatNo;
    private String societyName;

    private String localityName;
    private String cityName;

    private String stateName;

    private UserDto userDto;

    public AddressDto() {
    }

    public AddressDto(int address_id, String flatNo, String societyName, String localityName, String cityName, String stateName, UserDto userDto) {
        this.address_id = address_id;
        this.flatNo = flatNo;
        this.societyName = societyName;
        this.localityName = localityName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.userDto = userDto;
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

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
