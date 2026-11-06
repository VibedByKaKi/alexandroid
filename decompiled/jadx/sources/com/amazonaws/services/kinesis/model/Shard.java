package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Shard implements Serializable {
    private String adjacentParentShardId;
    private HashKeyRange hashKeyRange;
    private String parentShardId;
    private SequenceNumberRange sequenceNumberRange;
    private String shardId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Shard)) {
            return false;
        }
        Shard shard = (Shard) obj;
        if ((shard.getShardId() == null) ^ (getShardId() == null)) {
            return false;
        }
        if (shard.getShardId() != null && !shard.getShardId().equals(getShardId())) {
            return false;
        }
        if ((shard.getParentShardId() == null) ^ (getParentShardId() == null)) {
            return false;
        }
        if (shard.getParentShardId() != null && !shard.getParentShardId().equals(getParentShardId())) {
            return false;
        }
        if ((shard.getAdjacentParentShardId() == null) ^ (getAdjacentParentShardId() == null)) {
            return false;
        }
        if (shard.getAdjacentParentShardId() != null && !shard.getAdjacentParentShardId().equals(getAdjacentParentShardId())) {
            return false;
        }
        if ((shard.getHashKeyRange() == null) ^ (getHashKeyRange() == null)) {
            return false;
        }
        if (shard.getHashKeyRange() != null && !shard.getHashKeyRange().equals(getHashKeyRange())) {
            return false;
        }
        if ((shard.getSequenceNumberRange() == null) ^ (getSequenceNumberRange() == null)) {
            return false;
        }
        return shard.getSequenceNumberRange() == null || shard.getSequenceNumberRange().equals(getSequenceNumberRange());
    }

    public String getAdjacentParentShardId() {
        return this.adjacentParentShardId;
    }

    public HashKeyRange getHashKeyRange() {
        return this.hashKeyRange;
    }

    public String getParentShardId() {
        return this.parentShardId;
    }

    public SequenceNumberRange getSequenceNumberRange() {
        return this.sequenceNumberRange;
    }

    public String getShardId() {
        return this.shardId;
    }

    public int hashCode() {
        return (((((((((getShardId() == null ? 0 : getShardId().hashCode()) + 31) * 31) + (getParentShardId() == null ? 0 : getParentShardId().hashCode())) * 31) + (getAdjacentParentShardId() == null ? 0 : getAdjacentParentShardId().hashCode())) * 31) + (getHashKeyRange() == null ? 0 : getHashKeyRange().hashCode())) * 31) + (getSequenceNumberRange() != null ? getSequenceNumberRange().hashCode() : 0);
    }

    public void setAdjacentParentShardId(String str) {
        this.adjacentParentShardId = str;
    }

    public void setHashKeyRange(HashKeyRange hashKeyRange) {
        this.hashKeyRange = hashKeyRange;
    }

    public void setParentShardId(String str) {
        this.parentShardId = str;
    }

    public void setSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
    }

    public void setShardId(String str) {
        this.shardId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getShardId() != null) {
            sb.append("ShardId: " + getShardId() + ",");
        }
        if (getParentShardId() != null) {
            sb.append("ParentShardId: " + getParentShardId() + ",");
        }
        if (getAdjacentParentShardId() != null) {
            sb.append("AdjacentParentShardId: " + getAdjacentParentShardId() + ",");
        }
        if (getHashKeyRange() != null) {
            sb.append("HashKeyRange: " + getHashKeyRange() + ",");
        }
        if (getSequenceNumberRange() != null) {
            sb.append("SequenceNumberRange: " + getSequenceNumberRange());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Shard withAdjacentParentShardId(String str) {
        this.adjacentParentShardId = str;
        return this;
    }

    public Shard withHashKeyRange(HashKeyRange hashKeyRange) {
        this.hashKeyRange = hashKeyRange;
        return this;
    }

    public Shard withParentShardId(String str) {
        this.parentShardId = str;
        return this;
    }

    public Shard withSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
        return this;
    }

    public Shard withShardId(String str) {
        this.shardId = str;
        return this;
    }
}
