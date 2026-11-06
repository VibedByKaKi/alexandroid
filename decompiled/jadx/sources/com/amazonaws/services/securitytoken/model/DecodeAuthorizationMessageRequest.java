package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DecodeAuthorizationMessageRequest extends AmazonWebServiceRequest implements Serializable {
    private String encodedMessage;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DecodeAuthorizationMessageRequest)) {
            return false;
        }
        DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest = (DecodeAuthorizationMessageRequest) obj;
        if ((decodeAuthorizationMessageRequest.getEncodedMessage() == null) ^ (getEncodedMessage() == null)) {
            return false;
        }
        return decodeAuthorizationMessageRequest.getEncodedMessage() == null || decodeAuthorizationMessageRequest.getEncodedMessage().equals(getEncodedMessage());
    }

    public String getEncodedMessage() {
        return this.encodedMessage;
    }

    public int hashCode() {
        return 31 + (getEncodedMessage() == null ? 0 : getEncodedMessage().hashCode());
    }

    public void setEncodedMessage(String str) {
        this.encodedMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEncodedMessage() != null) {
            sb.append("EncodedMessage: " + getEncodedMessage());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DecodeAuthorizationMessageRequest withEncodedMessage(String str) {
        this.encodedMessage = str;
        return this;
    }
}
