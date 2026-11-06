package com.amazon.alexa.voice.ui.onedesign.transitions;

import android.animation.Animator;
import android.animation.AnimatorSet;
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
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SlideStartInTransition extends AnimatorTransition {
    public static final Parcelable.Creator<SlideStartInTransition> CREATOR = new Parcelable.Creator<SlideStartInTransition>() { // from class: com.amazon.alexa.voice.ui.onedesign.transitions.SlideStartInTransition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SlideStartInTransition createFromParcel(Parcel parcel) {
            return new SlideStartInTransition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SlideStartInTransition[] newArray(int i) {
            return new SlideStartInTransition[i];
        }
    };

    public SlideStartInTransition() {
    }

    @Override // com.amazon.regulator.transitions.AnimatorTransition
    @Nullable
    public Animator getAnimator(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable View view2) {
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, -view.getWidth()));
        }
        if (view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, view2.getWidth(), 0.0f));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    public SlideStartInTransition(Parcel parcel) {
        super(parcel);
    }
}
