package com.amazon.comms.calling.data.util;

import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/data/util/InCallEventsConstants;", "", "<init>", "()V", "COMMS_ALEXA_SERVICE_CONNECTION", "", com.amazon.deecomms.common.Constants.CALL_ID, "CALL_EXPERIENCE_TYPE", "CALL_FLAGS", "CALL_STATE", "COMMS_ID", "DEVICE_CONTEXT_SIP_STATE_NAME", "DEVICE_SENT_ABSOLUTE_TIMESTAMP", "DEVICE_SENT_RELATIVE_TIMESTAMP", SimbaEventProcessor.SOURCE_EMPTY, "IDENTITY_TYPE", "IDENTITY_TYPE_INDIVIDUAL", "IN_CALL_EVENT", "OUTBOUND_CALL_REQUEST", "REQUEST_ID", "REQUESTER_IDENTITY", "SIP_CALL_STATE", "STATUS_CODE", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class InCallEventsConstants {

    @NotNull
    public static final String CALL_EXPERIENCE_TYPE = "callExperienceType";

    @NotNull
    public static final String CALL_FLAGS = "callFlags";

    @NotNull
    public static final String CALL_ID = "callId";

    @NotNull
    public static final String CALL_STATE = "callState";

    @NotNull
    public static final String COMMS_ALEXA_SERVICE_CONNECTION = "commsAlexaServiceConnection";

    @NotNull
    public static final String COMMS_ID = "commsID";

    @NotNull
    public static final String DEVICE_CONTEXT_SIP_STATE_NAME = "SipClientState";

    @NotNull
    public static final String DEVICE_SENT_ABSOLUTE_TIMESTAMP = "deviceSentAbsoluteTimestamp";

    @NotNull
    public static final String DEVICE_SENT_RELATIVE_TIMESTAMP = "deviceSentRelativeTimestamp";

    @NotNull
    public static final String EMPTY = "";

    @NotNull
    public static final String IDENTITY_TYPE = "identityType";

    @NotNull
    public static final String IDENTITY_TYPE_INDIVIDUAL = "Individual";

    @NotNull
    public static final InCallEventsConstants INSTANCE = new InCallEventsConstants();

    @NotNull
    public static final String IN_CALL_EVENT = "inCallEvent";

    @NotNull
    public static final String OUTBOUND_CALL_REQUEST = "OutboundCallRequest";

    @NotNull
    public static final String REQUESTER_IDENTITY = "requesterIdentity";

    @NotNull
    public static final String REQUEST_ID = "requestId";

    @NotNull
    public static final String SIP_CALL_STATE = "sipCallState";

    @NotNull
    public static final String STATUS_CODE = "statusCode";

    private InCallEventsConstants() {
    }
}
