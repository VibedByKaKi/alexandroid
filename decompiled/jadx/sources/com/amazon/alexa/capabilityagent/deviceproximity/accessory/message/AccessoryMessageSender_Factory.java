package com.amazon.alexa.capabilityagent.deviceproximity.accessory.message;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AccessoryMessageSender_Factory implements Factory<AccessoryMessageSender> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AccessoryMessageSender_Factory INSTANCE = new AccessoryMessageSender_Factory();

        private InstanceHolder() {
        }
    }

    public static AccessoryMessageSender_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AccessoryMessageSender newInstance() {
        return new AccessoryMessageSender();
    }

    @Override // javax.inject.Provider
    public AccessoryMessageSender get() {
        return newInstance();
    }
}
