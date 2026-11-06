package com.amazon.regulator.transitions;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.regulator.ControllerTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class InstantTransition implements ControllerTransition {
    public static final Parcelable.Creator<InstantTransition> CREATOR = new Parcelable.Creator<InstantTransition>() { // from class: com.amazon.regulator.transitions.InstantTransition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstantTransition createFromParcel(Parcel parcel) {
            return new InstantTransition();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstantTransition[] newArray(int i) {
            return new InstantTransition[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amazon.regulator.ControllerTransition
    public void performTransition(ViewGroup viewGroup, View view, View view2, ControllerTransition.CompletionListener completionListener) {
        completionListener.completeTransition();
    }

    @Override // com.amazon.regulator.ControllerTransition
    public void completeTransition() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
