package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SmsMfaConfigType implements Serializable {
    private String smsAuthenticationMessage;
    private SmsConfigurationType smsConfiguration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SmsMfaConfigType)) {
            return false;
        }
        SmsMfaConfigType smsMfaConfigType = (SmsMfaConfigType) obj;
        if ((smsMfaConfigType.getSmsAuthenticationMessage() == null) ^ (getSmsAuthenticationMessage() == null)) {
            return false;
        }
        if (smsMfaConfigType.getSmsAuthenticationMessage() != null && !smsMfaConfigType.getSmsAuthenticationMessage().equals(getSmsAuthenticationMessage())) {
            return false;
        }
        if ((smsMfaConfigType.getSmsConfiguration() == null) ^ (getSmsConfiguration() == null)) {
            return false;
        }
        return smsMfaConfigType.getSmsConfiguration() == null || smsMfaConfigType.getSmsConfiguration().equals(getSmsConfiguration());
    }

    public String getSmsAuthenticationMessage() {
        return this.smsAuthenticationMessage;
    }

    public SmsConfigurationType getSmsConfiguration() {
        return this.smsConfiguration;
    }

    public int hashCode() {
        return (((getSmsAuthenticationMessage() == null ? 0 : getSmsAuthenticationMessage().hashCode()) + 31) * 31) + (getSmsConfiguration() != null ? getSmsConfiguration().hashCode() : 0);
    }

    public void setSmsAuthenticationMessage(String str) {
        this.smsAuthenticationMessage = str;
    }

    public void setSmsConfiguration(SmsConfigurationType smsConfigurationType) {
        this.smsConfiguration = smsConfigurationType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSmsAuthenticationMessage() != null) {
            sb.append("SmsAuthenticationMessage: " + getSmsAuthenticationMessage() + ",");
        }
        if (getSmsConfiguration() != null) {
            sb.append("SmsConfiguration: " + getSmsConfiguration());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SmsMfaConfigType withSmsAuthenticationMessage(String str) {
        this.smsAuthenticationMessage = str;
        return this;
    }

    public SmsMfaConfigType withSmsConfiguration(SmsConfigurationType smsConfigurationType) {
        this.smsConfiguration = smsConfigurationType;
        return this;
    }
}
