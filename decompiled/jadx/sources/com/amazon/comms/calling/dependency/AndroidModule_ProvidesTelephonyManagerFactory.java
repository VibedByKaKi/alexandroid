package com.amazon.comms.calling.dependency;

import android.content.Context;
import android.telephony.TelephonyManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AndroidModule_ProvidesTelephonyManagerFactory implements Factory<TelephonyManager> {
    private final Provider<Context> contextProvider;
    private final AndroidModule module;

    public AndroidModule_ProvidesTelephonyManagerFactory(AndroidModule androidModule, Provider<Context> provider) {
        this.module = androidModule;
        this.contextProvider = provider;
    }

    public static AndroidModule_ProvidesTelephonyManagerFactory create(AndroidModule androidModule, Provider<Context> provider) {
        return new AndroidModule_ProvidesTelephonyManagerFactory(androidModule, provider);
    }

    public static TelephonyManager providesTelephonyManager(AndroidModule androidModule, Context context) {
        return (TelephonyManager) Preconditions.checkNotNullFromProvides(androidModule.providesTelephonyManager(context));
    }

    @Override // javax.inject.Provider
    public TelephonyManager get() {
        return providesTelephonyManager(this.module, this.contextProvider.get());
    }
}
