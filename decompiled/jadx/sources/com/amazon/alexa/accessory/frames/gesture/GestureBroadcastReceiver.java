package com.amazon.alexa.accessory.frames.gesture;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.alexa.accessory.frames.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class GestureBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "GestureBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive - broadcast intent for action: " + intent.getAction());
        try {
            GestureManagerFactory.getGestureManager(intent.getStringExtra("deviceType")).onGestureEventReceived(intent);
        } catch (Exception e) {
            Log.e(TAG, "Error in dispatching gesture broadcast for actionType: " + intent.getAction() + " with error as: " + e.getMessage());
        }
    }
}
