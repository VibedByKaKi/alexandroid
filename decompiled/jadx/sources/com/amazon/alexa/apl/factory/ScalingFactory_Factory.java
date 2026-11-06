package com.amazon.alexa.apl.factory;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class ScalingFactory_Factory implements Factory<ScalingFactory> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final ScalingFactory_Factory INSTANCE = new ScalingFactory_Factory();

        private InstanceHolder() {
        }
    }

    public static ScalingFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ScalingFactory newInstance() {
        return new ScalingFactory();
    }

    @Override // javax.inject.Provider
    public ScalingFactory get() {
        return newInstance();
    }
}
