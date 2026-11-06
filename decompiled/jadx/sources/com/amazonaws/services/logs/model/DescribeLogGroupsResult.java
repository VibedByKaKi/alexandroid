package com.amazonaws.services.logs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeLogGroupsResult implements Serializable {
    private List<LogGroup> logGroups;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeLogGroupsResult)) {
            return false;
        }
        DescribeLogGroupsResult describeLogGroupsResult = (DescribeLogGroupsResult) obj;
        if ((describeLogGroupsResult.getLogGroups() == null) ^ (getLogGroups() == null)) {
            return false;
        }
        if (describeLogGroupsResult.getLogGroups() != null && !describeLogGroupsResult.getLogGroups().equals(getLogGroups())) {
            return false;
        }
        if ((describeLogGroupsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return describeLogGroupsResult.getNextToken() == null || describeLogGroupsResult.getNextToken().equals(getNextToken());
    }

    public List<LogGroup> getLogGroups() {
        return this.logGroups;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getLogGroups() == null ? 0 : getLogGroups().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setLogGroups(Collection<LogGroup> collection) {
        if (collection == null) {
            this.logGroups = null;
        } else {
            this.logGroups = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLogGroups() != null) {
            sb.append("logGroups: " + getLogGroups() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeLogGroupsResult withLogGroups(LogGroup... logGroupArr) {
        if (getLogGroups() == null) {
            this.logGroups = new ArrayList(logGroupArr.length);
        }
        for (LogGroup logGroup : logGroupArr) {
            this.logGroups.add(logGroup);
        }
        return this;
    }

    public DescribeLogGroupsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeLogGroupsResult withLogGroups(Collection<LogGroup> collection) {
        setLogGroups(collection);
        return this;
    }
}
