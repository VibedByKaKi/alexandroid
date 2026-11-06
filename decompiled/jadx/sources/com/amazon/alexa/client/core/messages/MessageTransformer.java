package com.amazon.alexa.client.core.messages;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaDirective;
import com.amazon.alexa.api.AlexaEvent;
import com.amazon.alexa.api.AlexaHeader;
import com.amazon.alexa.api.AlexaPayload;
import com.amazon.alexa.client.core.messages.Header;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MessageTransformer {

    @VisibleForTesting
    static final String EVENT_CORRELATION_TOKEN = "eventCorrelationToken";

    @VisibleForTesting
    static final String INSTANCE = "instance";

    @VisibleForTesting
    static final String PRESENTATION_URI = "presentationUri";

    @VisibleForTesting
    static final String UNIVERSAL_PRIVACY_CODE = "upc";

    @Inject
    public MessageTransformer() {
    }

    public Message convertAlexaEventToMessage(AlexaEvent alexaEvent) {
        AlexaHeader alexaHeader = alexaEvent.getAlexaHeader();
        RawStringPayload create = alexaEvent.getAlexaPayload() != null ? RawStringPayload.create(alexaEvent.getAlexaPayload().getPayload()) : null;
        Header.Builder name = Header.builder().setMessageIdentifier(MessageIdentifier.create(alexaHeader.getMessageId())).setNamespace(Namespace.create(alexaHeader.getNamespace())).setName(Name.create(alexaHeader.getName()));
        if (alexaHeader.getCorrelationToken() != null) {
            name.setCorrelationToken(CorrelationToken.create(alexaHeader.getCorrelationToken()));
        }
        if (alexaHeader.getPayloadVersion() != null) {
            name.setPayloadVersion(PayloadVersion.create(alexaHeader.getPayloadVersion()));
        }
        if (alexaHeader.getDialogRequestId() != null) {
            name.setDialogRequestIdentifier(DialogRequestIdentifier.create(alexaHeader.getDialogRequestId()));
        }
        HashMap hashMap = new HashMap();
        if (alexaHeader.getPresentationUri() != null) {
            hashMap.put("presentationUri", new JsonPrimitive(alexaHeader.getPresentationUri()));
        }
        if (alexaHeader.getUniversalPrivacyCode() != null) {
            hashMap.put("upc", new JsonPrimitive(alexaHeader.getUniversalPrivacyCode()));
        }
        if (alexaHeader.getEventCorrelationToken() != null) {
            hashMap.put("eventCorrelationToken", new JsonPrimitive(alexaHeader.getEventCorrelationToken()));
        }
        if (alexaHeader.getInstance() != null) {
            hashMap.put("instance", new JsonPrimitive(alexaHeader.getInstance()));
        }
        if (!hashMap.isEmpty()) {
            name.setAdditionalFields(hashMap);
        }
        return Message.create(name.build(), create);
    }

    public AlexaDirective convertMessageToAlexaDirective(Message message) {
        Header header = message.getHeader();
        AlexaHeader.Builder messageId = AlexaHeader.builder().setName(header.getName().getValue()).setNamespace(header.getNamespace().getValue()).setMessageId(header.getMessageIdentifier().getValue());
        if (message.getHeader().getCorrelationToken() != null) {
            messageId.setCorrelationToken(message.getHeader().getCorrelationToken().getValue());
        }
        if (message.getHeader().getPayloadVersion() != null) {
            messageId.setPayloadVersion(message.getHeader().getPayloadVersion().getValue());
        }
        if (message.getHeader().hasDialogRequestIdentifier()) {
            messageId.setDialogRequestId(message.getHeader().getDialogRequestIdentifier().getValue());
        }
        Map<String, JsonElement> additionalFields = message.getHeader().getAdditionalFields();
        if (additionalFields != null) {
            if (additionalFields.containsKey("presentationUri")) {
                messageId.setPresentationUri(additionalFields.get("presentationUri").getAsString());
            }
            if (additionalFields.containsKey("upc")) {
                messageId.setUniversalPrivacyCode(additionalFields.get("upc").getAsString());
            }
            if (additionalFields.containsKey("eventCorrelationToken")) {
                messageId.setEventCorrelationToken(additionalFields.get("eventCorrelationToken").getAsString());
            }
            if (additionalFields.containsKey("instance")) {
                messageId.setInstance(additionalFields.get("instance").getAsString());
            }
        }
        if (message.getEndpoint() != null) {
            messageId.setEndpointId(message.getEndpoint().getEndpointId());
        }
        return new AlexaDirective(messageId.build(), new AlexaPayload(message.getPayload() instanceof RawStringPayload ? ((RawStringPayload) message.getPayload()).getValue() : new JSONObject().toString()));
    }
}
