package com.amazon.comms.calling.sdk;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CallingBridgeHandlerRegistry_Factory implements Factory<CallingBridgeHandlerRegistry> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final CallingBridgeHandlerRegistry_Factory INSTANCE = new CallingBridgeHandlerRegistry_Factory();

        private InstanceHolder() {
        }
    }

    public static CallingBridgeHandlerRegistry_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CallingBridgeHandlerRegistry newInstance() {
        return new CallingBridgeHandlerRegistry();
    }

    @Override // javax.inject.Provider
    public CallingBridgeHandlerRegistry get() {
        return newInstance();
    }
}
