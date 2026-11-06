package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class EnhancedMetrics implements Serializable {
    private List<String> shardLevelMetrics = new ArrayList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EnhancedMetrics)) {
            return false;
        }
        EnhancedMetrics enhancedMetrics = (EnhancedMetrics) obj;
        if ((enhancedMetrics.getShardLevelMetrics() == null) ^ (getShardLevelMetrics() == null)) {
            return false;
        }
        return enhancedMetrics.getShardLevelMetrics() == null || enhancedMetrics.getShardLevelMetrics().equals(getShardLevelMetrics());
    }

    public List<String> getShardLevelMetrics() {
        return this.shardLevelMetrics;
    }

    public int hashCode() {
        return 31 + (getShardLevelMetrics() == null ? 0 : getShardLevelMetrics().hashCode());
    }

    public void setShardLevelMetrics(Collection<String> collection) {
        if (collection == null) {
            this.shardLevelMetrics = null;
        } else {
            this.shardLevelMetrics = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getShardLevelMetrics() != null) {
            sb.append("ShardLevelMetrics: " + getShardLevelMetrics());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public EnhancedMetrics withShardLevelMetrics(String... strArr) {
        if (getShardLevelMetrics() == null) {
            this.shardLevelMetrics = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.shardLevelMetrics.add(str);
        }
        return this;
    }

    public EnhancedMetrics withShardLevelMetrics(Collection<String> collection) {
        setShardLevelMetrics(collection);
        return this;
    }
}
