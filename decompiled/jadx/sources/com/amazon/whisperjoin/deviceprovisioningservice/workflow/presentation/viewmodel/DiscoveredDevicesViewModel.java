package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.deviceprovisioningservice.device.DiscoveredDevices;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.WorkflowStep;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveredDevicesViewModel extends ViewModel implements Parcelable {
    public static final Parcelable.Creator<DiscoveredDevicesViewModel> CREATOR = new Parcelable.Creator<DiscoveredDevicesViewModel>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.DiscoveredDevicesViewModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DiscoveredDevicesViewModel createFromParcel(Parcel parcel) {
            return new DiscoveredDevicesViewModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DiscoveredDevicesViewModel[] newArray(int i) {
            return new DiscoveredDevicesViewModel[i];
        }
    };
    private final DiscoveredDevices mDiscoveredDevices;

    public DiscoveredDevicesViewModel(Parcel parcel) {
        super(parcel);
        DiscoveredDevices discoveredDevices = (DiscoveredDevices) parcel.readParcelable(DiscoveredDevices.class.getClassLoader());
        this.mDiscoveredDevices = discoveredDevices;
        if (discoveredDevices != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("discoveredDevices can not be null");
        throw null;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.ViewModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DiscoveredDevices getDiscoveredDevices() {
        return this.mDiscoveredDevices;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.ViewModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.mDiscoveredDevices, i);
    }

    public DiscoveredDevicesViewModel(DiscoveredDevices discoveredDevices) {
        super(WorkflowStep.AWAITING_DEVICE_SELECTION);
        if (discoveredDevices != null) {
            this.mDiscoveredDevices = discoveredDevices;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$2("discoveredDevices can not be null");
            throw null;
        }
    }
}
