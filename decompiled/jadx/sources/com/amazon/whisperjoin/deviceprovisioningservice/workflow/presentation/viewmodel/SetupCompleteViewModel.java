package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.WorkflowStep;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetupCompleteViewModel extends ViewModel implements Parcelable {
    public static final Parcelable.Creator<SetupCompleteViewModel> CREATOR = new Parcelable.Creator<SetupCompleteViewModel>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.SetupCompleteViewModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SetupCompleteViewModel createFromParcel(Parcel parcel) {
            return new SetupCompleteViewModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SetupCompleteViewModel[] newArray(int i) {
            return new SetupCompleteViewModel[i];
        }
    };

    public SetupCompleteViewModel() {
        super(WorkflowStep.SETUP_SUCCESS);
    }

    public SetupCompleteViewModel(Parcel parcel) {
        super(parcel);
    }
}
