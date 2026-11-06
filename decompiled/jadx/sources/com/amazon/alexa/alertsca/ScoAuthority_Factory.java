package com.amazon.alexa.alertsca;

import android.content.Context;
import com.amazon.alexa.accessory.sco.ScoPrioritizer;
import com.amazon.alexa.bluetooth.sco.BluetoothScoController;
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
public final class ScoAuthority_Factory implements Factory<ScoAuthority> {
    private final Provider<BluetoothScoController> bluetoothScoControllerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<ScoPrioritizer> scoPrioritizerProvider;

    public ScoAuthority_Factory(Provider<Context> provider, Provider<BluetoothScoController> provider2, Provider<ScoPrioritizer> provider3) {
        this.contextProvider = provider;
        this.bluetoothScoControllerProvider = provider2;
        this.scoPrioritizerProvider = provider3;
    }

    public static ScoAuthority_Factory create(Provider<Context> provider, Provider<BluetoothScoController> provider2, Provider<ScoPrioritizer> provider3) {
        return new ScoAuthority_Factory(provider, provider2, provider3);
    }

    public static ScoAuthority newInstance(Context context, BluetoothScoController bluetoothScoController, ScoPrioritizer scoPrioritizer) {
        return new ScoAuthority(context, bluetoothScoController, scoPrioritizer);
    }

    @Override // javax.inject.Provider
    public ScoAuthority get() {
        return newInstance(this.contextProvider.get(), this.bluetoothScoControllerProvider.get(), this.scoPrioritizerProvider.get());
    }
}
