package com.amazon.alexa.voice.ui.onedesign.transitions;

import android.animation.Animator;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.alexa.vox.ui.onedesign.R;
import com.amazon.regulator.transitions.AnimatorTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BottomSheetDismissTransition extends AnimatorTransition {
    public static final Parcelable.Creator<BottomSheetDismissTransition> CREATOR = new Parcelable.Creator<BottomSheetDismissTransition>() { // from class: com.amazon.alexa.voice.ui.onedesign.transitions.BottomSheetDismissTransition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BottomSheetDismissTransition createFromParcel(Parcel parcel) {
            return new BottomSheetDismissTransition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BottomSheetDismissTransition[] newArray(int i) {
            return new BottomSheetDismissTransition[i];
        }
    };
    private final LoadAnimator loadAnimator;

    public BottomSheetDismissTransition() {
        this.loadAnimator = new BottomSheetCallTransition$$ExternalSyntheticLambda0();
    }

    @Override // com.amazon.regulator.transitions.AnimatorTransition
    public Animator getAnimator(ViewGroup viewGroup, View view, View view2) {
        if (view == null) {
            return null;
        }
        Animator load = this.loadAnimator.load(view.getContext(), R.animator.bottom_sheet_scrim_dismiss);
        load.setTarget(view);
        return load;
    }

    public BottomSheetDismissTransition(Parcel parcel) {
        this(parcel, new BottomSheetCallTransition$$ExternalSyntheticLambda0());
    }

    public BottomSheetDismissTransition(Parcel parcel, LoadAnimator loadAnimator) {
        super(parcel);
        this.loadAnimator = loadAnimator;
    }
}
