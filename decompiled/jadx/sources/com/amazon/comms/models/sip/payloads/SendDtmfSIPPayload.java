package com.amazon.comms.models.sip.payloads;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.models.sip.UtteranceInfo;
import com.fasterxml.jackson.annotation.JsonInclude;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes20.dex */
public class SendDtmfSIPPayload implements SIPPayload {
    private String callId;
    private Integer durationInMillis;
    private String signal;
    private UtteranceInfo utteranceInfo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SendDtmfSIPPayloadBuilder {
        private String callId;
        private Integer durationInMillis;
        private String signal;
        private UtteranceInfo utteranceInfo;

        public SendDtmfSIPPayload build() {
            return new SendDtmfSIPPayload(this.callId, this.signal, this.durationInMillis, this.utteranceInfo, 0);
        }

        public SendDtmfSIPPayloadBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public SendDtmfSIPPayloadBuilder durationInMillis(Integer num) {
            this.durationInMillis = num;
            return this;
        }

        public SendDtmfSIPPayloadBuilder signal(String str) {
            this.signal = str;
            return this;
        }

        public String toString() {
            String str = this.callId;
            String str2 = this.signal;
            Integer num = this.durationInMillis;
            String valueOf = String.valueOf(this.utteranceInfo);
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SendDtmfSIPPayload.SendDtmfSIPPayloadBuilder(callId=", str, ", signal=", str2, ", durationInMillis=");
            m.append(num);
            m.append(", utteranceInfo=");
            m.append(valueOf);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }

        public SendDtmfSIPPayloadBuilder utteranceInfo(UtteranceInfo utteranceInfo) {
            this.utteranceInfo = utteranceInfo;
            return this;
        }
    }

    private SendDtmfSIPPayload(String str, String str2, Integer num, UtteranceInfo utteranceInfo) {
        this.callId = str;
        this.signal = str2;
        this.durationInMillis = num;
        this.utteranceInfo = utteranceInfo;
    }

    public static SendDtmfSIPPayloadBuilder builder() {
        return new SendDtmfSIPPayloadBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SendDtmfSIPPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendDtmfSIPPayload)) {
            return false;
        }
        SendDtmfSIPPayload sendDtmfSIPPayload = (SendDtmfSIPPayload) obj;
        if (!sendDtmfSIPPayload.canEqual(this)) {
            return false;
        }
        Integer durationInMillis = getDurationInMillis();
        Integer durationInMillis2 = sendDtmfSIPPayload.getDurationInMillis();
        if (durationInMillis != null ? !durationInMillis.equals(durationInMillis2) : durationInMillis2 != null) {
            return false;
        }
        String callId = getCallId();
        String callId2 = sendDtmfSIPPayload.getCallId();
        if (callId != null ? !callId.equals(callId2) : callId2 != null) {
            return false;
        }
        String signal = getSignal();
        String signal2 = sendDtmfSIPPayload.getSignal();
        if (signal != null ? !signal.equals(signal2) : signal2 != null) {
            return false;
        }
        UtteranceInfo utteranceInfo = getUtteranceInfo();
        UtteranceInfo utteranceInfo2 = sendDtmfSIPPayload.getUtteranceInfo();
        return utteranceInfo != null ? utteranceInfo.equals(utteranceInfo2) : utteranceInfo2 == null;
    }

    @Override // com.amazon.comms.models.sip.payloads.SIPPayload
    public String getCallId() {
        return this.callId;
    }

    public Integer getDurationInMillis() {
        return this.durationInMillis;
    }

    public String getSignal() {
        return this.signal;
    }

    public UtteranceInfo getUtteranceInfo() {
        return this.utteranceInfo;
    }

    public int hashCode() {
        Integer durationInMillis = getDurationInMillis();
        int hashCode = durationInMillis == null ? 43 : durationInMillis.hashCode();
        String callId = getCallId();
        int hashCode2 = ((hashCode + 59) * 59) + (callId == null ? 43 : callId.hashCode());
        String signal = getSignal();
        int i = hashCode2 * 59;
        int hashCode3 = signal == null ? 43 : signal.hashCode();
        UtteranceInfo utteranceInfo = getUtteranceInfo();
        return ((i + hashCode3) * 59) + (utteranceInfo != null ? utteranceInfo.hashCode() : 43);
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setDurationInMillis(Integer num) {
        this.durationInMillis = num;
    }

    public void setSignal(String str) {
        this.signal = str;
    }

    public void setUtteranceInfo(UtteranceInfo utteranceInfo) {
        this.utteranceInfo = utteranceInfo;
    }

    public String toString() {
        String callId = getCallId();
        String signal = getSignal();
        Integer durationInMillis = getDurationInMillis();
        String valueOf = String.valueOf(getUtteranceInfo());
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SendDtmfSIPPayload(callId=", callId, ", signal=", signal, ", durationInMillis=");
        m.append(durationInMillis);
        m.append(", utteranceInfo=");
        m.append(valueOf);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public SendDtmfSIPPayload() {
    }

    public /* synthetic */ SendDtmfSIPPayload(String str, String str2, Integer num, UtteranceInfo utteranceInfo, int i) {
        this(str, str2, num, utteranceInfo);
    }
}
