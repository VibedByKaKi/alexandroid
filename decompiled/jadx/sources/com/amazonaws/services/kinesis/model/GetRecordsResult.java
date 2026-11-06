package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetRecordsResult implements Serializable {
    private Long millisBehindLatest;
    private String nextShardIterator;
    private List<Record> records = new ArrayList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetRecordsResult)) {
            return false;
        }
        GetRecordsResult getRecordsResult = (GetRecordsResult) obj;
        if ((getRecordsResult.getRecords() == null) ^ (getRecords() == null)) {
            return false;
        }
        if (getRecordsResult.getRecords() != null && !getRecordsResult.getRecords().equals(getRecords())) {
            return false;
        }
        if ((getRecordsResult.getNextShardIterator() == null) ^ (getNextShardIterator() == null)) {
            return false;
        }
        if (getRecordsResult.getNextShardIterator() != null && !getRecordsResult.getNextShardIterator().equals(getNextShardIterator())) {
            return false;
        }
        if ((getRecordsResult.getMillisBehindLatest() == null) ^ (getMillisBehindLatest() == null)) {
            return false;
        }
        return getRecordsResult.getMillisBehindLatest() == null || getRecordsResult.getMillisBehindLatest().equals(getMillisBehindLatest());
    }

    public Long getMillisBehindLatest() {
        return this.millisBehindLatest;
    }

    public String getNextShardIterator() {
        return this.nextShardIterator;
    }

    public List<Record> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return (((((getRecords() == null ? 0 : getRecords().hashCode()) + 31) * 31) + (getNextShardIterator() == null ? 0 : getNextShardIterator().hashCode())) * 31) + (getMillisBehindLatest() != null ? getMillisBehindLatest().hashCode() : 0);
    }

    public void setMillisBehindLatest(Long l) {
        this.millisBehindLatest = l;
    }

    public void setNextShardIterator(String str) {
        this.nextShardIterator = str;
    }

    public void setRecords(Collection<Record> collection) {
        if (collection == null) {
            this.records = null;
        } else {
            this.records = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRecords() != null) {
            sb.append("Records: " + getRecords() + ",");
        }
        if (getNextShardIterator() != null) {
            sb.append("NextShardIterator: " + getNextShardIterator() + ",");
        }
        if (getMillisBehindLatest() != null) {
            sb.append("MillisBehindLatest: " + getMillisBehindLatest());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetRecordsResult withMillisBehindLatest(Long l) {
        this.millisBehindLatest = l;
        return this;
    }

    public GetRecordsResult withNextShardIterator(String str) {
        this.nextShardIterator = str;
        return this;
    }

    public GetRecordsResult withRecords(Record... recordArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(recordArr.length);
        }
        for (Record record : recordArr) {
            this.records.add(record);
        }
        return this;
    }

    public GetRecordsResult withRecords(Collection<Record> collection) {
        setRecords(collection);
        return this;
    }
}
