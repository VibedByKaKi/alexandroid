package com.amazon.alexa.client.alexaservice.utils;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class UniqueIdGenerator_Factory implements Factory<UniqueIdGenerator> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final UniqueIdGenerator_Factory INSTANCE = new UniqueIdGenerator_Factory();

        private InstanceHolder() {
        }
    }

    public static UniqueIdGenerator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UniqueIdGenerator newInstance() {
        return new UniqueIdGenerator();
    }

    @Override // javax.inject.Provider
    public UniqueIdGenerator get() {
        return newInstance();
    }
}
