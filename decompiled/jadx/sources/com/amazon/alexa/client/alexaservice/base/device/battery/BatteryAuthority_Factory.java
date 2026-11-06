package com.amazon.alexa.client.alexaservice.base.device.battery;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class BatteryAuthority_Factory implements Factory<BatteryAuthority> {
    private final Provider<BatteryLevelReceiver> batteryLevelReceiverProvider;
    private final Provider<AlexaClientEventBus> eventBusProvider;
    private final Provider<PowerConnectionReceiver> powerConnectionReceiverProvider;

    public BatteryAuthority_Factory(Provider<AlexaClientEventBus> provider, Provider<PowerConnectionReceiver> provider2, Provider<BatteryLevelReceiver> provider3) {
        this.eventBusProvider = provider;
        this.powerConnectionReceiverProvider = provider2;
        this.batteryLevelReceiverProvider = provider3;
    }

    public static BatteryAuthority_Factory create(Provider<AlexaClientEventBus> provider, Provider<PowerConnectionReceiver> provider2, Provider<BatteryLevelReceiver> provider3) {
        return new BatteryAuthority_Factory(provider, provider2, provider3);
    }

    public static BatteryAuthority newInstance(AlexaClientEventBus alexaClientEventBus, PowerConnectionReceiver powerConnectionReceiver, BatteryLevelReceiver batteryLevelReceiver) {
        return new BatteryAuthority(alexaClientEventBus, powerConnectionReceiver, batteryLevelReceiver);
    }

    @Override // javax.inject.Provider
    public BatteryAuthority get() {
        return newInstance(this.eventBusProvider.get(), this.powerConnectionReceiverProvider.get(), this.batteryLevelReceiverProvider.get());
    }
}
