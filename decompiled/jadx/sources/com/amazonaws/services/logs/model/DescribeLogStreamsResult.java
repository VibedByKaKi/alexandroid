package com.amazonaws.services.logs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeLogStreamsResult implements Serializable {
    private List<LogStream> logStreams;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeLogStreamsResult)) {
            return false;
        }
        DescribeLogStreamsResult describeLogStreamsResult = (DescribeLogStreamsResult) obj;
        if ((describeLogStreamsResult.getLogStreams() == null) ^ (getLogStreams() == null)) {
            return false;
        }
        if (describeLogStreamsResult.getLogStreams() != null && !describeLogStreamsResult.getLogStreams().equals(getLogStreams())) {
            return false;
        }
        if ((describeLogStreamsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return describeLogStreamsResult.getNextToken() == null || describeLogStreamsResult.getNextToken().equals(getNextToken());
    }

    public List<LogStream> getLogStreams() {
        return this.logStreams;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getLogStreams() == null ? 0 : getLogStreams().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setLogStreams(Collection<LogStream> collection) {
        if (collection == null) {
            this.logStreams = null;
        } else {
            this.logStreams = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogStreams() != null) {
            sb.append("logStreams: " + getLogStreams() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeLogStreamsResult withLogStreams(LogStream... logStreamArr) {
        if (getLogStreams() == null) {
            this.logStreams = new ArrayList(logStreamArr.length);
        }
        for (LogStream logStream : logStreamArr) {
            this.logStreams.add(logStream);
        }
        return this;
    }

    public DescribeLogStreamsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeLogStreamsResult withLogStreams(Collection<LogStream> collection) {
        setLogStreams(collection);
        return this;
    }
}
