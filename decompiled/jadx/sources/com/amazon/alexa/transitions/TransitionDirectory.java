package com.amazon.alexa.transitions;

import android.view.ViewGroup;
import androidx.transition.Transition;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface TransitionDirectory {
    void applyTransition();

    void clearTransition();

    void setMainView(ViewGroup viewGroup);

    void setNextTransition(Transition transition);
}
