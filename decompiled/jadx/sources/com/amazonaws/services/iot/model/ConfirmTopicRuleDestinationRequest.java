package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ConfirmTopicRuleDestinationRequest extends AmazonWebServiceRequest implements Serializable {
    private String confirmationToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ConfirmTopicRuleDestinationRequest)) {
            return false;
        }
        ConfirmTopicRuleDestinationRequest confirmTopicRuleDestinationRequest = (ConfirmTopicRuleDestinationRequest) obj;
        if ((confirmTopicRuleDestinationRequest.getConfirmationToken() == null) ^ (getConfirmationToken() == null)) {
            return false;
        }
        return confirmTopicRuleDestinationRequest.getConfirmationToken() == null || confirmTopicRuleDestinationRequest.getConfirmationToken().equals(getConfirmationToken());
    }

    public String getConfirmationToken() {
        return this.confirmationToken;
    }

    public int hashCode() {
        return 31 + (getConfirmationToken() == null ? 0 : getConfirmationToken().hashCode());
    }

    public void setConfirmationToken(String str) {
        this.confirmationToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getConfirmationToken() != null) {
            sb.append("confirmationToken: " + getConfirmationToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ConfirmTopicRuleDestinationRequest withConfirmationToken(String str) {
        this.confirmationToken = str;
        return this;
    }
}
