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
public final class APLGlideImageLoaderProvider_Factory implements Factory<APLGlideImageLoaderProvider> {
    private final Provider<APLGlideImageLoader> mAPLGlideImageLoaderProvider;

    public APLGlideImageLoaderProvider_Factory(Provider<APLGlideImageLoader> provider) {
        this.mAPLGlideImageLoaderProvider = provider;
    }

    public static APLGlideImageLoaderProvider_Factory create(Provider<APLGlideImageLoader> provider) {
        return new APLGlideImageLoaderProvider_Factory(provider);
    }

    public static APLGlideImageLoaderProvider newInstance(APLGlideImageLoader aPLGlideImageLoader) {
        return new APLGlideImageLoaderProvider(aPLGlideImageLoader);
    }

    @Override // javax.inject.Provider
    public APLGlideImageLoaderProvider get() {
        return newInstance(this.mAPLGlideImageLoaderProvider.get());
    }
}
