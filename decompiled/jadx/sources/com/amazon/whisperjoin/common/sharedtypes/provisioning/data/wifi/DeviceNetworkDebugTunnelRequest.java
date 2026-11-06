package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceNetworkDebugTunnelRequest implements Parcelable {
    public static final Parcelable.Creator<DeviceNetworkDebugTunnelRequest> CREATOR = new Parcelable.Creator<DeviceNetworkDebugTunnelRequest>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.DeviceNetworkDebugTunnelRequest.1
        private DeviceNetworkDebugTunnelRequest createObjectFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new DeviceNetworkDebugTunnelRequest(parcel.readInt(), parcel.readInt(), parcel.readString());
            }
            Single$$ExternalSyntheticBUOutline0.m$1("source is null");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceNetworkDebugTunnelRequest createFromParcel(Parcel parcel) {
            return createObjectFromParcel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceNetworkDebugTunnelRequest[] newArray(int i) {
            return new DeviceNetworkDebugTunnelRequest[i];
        }
    };
    private final int requestId;
    private final String requestParamJSON;
    private final int requestType;

    public DeviceNetworkDebugTunnelRequest(int i, int i2) {
        this.requestType = i;
        this.requestId = i2;
        this.requestParamJSON = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceNetworkDebugTunnelRequest deviceNetworkDebugTunnelRequest = (DeviceNetworkDebugTunnelRequest) obj;
            if (Objects.equal(Integer.valueOf(this.requestType), Integer.valueOf(deviceNetworkDebugTunnelRequest.requestType)) && Objects.equal(Integer.valueOf(this.requestId), Integer.valueOf(deviceNetworkDebugTunnelRequest.requestId)) && Objects.equal(this.requestParamJSON, deviceNetworkDebugTunnelRequest.requestParamJSON)) {
                return true;
            }
        }
        return false;
    }

    public int getRequestId() {
        return this.requestId;
    }

    public String getRequestParamJSON() {
        return this.requestParamJSON;
    }

    public int getRequestType() {
        return this.requestType;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.requestType), Integer.valueOf(this.requestId), this.requestParamJSON);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.requestType);
        parcel.writeInt(this.requestId);
        parcel.writeString(this.requestParamJSON);
    }

    public DeviceNetworkDebugTunnelRequest(int i, int i2, String str) {
        this.requestType = i;
        this.requestId = i2;
        this.requestParamJSON = str;
    }
}
