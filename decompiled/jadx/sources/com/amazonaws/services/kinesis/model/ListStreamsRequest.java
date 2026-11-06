package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListStreamsRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartStreamName;
    private Integer limit;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListStreamsRequest)) {
            return false;
        }
        ListStreamsRequest listStreamsRequest = (ListStreamsRequest) obj;
        if ((listStreamsRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (listStreamsRequest.getLimit() != null && !listStreamsRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((listStreamsRequest.getExclusiveStartStreamName() == null) ^ (getExclusiveStartStreamName() == null)) {
            return false;
        }
        return listStreamsRequest.getExclusiveStartStreamName() == null || listStreamsRequest.getExclusiveStartStreamName().equals(getExclusiveStartStreamName());
    }

    public String getExclusiveStartStreamName() {
        return this.exclusiveStartStreamName;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public int hashCode() {
        return (((getLimit() == null ? 0 : getLimit().hashCode()) + 31) * 31) + (getExclusiveStartStreamName() != null ? getExclusiveStartStreamName().hashCode() : 0);
    }

    public void setExclusiveStartStreamName(String str) {
        this.exclusiveStartStreamName = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit() + ",");
        }
        if (getExclusiveStartStreamName() != null) {
            sb.append("ExclusiveStartStreamName: " + getExclusiveStartStreamName());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListStreamsRequest withExclusiveStartStreamName(String str) {
        this.exclusiveStartStreamName = str;
        return this;
    }

    public ListStreamsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }
}
