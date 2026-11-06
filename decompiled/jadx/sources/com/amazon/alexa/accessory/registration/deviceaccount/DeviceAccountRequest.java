package com.amazon.alexa.accessory.registration.deviceaccount;

import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DeviceAccountRequest implements JsonObjectSerializable {
    private static final String CLUSTER_DEVICE_TYPE_KEY = "clusterDeviceType";
    private static final String CLUSTER_DSN_KEY = "clusterDsn";
    private static final String DEVICE_SERIAL_NUMBER_KEY = "deviceSerialNumber";
    private static final String DEVICE_TYPE_KEY = "deviceType";
    public static final Factory FACTORY = new Factory();
    private final String clusterDeviceType;
    private final String clusterDsn;
    private final String deviceSerialNumber;
    private final String deviceType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<DeviceAccountRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public DeviceAccountRequest create(JSONObject jSONObject) throws JSONException {
            return new DeviceAccountRequest(jSONObject.getString("deviceType"), jSONObject.getString("deviceSerialNumber"), jSONObject.has(DeviceAccountRequest.CLUSTER_DEVICE_TYPE_KEY) ? jSONObject.getString(DeviceAccountRequest.CLUSTER_DEVICE_TYPE_KEY) : null, jSONObject.has(DeviceAccountRequest.CLUSTER_DSN_KEY) ? jSONObject.getString(DeviceAccountRequest.CLUSTER_DSN_KEY) : null);
        }
    }

    public DeviceAccountRequest(String str, String str2, String str3, String str4) {
        Preconditions.notNull(str, "deviceType");
        Preconditions.notNull(str2, "deviceSerialNumber");
        this.deviceType = str;
        this.deviceSerialNumber = str2;
        this.clusterDeviceType = str3;
        this.clusterDsn = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceAccountRequest deviceAccountRequest = (DeviceAccountRequest) obj;
            if (Objects.equals(this.deviceType, deviceAccountRequest.deviceType) && Objects.equals(this.deviceSerialNumber, deviceAccountRequest.deviceSerialNumber) && Objects.equals(this.clusterDeviceType, deviceAccountRequest.clusterDeviceType) && Objects.equals(this.clusterDsn, deviceAccountRequest.clusterDsn)) {
                return true;
            }
        }
        return false;
    }

    public String getClusterDeviceType() {
        return this.clusterDeviceType;
    }

    public String getClusterDsn() {
        return this.clusterDsn;
    }

    public String getDeviceSerialNumber() {
        return this.deviceSerialNumber;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return Objects.hash(this.deviceType, this.deviceSerialNumber, this.clusterDeviceType, this.clusterDsn);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceType", this.deviceType);
        jSONObject.put("deviceSerialNumber", this.deviceSerialNumber);
        String str = this.clusterDeviceType;
        if (str != null) {
            jSONObject.put(CLUSTER_DEVICE_TYPE_KEY, str);
        }
        if (this.clusterDeviceType != null) {
            jSONObject.put(CLUSTER_DSN_KEY, this.clusterDsn);
        }
        return jSONObject;
    }
}
