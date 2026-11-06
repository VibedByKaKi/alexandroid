package com.amazon.alexa.voice.handsfree.utils;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class WakeWordStateValidator_Factory implements Factory<WakeWordStateValidator> {
    private final Provider<Context> contextProvider;

    public WakeWordStateValidator_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static WakeWordStateValidator_Factory create(Provider<Context> provider) {
        return new WakeWordStateValidator_Factory(provider);
    }

    public static WakeWordStateValidator newInstance(Context context) {
        return new WakeWordStateValidator(context);
    }

    @Override // javax.inject.Provider
    public WakeWordStateValidator get() {
        return new WakeWordStateValidator(this.contextProvider.get());
    }
}
