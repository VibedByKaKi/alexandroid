package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetBucketsAggregationResult implements Serializable {
    private List<Bucket> buckets;
    private Integer totalCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetBucketsAggregationResult)) {
            return false;
        }
        GetBucketsAggregationResult getBucketsAggregationResult = (GetBucketsAggregationResult) obj;
        if ((getBucketsAggregationResult.getTotalCount() == null) ^ (getTotalCount() == null)) {
            return false;
        }
        if (getBucketsAggregationResult.getTotalCount() != null && !getBucketsAggregationResult.getTotalCount().equals(getTotalCount())) {
            return false;
        }
        if ((getBucketsAggregationResult.getBuckets() == null) ^ (getBuckets() == null)) {
            return false;
        }
        return getBucketsAggregationResult.getBuckets() == null || getBucketsAggregationResult.getBuckets().equals(getBuckets());
    }

    public List<Bucket> getBuckets() {
        return this.buckets;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return (((getTotalCount() == null ? 0 : getTotalCount().hashCode()) + 31) * 31) + (getBuckets() != null ? getBuckets().hashCode() : 0);
    }

    public void setBuckets(Collection<Bucket> collection) {
        if (collection == null) {
            this.buckets = null;
        } else {
            this.buckets = new ArrayList(collection);
        }
    }

    public void setTotalCount(Integer num) {
        this.totalCount = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTotalCount() != null) {
            sb.append("totalCount: " + getTotalCount() + ",");
        }
        if (getBuckets() != null) {
            sb.append("buckets: " + getBuckets());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetBucketsAggregationResult withBuckets(Bucket... bucketArr) {
        if (getBuckets() == null) {
            this.buckets = new ArrayList(bucketArr.length);
        }
        for (Bucket bucket : bucketArr) {
            this.buckets.add(bucket);
        }
        return this;
    }

    public GetBucketsAggregationResult withTotalCount(Integer num) {
        this.totalCount = num;
        return this;
    }

    public GetBucketsAggregationResult withBuckets(Collection<Bucket> collection) {
        setBuckets(collection);
        return this;
    }
}
