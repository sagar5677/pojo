
package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Auditing",
    "Operator",
    "ShipmentNumber",
    "RouteCode",
    "Brand",
    "BrandCode",
    "IsExtensionOfOriginalProduct",
    "Customer",
    "PriceOwner",
    "VesselPortDetails",
    "HaulageArrangements"
})
public class Example {

    @JsonProperty("Auditing")
    private Auditing auditing;
    @JsonProperty("Operator")
    private String operator;
    @JsonProperty("ShipmentNumber")
    private String shipmentNumber;
    @JsonProperty("RouteCode")
    private String routeCode;
    @JsonProperty("Brand")
    private String brand;
    @JsonProperty("BrandCode")
    private String brandCode;
    @JsonProperty("IsExtensionOfOriginalProduct")
    private String isExtensionOfOriginalProduct;
    @JsonProperty("Customer")
    private Customer customer;
    @JsonProperty("PriceOwner")
    private PriceOwner priceOwner;
    @JsonProperty("VesselPortDetails")
    private VesselPortDetails vesselPortDetails;
    @JsonProperty("HaulageArrangements")
    private List<HaulageArrangement> haulageArrangements = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Auditing")
    public Auditing getAuditing() {
        return auditing;
    }

    @JsonProperty("Auditing")
    public void setAuditing(Auditing auditing) {
        this.auditing = auditing;
    }

    @JsonProperty("Operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("Operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("ShipmentNumber")
    public String getShipmentNumber() {
        return shipmentNumber;
    }

    @JsonProperty("ShipmentNumber")
    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    @JsonProperty("RouteCode")
    public String getRouteCode() {
        return routeCode;
    }

    @JsonProperty("RouteCode")
    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    @JsonProperty("Brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("Brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("BrandCode")
    public String getBrandCode() {
        return brandCode;
    }

    @JsonProperty("BrandCode")
    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    @JsonProperty("IsExtensionOfOriginalProduct")
    public String getIsExtensionOfOriginalProduct() {
        return isExtensionOfOriginalProduct;
    }

    @JsonProperty("IsExtensionOfOriginalProduct")
    public void setIsExtensionOfOriginalProduct(String isExtensionOfOriginalProduct) {
        this.isExtensionOfOriginalProduct = isExtensionOfOriginalProduct;
    }

    @JsonProperty("Customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("Customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("PriceOwner")
    public PriceOwner getPriceOwner() {
        return priceOwner;
    }

    @JsonProperty("PriceOwner")
    public void setPriceOwner(PriceOwner priceOwner) {
        this.priceOwner = priceOwner;
    }

    @JsonProperty("VesselPortDetails")
    public VesselPortDetails getVesselPortDetails() {
        return vesselPortDetails;
    }

    @JsonProperty("VesselPortDetails")
    public void setVesselPortDetails(VesselPortDetails vesselPortDetails) {
        this.vesselPortDetails = vesselPortDetails;
    }

    @JsonProperty("HaulageArrangements")
    public List<HaulageArrangement> getHaulageArrangements() {
        return haulageArrangements;
    }

    @JsonProperty("HaulageArrangements")
    public void setHaulageArrangements(List<HaulageArrangement> haulageArrangements) {
        this.haulageArrangements = haulageArrangements;
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
