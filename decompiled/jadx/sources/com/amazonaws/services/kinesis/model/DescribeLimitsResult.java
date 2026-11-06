package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeLimitsResult implements Serializable {
    private Integer openShardCount;
    private Integer shardLimit;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeLimitsResult)) {
            return false;
        }
        DescribeLimitsResult describeLimitsResult = (DescribeLimitsResult) obj;
        if ((describeLimitsResult.getShardLimit() == null) ^ (getShardLimit() == null)) {
            return false;
        }
        if (describeLimitsResult.getShardLimit() != null && !describeLimitsResult.getShardLimit().equals(getShardLimit())) {
            return false;
        }
        if ((describeLimitsResult.getOpenShardCount() == null) ^ (getOpenShardCount() == null)) {
            return false;
        }
        return describeLimitsResult.getOpenShardCount() == null || describeLimitsResult.getOpenShardCount().equals(getOpenShardCount());
    }

    public Integer getOpenShardCount() {
        return this.openShardCount;
    }

    public Integer getShardLimit() {
        return this.shardLimit;
    }

    public int hashCode() {
        return (((getShardLimit() == null ? 0 : getShardLimit().hashCode()) + 31) * 31) + (getOpenShardCount() != null ? getOpenShardCount().hashCode() : 0);
    }

    public void setOpenShardCount(Integer num) {
        this.openShardCount = num;
    }

    public void setShardLimit(Integer num) {
        this.shardLimit = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getShardLimit() != null) {
            sb.append("ShardLimit: " + getShardLimit() + ",");
        }
        if (getOpenShardCount() != null) {
            sb.append("OpenShardCount: " + getOpenShardCount());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeLimitsResult withOpenShardCount(Integer num) {
        this.openShardCount = num;
        return this;
    }

    public DescribeLimitsResult withShardLimit(Integer num) {
        this.shardLimit = num;
        return this;
    }
}
