package com.amazon.alexa.alertsca.networking;

import android.content.Context;
import android.net.ConnectivityManager;
import com.amazon.alexa.alertsca.AlertsEventBus;
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
public final class ConnectivityAuthority_Factory implements Factory<ConnectivityAuthority> {
    private final Provider<AlertsEventBus> alertsEventBusProvider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final Provider<Context> contextProvider;

    public ConnectivityAuthority_Factory(Provider<Context> provider, Provider<ConnectivityManager> provider2, Provider<AlertsEventBus> provider3) {
        this.contextProvider = provider;
        this.connectivityManagerProvider = provider2;
        this.alertsEventBusProvider = provider3;
    }

    public static ConnectivityAuthority_Factory create(Provider<Context> provider, Provider<ConnectivityManager> provider2, Provider<AlertsEventBus> provider3) {
        return new ConnectivityAuthority_Factory(provider, provider2, provider3);
    }

    public static ConnectivityAuthority newInstance(Context context, ConnectivityManager connectivityManager, AlertsEventBus alertsEventBus) {
        return new ConnectivityAuthority(context, connectivityManager, alertsEventBus);
    }

    @Override // javax.inject.Provider
    public ConnectivityAuthority get() {
        return newInstance(this.contextProvider.get(), this.connectivityManagerProvider.get(), this.alertsEventBusProvider.get());
    }
}
