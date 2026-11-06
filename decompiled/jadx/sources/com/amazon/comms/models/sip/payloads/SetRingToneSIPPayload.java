package com.amazon.comms.models.sip.payloads;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonInclude;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes20.dex */
public class SetRingToneSIPPayload implements SIPPayload {
    private String callId;
    private String ringToneUrl;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SetRingToneSIPPayloadBuilder {
        private String callId;
        private String ringToneUrl;

        public SetRingToneSIPPayload build() {
            return new SetRingToneSIPPayload(this.callId, this.ringToneUrl, 0);
        }

        public SetRingToneSIPPayloadBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public SetRingToneSIPPayloadBuilder ringToneUrl(String str) {
            this.ringToneUrl = str;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("SetRingToneSIPPayload.SetRingToneSIPPayloadBuilder(callId=", this.callId, ", ringToneUrl=", this.ringToneUrl, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private SetRingToneSIPPayload(String str, String str2) {
        this.callId = str;
        this.ringToneUrl = str2;
    }

    public static SetRingToneSIPPayloadBuilder builder() {
        return new SetRingToneSIPPayloadBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SetRingToneSIPPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetRingToneSIPPayload)) {
            return false;
        }
        SetRingToneSIPPayload setRingToneSIPPayload = (SetRingToneSIPPayload) obj;
        if (!setRingToneSIPPayload.canEqual(this)) {
            return false;
        }
        String callId = getCallId();
        String callId2 = setRingToneSIPPayload.getCallId();
        if (callId != null ? !callId.equals(callId2) : callId2 != null) {
            return false;
        }
        String ringToneUrl = getRingToneUrl();
        String ringToneUrl2 = setRingToneSIPPayload.getRingToneUrl();
        return ringToneUrl != null ? ringToneUrl.equals(ringToneUrl2) : ringToneUrl2 == null;
    }

    @Override // com.amazon.comms.models.sip.payloads.SIPPayload
    public String getCallId() {
        return this.callId;
    }

    public String getRingToneUrl() {
        return this.ringToneUrl;
    }

    public int hashCode() {
        String callId = getCallId();
        int hashCode = callId == null ? 43 : callId.hashCode();
        String ringToneUrl = getRingToneUrl();
        return ((hashCode + 59) * 59) + (ringToneUrl != null ? ringToneUrl.hashCode() : 43);
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setRingToneUrl(String str) {
        this.ringToneUrl = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("SetRingToneSIPPayload(callId=", getCallId(), ", ringToneUrl=", getRingToneUrl(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public SetRingToneSIPPayload() {
    }

    public /* synthetic */ SetRingToneSIPPayload(String str, String str2, int i) {
        this(str, str2);
    }
}
