package com.amazon.deecomms.alexa;

import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.util.CallUtils;
import com.amazon.deecomms.common.sip.SipClientState;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CallTypeEventModel {
    private final List<String> callFlags;
    private final String callId;
    private final String callType;
    private final SipClientState sipClientState;

    public CallTypeEventModel(@NonNull String str, @NonNull List<String> list, @NonNull String str2, @NonNull SipClientState sipClientState) {
        this.callType = str;
        this.callFlags = list;
        this.callId = str2;
        this.sipClientState = sipClientState;
    }

    private String toSipDeviceStateSerialized(@NonNull SipClientState sipClientState) {
        try {
            return new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(CallUtils.getSipDeviceState(sipClientState, this.callId));
        } catch (JsonProcessingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    @NonNull
    public List<String> getCallFlags() {
        return this.callFlags;
    }

    @NonNull
    public String getCallId() {
        return this.callId;
    }

    @NonNull
    public String getCallType() {
        return this.callType;
    }

    @NonNull
    public SipClientState getSipClientState() {
        return this.sipClientState;
    }

    @NonNull
    public String getSipDeviceStateSerialized() {
        return toSipDeviceStateSerialized(this.sipClientState);
    }
}
