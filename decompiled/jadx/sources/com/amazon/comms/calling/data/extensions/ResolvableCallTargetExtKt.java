package com.amazon.comms.calling.data.extensions;

import com.amazon.comms.calling.data.dao.InitiateOutboundCallRequest;
import com.amazon.comms.calling.data.dao.InitiateOutboundCallRequestBuilder;
import com.amazon.deecomms.calling.api.ResolvableTarget;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"buildRequest", "Lcom/amazon/comms/calling/data/dao/InitiateOutboundCallRequest;", "Lcom/amazon/deecomms/calling/api/ResolvableTarget;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ResolvableCallTargetExtKt {
    @NotNull
    public static final InitiateOutboundCallRequest buildRequest(@NotNull ResolvableTarget resolvableTarget) {
        resolvableTarget.getClass();
        InitiateOutboundCallRequestBuilder initiateOutboundCallRequestBuilder = new InitiateOutboundCallRequestBuilder(MediaStreamsExtKt.getMediaStreams(false));
        String usecase = resolvableTarget.getUsecase();
        usecase.getClass();
        return initiateOutboundCallRequestBuilder.withResolvableTarget(usecase).build();
    }
}
