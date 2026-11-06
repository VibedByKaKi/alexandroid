package com.amazon.deecomms.calling.model;

import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AbstractCallModel {

    @JsonProperty("callId")
    private String callId;

    @JsonProperty("creationDate")
    private long creationDate;

    @JsonProperty(AmazonPhotosConstants.DEVICE_MAKE_KEY)
    private String deviceMake;

    @JsonProperty("deviceModel")
    private String deviceModel;

    @JsonProperty("deviceScreenSize")
    private double deviceScreenSize;

    @JsonProperty("localTime")
    private String localTime;

    @JsonProperty("platform")
    private String platform;

    public String getCallId() {
        return this.callId;
    }

    public long getCreationDate() {
        return this.creationDate;
    }

    public String getDeviceMake() {
        return this.deviceMake;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public double getDeviceScreenSize() {
        return this.deviceScreenSize;
    }

    public String getLocalTime() {
        return this.localTime;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setCreationDate(long j) {
        this.creationDate = j;
    }

    public void setDeviceMake(String str) {
        this.deviceMake = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceScreenSize(double d) {
        this.deviceScreenSize = d;
    }

    public void setLocalTime(String str) {
        this.localTime = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }
}
