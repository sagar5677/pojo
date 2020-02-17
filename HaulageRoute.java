
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SequenceNumber",
    "HaulagePointCode",
    "HaulagePointName",
    "SiteCode",
    "AddressName",
    "Address1",
    "Address2",
    "Address3",
    "City",
    "State",
    "Country",
    "StreetNo",
    "CountryCode",
    "PhoneNo",
    "ZipCode",
    "AppointmentTimeFrom",
    "AppointmentTimeTo"
})
public class HaulageRoute {

    @JsonProperty("SequenceNumber")
    private String sequenceNumber;
    @JsonProperty("HaulagePointCode")
    private String haulagePointCode;
    @JsonProperty("HaulagePointName")
    private String haulagePointName;
    @JsonProperty("SiteCode")
    private String siteCode;
    @JsonProperty("AddressName")
    private String addressName;
    @JsonProperty("Address1")
    private String address1;
    @JsonProperty("Address2")
    private Object address2;
    @JsonProperty("Address3")
    private Object address3;
    @JsonProperty("City")
    private String city;
    @JsonProperty("State")
    private String state;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("StreetNo")
    private Object streetNo;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("PhoneNo")
    private Object phoneNo;
    @JsonProperty("ZipCode")
    private Object zipCode;
    @JsonProperty("AppointmentTimeFrom")
    private String appointmentTimeFrom;
    @JsonProperty("AppointmentTimeTo")
    private String appointmentTimeTo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SequenceNumber")
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("SequenceNumber")
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @JsonProperty("HaulagePointCode")
    public String getHaulagePointCode() {
        return haulagePointCode;
    }

    @JsonProperty("HaulagePointCode")
    public void setHaulagePointCode(String haulagePointCode) {
        this.haulagePointCode = haulagePointCode;
    }

    @JsonProperty("HaulagePointName")
    public String getHaulagePointName() {
        return haulagePointName;
    }

    @JsonProperty("HaulagePointName")
    public void setHaulagePointName(String haulagePointName) {
        this.haulagePointName = haulagePointName;
    }

    @JsonProperty("SiteCode")
    public String getSiteCode() {
        return siteCode;
    }

    @JsonProperty("SiteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    @JsonProperty("AddressName")
    public String getAddressName() {
        return addressName;
    }

    @JsonProperty("AddressName")
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @JsonProperty("Address1")
    public String getAddress1() {
        return address1;
    }

    @JsonProperty("Address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @JsonProperty("Address2")
    public Object getAddress2() {
        return address2;
    }

    @JsonProperty("Address2")
    public void setAddress2(Object address2) {
        this.address2 = address2;
    }

    @JsonProperty("Address3")
    public Object getAddress3() {
        return address3;
    }

    @JsonProperty("Address3")
    public void setAddress3(Object address3) {
        this.address3 = address3;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("State")
    public String getState() {
        return state;
    }

    @JsonProperty("State")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("StreetNo")
    public Object getStreetNo() {
        return streetNo;
    }

    @JsonProperty("StreetNo")
    public void setStreetNo(Object streetNo) {
        this.streetNo = streetNo;
    }

    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("PhoneNo")
    public Object getPhoneNo() {
        return phoneNo;
    }

    @JsonProperty("PhoneNo")
    public void setPhoneNo(Object phoneNo) {
        this.phoneNo = phoneNo;
    }

    @JsonProperty("ZipCode")
    public Object getZipCode() {
        return zipCode;
    }

    @JsonProperty("ZipCode")
    public void setZipCode(Object zipCode) {
        this.zipCode = zipCode;
    }

    @JsonProperty("AppointmentTimeFrom")
    public String getAppointmentTimeFrom() {
        return appointmentTimeFrom;
    }

    @JsonProperty("AppointmentTimeFrom")
    public void setAppointmentTimeFrom(String appointmentTimeFrom) {
        this.appointmentTimeFrom = appointmentTimeFrom;
    }

    @JsonProperty("AppointmentTimeTo")
    public String getAppointmentTimeTo() {
        return appointmentTimeTo;
    }

    @JsonProperty("AppointmentTimeTo")
    public void setAppointmentTimeTo(String appointmentTimeTo) {
        this.appointmentTimeTo = appointmentTimeTo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
