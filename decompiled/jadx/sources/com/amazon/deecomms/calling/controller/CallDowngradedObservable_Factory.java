package com.amazon.deecomms.calling.controller;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class CallDowngradedObservable_Factory implements Factory<CallDowngradedObservable> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final CallDowngradedObservable_Factory INSTANCE = new CallDowngradedObservable_Factory();

        private InstanceHolder() {
        }
    }

    public static CallDowngradedObservable_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CallDowngradedObservable newInstance() {
        return new CallDowngradedObservable();
    }

    @Override // javax.inject.Provider
    public CallDowngradedObservable get() {
        return newInstance();
    }
}
