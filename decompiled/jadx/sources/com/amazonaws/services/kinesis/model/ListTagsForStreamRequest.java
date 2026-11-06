package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTagsForStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartTagKey;
    private Integer limit;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsForStreamRequest)) {
            return false;
        }
        ListTagsForStreamRequest listTagsForStreamRequest = (ListTagsForStreamRequest) obj;
        if ((listTagsForStreamRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (listTagsForStreamRequest.getStreamName() != null && !listTagsForStreamRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((listTagsForStreamRequest.getExclusiveStartTagKey() == null) ^ (getExclusiveStartTagKey() == null)) {
            return false;
        }
        if (listTagsForStreamRequest.getExclusiveStartTagKey() != null && !listTagsForStreamRequest.getExclusiveStartTagKey().equals(getExclusiveStartTagKey())) {
            return false;
        }
        if ((listTagsForStreamRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        return listTagsForStreamRequest.getLimit() == null || listTagsForStreamRequest.getLimit().equals(getLimit());
    }

    public String getExclusiveStartTagKey() {
        return this.exclusiveStartTagKey;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getExclusiveStartTagKey() == null ? 0 : getExclusiveStartTagKey().hashCode())) * 31) + (getLimit() != null ? getLimit().hashCode() : 0);
    }

    public void setExclusiveStartTagKey(String str) {
        this.exclusiveStartTagKey = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getExclusiveStartTagKey() != null) {
            sb.append("ExclusiveStartTagKey: " + getExclusiveStartTagKey() + ",");
        }
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTagsForStreamRequest withExclusiveStartTagKey(String str) {
        this.exclusiveStartTagKey = str;
        return this;
    }

    public ListTagsForStreamRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListTagsForStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
