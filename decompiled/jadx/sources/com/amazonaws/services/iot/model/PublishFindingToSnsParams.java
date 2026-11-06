package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PublishFindingToSnsParams implements Serializable {
    private String topicArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PublishFindingToSnsParams)) {
            return false;
        }
        PublishFindingToSnsParams publishFindingToSnsParams = (PublishFindingToSnsParams) obj;
        if ((publishFindingToSnsParams.getTopicArn() == null) ^ (getTopicArn() == null)) {
            return false;
        }
        return publishFindingToSnsParams.getTopicArn() == null || publishFindingToSnsParams.getTopicArn().equals(getTopicArn());
    }

    public String getTopicArn() {
        return this.topicArn;
    }

    public int hashCode() {
        return 31 + (getTopicArn() == null ? 0 : getTopicArn().hashCode());
    }

    public void setTopicArn(String str) {
        this.topicArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTopicArn() != null) {
            sb.append("topicArn: " + getTopicArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PublishFindingToSnsParams withTopicArn(String str) {
        this.topicArn = str;
        return this;
    }
}
