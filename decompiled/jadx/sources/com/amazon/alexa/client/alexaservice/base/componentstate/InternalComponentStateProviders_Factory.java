package com.amazon.alexa.client.alexaservice.base.componentstate;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class InternalComponentStateProviders_Factory implements Factory<InternalComponentStateProviders> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final InternalComponentStateProviders_Factory INSTANCE = new InternalComponentStateProviders_Factory();

        private InstanceHolder() {
        }
    }

    public static InternalComponentStateProviders_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InternalComponentStateProviders newInstance() {
        return new InternalComponentStateProviders();
    }

    @Override // javax.inject.Provider
    public InternalComponentStateProviders get() {
        return newInstance();
    }
}
