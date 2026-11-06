package com.amazon.comms.calling.data.extensions;

import com.amazon.comms.calling.data.dao.InitiateOutboundCallRequest;
import com.amazon.comms.calling.data.dao.InitiateOutboundCallRequestBuilder;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.calling.api.ContactCallTarget;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"buildRequest", "Lcom/amazon/comms/calling/data/dao/InitiateOutboundCallRequest;", "Lcom/amazon/deecomms/calling/api/ContactCallTarget;", "isVideo", "", "logger", "Lcom/amazon/comms/log/CommsLogger;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ContactCallTargetExtKt {
    @NotNull
    public static final InitiateOutboundCallRequest buildRequest(@NotNull ContactCallTarget contactCallTarget, boolean z, @NotNull CommsLogger commsLogger) {
        contactCallTarget.getClass();
        commsLogger.getClass();
        if (contactCallTarget.isDropIn()) {
            commsLogger.i("Initiating a contact drop-in");
        } else if (z) {
            commsLogger.i("Initiating a video call");
        } else {
            commsLogger.i("Initiating an audio call");
        }
        InitiateOutboundCallRequestBuilder initiateOutboundCallRequestBuilder = new InitiateOutboundCallRequestBuilder(MediaStreamsExtKt.getMediaStreams(z));
        String id = contactCallTarget.getId();
        id.getClass();
        return initiateOutboundCallRequestBuilder.withContactTarget(id, contactCallTarget.isDropIn()).build();
    }
}
