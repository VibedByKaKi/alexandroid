package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminListDevicesResult implements Serializable {
    private List<DeviceType> devices;
    private String paginationToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AdminListDevicesResult)) {
            return false;
        }
        AdminListDevicesResult adminListDevicesResult = (AdminListDevicesResult) obj;
        if ((adminListDevicesResult.getDevices() == null) ^ (getDevices() == null)) {
            return false;
        }
        if (adminListDevicesResult.getDevices() != null && !adminListDevicesResult.getDevices().equals(getDevices())) {
            return false;
        }
        if ((adminListDevicesResult.getPaginationToken() == null) ^ (getPaginationToken() == null)) {
            return false;
        }
        return adminListDevicesResult.getPaginationToken() == null || adminListDevicesResult.getPaginationToken().equals(getPaginationToken());
    }

    public List<DeviceType> getDevices() {
        return this.devices;
    }

    public String getPaginationToken() {
        return this.paginationToken;
    }

    public int hashCode() {
        return (((getDevices() == null ? 0 : getDevices().hashCode()) + 31) * 31) + (getPaginationToken() != null ? getPaginationToken().hashCode() : 0);
    }

    public void setDevices(Collection<DeviceType> collection) {
        if (collection == null) {
            this.devices = null;
        } else {
            this.devices = new ArrayList(collection);
        }
    }

    public void setPaginationToken(String str) {
        this.paginationToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDevices() != null) {
            sb.append("Devices: " + getDevices() + ",");
        }
        if (getPaginationToken() != null) {
            sb.append("PaginationToken: " + getPaginationToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AdminListDevicesResult withDevices(DeviceType... deviceTypeArr) {
        if (getDevices() == null) {
            this.devices = new ArrayList(deviceTypeArr.length);
        }
        for (DeviceType deviceType : deviceTypeArr) {
            this.devices.add(deviceType);
        }
        return this;
    }

    public AdminListDevicesResult withPaginationToken(String str) {
        this.paginationToken = str;
        return this;
    }

    public AdminListDevicesResult withDevices(Collection<DeviceType> collection) {
        setDevices(collection);
        return this;
    }
}
