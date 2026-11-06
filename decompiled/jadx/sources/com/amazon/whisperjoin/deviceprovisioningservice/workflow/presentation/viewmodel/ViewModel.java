package com.amazon.whisperjoin.deviceprovisioningservice.workflow.presentation.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.state.WorkflowStep;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class ViewModel implements Parcelable {
    private WorkflowStep mState;

    public ViewModel(Parcel parcel) {
        this.mState = (WorkflowStep) parcel.readParcelable(WorkflowStep.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public WorkflowStep getState() {
        return this.mState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mState, i);
    }

    public ViewModel(WorkflowStep workflowStep) {
        this.mState = workflowStep;
    }
}
