package com.amazon.alexa.alertsca.dependencies;

import android.content.Context;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.amazon.alexa.bluetooth.sco.BluetoothScoController;
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
/* loaded from: classes16.dex */
public final class ApplicationModule_ProvidesScoControllerFactory implements Factory<BluetoothScoController> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<Context> contextProvider;
    private final ApplicationModule module;
    private final Provider<TelephonyManager> telephonyManagerProvider;

    public ApplicationModule_ProvidesScoControllerFactory(ApplicationModule applicationModule, Provider<Context> provider, Provider<AudioManager> provider2, Provider<TelephonyManager> provider3) {
        this.module = applicationModule;
        this.contextProvider = provider;
        this.audioManagerProvider = provider2;
        this.telephonyManagerProvider = provider3;
    }

    public static ApplicationModule_ProvidesScoControllerFactory create(ApplicationModule applicationModule, Provider<Context> provider, Provider<AudioManager> provider2, Provider<TelephonyManager> provider3) {
        return new ApplicationModule_ProvidesScoControllerFactory(applicationModule, provider, provider2, provider3);
    }

    public static BluetoothScoController providesScoController(ApplicationModule applicationModule, Context context, AudioManager audioManager, TelephonyManager telephonyManager) {
        return (BluetoothScoController) Preconditions.checkNotNullFromProvides(applicationModule.providesScoController(context, audioManager, telephonyManager));
    }

    @Override // javax.inject.Provider
    public BluetoothScoController get() {
        return providesScoController(this.module, this.contextProvider.get(), this.audioManagerProvider.get(), this.telephonyManagerProvider.get());
    }
}
