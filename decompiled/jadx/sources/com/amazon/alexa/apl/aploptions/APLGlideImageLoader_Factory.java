package com.amazon.alexa.apl.aploptions;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class APLGlideImageLoader_Factory implements Factory<APLGlideImageLoader> {
    private final Provider<APLGlideRequestManagerWrapper> aplGlideRequestManagerWrapperProvider;

    public APLGlideImageLoader_Factory(Provider<APLGlideRequestManagerWrapper> provider) {
        this.aplGlideRequestManagerWrapperProvider = provider;
    }

    public static APLGlideImageLoader_Factory create(Provider<APLGlideRequestManagerWrapper> provider) {
        return new APLGlideImageLoader_Factory(provider);
    }

    public static APLGlideImageLoader newInstance(APLGlideRequestManagerWrapper aPLGlideRequestManagerWrapper) {
        return new APLGlideImageLoader(aPLGlideRequestManagerWrapper);
    }

    @Override // javax.inject.Provider
    public APLGlideImageLoader get() {
        return newInstance(this.aplGlideRequestManagerWrapperProvider.get());
    }
}
