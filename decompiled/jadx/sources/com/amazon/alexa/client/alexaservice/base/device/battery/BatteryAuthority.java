package com.amazon.alexa.client.alexaservice.base.device.battery;

import com.amazon.alexa.client.alexaservice.base.events.BatteryLevelChangedEvent;
import com.amazon.alexa.client.alexaservice.base.events.PowerConnectionEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class BatteryAuthority {
    private final BatteryLevelReceiver batteryLevelReceiver;
    private boolean isCharging;
    private boolean isLowBattery;
    private final PowerConnectionReceiver powerConnectionReceiver;

    @Inject
    public BatteryAuthority(AlexaClientEventBus alexaClientEventBus, PowerConnectionReceiver powerConnectionReceiver, BatteryLevelReceiver batteryLevelReceiver) {
        this.batteryLevelReceiver = batteryLevelReceiver;
        this.powerConnectionReceiver = powerConnectionReceiver;
        alexaClientEventBus.register(this);
    }

    public boolean isCharging() {
        return this.isCharging;
    }

    public boolean isLowBattery() {
        return this.isLowBattery;
    }

    @Subscribe
    public synchronized void on(PowerConnectionEvent powerConnectionEvent) {
        this.isCharging = powerConnectionEvent.isCharging();
    }

    @Subscribe
    public synchronized void on(BatteryLevelChangedEvent batteryLevelChangedEvent) {
        this.isLowBattery = batteryLevelChangedEvent.isLowBattery();
    }
}
