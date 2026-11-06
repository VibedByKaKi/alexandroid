package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceNetworkDebugTunnelResponse implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<DeviceNetworkDebugTunnelResponse> CREATOR = new Parcelable.ClassLoaderCreator<DeviceNetworkDebugTunnelResponse>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.DeviceNetworkDebugTunnelResponse.1
        @Override // android.os.Parcelable.Creator
        public DeviceNetworkDebugTunnelResponse createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new DeviceNetworkDebugTunnelResponse(parcel, DeviceNetworkDebugTunnelResponse.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public DeviceNetworkDebugTunnelResponse[] newArray(int i) {
            if (i >= 0) {
                return new DeviceNetworkDebugTunnelResponse[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public DeviceNetworkDebugTunnelResponse createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new DeviceNetworkDebugTunnelResponse(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private static final String REQUEST_ID_KEY = "requestId";
    private static final String REQUEST_TYPE_KEY = "requestType";
    private static final String RESPONSE_KEY = "response";
    private static final String SUCCESS_KEY = "success";
    public static final String UNKNOWN_COMMAND_RESPONSE = "Unknown command sent by device";
    private int requestId;
    private int requestType;
    private String response;
    private boolean success;

    public DeviceNetworkDebugTunnelResponse(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle(classLoader);
        this.requestType = readBundle.getInt("requestType");
        this.requestId = readBundle.getInt("requestId");
        this.success = readBundle.getBoolean("success");
        this.response = readBundle.getString("response");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DeviceNetworkDebugTunnelResponse)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        DeviceNetworkDebugTunnelResponse deviceNetworkDebugTunnelResponse = (DeviceNetworkDebugTunnelResponse) obj;
        return this.requestType == deviceNetworkDebugTunnelResponse.requestType && this.requestId == deviceNetworkDebugTunnelResponse.requestId && this.success == deviceNetworkDebugTunnelResponse.success && this.response.equals(deviceNetworkDebugTunnelResponse.response);
    }

    public int getRequestId() {
        return this.requestId;
    }

    public int getRequestType() {
        return this.requestType;
    }

    public String getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode() + ((((((this.requestType + 41) * 41) + this.requestId) * 41) + (this.success ? 1 : 0)) * 41);
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setDeviceNetworkDebugTunnelResponse(DeviceNetworkDebugTunnelResponse deviceNetworkDebugTunnelResponse) {
        this.requestType = deviceNetworkDebugTunnelResponse.requestType;
        this.requestId = deviceNetworkDebugTunnelResponse.requestId;
        this.success = deviceNetworkDebugTunnelResponse.success;
        this.response = deviceNetworkDebugTunnelResponse.response;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("requestType", this.requestType);
        bundle.putInt("requestId", this.requestId);
        bundle.putBoolean("success", this.success);
        bundle.putString("response", this.response);
        parcel.writeBundle(bundle);
    }

    public DeviceNetworkDebugTunnelResponse() {
        this.requestType = -1;
        this.requestId = -1;
        this.success = false;
        this.response = null;
    }

    public DeviceNetworkDebugTunnelResponse(int i, int i2, boolean z, String str) {
        this.requestType = i;
        this.requestId = i2;
        this.success = z;
        this.response = str;
    }
}
