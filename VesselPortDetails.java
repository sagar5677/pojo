
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
    "Port",
    "PortName",
    "VesselName",
    "VesselCode",
    "VesselET",
    "VoyageNumber",
    "TransportMode"
})
public class VesselPortDetails {

    @JsonProperty("Port")
    private String port;
    @JsonProperty("PortName")
    private String portName;
    @JsonProperty("VesselName")
    private String vesselName;
    @JsonProperty("VesselCode")
    private String vesselCode;
    @JsonProperty("VesselET")
    private String vesselET;
    @JsonProperty("VoyageNumber")
    private String voyageNumber;
    @JsonProperty("TransportMode")
    private String transportMode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Port")
    public String getPort() {
        return port;
    }

    @JsonProperty("Port")
    public void setPort(String port) {
        this.port = port;
    }

    @JsonProperty("PortName")
    public String getPortName() {
        return portName;
    }

    @JsonProperty("PortName")
    public void setPortName(String portName) {
        this.portName = portName;
    }

    @JsonProperty("VesselName")
    public String getVesselName() {
        return vesselName;
    }

    @JsonProperty("VesselName")
    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    @JsonProperty("VesselCode")
    public String getVesselCode() {
        return vesselCode;
    }

    @JsonProperty("VesselCode")
    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode;
    }

    @JsonProperty("VesselET")
    public String getVesselET() {
        return vesselET;
    }

    @JsonProperty("VesselET")
    public void setVesselET(String vesselET) {
        this.vesselET = vesselET;
    }

    @JsonProperty("VoyageNumber")
    public String getVoyageNumber() {
        return voyageNumber;
    }

    @JsonProperty("VoyageNumber")
    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber;
    }

    @JsonProperty("TransportMode")
    public String getTransportMode() {
        return transportMode;
    }

    @JsonProperty("TransportMode")
    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
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
