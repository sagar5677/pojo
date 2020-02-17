
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
    "OperationalStage",
    "HaulageArrangementInstructions",
    "MerchantInspiredCarrierHaulage",
    "PreferredContractor",
    "HaulageNumber",
    "HaulageVersionNumber",
    "HaulageArrangedBy",
    "ChangeType",
    "ChangeReason",
    "Containers",
    "HaulageMoves"
})
public class HaulageArrangement {

    @JsonProperty("OperationalStage")
    private String operationalStage;
    @JsonProperty("HaulageArrangementInstructions")
    private String haulageArrangementInstructions;
    @JsonProperty("MerchantInspiredCarrierHaulage")
    private Object merchantInspiredCarrierHaulage;
    @JsonProperty("PreferredContractor")
    private Object preferredContractor;
    @JsonProperty("HaulageNumber")
    private String haulageNumber;
    @JsonProperty("HaulageVersionNumber")
    private String haulageVersionNumber;
    @JsonProperty("HaulageArrangedBy")
    private String haulageArrangedBy;
    @JsonProperty("ChangeType")
    private String changeType;
    @JsonProperty("ChangeReason")
    private String changeReason;
    @JsonProperty("Containers")
    private List<Container> containers = null;
    @JsonProperty("HaulageMoves")
    private List<Haulagemove> haulageMoves = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OperationalStage")
    public String getOperationalStage() {
        return operationalStage;
    }

    @JsonProperty("OperationalStage")
    public void setOperationalStage(String operationalStage) {
        this.operationalStage = operationalStage;
    }

    @JsonProperty("HaulageArrangementInstructions")
    public String getHaulageArrangementInstructions() {
        return haulageArrangementInstructions;
    }

    @JsonProperty("HaulageArrangementInstructions")
    public void setHaulageArrangementInstructions(String haulageArrangementInstructions) {
        this.haulageArrangementInstructions = haulageArrangementInstructions;
    }

    @JsonProperty("MerchantInspiredCarrierHaulage")
    public Object getMerchantInspiredCarrierHaulage() {
        return merchantInspiredCarrierHaulage;
    }

    @JsonProperty("MerchantInspiredCarrierHaulage")
    public void setMerchantInspiredCarrierHaulage(Object merchantInspiredCarrierHaulage) {
        this.merchantInspiredCarrierHaulage = merchantInspiredCarrierHaulage;
    }

    @JsonProperty("PreferredContractor")
    public Object getPreferredContractor() {
        return preferredContractor;
    }

    @JsonProperty("PreferredContractor")
    public void setPreferredContractor(Object preferredContractor) {
        this.preferredContractor = preferredContractor;
    }

    @JsonProperty("HaulageNumber")
    public String getHaulageNumber() {
        return haulageNumber;
    }

    @JsonProperty("HaulageNumber")
    public void setHaulageNumber(String haulageNumber) {
        this.haulageNumber = haulageNumber;
    }

    @JsonProperty("HaulageVersionNumber")
    public String getHaulageVersionNumber() {
        return haulageVersionNumber;
    }

    @JsonProperty("HaulageVersionNumber")
    public void setHaulageVersionNumber(String haulageVersionNumber) {
        this.haulageVersionNumber = haulageVersionNumber;
    }

    @JsonProperty("HaulageArrangedBy")
    public String getHaulageArrangedBy() {
        return haulageArrangedBy;
    }

    @JsonProperty("HaulageArrangedBy")
    public void setHaulageArrangedBy(String haulageArrangedBy) {
        this.haulageArrangedBy = haulageArrangedBy;
    }

    @JsonProperty("ChangeType")
    public String getChangeType() {
        return changeType;
    }

    @JsonProperty("ChangeType")
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    @JsonProperty("ChangeReason")
    public String getChangeReason() {
        return changeReason;
    }

    @JsonProperty("ChangeReason")
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    @JsonProperty("Containers")
    public List<Container> getContainers() {
        return containers;
    }

    @JsonProperty("Containers")
    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    @JsonProperty("HaulageMoves")
    public List<Haulagemove> getHaulageMoves() {
        return haulageMoves;
    }

    @JsonProperty("HaulageMoves")
    public void setHaulageMoves(List<Haulagemove> haulageMoves) {
        this.haulageMoves = haulageMoves;
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
