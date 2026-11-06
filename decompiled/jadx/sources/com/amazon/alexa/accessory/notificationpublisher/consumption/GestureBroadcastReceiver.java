package com.amazon.alexa.accessory.notificationpublisher.consumption;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class GestureBroadcastReceiver extends BroadcastReceiver {
    private static final String KEY_DEVICE_ADDRESS = "deviceAddress";
    private static final String KEY_DEVICE_TYPE = "deviceType";
    private static final String KEY_INPUT_ACTION = "action";
    private static final String KEY_INPUT_BEHAVIOR = "behavior";
    private static final String KEY_INPUT_SOURCE = "source";
    private static final String TAG = "GestureBroadcastReceiver";

    private GestureEventPayload getGestureEventPayload(Intent intent) {
        int intExtra = intent.getIntExtra("source", -1);
        int intExtra2 = intent.getIntExtra("action", -1);
        int intExtra3 = intent.getIntExtra("behavior", 0);
        String stringExtra = intent.getStringExtra("deviceType");
        return GestureEventPayload.builder().setInputSource(intExtra).setInputAction(intExtra2).setInputBehavior(intExtra3).setDeviceType(stringExtra).setDeviceAddress(intent.getStringExtra("deviceAddress")).build();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive - broadcast intent for action: " + intent.getAction());
        try {
            GestureManager.getInstance().onGestureEventReceived(getGestureEventPayload(intent));
        } catch (Exception e) {
            String str = TAG;
            String action = intent.getAction();
            e.getMessage();
            Log.e(str, "Error in dispatching gesture broadcast for actionType: " + action + " with error as:");
        }
    }
}
