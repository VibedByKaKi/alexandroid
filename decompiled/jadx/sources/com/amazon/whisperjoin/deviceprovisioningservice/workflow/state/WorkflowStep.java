package com.amazon.whisperjoin.deviceprovisioningservice.workflow.state;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum WorkflowStep implements Parcelable {
    IDLE,
    DISCOVERING,
    AWAITING_DEVICE_SELECTION,
    CONNECTING_TO_DEVICE,
    GETTING_PROVISIONING_DETAILS,
    VALIDATING_WIFI_SYNC_AUTH_TOKEN,
    AWAITING_PROVISIONING_DATA,
    PROVISIONING_DEVICE,
    VERIFYING_PROVISIONING,
    FIXUP_WIFI_CONNECTION_ERROR,
    SETUP_FAILURE,
    SETUP_SUCCESS,
    AWAITING_DEVICE_NETWORK_DEBUG_TUNNEL,
    GETTING_DEVICE_NETWORK_DEBUG_TUNNEL,
    AWAITING_SEND_CUSTOM_COMMAND,
    GETTING_SEND_CUSTOM_COMMAND;

    public static final Parcelable.Creator<WorkflowStep> CREATOR = new Parcelable.Creator<WorkflowStep>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.WorkflowStep.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkflowStep createFromParcel(Parcel parcel) {
            return WorkflowStep.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkflowStep[] newArray(int i) {
            return new WorkflowStep[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
