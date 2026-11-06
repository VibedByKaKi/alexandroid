package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MessageTemplateType implements Serializable {
    private String emailMessage;
    private String emailSubject;
    private String sMSMessage;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MessageTemplateType)) {
            return false;
        }
        MessageTemplateType messageTemplateType = (MessageTemplateType) obj;
        if ((messageTemplateType.getSMSMessage() == null) ^ (getSMSMessage() == null)) {
            return false;
        }
        if (messageTemplateType.getSMSMessage() != null && !messageTemplateType.getSMSMessage().equals(getSMSMessage())) {
            return false;
        }
        if ((messageTemplateType.getEmailMessage() == null) ^ (getEmailMessage() == null)) {
            return false;
        }
        if (messageTemplateType.getEmailMessage() != null && !messageTemplateType.getEmailMessage().equals(getEmailMessage())) {
            return false;
        }
        if ((messageTemplateType.getEmailSubject() == null) ^ (getEmailSubject() == null)) {
            return false;
        }
        return messageTemplateType.getEmailSubject() == null || messageTemplateType.getEmailSubject().equals(getEmailSubject());
    }

    public String getEmailMessage() {
        return this.emailMessage;
    }

    public String getEmailSubject() {
        return this.emailSubject;
    }

    public String getSMSMessage() {
        return this.sMSMessage;
    }

    public int hashCode() {
        return (((((getSMSMessage() == null ? 0 : getSMSMessage().hashCode()) + 31) * 31) + (getEmailMessage() == null ? 0 : getEmailMessage().hashCode())) * 31) + (getEmailSubject() != null ? getEmailSubject().hashCode() : 0);
    }

    public void setEmailMessage(String str) {
        this.emailMessage = str;
    }

    public void setEmailSubject(String str) {
        this.emailSubject = str;
    }

    public void setSMSMessage(String str) {
        this.sMSMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSMSMessage() != null) {
            sb.append("SMSMessage: " + getSMSMessage() + ",");
        }
        if (getEmailMessage() != null) {
            sb.append("EmailMessage: " + getEmailMessage() + ",");
        }
        if (getEmailSubject() != null) {
            sb.append("EmailSubject: " + getEmailSubject());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MessageTemplateType withEmailMessage(String str) {
        this.emailMessage = str;
        return this;
    }

    public MessageTemplateType withEmailSubject(String str) {
        this.emailSubject = str;
        return this;
    }

    public MessageTemplateType withSMSMessage(String str) {
        this.sMSMessage = str;
        return this;
    }
}
