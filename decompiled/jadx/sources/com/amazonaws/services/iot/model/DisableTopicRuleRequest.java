package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DisableTopicRuleRequest extends AmazonWebServiceRequest implements Serializable {
    private String ruleName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DisableTopicRuleRequest)) {
            return false;
        }
        DisableTopicRuleRequest disableTopicRuleRequest = (DisableTopicRuleRequest) obj;
        if ((disableTopicRuleRequest.getRuleName() == null) ^ (getRuleName() == null)) {
            return false;
        }
        return disableTopicRuleRequest.getRuleName() == null || disableTopicRuleRequest.getRuleName().equals(getRuleName());
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public int hashCode() {
        return 31 + (getRuleName() == null ? 0 : getRuleName().hashCode());
    }

    public void setRuleName(String str) {
        this.ruleName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRuleName() != null) {
            sb.append("ruleName: " + getRuleName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DisableTopicRuleRequest withRuleName(String str) {
        this.ruleName = str;
        return this;
    }
}
