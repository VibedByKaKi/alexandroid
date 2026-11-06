package com.amazon.alexa.handsfree.vendor.bridge;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VoiceAppPackageInfoProvider_Factory implements Factory<VoiceAppPackageInfoProvider> {
    private final Provider<Context> contextProvider;

    public VoiceAppPackageInfoProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static VoiceAppPackageInfoProvider_Factory create(Provider<Context> provider) {
        return new VoiceAppPackageInfoProvider_Factory(provider);
    }

    public static VoiceAppPackageInfoProvider newInstance(Context context) {
        return new VoiceAppPackageInfoProvider(context);
    }

    @Override // javax.inject.Provider
    public VoiceAppPackageInfoProvider get() {
        return newInstance(this.contextProvider.get());
    }
}
