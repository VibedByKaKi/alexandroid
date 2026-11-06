package com.amazon.comms.models.sip.payloads;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.models.sip.CallMediaState;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetCallMediaStateSIPPayload implements SIPPayload {
    private String callId;
    private CallMediaState callMediaState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SetCallMediaStateSIPPayloadBuilder {
        private String callId;
        private CallMediaState callMediaState;

        public SetCallMediaStateSIPPayload build() {
            return new SetCallMediaStateSIPPayload(this.callId, this.callMediaState, 0);
        }

        public SetCallMediaStateSIPPayloadBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public SetCallMediaStateSIPPayloadBuilder callMediaState(CallMediaState callMediaState) {
            this.callMediaState = callMediaState;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("SetCallMediaStateSIPPayload.SetCallMediaStateSIPPayloadBuilder(callId=", this.callId, ", callMediaState=", String.valueOf(this.callMediaState), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private SetCallMediaStateSIPPayload(String str, CallMediaState callMediaState) {
        this.callId = str;
        this.callMediaState = callMediaState;
    }

    public static SetCallMediaStateSIPPayloadBuilder builder() {
        return new SetCallMediaStateSIPPayloadBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SetCallMediaStateSIPPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCallMediaStateSIPPayload)) {
            return false;
        }
        SetCallMediaStateSIPPayload setCallMediaStateSIPPayload = (SetCallMediaStateSIPPayload) obj;
        if (!setCallMediaStateSIPPayload.canEqual(this)) {
            return false;
        }
        String callId = getCallId();
        String callId2 = setCallMediaStateSIPPayload.getCallId();
        if (callId != null ? !callId.equals(callId2) : callId2 != null) {
            return false;
        }
        CallMediaState callMediaState = getCallMediaState();
        CallMediaState callMediaState2 = setCallMediaStateSIPPayload.getCallMediaState();
        return callMediaState != null ? callMediaState.equals(callMediaState2) : callMediaState2 == null;
    }

    @Override // com.amazon.comms.models.sip.payloads.SIPPayload
    public String getCallId() {
        return this.callId;
    }

    public CallMediaState getCallMediaState() {
        return this.callMediaState;
    }

    public int hashCode() {
        String callId = getCallId();
        int hashCode = callId == null ? 43 : callId.hashCode();
        CallMediaState callMediaState = getCallMediaState();
        return ((hashCode + 59) * 59) + (callMediaState != null ? callMediaState.hashCode() : 43);
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setCallMediaState(CallMediaState callMediaState) {
        this.callMediaState = callMediaState;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("SetCallMediaStateSIPPayload(callId=", getCallId(), ", callMediaState=", String.valueOf(getCallMediaState()), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public SetCallMediaStateSIPPayload() {
    }

    public /* synthetic */ SetCallMediaStateSIPPayload(String str, CallMediaState callMediaState, int i) {
        this(str, callMediaState);
    }
}
