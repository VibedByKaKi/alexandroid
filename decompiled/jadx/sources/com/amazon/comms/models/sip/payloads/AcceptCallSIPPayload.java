package com.amazon.comms.models.sip.payloads;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.models.sip.UtteranceInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes20.dex */
public class AcceptCallSIPPayload implements SIPPayload {
    private String callId;
    private UtteranceInfo utteranceInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AcceptCallSIPPayloadBuilder {
        private String callId;
        private UtteranceInfo utteranceInfo;

        public AcceptCallSIPPayload build() {
            return new AcceptCallSIPPayload(this.callId, this.utteranceInfo, 0);
        }

        public AcceptCallSIPPayloadBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("AcceptCallSIPPayload.AcceptCallSIPPayloadBuilder(callId=", this.callId, ", utteranceInfo=", String.valueOf(this.utteranceInfo), MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public AcceptCallSIPPayloadBuilder utteranceInfo(UtteranceInfo utteranceInfo) {
            this.utteranceInfo = utteranceInfo;
            return this;
        }
    }

    private AcceptCallSIPPayload(String str, UtteranceInfo utteranceInfo) {
        this.callId = str;
        this.utteranceInfo = utteranceInfo;
    }

    public static AcceptCallSIPPayloadBuilder builder() {
        return new AcceptCallSIPPayloadBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AcceptCallSIPPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AcceptCallSIPPayload)) {
            return false;
        }
        AcceptCallSIPPayload acceptCallSIPPayload = (AcceptCallSIPPayload) obj;
        if (!acceptCallSIPPayload.canEqual(this)) {
            return false;
        }
        String callId = getCallId();
        String callId2 = acceptCallSIPPayload.getCallId();
        if (callId != null ? !callId.equals(callId2) : callId2 != null) {
            return false;
        }
        UtteranceInfo utteranceInfo = getUtteranceInfo();
        UtteranceInfo utteranceInfo2 = acceptCallSIPPayload.getUtteranceInfo();
        return utteranceInfo != null ? utteranceInfo.equals(utteranceInfo2) : utteranceInfo2 == null;
    }

    @Override // com.amazon.comms.models.sip.payloads.SIPPayload
    public String getCallId() {
        return this.callId;
    }

    public UtteranceInfo getUtteranceInfo() {
        return this.utteranceInfo;
    }

    public int hashCode() {
        String callId = getCallId();
        int hashCode = callId == null ? 43 : callId.hashCode();
        UtteranceInfo utteranceInfo = getUtteranceInfo();
        return ((hashCode + 59) * 59) + (utteranceInfo != null ? utteranceInfo.hashCode() : 43);
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setUtteranceInfo(UtteranceInfo utteranceInfo) {
        this.utteranceInfo = utteranceInfo;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("AcceptCallSIPPayload(callId=", getCallId(), ", utteranceInfo=", String.valueOf(getUtteranceInfo()), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public AcceptCallSIPPayload() {
    }

    public /* synthetic */ AcceptCallSIPPayload(String str, UtteranceInfo utteranceInfo, int i) {
        this(str, utteranceInfo);
    }
}
