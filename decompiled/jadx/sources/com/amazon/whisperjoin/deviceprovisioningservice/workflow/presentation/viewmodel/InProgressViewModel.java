package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.WorkflowStep;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class InProgressViewModel extends ViewModel implements Parcelable {
    public static final Parcelable.Creator<InProgressViewModel> CREATOR = new Parcelable.Creator<InProgressViewModel>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel.InProgressViewModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InProgressViewModel createFromParcel(Parcel parcel) {
            return new InProgressViewModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InProgressViewModel[] newArray(int i) {
            return new InProgressViewModel[i];
        }
    };

    public InProgressViewModel(WorkflowStep workflowStep) {
        super(workflowStep);
    }

    public InProgressViewModel(Parcel parcel) {
        super(parcel);
    }
}
