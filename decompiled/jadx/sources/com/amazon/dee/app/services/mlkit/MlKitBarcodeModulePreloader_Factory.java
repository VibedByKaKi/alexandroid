package com.amazon.dee.app.services.mlkit;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class MlKitBarcodeModulePreloader_Factory implements Factory<MlKitBarcodeModulePreloader> {
    private final Provider<Application> applicationProvider;

    public MlKitBarcodeModulePreloader_Factory(Provider<Application> provider) {
        this.applicationProvider = provider;
    }

    public static MlKitBarcodeModulePreloader_Factory create(Provider<Application> provider) {
        return new MlKitBarcodeModulePreloader_Factory(provider);
    }

    public static MlKitBarcodeModulePreloader newInstance(Application application) {
        return new MlKitBarcodeModulePreloader(application);
    }

    @Override // javax.inject.Provider
    public MlKitBarcodeModulePreloader get() {
        return newInstance(this.applicationProvider.get());
    }
}
