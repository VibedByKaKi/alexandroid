package com.amazon.alexa.client.alexaservice.base.application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.amazon.alexa.client.alexaservice.base.events.PackageAddedEvent;
import com.amazon.alexa.client.alexaservice.base.events.PackageRemovedEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class PackagesChangedBroadcastReceiver extends BroadcastReceiver {
    private static final String PACKAGE_SCHEME = "package";
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "PackagesChangedBroadcastReceiver";
    private final Context context;
    private final AlexaClientEventBus eventBus;
    private boolean isRegistered = false;

    @Inject
    public PackagesChangedBroadcastReceiver(Context context, AlexaClientEventBus alexaClientEventBus) {
        this.context = context;
        this.eventBus = alexaClientEventBus;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
            this.eventBus.post(PackageRemovedEvent.create(intent.getData() != null ? intent.getData().getEncodedSchemeSpecificPart() : ""));
        } else if (action.equals("android.intent.action.PACKAGE_ADDED")) {
            this.eventBus.post(PackageAddedEvent.create());
        }
    }

    public void register() {
        if (this.isRegistered) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 34) {
            context.registerReceiver(this, intentFilter, 4);
        } else {
            context.registerReceiver(this, intentFilter);
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
