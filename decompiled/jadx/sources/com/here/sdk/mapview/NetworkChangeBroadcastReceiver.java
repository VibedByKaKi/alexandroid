package com.here.sdk.mapview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.here.sdk.mapview.NetworkChangesObserver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class NetworkChangeBroadcastReceiver extends BroadcastReceiver {
    private BroadcastReceiver receiver;

    public NetworkChangeBroadcastReceiver(final NetworkChangesObserver.Listener listener) {
        this.receiver = new BroadcastReceiver() { // from class: com.here.sdk.mapview.NetworkChangeBroadcastReceiver.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                NetworkChangesObserver.Listener listener2 = listener;
                if (booleanExtra) {
                    listener2.onDisconnected();
                } else {
                    listener2.onConnected();
                }
            }
        };
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.receiver.onReceive(context, intent);
    }
}
