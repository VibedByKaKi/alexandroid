package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DecodeAuthorizationMessageResult implements Serializable {
    private String decodedMessage;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DecodeAuthorizationMessageResult)) {
            return false;
        }
        DecodeAuthorizationMessageResult decodeAuthorizationMessageResult = (DecodeAuthorizationMessageResult) obj;
        if ((decodeAuthorizationMessageResult.getDecodedMessage() == null) ^ (getDecodedMessage() == null)) {
            return false;
        }
        return decodeAuthorizationMessageResult.getDecodedMessage() == null || decodeAuthorizationMessageResult.getDecodedMessage().equals(getDecodedMessage());
    }

    public String getDecodedMessage() {
        return this.decodedMessage;
    }

    public int hashCode() {
        return 31 + (getDecodedMessage() == null ? 0 : getDecodedMessage().hashCode());
    }

    public void setDecodedMessage(String str) {
        this.decodedMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDecodedMessage() != null) {
            sb.append("DecodedMessage: " + getDecodedMessage());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DecodeAuthorizationMessageResult withDecodedMessage(String str) {
        this.decodedMessage = str;
        return this;
    }
}
