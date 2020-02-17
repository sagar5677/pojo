
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
    "MoveSequenceNumber",
    "Modality",
    "HaulageResponsible",
    "HaulageRoute"
})
public class Haulagemove {

    @JsonProperty("MoveSequenceNumber")
    private String moveSequenceNumber;
    @JsonProperty("Modality")
    private String modality;
    @JsonProperty("HaulageResponsible")
    private String haulageResponsible;
    @JsonProperty("HaulageRoute")
    private List<HaulageRoute> haulageRoute = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MoveSequenceNumber")
    public String getMoveSequenceNumber() {
        return moveSequenceNumber;
    }

    @JsonProperty("MoveSequenceNumber")
    public void setMoveSequenceNumber(String moveSequenceNumber) {
        this.moveSequenceNumber = moveSequenceNumber;
    }

    @JsonProperty("Modality")
    public String getModality() {
        return modality;
    }

    @JsonProperty("Modality")
    public void setModality(String modality) {
        this.modality = modality;
    }

    @JsonProperty("HaulageResponsible")
    public String getHaulageResponsible() {
        return haulageResponsible;
    }

    @JsonProperty("HaulageResponsible")
    public void setHaulageResponsible(String haulageResponsible) {
        this.haulageResponsible = haulageResponsible;
    }

    @JsonProperty("HaulageRoute")
    public List<HaulageRoute> getHaulageRoute() {
        return haulageRoute;
    }

    @JsonProperty("HaulageRoute")
    public void setHaulageRoute(List<HaulageRoute> haulageRoute) {
        this.haulageRoute = haulageRoute;
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
