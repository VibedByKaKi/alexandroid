package com.amazon.alexa.seamlessswitching.capability.agent;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.api.AlexaCapability;
import com.amazon.alexa.api.AlexaCapabilityAgentService;
import com.amazon.alexa.api.AlexaDirective;
import com.amazon.alexa.seamlessswitching.utils.LoggingUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class IOComponentsBluetoothCapabilityAgentService extends AlexaCapabilityAgentService {
    private static final String TAG = LoggingUtils.getTag(IOComponentsBluetoothCapabilityAgentService.class);

    private void sendDirectiveBroadcast(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra(IOComponentsBluetoothDirectiveReceiver.INTENT_KEY_DIRECTIVE_PAYLOAD_EXTRA, str2);
        intent.setPackage(getPackageName());
        sendBroadcast(intent, IOComponentsBluetoothDirectiveReceiver.SECURE_PERMISSION);
        a$$ExternalSyntheticOutline0.m3m("Sent directive broadcast with action:", str, TAG);
    }

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService
    public Set<AlexaCapability> getCapabilities() {
        return Collections.singleton(AlexaCapability.create(IOComponentsBluetoothCapabilityAgentConstants.INTERFACE_NAME, "1.0"));
    }

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService
    public boolean process(AlexaDirective alexaDirective) {
        if (alexaDirective == null) {
            Log.e(TAG, "AlexaDirective is null!");
            return false;
        }
        if (!IOComponentsBluetoothCapabilityAgentConstants.INTERFACE_NAME.equals(alexaDirective.getNamespace())) {
            Log.w(TAG, "Received a directive in unrecognized namespace");
            return false;
        }
        String name = alexaDirective.getName();
        String payload = alexaDirective.getAlexaPayload().getPayload();
        name.getClass();
        if (name.equals(IOComponentsBluetoothCapabilityAgentConstants.CONNECT_DEVICE_DIRECTIVE)) {
            Log.i(TAG, "Processing a connect directive");
            sendDirectiveBroadcast(IOComponentsBluetoothDirectiveReceiver.INTENT_ACTION_CONNECT_DEVICE_DIRECTIVE, payload);
            return true;
        }
        if (!name.equals(IOComponentsBluetoothCapabilityAgentConstants.DISCONNECT_DEVICE_DIRECTIVE)) {
            Log.e(TAG, "Received an unrecognized directive: ".concat(name));
            return false;
        }
        Log.i(TAG, "Processing a disconnect directive");
        sendDirectiveBroadcast(IOComponentsBluetoothDirectiveReceiver.INTENT_ACTION_DISCONNECT_DEVICE_DIRECTIVE, payload);
        return true;
    }
}
