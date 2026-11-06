package com.amazon.comms.models.sip.payloads;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.application.service.common.logging.RedactInLogs;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RedactInLogs
/* loaded from: classes20.dex */
public class ConfigureCommsSIPPayload implements SIPPayload {
    private String callId;
    private List<Map<String, String>> headers;
    private SIPRegisterInfo registerInfo;
    private Boolean sendPresence;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ConfigureCommsSIPPayloadBuilder {
        private String callId;
        private List<Map<String, String>> headers;
        private SIPRegisterInfo registerInfo;
        private boolean sendPresence$set;
        private Boolean sendPresence$value;

        public ConfigureCommsSIPPayload build() {
            Boolean bool = this.sendPresence$value;
            if (!this.sendPresence$set) {
                bool = ConfigureCommsSIPPayload.$default$sendPresence();
            }
            return new ConfigureCommsSIPPayload(this.callId, this.registerInfo, this.headers, bool, 0);
        }

        public ConfigureCommsSIPPayloadBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public ConfigureCommsSIPPayloadBuilder headers(List<Map<String, String>> list) {
            this.headers = list;
            return this;
        }

        public ConfigureCommsSIPPayloadBuilder registerInfo(SIPRegisterInfo sIPRegisterInfo) {
            this.registerInfo = sIPRegisterInfo;
            return this;
        }

        public ConfigureCommsSIPPayloadBuilder sendPresence(Boolean bool) {
            this.sendPresence$value = bool;
            this.sendPresence$set = true;
            return this;
        }

        public String toString() {
            String str = this.callId;
            String valueOf = String.valueOf(this.registerInfo);
            String valueOf2 = String.valueOf(this.headers);
            Boolean bool = this.sendPresence$value;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ConfigureCommsSIPPayload.ConfigureCommsSIPPayloadBuilder(callId=", str, ", registerInfo=", valueOf, ", headers=");
            m.append(valueOf2);
            m.append(", sendPresence$value=");
            m.append(bool);
            m.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return m.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean $default$sendPresence() {
        return Boolean.FALSE;
    }

    private ConfigureCommsSIPPayload(String str, SIPRegisterInfo sIPRegisterInfo, List<Map<String, String>> list, Boolean bool) {
        this.callId = str;
        this.registerInfo = sIPRegisterInfo;
        this.headers = list;
        this.sendPresence = bool;
    }

    public static ConfigureCommsSIPPayloadBuilder builder() {
        return new ConfigureCommsSIPPayloadBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ConfigureCommsSIPPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConfigureCommsSIPPayload)) {
            return false;
        }
        ConfigureCommsSIPPayload configureCommsSIPPayload = (ConfigureCommsSIPPayload) obj;
        if (!configureCommsSIPPayload.canEqual(this)) {
            return false;
        }
        Boolean sendPresence = getSendPresence();
        Boolean sendPresence2 = configureCommsSIPPayload.getSendPresence();
        if (sendPresence != null ? !sendPresence.equals(sendPresence2) : sendPresence2 != null) {
            return false;
        }
        String callId = getCallId();
        String callId2 = configureCommsSIPPayload.getCallId();
        if (callId != null ? !callId.equals(callId2) : callId2 != null) {
            return false;
        }
        SIPRegisterInfo registerInfo = getRegisterInfo();
        SIPRegisterInfo registerInfo2 = configureCommsSIPPayload.getRegisterInfo();
        if (registerInfo != null ? !registerInfo.equals(registerInfo2) : registerInfo2 != null) {
            return false;
        }
        List<Map<String, String>> headers = getHeaders();
        List<Map<String, String>> headers2 = configureCommsSIPPayload.getHeaders();
        return headers != null ? headers.equals(headers2) : headers2 == null;
    }

    @Override // com.amazon.comms.models.sip.payloads.SIPPayload
    public String getCallId() {
        return this.callId;
    }

    public List<Map<String, String>> getHeaders() {
        return this.headers;
    }

    public SIPRegisterInfo getRegisterInfo() {
        return this.registerInfo;
    }

    public Boolean getSendPresence() {
        return this.sendPresence;
    }

    public int hashCode() {
        Boolean sendPresence = getSendPresence();
        int hashCode = sendPresence == null ? 43 : sendPresence.hashCode();
        String callId = getCallId();
        int hashCode2 = ((hashCode + 59) * 59) + (callId == null ? 43 : callId.hashCode());
        SIPRegisterInfo registerInfo = getRegisterInfo();
        int i = hashCode2 * 59;
        int hashCode3 = registerInfo == null ? 43 : registerInfo.hashCode();
        List<Map<String, String>> headers = getHeaders();
        return ((i + hashCode3) * 59) + (headers != null ? headers.hashCode() : 43);
    }

    public void setCallId(String str) {
        this.callId = str;
    }

    public void setHeaders(List<Map<String, String>> list) {
        this.headers = list;
    }

    public void setRegisterInfo(SIPRegisterInfo sIPRegisterInfo) {
        this.registerInfo = sIPRegisterInfo;
    }

    public void setSendPresence(Boolean bool) {
        this.sendPresence = bool;
    }

    public String toString() {
        String callId = getCallId();
        String valueOf = String.valueOf(getRegisterInfo());
        String valueOf2 = String.valueOf(getHeaders());
        Boolean sendPresence = getSendPresence();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ConfigureCommsSIPPayload(callId=", callId, ", registerInfo=", valueOf, ", headers=");
        m.append(valueOf2);
        m.append(", sendPresence=");
        m.append(sendPresence);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public ConfigureCommsSIPPayload() {
        this.sendPresence = Boolean.FALSE;
    }

    public /* synthetic */ ConfigureCommsSIPPayload(String str, SIPRegisterInfo sIPRegisterInfo, List list, Boolean bool, int i) {
        this(str, sIPRegisterInfo, list, bool);
    }
}
