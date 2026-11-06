package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListShardsResult implements Serializable {
    private String nextToken;
    private List<Shard> shards = new ArrayList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListShardsResult)) {
            return false;
        }
        ListShardsResult listShardsResult = (ListShardsResult) obj;
        if ((listShardsResult.getShards() == null) ^ (getShards() == null)) {
            return false;
        }
        if (listShardsResult.getShards() != null && !listShardsResult.getShards().equals(getShards())) {
            return false;
        }
        if ((listShardsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listShardsResult.getNextToken() == null || listShardsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<Shard> getShards() {
        return this.shards;
    }

    public int hashCode() {
        return (((getShards() == null ? 0 : getShards().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setShards(Collection<Shard> collection) {
        if (collection == null) {
            this.shards = null;
        } else {
            this.shards = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getShards() != null) {
            sb.append("Shards: " + getShards() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListShardsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListShardsResult withShards(Shard... shardArr) {
        if (getShards() == null) {
            this.shards = new ArrayList(shardArr.length);
        }
        for (Shard shard : shardArr) {
            this.shards.add(shard);
        }
        return this;
    }

    public ListShardsResult withShards(Collection<Shard> collection) {
        setShards(collection);
        return this;
    }
}
