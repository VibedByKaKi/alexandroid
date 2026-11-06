package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeIndexRequest extends AmazonWebServiceRequest implements Serializable {
    private String indexName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeIndexRequest)) {
            return false;
        }
        DescribeIndexRequest describeIndexRequest = (DescribeIndexRequest) obj;
        if ((describeIndexRequest.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        return describeIndexRequest.getIndexName() == null || describeIndexRequest.getIndexName().equals(getIndexName());
    }

    public String getIndexName() {
        return this.indexName;
    }

    public int hashCode() {
        return 31 + (getIndexName() == null ? 0 : getIndexName().hashCode());
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getIndexName() != null) {
            sb.append("indexName: " + getIndexName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeIndexRequest withIndexName(String str) {
        this.indexName = str;
        return this;
    }
}
