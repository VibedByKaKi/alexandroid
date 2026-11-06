package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.DeviceNetworkDebugTunnelResponse;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.WorkflowStep;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceNetworkDebugTunnelViewModel extends ViewModel implements Parcelable {
    public static final Parcelable.Creator<DeviceNetworkDebugTunnelViewModel> CREATOR = new Parcelable.Creator<DeviceNetworkDebugTunnelViewModel>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.DeviceNetworkDebugTunnelViewModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceNetworkDebugTunnelViewModel createFromParcel(Parcel parcel) {
            return new DeviceNetworkDebugTunnelViewModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceNetworkDebugTunnelViewModel[] newArray(int i) {
            return new DeviceNetworkDebugTunnelViewModel[i];
        }
    };
    private final DeviceNetworkDebugTunnelResponse deviceNetworkDebugTunnelResponse;

    public DeviceNetworkDebugTunnelViewModel(Parcel parcel) {
        super(parcel);
        DeviceNetworkDebugTunnelResponse deviceNetworkDebugTunnelResponse = (DeviceNetworkDebugTunnelResponse) parcel.readParcelable(DeviceNetworkDebugTunnelResponse.class.getClassLoader());
        this.deviceNetworkDebugTunnelResponse = deviceNetworkDebugTunnelResponse;
        if (deviceNetworkDebugTunnelResponse != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("deviceNetworkDebugTunnelResponse is null");
        throw null;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.ViewModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DeviceNetworkDebugTunnelResponse getDeviceNetworkDebugTunnelResponse() {
        return this.deviceNetworkDebugTunnelResponse;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.ViewModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.deviceNetworkDebugTunnelResponse, i);
    }

    public DeviceNetworkDebugTunnelViewModel(DeviceNetworkDebugTunnelResponse deviceNetworkDebugTunnelResponse) {
        super(WorkflowStep.AWAITING_DEVICE_NETWORK_DEBUG_TUNNEL);
        if (deviceNetworkDebugTunnelResponse != null) {
            this.deviceNetworkDebugTunnelResponse = deviceNetworkDebugTunnelResponse;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("deviceNetworkDebugTunnelResponse is null");
            throw null;
        }
    }
}
