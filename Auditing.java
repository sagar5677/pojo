
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
    "MessageVersion",
    "BookingSystem",
    "CommunicationMedia",
    "CreateUser",
    "DateConverted",
    "DateSent",
    "SendByTeamId",
    "SendByUserId",
    "SenderMessageVersion",
    "SenderSystem"
})
public class Auditing {

    @JsonProperty("MessageVersion")
    private String messageVersion;
    @JsonProperty("BookingSystem")
    private String bookingSystem;
    @JsonProperty("CommunicationMedia")
    private String communicationMedia;
    @JsonProperty("CreateUser")
    private String createUser;
    @JsonProperty("DateConverted")
    private String dateConverted;
    @JsonProperty("DateSent")
    private String dateSent;
    @JsonProperty("SendByTeamId")
    private String sendByTeamId;
    @JsonProperty("SendByUserId")
    private String sendByUserId;
    @JsonProperty("SenderMessageVersion")
    private String senderMessageVersion;
    @JsonProperty("SenderSystem")
    private String senderSystem;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MessageVersion")
    public String getMessageVersion() {
        return messageVersion;
    }

    @JsonProperty("MessageVersion")
    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    @JsonProperty("BookingSystem")
    public String getBookingSystem() {
        return bookingSystem;
    }

    @JsonProperty("BookingSystem")
    public void setBookingSystem(String bookingSystem) {
        this.bookingSystem = bookingSystem;
    }

    @JsonProperty("CommunicationMedia")
    public String getCommunicationMedia() {
        return communicationMedia;
    }

    @JsonProperty("CommunicationMedia")
    public void setCommunicationMedia(String communicationMedia) {
        this.communicationMedia = communicationMedia;
    }

    @JsonProperty("CreateUser")
    public String getCreateUser() {
        return createUser;
    }

    @JsonProperty("CreateUser")
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @JsonProperty("DateConverted")
    public String getDateConverted() {
        return dateConverted;
    }

    @JsonProperty("DateConverted")
    public void setDateConverted(String dateConverted) {
        this.dateConverted = dateConverted;
    }

    @JsonProperty("DateSent")
    public String getDateSent() {
        return dateSent;
    }

    @JsonProperty("DateSent")
    public void setDateSent(String dateSent) {
        this.dateSent = dateSent;
    }

    @JsonProperty("SendByTeamId")
    public String getSendByTeamId() {
        return sendByTeamId;
    }

    @JsonProperty("SendByTeamId")
    public void setSendByTeamId(String sendByTeamId) {
        this.sendByTeamId = sendByTeamId;
    }

    @JsonProperty("SendByUserId")
    public String getSendByUserId() {
        return sendByUserId;
    }

    @JsonProperty("SendByUserId")
    public void setSendByUserId(String sendByUserId) {
        this.sendByUserId = sendByUserId;
    }

    @JsonProperty("SenderMessageVersion")
    public String getSenderMessageVersion() {
        return senderMessageVersion;
    }

    @JsonProperty("SenderMessageVersion")
    public void setSenderMessageVersion(String senderMessageVersion) {
        this.senderMessageVersion = senderMessageVersion;
    }

    @JsonProperty("SenderSystem")
    public String getSenderSystem() {
        return senderSystem;
    }

    @JsonProperty("SenderSystem")
    public void setSenderSystem(String senderSystem) {
        this.senderSystem = senderSystem;
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
