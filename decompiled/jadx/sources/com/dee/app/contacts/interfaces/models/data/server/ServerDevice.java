package com.dee.app.contacts.interfaces.models.data.server;

import com.dee.app.contacts.interfaces.models.data.device.DeviceCommsFeaturesStatus;
import com.dee.app.contacts.interfaces.models.data.device.PersonalizedAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ServerDevice {

    @JsonProperty("commsFeaturesStatusList")
    private List<DeviceCommsFeaturesStatus> commsFeaturesStatusList;

    @JsonProperty("deviceGruu")
    private String deviceGruu;

    @JsonProperty("deviceName")
    private String deviceName;

    @JsonProperty("deviceSerialNumber")
    private String deviceSerialNumber;

    @JsonProperty("deviceStatus")
    private ServerDeviceStatus deviceStatus;

    @JsonProperty("deviceType")
    private String deviceType;

    @JsonProperty("personalizedAccounts")
    private List<PersonalizedAccount> personalizedAccounts;

    public List<DeviceCommsFeaturesStatus> getCommsFeaturesStatusList() {
        return this.commsFeaturesStatusList;
    }

    public String getDeviceGruu() {
        return this.deviceGruu;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public ServerDeviceStatus getDeviceStatus() {
        return this.deviceStatus;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public ServerDeviceStatus getDisplayStatus() {
        return this.deviceStatus;
    }

    public List<PersonalizedAccount> getPersonalizedAccounts() {
        return this.personalizedAccounts;
    }

    public void setCommsFeaturesStatusList(List<DeviceCommsFeaturesStatus> list) {
        this.commsFeaturesStatusList = list;
    }

    public void setDeviceGruu(String str) {
        this.deviceGruu = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceSerialNumber(String str) {
        this.deviceSerialNumber = str;
    }

    public void setDeviceStatus(ServerDeviceStatus serverDeviceStatus) {
        this.deviceStatus = serverDeviceStatus;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDisplayStatus(ServerDeviceStatus serverDeviceStatus) {
        this.deviceStatus = serverDeviceStatus;
    }

    public void setPersonalizedAccounts(List<PersonalizedAccount> list) {
        this.personalizedAccounts = list;
    }
}
