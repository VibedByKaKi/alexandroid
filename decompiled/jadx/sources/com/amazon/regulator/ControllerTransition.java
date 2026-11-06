package com.amazon.regulator;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface ControllerTransition extends Parcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CompletionListener {
        public static final CompletionListener NONE = new CompletionListener() { // from class: com.amazon.regulator.ControllerTransition.CompletionListener.1
            @Override // com.amazon.regulator.ControllerTransition.CompletionListener
            public void completeTransition() {
            }
        };

        void completeTransition();
    }

    void completeTransition();

    void performTransition(ViewGroup viewGroup, View view, View view2, CompletionListener completionListener);
}
