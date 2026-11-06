package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetTopicRuleRequest extends AmazonWebServiceRequest implements Serializable {
    private String ruleName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetTopicRuleRequest)) {
            return false;
        }
        GetTopicRuleRequest getTopicRuleRequest = (GetTopicRuleRequest) obj;
        if ((getTopicRuleRequest.getRuleName() == null) ^ (getRuleName() == null)) {
            return false;
        }
        return getTopicRuleRequest.getRuleName() == null || getTopicRuleRequest.getRuleName().equals(getRuleName());
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

    public GetTopicRuleRequest withRuleName(String str) {
        this.ruleName = str;
        return this;
    }
}
