package com.amazon.comms.calling.infrastructure;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class ActiveCallNotificationService_Factory implements Factory<ActiveCallNotificationService> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final ActiveCallNotificationService_Factory INSTANCE = new ActiveCallNotificationService_Factory();

        private InstanceHolder() {
        }
    }

    public static ActiveCallNotificationService_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ActiveCallNotificationService newInstance() {
        return new ActiveCallNotificationService();
    }

    @Override // javax.inject.Provider
    public ActiveCallNotificationService get() {
        return newInstance();
    }
}
