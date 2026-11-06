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
public class BottomSheetCallTransition extends AnimatorTransition {
    public static final Parcelable.Creator<BottomSheetCallTransition> CREATOR = new Parcelable.Creator<BottomSheetCallTransition>() { // from class: com.amazon.alexa.voice.ui.onedesign.transitions.BottomSheetCallTransition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BottomSheetCallTransition createFromParcel(Parcel parcel) {
            return new BottomSheetCallTransition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BottomSheetCallTransition[] newArray(int i) {
            return new BottomSheetCallTransition[i];
        }
    };
    private final LoadAnimator loadAnimator;

    public BottomSheetCallTransition() {
        this.loadAnimator = new BottomSheetCallTransition$$ExternalSyntheticLambda0();
    }

    @Override // com.amazon.regulator.transitions.AnimatorTransition
    public Animator getAnimator(ViewGroup viewGroup, View view, View view2) {
        if (view2 == null) {
            return null;
        }
        Animator load = this.loadAnimator.load(view2.getContext(), R.animator.bottom_sheet_scrim_call);
        load.setTarget(view2);
        return load;
    }

    public BottomSheetCallTransition(Parcel parcel) {
        this(parcel, new BottomSheetCallTransition$$ExternalSyntheticLambda0());
    }

    public BottomSheetCallTransition(Parcel parcel, LoadAnimator loadAnimator) {
        super(parcel);
        this.loadAnimator = loadAnimator;
    }
}
