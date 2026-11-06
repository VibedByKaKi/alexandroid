package com.amazon.alexa.externalnotifications.capability;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.api.AlexaCapability;
import com.amazon.alexa.api.AlexaCapabilityAgentService;
import com.amazon.alexa.api.AlexaDirective;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExternalNotificationCapabilityAgentService extends AlexaCapabilityAgentService {
    private static final String TAG = "ExternalNotificationCapabilityAgentService";

    private void sendSetReadDirectiveBroadcast(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ExternalNotificationsDirectiveReceiver.INTENT_ACTION_SET_READ_DIRECTIVE_RECEIVED);
        intent.putExtra(ExternalNotificationsDirectiveReceiver.INTENT_KEY_SET_READ_PAYLOAD_EXTRA, str);
        intent.setPackage(getPackageName());
        sendBroadcast(intent, ExternalNotificationsDirectiveReceiver.SECURE_PERMISSION);
        Log.i(TAG, "Sent SetRead directive broadcast");
    }

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService
    public Set<AlexaCapability> getCapabilities() {
        return Collections.singleton(AlexaCapability.create(ExternalNotificationsCapabilityAgentConstants.INTERFACE_NAME, "1.0"));
    }

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService
    public boolean process(AlexaDirective alexaDirective) {
        if (alexaDirective == null) {
            Log.e(TAG, "process: Alexa directive is null!");
            return false;
        }
        if (!ExternalNotificationsCapabilityAgentConstants.INTERFACE_NAME.equals(alexaDirective.getNamespace())) {
            Log.w(TAG, "process: Not Alexa.Notifications.External namespace");
            return false;
        }
        String name = alexaDirective.getName();
        if (ExternalNotificationsCapabilityAgentConstants.SET_READ_DIRECTIVE_NAME.equals(name)) {
            sendSetReadDirectiveBroadcast(alexaDirective.getAlexaPayload().getPayload());
            return true;
        }
        Log.e(TAG, "process: Unknown directive " + name);
        return false;
    }
}
