package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetShardIteratorResult implements Serializable {
    private String shardIterator;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetShardIteratorResult)) {
            return false;
        }
        GetShardIteratorResult getShardIteratorResult = (GetShardIteratorResult) obj;
        if ((getShardIteratorResult.getShardIterator() == null) ^ (getShardIterator() == null)) {
            return false;
        }
        return getShardIteratorResult.getShardIterator() == null || getShardIteratorResult.getShardIterator().equals(getShardIterator());
    }

    public String getShardIterator() {
        return this.shardIterator;
    }

    public int hashCode() {
        return 31 + (getShardIterator() == null ? 0 : getShardIterator().hashCode());
    }

    public void setShardIterator(String str) {
        this.shardIterator = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getShardIterator() != null) {
            sb.append("ShardIterator: " + getShardIterator());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetShardIteratorResult withShardIterator(String str) {
        this.shardIterator = str;
        return this;
    }
}
