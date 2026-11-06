package com.amazon.alexa.smarthomecameras.dependencies.modules;

import android.content.Context;
import com.amazon.alexa.smarthomecameras.rtcsc.CamerasAppClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class AppLiveViewModule_ProvidesCamerasAppClientFactory implements Factory<CamerasAppClient> {
    private final Provider<Context> contextProvider;

    public AppLiveViewModule_ProvidesCamerasAppClientFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static AppLiveViewModule_ProvidesCamerasAppClientFactory create(Provider<Context> provider) {
        return new AppLiveViewModule_ProvidesCamerasAppClientFactory(provider);
    }

    public static CamerasAppClient providesCamerasAppClient(Context context) {
        return (CamerasAppClient) Preconditions.checkNotNull(AppLiveViewModule.providesCamerasAppClient(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public CamerasAppClient get() {
        return providesCamerasAppClient(this.contextProvider.get());
    }
}
