package com.amazon.alexa.shortcuts.shortcutscapabilityagent;

import com.amazon.alexa.api.AlexaCapability;
import com.amazon.alexa.api.AlexaCapabilityAgentService;
import com.amazon.alexa.api.AlexaDirective;
import com.amazon.alexa.shortcuts.shortcutscapabilityagent.utils.Log;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ShortcutsCapabilityAgentService extends AlexaCapabilityAgentService {
    private static final String TAG = "ShortcutsCapabilityAgentService";

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService
    public Set<AlexaCapability> getCapabilities() {
        return Collections.singleton(AlexaCapability.create(ShortcutsCapabilityAgentConstants.SHORTCUTS_INTERFACE_NAME, "1.0"));
    }

    @Override // com.amazon.alexa.api.AlexaCapabilityAgentService
    public boolean process(AlexaDirective alexaDirective) {
        if (alexaDirective == null) {
            Log.e(TAG, "AlexaDirective is null!");
            return false;
        }
        if (ShortcutsCapabilityAgentConstants.SHORTCUTS_INTERFACE_NAME.equals(alexaDirective.getNamespace())) {
            Log.i(TAG, "received directive for Alexa.Shortcuts");
            return true;
        }
        Log.w(TAG, "Received a directive in unrecognized namespace");
        return false;
    }
}
