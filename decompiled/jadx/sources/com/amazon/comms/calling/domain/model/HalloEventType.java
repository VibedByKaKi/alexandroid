package com.amazon.comms.calling.domain.model;

import com.amazon.comms.calling.data.util.CallTypeEventConstants;
import com.amazon.comms.calling.data.util.HalloConstants;
import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/amazon/comms/calling/domain/model/HalloEventType;", "", "eventName", "", "callState", "Lcom/amazon/comms/calling/domain/model/CallState;", "action", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/amazon/comms/calling/domain/model/CallState;Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "getCallState", "()Lcom/amazon/comms/calling/domain/model/CallState;", "getAction", "OUTBOUND_CALL_REQUEST", "OUTBOUND_CALL_RINGING", "OUTBOUND_CALL_REQUESTED", "INBOUND_CALL_RECEIVED", "INBOUND_CALL_RINGING", "OUTBOUND_CALL_ACCEPTED", "INBOUND_CALL_ACCEPTED", "LOCAL_HANG_UP", "REMOTE_HANG_UP", "REMOTE_HANG_UP_ON_RING", "CALL_DISCONNECTED", "TERMINATE_CALL_FOR_ALL", "CALL_LOCAL_HOLD", "CALL_REMOTE_HOLD", "CALL_RESUMED", Constants.Calling.DIALOG_CALL_ERROR_KEY, "CALL_MEDIA_ERROR", "CALL_CANCEL", "SIP_INFO_RESPONSE", "SEND_DTMF_SUCCEEDED", "SEND_DTMF_FAILED", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class HalloEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HalloEventType[] $VALUES;
    public static final HalloEventType CALL_CANCEL;
    public static final HalloEventType CALL_DISCONNECTED;
    public static final HalloEventType CALL_ERROR;
    public static final HalloEventType CALL_LOCAL_HOLD;
    public static final HalloEventType CALL_MEDIA_ERROR;
    public static final HalloEventType CALL_REMOTE_HOLD;
    public static final HalloEventType CALL_RESUMED;
    public static final HalloEventType INBOUND_CALL_ACCEPTED;
    public static final HalloEventType INBOUND_CALL_RECEIVED;
    public static final HalloEventType INBOUND_CALL_RINGING;
    public static final HalloEventType LOCAL_HANG_UP;
    public static final HalloEventType OUTBOUND_CALL_ACCEPTED;
    public static final HalloEventType OUTBOUND_CALL_REQUEST;
    public static final HalloEventType OUTBOUND_CALL_REQUESTED;
    public static final HalloEventType OUTBOUND_CALL_RINGING;
    public static final HalloEventType REMOTE_HANG_UP;
    public static final HalloEventType REMOTE_HANG_UP_ON_RING;
    public static final HalloEventType SEND_DTMF_FAILED;
    public static final HalloEventType SEND_DTMF_SUCCEEDED;
    public static final HalloEventType SIP_INFO_RESPONSE;
    public static final HalloEventType TERMINATE_CALL_FOR_ALL;

    @NotNull
    private final String action;

    @NotNull
    private final CallState callState;

    @NotNull
    private final String eventName;

    private static final /* synthetic */ HalloEventType[] $values() {
        return new HalloEventType[]{OUTBOUND_CALL_REQUEST, OUTBOUND_CALL_RINGING, OUTBOUND_CALL_REQUESTED, INBOUND_CALL_RECEIVED, INBOUND_CALL_RINGING, OUTBOUND_CALL_ACCEPTED, INBOUND_CALL_ACCEPTED, LOCAL_HANG_UP, REMOTE_HANG_UP, REMOTE_HANG_UP_ON_RING, CALL_DISCONNECTED, TERMINATE_CALL_FOR_ALL, CALL_LOCAL_HOLD, CALL_REMOTE_HOLD, CALL_RESUMED, CALL_ERROR, CALL_MEDIA_ERROR, CALL_CANCEL, SIP_INFO_RESPONSE, SEND_DTMF_SUCCEEDED, SEND_DTMF_FAILED};
    }

    static {
        CallState callState = CallState.OUTBOUND_RINGING;
        OUTBOUND_CALL_REQUEST = new HalloEventType("OUTBOUND_CALL_REQUEST", 0, "OutboundCallRequest", callState, CallTypeEventConstants.CALL_TYPE_EVENT_ACTION);
        OUTBOUND_CALL_RINGING = new HalloEventType("OUTBOUND_CALL_RINGING", 1, "OutboundCallRinging", callState, null, 4, null);
        OUTBOUND_CALL_REQUESTED = new HalloEventType("OUTBOUND_CALL_REQUESTED", 2, "OutboundCallRequested", CallState.CALLING, null, 4, null);
        INBOUND_CALL_RECEIVED = new HalloEventType("INBOUND_CALL_RECEIVED", 3, "InboundCallReceived", CallState.INBOUND_RECEIVED, null, 4, null);
        INBOUND_CALL_RINGING = new HalloEventType("INBOUND_CALL_RINGING", 4, "InboundCallRinging", CallState.INBOUND_RINGING, null, 4, null);
        CallState callState2 = CallState.ACTIVE;
        OUTBOUND_CALL_ACCEPTED = new HalloEventType("OUTBOUND_CALL_ACCEPTED", 5, "OutboundCallAccepted", callState2, null, 4, null);
        INBOUND_CALL_ACCEPTED = new HalloEventType("INBOUND_CALL_ACCEPTED", 6, "InboundCallAccepted", callState2, null, 4, null);
        CallState callState3 = CallState.INACTIVE;
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        LOCAL_HANG_UP = new HalloEventType("LOCAL_HANG_UP", 7, "LocalHangUp", callState3, str, i, defaultConstructorMarker);
        int i2 = 4;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str2 = null;
        REMOTE_HANG_UP = new HalloEventType("REMOTE_HANG_UP", 8, "RemoteHangUp", callState3, str2, i2, defaultConstructorMarker2);
        REMOTE_HANG_UP_ON_RING = new HalloEventType("REMOTE_HANG_UP_ON_RING", 9, "RemoteHangUpOnRing", callState3, str2, i2, defaultConstructorMarker2);
        CALL_DISCONNECTED = new HalloEventType("CALL_DISCONNECTED", 10, "CallDisconnected", callState3, str2, i2, defaultConstructorMarker2);
        TERMINATE_CALL_FOR_ALL = new HalloEventType("TERMINATE_CALL_FOR_ALL", 11, "TerminateCallForAll", callState3, str2, i2, defaultConstructorMarker2);
        CALL_LOCAL_HOLD = new HalloEventType("CALL_LOCAL_HOLD", 12, "CallLocalHold", CallState.LOCAL_HOLD, str, i, defaultConstructorMarker);
        CALL_REMOTE_HOLD = new HalloEventType("CALL_REMOTE_HOLD", 13, "CallRemoteHold", CallState.REMOTE_HOLD, null, 4, null);
        int i3 = 4;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        String str3 = null;
        CALL_RESUMED = new HalloEventType("CALL_RESUMED", 14, "CallResumed", callState2, str3, i3, defaultConstructorMarker3);
        int i4 = 4;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        CALL_ERROR = new HalloEventType(Constants.Calling.DIALOG_CALL_ERROR_KEY, 15, "CallError", callState3, str2, i4, defaultConstructorMarker4);
        CALL_MEDIA_ERROR = new HalloEventType("CALL_MEDIA_ERROR", 16, "CallMediaError", callState3, str2, i4, defaultConstructorMarker4);
        CALL_CANCEL = new HalloEventType("CALL_CANCEL", 17, "CallCancel", callState3, str2, i4, defaultConstructorMarker4);
        SIP_INFO_RESPONSE = new HalloEventType("SIP_INFO_RESPONSE", 18, "SipInfoResponse", callState2, str3, i3, defaultConstructorMarker3);
        SEND_DTMF_SUCCEEDED = new HalloEventType("SEND_DTMF_SUCCEEDED", 19, "SendDTMFSucceeded", callState2, str3, i3, defaultConstructorMarker3);
        SEND_DTMF_FAILED = new HalloEventType("SEND_DTMF_FAILED", 20, "SendDTMFFailed", callState2, str3, i3, defaultConstructorMarker3);
        HalloEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public /* synthetic */ HalloEventType(String str, int i, String str2, CallState callState, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, callState, (i2 & 4) != 0 ? HalloConstants.HALLO_EVENT_ACTION : str3);
    }

    @NotNull
    public static EnumEntries<HalloEventType> getEntries() {
        return $ENTRIES;
    }

    public static HalloEventType valueOf(String str) {
        return (HalloEventType) Enum.valueOf(HalloEventType.class, str);
    }

    public static HalloEventType[] values() {
        return (HalloEventType[]) $VALUES.clone();
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final CallState getCallState() {
        return this.callState;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    private HalloEventType(String str, int i, String str2, CallState callState, String str3) {
        this.eventName = str2;
        this.callState = callState;
        this.action = str3;
    }
}
