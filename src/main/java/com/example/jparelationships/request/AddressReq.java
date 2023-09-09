package com.example.jparelationships.request;

public class AddressReq {
    private String flatNo;
    private String societyName;
    private String localityName;
    private String cityName;

    private String stateName;

    private UserReq userReq;

    public UserReq getUserReq() {
        return userReq;
    }

    public void setUserReq(UserReq userReq) {
        this.userReq = userReq;
    }

    public AddressReq() {
    }

    public AddressReq(String flatNo, String societyName, String localityName, String cityName, String stateName, UserReq userReq) {
        this.flatNo = flatNo;
        this.societyName = societyName;
        this.localityName = localityName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.userReq = userReq;
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
