
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
    "EquipmentId",
    "EquipmentNumber",
    "SOC",
    "ContainerType",
    "ContainerSize",
    "ContainerHeight",
    "ContainerISO6346",
    "TareWeightKgs",
    "GrossWeightKgs",
    "CargoDetails"
})
public class Container {

    @JsonProperty("EquipmentId")
    private String equipmentId;
    @JsonProperty("EquipmentNumber")
    private String equipmentNumber;
    @JsonProperty("SOC")
    private String sOC;
    @JsonProperty("ContainerType")
    private String containerType;
    @JsonProperty("ContainerSize")
    private String containerSize;
    @JsonProperty("ContainerHeight")
    private String containerHeight;
    @JsonProperty("ContainerISO6346")
    private String containerISO6346;
    @JsonProperty("TareWeightKgs")
    private String tareWeightKgs;
    @JsonProperty("GrossWeightKgs")
    private String grossWeightKgs;
    @JsonProperty("CargoDetails")
    private List<CargoDetail> cargoDetails = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EquipmentId")
    public String getEquipmentId() {
        return equipmentId;
    }

    @JsonProperty("EquipmentId")
    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    @JsonProperty("EquipmentNumber")
    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    @JsonProperty("EquipmentNumber")
    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    @JsonProperty("SOC")
    public String getSOC() {
        return sOC;
    }

    @JsonProperty("SOC")
    public void setSOC(String sOC) {
        this.sOC = sOC;
    }

    @JsonProperty("ContainerType")
    public String getContainerType() {
        return containerType;
    }

    @JsonProperty("ContainerType")
    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    @JsonProperty("ContainerSize")
    public String getContainerSize() {
        return containerSize;
    }

    @JsonProperty("ContainerSize")
    public void setContainerSize(String containerSize) {
        this.containerSize = containerSize;
    }

    @JsonProperty("ContainerHeight")
    public String getContainerHeight() {
        return containerHeight;
    }

    @JsonProperty("ContainerHeight")
    public void setContainerHeight(String containerHeight) {
        this.containerHeight = containerHeight;
    }

    @JsonProperty("ContainerISO6346")
    public String getContainerISO6346() {
        return containerISO6346;
    }

    @JsonProperty("ContainerISO6346")
    public void setContainerISO6346(String containerISO6346) {
        this.containerISO6346 = containerISO6346;
    }

    @JsonProperty("TareWeightKgs")
    public String getTareWeightKgs() {
        return tareWeightKgs;
    }

    @JsonProperty("TareWeightKgs")
    public void setTareWeightKgs(String tareWeightKgs) {
        this.tareWeightKgs = tareWeightKgs;
    }

    @JsonProperty("GrossWeightKgs")
    public String getGrossWeightKgs() {
        return grossWeightKgs;
    }

    @JsonProperty("GrossWeightKgs")
    public void setGrossWeightKgs(String grossWeightKgs) {
        this.grossWeightKgs = grossWeightKgs;
    }

    @JsonProperty("CargoDetails")
    public List<CargoDetail> getCargoDetails() {
        return cargoDetails;
    }

    @JsonProperty("CargoDetails")
    public void setCargoDetails(List<CargoDetail> cargoDetails) {
        this.cargoDetails = cargoDetails;
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
