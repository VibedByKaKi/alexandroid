package com.amazon.alexa.client.alexaservice.base.device.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.amazon.alexa.client.alexaservice.base.events.PowerConnectionEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class PowerConnectionReceiver extends BroadcastReceiver {
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "PowerConnectionReceiver";
    private final Context context;
    private final AlexaClientEventBus eventBus;
    private boolean isCharging = false;
    private boolean isRegistered = false;
    private final IntentFilter powerConnectionFilter;

    @Inject
    public PowerConnectionReceiver(Context context, AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
        IntentFilter intentFilter = new IntentFilter();
        this.powerConnectionFilter = intentFilter;
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
    }

    public boolean isCharging() {
        return this.isCharging;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            if (intent.getIntExtra("status", -1) == 2) {
                this.isCharging = true;
                this.eventBus.post(PowerConnectionEvent.create(true));
            } else {
                this.isCharging = false;
                this.eventBus.post(PowerConnectionEvent.create(false));
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
            context.registerReceiver(this, this.powerConnectionFilter, 4);
        } else {
            context.registerReceiver(this, this.powerConnectionFilter);
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
