package com.amazon.comms.models.sip.payloads;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonInclude;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes20.dex */
public class WarmupSIPPayload implements SIPPayload {
    private String callId;
    private int maxDurationMs;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class WarmupSIPPayloadBuilder {
        private String callId;
        private int maxDurationMs;

        public WarmupSIPPayload build() {
            return new WarmupSIPPayload(this.callId, this.maxDurationMs, 0);
        }

        public WarmupSIPPayloadBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public WarmupSIPPayloadBuilder maxDurationMs(int i) {
            this.maxDurationMs = i;
            return this;
        }

        public String toString() {
            return DoubleList$$ExternalSyntheticOutline0.m("WarmupSIPPayload.WarmupSIPPayloadBuilder(callId=", this.callId, ", maxDurationMs=", this.maxDurationMs, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private WarmupSIPPayload(String str, int i) {
        this.callId = str;
        this.maxDurationMs = i;
    }

    public static WarmupSIPPayloadBuilder builder() {
        return new WarmupSIPPayloadBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WarmupSIPPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WarmupSIPPayload)) {
            return false;
        }
        WarmupSIPPayload warmupSIPPayload = (WarmupSIPPayload) obj;
        if (!warmupSIPPayload.canEqual(this) || getMaxDurationMs() != warmupSIPPayload.getMaxDurationMs()) {
            return false;
        }
        String callId = getCallId();
        String callId2 = warmupSIPPayload.getCallId();
        return callId != null ? callId.equals(callId2) : callId2 == null;
    }

    @Override // com.amazon.comms.models.sip.payloads.SIPPayload
    public String getCallId() {
        return this.callId;
    }

    public int getMaxDurationMs() {
        return this.maxDurationMs;
    }

    public int hashCode() {
        int maxDurationMs = getMaxDurationMs() + 59;
        String callId = getCallId();
        return (maxDurationMs * 59) + (callId == null ? 43 : callId.hashCode());
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setMaxDurationMs(int i) {
        this.maxDurationMs = i;
    }

    public String toString() {
        return DoubleList$$ExternalSyntheticOutline0.m("WarmupSIPPayload(callId=", getCallId(), ", maxDurationMs=", getMaxDurationMs(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public WarmupSIPPayload() {
    }

    public /* synthetic */ WarmupSIPPayload(String str, int i, int i2) {
        this(str, i);
    }
}
