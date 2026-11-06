package com.amazon.alexa.mosaic.components;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class PulsatingStateObserver {
    private static final MutableLiveData<Boolean> shouldStopPulsating = new MutableLiveData<>(Boolean.FALSE);

    private PulsatingStateObserver() {
        throw new UnsupportedOperationException("Not to init");
    }

    public static LiveData<Boolean> getShouldStopPulsating() {
        return shouldStopPulsating;
    }

    public static void setShouldStopPulsating(boolean z) {
        shouldStopPulsating.setValue(Boolean.valueOf(z));
    }
}
