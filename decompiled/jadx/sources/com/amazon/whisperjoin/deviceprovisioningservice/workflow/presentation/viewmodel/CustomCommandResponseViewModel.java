package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.CustomCommandResponse;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.WorkflowStep;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CustomCommandResponseViewModel extends ViewModel implements Parcelable {
    public static final Parcelable.Creator<CustomCommandResponseViewModel> CREATOR = new Parcelable.Creator<CustomCommandResponseViewModel>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.CustomCommandResponseViewModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomCommandResponseViewModel createFromParcel(Parcel parcel) {
            return new CustomCommandResponseViewModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomCommandResponseViewModel[] newArray(int i) {
            return new CustomCommandResponseViewModel[i];
        }
    };
    private final CustomCommandResponse customCommandResponse;

    public CustomCommandResponseViewModel(Parcel parcel) {
        super(parcel);
        CustomCommandResponse customCommandResponse = (CustomCommandResponse) parcel.readParcelable(CustomCommandResponse.class.getClassLoader());
        this.customCommandResponse = customCommandResponse;
        if (customCommandResponse != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("customCommandResponse is null");
        throw null;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.ViewModel, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CustomCommandResponse getCustomCommandResponse() {
        return this.customCommandResponse;
    }

    @Override // com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.ViewModel, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.customCommandResponse, i);
    }

    public CustomCommandResponseViewModel(CustomCommandResponse customCommandResponse) {
        super(WorkflowStep.AWAITING_SEND_CUSTOM_COMMAND);
        if (customCommandResponse != null) {
            this.customCommandResponse = customCommandResponse;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("customCommandResponse is null");
            throw null;
        }
    }
}
