package com.amazon.alexa.accessory.speechapi.voicesdk.events;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.speechapi.context.MessageHeader;
import com.amazon.alexa.accessory.speechapi.events.MessageEvent;
import com.amazon.alexa.api.AlexaEvent;
import com.amazon.alexa.api.AlexaHeader;
import com.amazon.alexa.api.AlexaPayload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toAlexaEvent", "Lcom/amazon/alexa/api/AlexaEvent;", "Lcom/amazon/alexa/accessory/speechapi/events/MessageEvent;", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxAlexaEventKt {
    @NotNull
    public static final AlexaEvent toAlexaEvent(@NotNull MessageEvent messageEvent) {
        messageEvent.getClass();
        Logger.d("VoxAlexaEvent: MessageEvent.toAlexaEvent");
        MessageHeader messageHeader = messageEvent.getMessageHeader();
        return new AlexaEvent(AlexaHeader.builder().setNamespace(messageHeader.getNamespace()).setName(messageHeader.getName()).setCorrelationToken(messageHeader.getCorrelationToken()).setMessageId(messageHeader.getMessageId()).setPayloadVersion(messageHeader.getPayloadVersion()).build(), new AlexaPayload(messageEvent.getMessagePayload().getPayload()));
    }
}
