package com.amazon.deecomms.calling.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class EnhancedProcessingStateObservable_Factory implements Factory<EnhancedProcessingStateObservable> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final EnhancedProcessingStateObservable_Factory INSTANCE = new EnhancedProcessingStateObservable_Factory();

        private InstanceHolder() {
        }
    }

    public static EnhancedProcessingStateObservable_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EnhancedProcessingStateObservable newInstance() {
        return new EnhancedProcessingStateObservable();
    }

    @Override // javax.inject.Provider
    public EnhancedProcessingStateObservable get() {
        return newInstance();
    }
}
