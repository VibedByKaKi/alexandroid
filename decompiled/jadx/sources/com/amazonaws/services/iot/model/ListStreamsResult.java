package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListStreamsResult implements Serializable {
    private String nextToken;
    private List<StreamSummary> streams;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListStreamsResult)) {
            return false;
        }
        ListStreamsResult listStreamsResult = (ListStreamsResult) obj;
        if ((listStreamsResult.getStreams() == null) ^ (getStreams() == null)) {
            return false;
        }
        if (listStreamsResult.getStreams() != null && !listStreamsResult.getStreams().equals(getStreams())) {
            return false;
        }
        if ((listStreamsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listStreamsResult.getNextToken() == null || listStreamsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<StreamSummary> getStreams() {
        return this.streams;
    }

    public int hashCode() {
        return (((getStreams() == null ? 0 : getStreams().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStreams(Collection<StreamSummary> collection) {
        if (collection == null) {
            this.streams = null;
        } else {
            this.streams = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreams() != null) {
            sb.append("streams: " + getStreams() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListStreamsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListStreamsResult withStreams(StreamSummary... streamSummaryArr) {
        if (getStreams() == null) {
            this.streams = new ArrayList(streamSummaryArr.length);
        }
        for (StreamSummary streamSummary : streamSummaryArr) {
            this.streams.add(streamSummary);
        }
        return this;
    }

    public ListStreamsResult withStreams(Collection<StreamSummary> collection) {
        setStreams(collection);
        return this;
    }
}
