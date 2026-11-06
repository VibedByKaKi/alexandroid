package com.amazon.comms.calling.data.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/data/util/HalloConstants;", "", "<init>", "()V", "IN_CALL_EVENT", "", "DEVICE_CONTEXT_SIP_STATE_NAME", "CALLER_SIDE", "CALLEE_SIDE", "CLIENT_IDENTIFIER", "CALL_STATE", "STATUS_CODE", "HALLO_EVENT_ACTION", com.amazon.deecomms.common.Constants.CALL_ID, "HALLO_EVENT", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class HalloConstants {

    @NotNull
    public static final String CALLEE_SIDE = "callee";

    @NotNull
    public static final String CALLER_SIDE = "caller";

    @NotNull
    public static final String CALL_ID = "callId";

    @NotNull
    public static final String CALL_STATE = "callState";

    @NotNull
    public static final String CLIENT_IDENTIFIER = "Domain:Application:Communications:Calling";

    @NotNull
    public static final String DEVICE_CONTEXT_SIP_STATE_NAME = "SipClientState";

    @NotNull
    public static final String HALLO_EVENT = "halloEvent";

    @NotNull
    public static final String HALLO_EVENT_ACTION = "com.amazon.deecomms.alexa.CALLING_HALLO_EVENT_ACTION";

    @NotNull
    public static final HalloConstants INSTANCE = new HalloConstants();

    @NotNull
    public static final String IN_CALL_EVENT = "inCallEvent";

    @NotNull
    public static final String STATUS_CODE = "statusCode";

    private HalloConstants() {
    }
}
