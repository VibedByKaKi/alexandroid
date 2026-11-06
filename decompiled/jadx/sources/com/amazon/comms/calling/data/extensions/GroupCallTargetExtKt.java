package com.amazon.comms.calling.data.extensions;

import com.amazon.comms.calling.data.dao.InitiateOutboundCallRequest;
import com.amazon.comms.calling.data.dao.InitiateOutboundCallRequestBuilder;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.calling.api.GroupCallTarget;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"buildRequest", "Lcom/amazon/comms/calling/data/dao/InitiateOutboundCallRequest;", "Lcom/amazon/deecomms/calling/api/GroupCallTarget;", "logger", "Lcom/amazon/comms/log/CommsLogger;", "inferGroupType", "", "isDropIn", "", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class GroupCallTargetExtKt {
    @NotNull
    public static final InitiateOutboundCallRequest buildRequest(@NotNull GroupCallTarget groupCallTarget, @NotNull CommsLogger commsLogger) {
        groupCallTarget.getClass();
        commsLogger.getClass();
        if (groupCallTarget.isDropIn()) {
            commsLogger.i("Initiating a group drop-in (Chapman call)");
        } else {
            commsLogger.i("Initiating an group call");
        }
        InitiateOutboundCallRequestBuilder initiateOutboundCallRequestBuilder = new InitiateOutboundCallRequestBuilder(MediaStreamsExtKt.getMediaStreams(true));
        String inferGroupType = inferGroupType(groupCallTarget.isDropIn());
        String id = groupCallTarget.getId();
        id.getClass();
        return initiateOutboundCallRequestBuilder.withGroupTarget(inferGroupType, id, groupCallTarget.isDropIn()).build();
    }

    @NotNull
    public static final String inferGroupType(boolean z) {
        if (z) {
            return "HOMEGROUP";
        }
        if (!z) {
            return "GROUP_CONTACT";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
