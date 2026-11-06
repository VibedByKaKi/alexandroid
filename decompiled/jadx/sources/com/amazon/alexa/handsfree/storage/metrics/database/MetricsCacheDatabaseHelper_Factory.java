package com.amazon.alexa.handsfree.storage.metrics.database;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.alexa.handsfree.protocols.dependencies.AhfScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MetricsCacheDatabaseHelper_Factory implements Factory<MetricsCacheDatabaseHelper> {
    private final Provider<Context> contextProvider;

    public MetricsCacheDatabaseHelper_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static MetricsCacheDatabaseHelper_Factory create(Provider<Context> provider) {
        return new MetricsCacheDatabaseHelper_Factory(provider);
    }

    public static MetricsCacheDatabaseHelper newInstance(Context context) {
        return new MetricsCacheDatabaseHelper(context);
    }

    @Override // javax.inject.Provider
    public MetricsCacheDatabaseHelper get() {
        return newInstance(this.contextProvider.get());
    }
}
