package com.amazon.alexa.accessorykit.interprocess;

import android.content.Context;
import android.content.Intent;
import com.amazon.alexa.accessory.Accessories;
import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.AccessorySessionListener;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class InterprocessAccessorySessionListener extends AccessorySessionListener {
    private static final String ACCESSORY_CONNECTION_ACTION = "com.amazon.alexa.accessorykit.action.accessory_connectivity_change";
    private static final String TAG = "InterprocessAccessorySessionListener";
    private final Context context;

    public InterprocessAccessorySessionListener(Context context) {
        Preconditions.notNull(context, "context");
        this.context = context;
    }

    private void sendConnectionEventBroadcast(Accessory accessory, boolean z) {
        Logger.d("%s sending AccessoryConnectionBroadcast for %s with status %b", TAG, accessory, Boolean.valueOf(z));
        Intent intent = new Intent(ACCESSORY_CONNECTION_ACTION);
        intent.putExtra("name", accessory.getName());
        intent.putExtra("id", accessory.getAddress());
        intent.putExtra("transport", accessory.getTransport().toString());
        intent.putExtra("connected", z);
        this.context.sendBroadcast(intent, Accessories.INTEGRATION_BROADCAST_PERMISSION);
    }

    @Override // com.amazon.alexa.accessory.AccessorySessionListener
    public void onAccessorySessionConnected(Accessory accessory) {
        super.onAccessorySessionConnected(accessory);
        sendConnectionEventBroadcast(accessory, true);
    }

    @Override // com.amazon.alexa.accessory.AccessorySessionListener
    public void onAccessorySessionReleased(Accessory accessory) {
        super.onAccessorySessionReleased(accessory);
        sendConnectionEventBroadcast(accessory, false);
    }
}
