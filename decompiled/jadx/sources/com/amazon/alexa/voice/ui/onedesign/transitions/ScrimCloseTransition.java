package com.amazon.alexa.voice.ui.onedesign.transitions;

import android.animation.Animator;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.vox.ui.onedesign.R;
import com.amazon.regulator.transitions.AnimatorTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ScrimCloseTransition extends AnimatorTransition {
    public static final Parcelable.Creator<ScrimCloseTransition> CREATOR = new Parcelable.Creator<ScrimCloseTransition>() { // from class: com.amazon.alexa.voice.ui.onedesign.transitions.ScrimCloseTransition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScrimCloseTransition createFromParcel(Parcel parcel) {
            return new ScrimCloseTransition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScrimCloseTransition[] newArray(int i) {
            return new ScrimCloseTransition[i];
        }
    };
    private LoadAnimator loadAnimator;

    public ScrimCloseTransition(Parcel parcel) {
        super(parcel);
        this.loadAnimator = new BottomSheetCallTransition$$ExternalSyntheticLambda0();
    }

    @Override // com.amazon.regulator.transitions.AnimatorTransition
    @Nullable
    public Animator getAnimator(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable View view2) {
        if (view == null) {
            return null;
        }
        Animator load = this.loadAnimator.load(view.getContext(), R.animator.voice_ui_scrim_close);
        load.setTarget(view);
        return load;
    }

    @VisibleForTesting
    public ScrimCloseTransition(LoadAnimator loadAnimator) {
        this.loadAnimator = loadAnimator;
    }

    public ScrimCloseTransition() {
        this(new BottomSheetCallTransition$$ExternalSyntheticLambda0());
    }
}
