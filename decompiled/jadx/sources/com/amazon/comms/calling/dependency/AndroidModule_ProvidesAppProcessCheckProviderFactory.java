package com.amazon.comms.calling.dependency;

import android.app.ActivityManager;
import com.amazon.comms.calling.foundation.features.providers.AppProcessCheckProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AndroidModule_ProvidesAppProcessCheckProviderFactory implements Factory<AppProcessCheckProvider> {
    private final Provider<ActivityManager> activityManagerProvider;
    private final AndroidModule module;

    public AndroidModule_ProvidesAppProcessCheckProviderFactory(AndroidModule androidModule, Provider<ActivityManager> provider) {
        this.module = androidModule;
        this.activityManagerProvider = provider;
    }

    public static AndroidModule_ProvidesAppProcessCheckProviderFactory create(AndroidModule androidModule, Provider<ActivityManager> provider) {
        return new AndroidModule_ProvidesAppProcessCheckProviderFactory(androidModule, provider);
    }

    public static AppProcessCheckProvider providesAppProcessCheckProvider(AndroidModule androidModule, ActivityManager activityManager) {
        return (AppProcessCheckProvider) Preconditions.checkNotNullFromProvides(androidModule.providesAppProcessCheckProvider(activityManager));
    }

    @Override // javax.inject.Provider
    public AppProcessCheckProvider get() {
        return providesAppProcessCheckProvider(this.module, this.activityManagerProvider.get());
    }
}
