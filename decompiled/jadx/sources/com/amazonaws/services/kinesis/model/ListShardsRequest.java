package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListShardsRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartShardId;
    private Integer maxResults;
    private String nextToken;
    private Date streamCreationTimestamp;
    private String streamName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListShardsRequest)) {
            return false;
        }
        ListShardsRequest listShardsRequest = (ListShardsRequest) obj;
        if ((listShardsRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (listShardsRequest.getStreamName() != null && !listShardsRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((listShardsRequest.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        if (listShardsRequest.getNextToken() != null && !listShardsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if ((listShardsRequest.getExclusiveStartShardId() == null) ^ (getExclusiveStartShardId() == null)) {
            return false;
        }
        if (listShardsRequest.getExclusiveStartShardId() != null && !listShardsRequest.getExclusiveStartShardId().equals(getExclusiveStartShardId())) {
            return false;
        }
        if ((listShardsRequest.getMaxResults() == null) ^ (getMaxResults() == null)) {
            return false;
        }
        if (listShardsRequest.getMaxResults() != null && !listShardsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if ((listShardsRequest.getStreamCreationTimestamp() == null) ^ (getStreamCreationTimestamp() == null)) {
            return false;
        }
        return listShardsRequest.getStreamCreationTimestamp() == null || listShardsRequest.getStreamCreationTimestamp().equals(getStreamCreationTimestamp());
    }

    public String getExclusiveStartShardId() {
        return this.exclusiveStartShardId;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public Date getStreamCreationTimestamp() {
        return this.streamCreationTimestamp;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        return (((((((((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getNextToken() == null ? 0 : getNextToken().hashCode())) * 31) + (getExclusiveStartShardId() == null ? 0 : getExclusiveStartShardId().hashCode())) * 31) + (getMaxResults() == null ? 0 : getMaxResults().hashCode())) * 31) + (getStreamCreationTimestamp() != null ? getStreamCreationTimestamp().hashCode() : 0);
    }

    public void setExclusiveStartShardId(String str) {
        this.exclusiveStartShardId = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStreamCreationTimestamp(Date date) {
        this.streamCreationTimestamp = date;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken() + ",");
        }
        if (getExclusiveStartShardId() != null) {
            sb.append("ExclusiveStartShardId: " + getExclusiveStartShardId() + ",");
        }
        if (getMaxResults() != null) {
            sb.append("MaxResults: " + getMaxResults() + ",");
        }
        if (getStreamCreationTimestamp() != null) {
            sb.append("StreamCreationTimestamp: " + getStreamCreationTimestamp());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListShardsRequest withExclusiveStartShardId(String str) {
        this.exclusiveStartShardId = str;
        return this;
    }

    public ListShardsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListShardsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListShardsRequest withStreamCreationTimestamp(Date date) {
        this.streamCreationTimestamp = date;
        return this;
    }

    public ListShardsRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
