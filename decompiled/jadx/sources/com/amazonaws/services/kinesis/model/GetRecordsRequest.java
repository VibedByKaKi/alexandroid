package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetRecordsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer limit;
    private String shardIterator;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetRecordsRequest)) {
            return false;
        }
        GetRecordsRequest getRecordsRequest = (GetRecordsRequest) obj;
        if ((getRecordsRequest.getShardIterator() == null) ^ (getShardIterator() == null)) {
            return false;
        }
        if (getRecordsRequest.getShardIterator() != null && !getRecordsRequest.getShardIterator().equals(getShardIterator())) {
            return false;
        }
        if ((getRecordsRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        return getRecordsRequest.getLimit() == null || getRecordsRequest.getLimit().equals(getLimit());
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getShardIterator() {
        return this.shardIterator;
    }

    public int hashCode() {
        return (((getShardIterator() == null ? 0 : getShardIterator().hashCode()) + 31) * 31) + (getLimit() != null ? getLimit().hashCode() : 0);
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setShardIterator(String str) {
        this.shardIterator = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getShardIterator() != null) {
            sb.append("ShardIterator: " + getShardIterator() + ",");
        }
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetRecordsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public GetRecordsRequest withShardIterator(String str) {
        this.shardIterator = str;
        return this;
    }
}
