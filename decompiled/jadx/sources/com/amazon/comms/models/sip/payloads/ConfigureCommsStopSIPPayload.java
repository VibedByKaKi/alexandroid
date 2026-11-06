package com.amazon.comms.models.sip.payloads;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonInclude;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes20.dex */
public class ConfigureCommsStopSIPPayload implements SIPPayload {
    private String callId;
    private String reason;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ConfigureCommsStopSIPPayloadBuilder {
        private String callId;
        private String reason;

        public ConfigureCommsStopSIPPayload build() {
            return new ConfigureCommsStopSIPPayload(this.callId, this.reason, 0);
        }

        public ConfigureCommsStopSIPPayloadBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public ConfigureCommsStopSIPPayloadBuilder reason(String str) {
            this.reason = str;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ConfigureCommsStopSIPPayload.ConfigureCommsStopSIPPayloadBuilder(callId=", this.callId, ", reason=", this.reason, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private ConfigureCommsStopSIPPayload(String str, String str2) {
        this.callId = str;
        this.reason = str2;
    }

    public static ConfigureCommsStopSIPPayloadBuilder builder() {
        return new ConfigureCommsStopSIPPayloadBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ConfigureCommsStopSIPPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfigureCommsStopSIPPayload)) {
            return false;
        }
        ConfigureCommsStopSIPPayload configureCommsStopSIPPayload = (ConfigureCommsStopSIPPayload) obj;
        if (!configureCommsStopSIPPayload.canEqual(this)) {
            return false;
        }
        String callId = getCallId();
        String callId2 = configureCommsStopSIPPayload.getCallId();
        if (callId != null ? !callId.equals(callId2) : callId2 != null) {
            return false;
        }
        String reason = getReason();
        String reason2 = configureCommsStopSIPPayload.getReason();
        return reason != null ? reason.equals(reason2) : reason2 == null;
    }

    @Override // com.amazon.comms.models.sip.payloads.SIPPayload
    public String getCallId() {
        return this.callId;
    }

    public String getReason() {
        return this.reason;
    }

    public int hashCode() {
        String callId = getCallId();
        int hashCode = callId == null ? 43 : callId.hashCode();
        String reason = getReason();
        return ((hashCode + 59) * 59) + (reason != null ? reason.hashCode() : 43);
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ConfigureCommsStopSIPPayload(callId=", getCallId(), ", reason=", getReason(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public ConfigureCommsStopSIPPayload() {
    }

    public /* synthetic */ ConfigureCommsStopSIPPayload(String str, String str2, int i) {
        this(str, str2);
    }
}
