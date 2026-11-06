package com.amazon.alexa.mobilytics.integration.ama.resourcestat.cpu;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class CpuStatManager_Factory implements Factory<CpuStatManager> {
    private final Provider<Context> contextProvider;

    public CpuStatManager_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static CpuStatManager_Factory create(Provider<Context> provider) {
        return new CpuStatManager_Factory(provider);
    }

    public static CpuStatManager newInstance(Context context) {
        return new CpuStatManager(context);
    }

    @Override // javax.inject.Provider
    public CpuStatManager get() {
        return newInstance(this.contextProvider.get());
    }
}
