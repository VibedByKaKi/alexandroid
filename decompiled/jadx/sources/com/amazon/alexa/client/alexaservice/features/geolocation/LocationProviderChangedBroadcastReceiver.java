package com.amazon.alexa.client.alexaservice.features.geolocation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class LocationProviderChangedBroadcastReceiver extends BroadcastReceiver {
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "LocationProviderChangedBroadcastReceiver";
    private final Context context;
    private final AlexaClientEventBus eventBus;
    private boolean isRegistered = false;

    @Inject
    public LocationProviderChangedBroadcastReceiver(Context context, AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            this.eventBus.post(LocationProviderChangedEvent.create());
        }
    }

    public void register() {
        if (this.isRegistered) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 34) {
            context.registerReceiver(this, new IntentFilter("android.location.PROVIDERS_CHANGED"), 4);
        } else {
            context.registerReceiver(this, new IntentFilter("android.location.PROVIDERS_CHANGED"));
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
