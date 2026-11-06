package com.amazon.deecomms.calling.model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class CallContext_Factory implements Factory<CallContext> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final CallContext_Factory INSTANCE = new CallContext_Factory();

        private InstanceHolder() {
        }
    }

    public static CallContext_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CallContext newInstance() {
        return new CallContext();
    }

    @Override // javax.inject.Provider
    public CallContext get() {
        return newInstance();
    }
}
