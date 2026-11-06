package com.amazon.alexa.client.alexaservice.vad.deferredbargein;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class DeferredBargeInConfiguration_Factory implements Factory<DeferredBargeInConfiguration> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final DeferredBargeInConfiguration_Factory INSTANCE = new DeferredBargeInConfiguration_Factory();

        private InstanceHolder() {
        }
    }

    public static DeferredBargeInConfiguration_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DeferredBargeInConfiguration newInstance() {
        return new DeferredBargeInConfiguration();
    }

    @Override // javax.inject.Provider
    public DeferredBargeInConfiguration get() {
        return newInstance();
    }
}
