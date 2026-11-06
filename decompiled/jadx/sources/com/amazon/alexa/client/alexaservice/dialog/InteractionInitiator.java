package com.amazon.alexa.client.alexaservice.dialog;

import com.amazon.alexa.voice.tta.Constants;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum InteractionInitiator {
    TOUCH("Touch"),
    TEXT(Constants.Namespaces.TEXT),
    VOICE(Constants.Telemetry.CallInitScreenNames.VOX);

    private static final String INTERACTION_LABEL_TEXT_INITIATOR = "TextField";
    private final String value;

    InteractionInitiator(String str) {
        this.value = str;
    }

    public static InteractionInitiator getInitiatorForTextInteraction(String str) {
        return "TextField".equals(str) ? TEXT : TOUCH;
    }

    public String getValue() {
        return this.value;
    }
}
