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
import com.amazon.regulator.transitions.AnimatorTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DismissContentTransition extends AnimatorTransition {
    public static final Parcelable.Creator<DismissContentTransition> CREATOR = new Parcelable.Creator<DismissContentTransition>() { // from class: com.amazon.alexa.voice.ui.onedesign.transitions.DismissContentTransition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DismissContentTransition createFromParcel(Parcel parcel) {
            return new DismissContentTransition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DismissContentTransition[] newArray(int i) {
            return new DismissContentTransition[i];
        }
    };

    public DismissContentTransition() {
    }

    @Override // com.amazon.regulator.transitions.AnimatorTransition
    @Nullable
    public Animator getAnimator(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable View view2) {
        if (view == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight());
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    public DismissContentTransition(Parcel parcel) {
        super(parcel);
    }
}
