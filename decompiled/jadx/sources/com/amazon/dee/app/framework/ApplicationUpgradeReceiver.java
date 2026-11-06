package com.amazon.dee.app.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.featureservice.constants.FeatureConstants;
import com.amazon.alexa.identity.api.IdentityConstant;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ApplicationUpgradeReceiver extends BroadcastReceiver {
    private static final String TAG = "ApplicationUpgradeReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "App has been upgraded. Removing shared preferences related to identity refresh.");
        context.getSharedPreferences(IdentityConstant.IDENTITY_STORAGE_NAME, 0).edit().clear().apply();
        sendAppUpgradedEvent();
    }

    @VisibleForTesting
    public void sendAppUpgradedEvent() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EventBus.class).get();
        EventBus eventBus = (EventBus) obj;
        Message build = new Message.Builder().setEventType(FeatureConstants.APP_UPGRADED_EVENT).build();
        if (eventBus != null) {
            eventBus.lambda$getPublisher$0(build);
        } else {
            Log.i(TAG, "Event bus not available. Unable to send \"app:upgraded\" event");
        }
    }
}
