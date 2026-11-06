package com.amazon.dee.app.services.shortcut;

import com.amazon.alexa.mobilytics.Mobilytics;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ShortcutMetrics_Factory implements Factory<ShortcutMetrics> {
    private final Provider<Mobilytics> mobilyticsProvider;

    public ShortcutMetrics_Factory(Provider<Mobilytics> provider) {
        this.mobilyticsProvider = provider;
    }

    public static ShortcutMetrics_Factory create(Provider<Mobilytics> provider) {
        return new ShortcutMetrics_Factory(provider);
    }

    public static ShortcutMetrics newInstance(Lazy<Mobilytics> lazy) {
        return new ShortcutMetrics(lazy);
    }

    @Override // javax.inject.Provider
    public ShortcutMetrics get() {
        return newInstance(DoubleCheck.lazy(this.mobilyticsProvider));
    }
}
