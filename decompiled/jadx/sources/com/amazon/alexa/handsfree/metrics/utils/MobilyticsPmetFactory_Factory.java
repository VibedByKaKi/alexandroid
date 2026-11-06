package com.amazon.alexa.handsfree.metrics.utils;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class MobilyticsPmetFactory_Factory implements Factory<MobilyticsPmetFactory> {
    private static final MobilyticsPmetFactory_Factory INSTANCE = new MobilyticsPmetFactory_Factory();

    public static Factory<MobilyticsPmetFactory> create() {
        return INSTANCE;
    }

    @Override // javax.inject.Provider
    public MobilyticsPmetFactory get() {
        return new MobilyticsPmetFactory();
    }
}
