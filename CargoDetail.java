
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
    "CargoDescription",
    "CommodityCode"
})
public class CargoDetail {

    @JsonProperty("CargoDescription")
    private String cargoDescription;
    @JsonProperty("CommodityCode")
    private String commodityCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CargoDescription")
    public String getCargoDescription() {
        return cargoDescription;
    }

    @JsonProperty("CargoDescription")
    public void setCargoDescription(String cargoDescription) {
        this.cargoDescription = cargoDescription;
    }

    @JsonProperty("CommodityCode")
    public String getCommodityCode() {
        return commodityCode;
    }

    @JsonProperty("CommodityCode")
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
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
