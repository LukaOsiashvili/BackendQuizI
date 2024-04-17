package com.example.demo.dto;

public class AddressDTO {

    private String addressName;
    private CityDTO city;

    public AddressDTO() {
    }

    public AddressDTO(String addressName, CityDTO city) {
        this.addressName = addressName;
        this.city = city;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }
}
