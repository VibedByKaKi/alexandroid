package com.amazon.alexa.client.alexaservice.base.device.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.client.alexaservice.base.events.BatteryLevelChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class BatteryLevelReceiver extends BroadcastReceiver {
    private static final int BATTERY_LEVEL_FULL = 100;
    private static final int BATTERY_LEVEL_LOW = 20;
    private static final int BATTERY_LEVEL_ZERO = 0;
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "BatteryLevelReceiver";
    private final IntentFilter batteryLevelFilter;
    private final Context context;
    private final AlexaClientEventBus eventBus;
    private boolean isLowBattery = false;
    private boolean isRegistered = false;

    @Inject
    public BatteryLevelReceiver(Context context, AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
        IntentFilter intentFilter = new IntentFilter();
        this.batteryLevelFilter = intentFilter;
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
    }

    public boolean isLowBattery() {
        return this.isLowBattery;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            int intExtra = (int) ((intent.getIntExtra(ModelTransformer.KEY_BATTERY_LEVEL, -1) / intent.getIntExtra(ModelTransformer.KEY_BATTERY_SCALE, -1)) * 100.0d);
            if (intExtra <= 20 && intExtra >= 0) {
                this.isLowBattery = true;
                this.eventBus.post(BatteryLevelChangedEvent.create(true));
            } else {
                if (intExtra <= 20 || intExtra > 100) {
                    return;
                }
                this.isLowBattery = false;
                this.eventBus.post(BatteryLevelChangedEvent.create(false));
            }
        }
    }

    public void register() {
        if (this.isRegistered) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 34) {
            context.registerReceiver(this, this.batteryLevelFilter, 4);
        } else {
            context.registerReceiver(this, this.batteryLevelFilter);
        }
        this.isRegistered = true;
    }

    public void unregister() {
        if (this.isRegistered) {
            this.context.unregisterReceiver(this);
            this.isRegistered = false;
        }
    }
}
