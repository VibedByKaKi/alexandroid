package com.amazon.alexa.voice.ui.onedesign.transitions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.vox.ui.onedesign.R;
import com.amazon.regulator.transitions.AnimatorTransition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 22)
/* loaded from: classes20.dex */
public final class ScrimOpenTransition extends AnimatorTransition {
    public static final Parcelable.Creator<ScrimOpenTransition> CREATOR = new Parcelable.Creator<ScrimOpenTransition>() { // from class: com.amazon.alexa.voice.ui.onedesign.transitions.ScrimOpenTransition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScrimOpenTransition createFromParcel(Parcel parcel) {
            return new ScrimOpenTransition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScrimOpenTransition[] newArray(int i) {
            return new ScrimOpenTransition[i];
        }
    };
    private static final String TAG = "ScrimOpenTransition";
    private LoadAnimator loadAnimator;

    public ScrimOpenTransition(boolean z) {
        super(z);
        this.loadAnimator = new BottomSheetCallTransition$$ExternalSyntheticLambda0();
    }

    @Override // com.amazon.regulator.transitions.AnimatorTransition
    @Nullable
    public Animator getAnimator(@NonNull ViewGroup viewGroup, @Nullable View view, @Nullable View view2) {
        if (view2 == null) {
            return null;
        }
        Animator load = this.loadAnimator.load(view2.getContext(), R.animator.voice_ui_scrim_overlay_open);
        load.setTarget(view2);
        View findViewById = view2.findViewById(R.id.chrome);
        if (findViewById == null) {
            Log.e(TAG, "ChromeView was null so an animation was not applied to it");
            return load;
        }
        Animator load2 = this.loadAnimator.load(findViewById.getContext(), R.animator.voice_ui_scrim_chome_open);
        load2.setTarget(findViewById);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(load, load2);
        return animatorSet;
    }

    public ScrimOpenTransition() {
        this(new BottomSheetCallTransition$$ExternalSyntheticLambda0());
    }

    @VisibleForTesting
    public ScrimOpenTransition(LoadAnimator loadAnimator) {
        this.loadAnimator = loadAnimator;
    }

    public ScrimOpenTransition(Parcel parcel) {
        super(parcel);
        this.loadAnimator = new BottomSheetCallTransition$$ExternalSyntheticLambda0();
    }
}
