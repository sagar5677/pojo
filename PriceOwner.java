
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
    "Name",
    "Number",
    "ContactName",
    "ContactPhone",
    "ContactEmail",
    "CustomerSegment"
})
public class PriceOwner {

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Number")
    private String number;
    @JsonProperty("ContactName")
    private String contactName;
    @JsonProperty("ContactPhone")
    private String contactPhone;
    @JsonProperty("ContactEmail")
    private String contactEmail;
    @JsonProperty("CustomerSegment")
    private Object customerSegment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("Number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("ContactName")
    public String getContactName() {
        return contactName;
    }

    @JsonProperty("ContactName")
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @JsonProperty("ContactPhone")
    public String getContactPhone() {
        return contactPhone;
    }

    @JsonProperty("ContactPhone")
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @JsonProperty("ContactEmail")
    public String getContactEmail() {
        return contactEmail;
    }

    @JsonProperty("ContactEmail")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @JsonProperty("CustomerSegment")
    public Object getCustomerSegment() {
        return customerSegment;
    }

    @JsonProperty("CustomerSegment")
    public void setCustomerSegment(Object customerSegment) {
        this.customerSegment = customerSegment;
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
