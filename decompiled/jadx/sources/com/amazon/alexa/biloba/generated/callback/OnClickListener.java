package com.amazon.alexa.biloba.generated.callback;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class OnClickListener implements View.OnClickListener {
    final Listener mListener;
    final int mSourceId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void _internalCallbackOnClick(int i, View view);
    }

    public OnClickListener(Listener listener, int i) {
        this.mListener = listener;
        this.mSourceId = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.mListener._internalCallbackOnClick(this.mSourceId, view);
    }
}
