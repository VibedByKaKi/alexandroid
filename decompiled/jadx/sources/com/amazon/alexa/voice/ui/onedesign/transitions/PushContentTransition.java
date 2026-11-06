package com.amazon.alexa.voice.ui.onedesign.transitions;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.amazon.regulator.transitions.AnimatorTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class PushContentTransition extends AnimatorTransition {
    public static final Parcelable.Creator<PushContentTransition> CREATOR = new Parcelable.Creator<PushContentTransition>() { // from class: com.amazon.alexa.voice.ui.onedesign.transitions.PushContentTransition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PushContentTransition createFromParcel(Parcel parcel) {
            return new PushContentTransition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PushContentTransition[] newArray(int i) {
            return new PushContentTransition[i];
        }
    };

    public PushContentTransition(boolean z) {
        super(z);
    }

    @Override // com.amazon.regulator.transitions.AnimatorTransition
    @Nullable
    public Animator getAnimator(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable View view2) {
        if (view2 == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        return ofFloat;
    }

    public PushContentTransition() {
    }

    public PushContentTransition(Parcel parcel) {
        super(parcel);
    }
}
