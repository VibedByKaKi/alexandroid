package com.amazon.alexa.voice.ui.onedesign.transitions;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.vox.ui.onedesign.R;
import com.amazon.regulator.transitions.AnimatorTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class FadeInContentTransition extends AnimatorTransition {
    public static final Parcelable.Creator<FadeInContentTransition> CREATOR = new Parcelable.Creator<FadeInContentTransition>() { // from class: com.amazon.alexa.voice.ui.onedesign.transitions.FadeInContentTransition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FadeInContentTransition createFromParcel(Parcel parcel) {
            return new FadeInContentTransition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FadeInContentTransition[] newArray(int i) {
            return new FadeInContentTransition[i];
        }
    };

    public FadeInContentTransition() {
    }

    @Override // com.amazon.regulator.transitions.AnimatorTransition
    @Nullable
    public Animator getAnimator(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable View view2) {
        if (view2 == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(view2.getContext().getResources().getInteger(R.integer.mosaic_motion_duration_fast_100));
        return ofFloat;
    }

    public FadeInContentTransition(Parcel parcel) {
        super(parcel);
    }
}
