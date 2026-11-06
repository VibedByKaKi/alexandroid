package com.amazon.dee.app.framework.startup.metrics;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class MetricsCollector_Factory implements Factory<MetricsCollector> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final MetricsCollector_Factory INSTANCE = new MetricsCollector_Factory();

        private InstanceHolder() {
        }
    }

    public static MetricsCollector_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MetricsCollector newInstance() {
        return new MetricsCollector();
    }

    @Override // javax.inject.Provider
    public MetricsCollector get() {
        return newInstance();
    }
}
