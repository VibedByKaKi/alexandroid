package com.amazon.deecomms.smsmessaging.messagingcontroller;

import androidx.annotation.NonNull;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.api.compat.model.AlexaPayload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MessagingControllerEventModel {
    private final AlexaHeader alexaHeader;
    private final AlexaPayload alexaPayload;

    public MessagingControllerEventModel(@NonNull AlexaHeader alexaHeader, @NonNull AlexaPayload alexaPayload) {
        this.alexaHeader = alexaHeader;
        this.alexaPayload = alexaPayload;
    }

    @NonNull
    public static AlexaHeader createHeader(@NonNull String str) {
        return AlexaHeader.builder().setNamespace(MessagingControllerConstant.MESSAGING_CONTROLLER_NAMESPACE).setName(str).build();
    }

    @NonNull
    public static AlexaPayload createPayload(@NonNull String str) {
        return new AlexaPayload(str);
    }

    @NonNull
    public AlexaHeader getAlexaHeader() {
        return this.alexaHeader;
    }

    @NonNull
    public AlexaPayload getAlexaPayload() {
        return this.alexaPayload;
    }
}
