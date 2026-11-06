package com.amazon.alexa.client.metrics.core;

import android.content.Context;
import android.content.pm.PackageManager;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class AppInformation_Factory implements Factory<AppInformation> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Provider<Context> contextProvider;
    private final Provider<PackageManager> packageManagerProvider;

    public AppInformation_Factory(Provider<Context> provider, Provider<PackageManager> provider2) {
        this.contextProvider = provider;
        this.packageManagerProvider = provider2;
    }

    public static Factory<AppInformation> create(Provider<Context> provider, Provider<PackageManager> provider2) {
        return new AppInformation_Factory(provider, provider2);
    }

    @Override // javax.inject.Provider
    public AppInformation get() {
        return new AppInformation(this.contextProvider.get(), this.packageManagerProvider.get());
    }
}
