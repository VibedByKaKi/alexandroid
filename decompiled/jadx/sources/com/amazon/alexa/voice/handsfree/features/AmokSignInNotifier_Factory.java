package com.amazon.alexa.voice.handsfree.features;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AmokSignInNotifier_Factory implements Factory<AmokSignInNotifier> {
    private static final AmokSignInNotifier_Factory INSTANCE = new AmokSignInNotifier_Factory();

    public static AmokSignInNotifier_Factory create() {
        return INSTANCE;
    }

    public static AmokSignInNotifier newInstance() {
        return new AmokSignInNotifier();
    }

    @Override // javax.inject.Provider
    public AmokSignInNotifier get() {
        return new AmokSignInNotifier();
    }
}
