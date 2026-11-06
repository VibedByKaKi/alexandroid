package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListRetainedMessagesResult implements Serializable {
    private String nextToken;
    private List<RetainedMessageSummary> retainedTopics;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListRetainedMessagesResult)) {
            return false;
        }
        ListRetainedMessagesResult listRetainedMessagesResult = (ListRetainedMessagesResult) obj;
        if ((listRetainedMessagesResult.getRetainedTopics() == null) ^ (getRetainedTopics() == null)) {
            return false;
        }
        if (listRetainedMessagesResult.getRetainedTopics() != null && !listRetainedMessagesResult.getRetainedTopics().equals(getRetainedTopics())) {
            return false;
        }
        if ((listRetainedMessagesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listRetainedMessagesResult.getNextToken() == null || listRetainedMessagesResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<RetainedMessageSummary> getRetainedTopics() {
        return this.retainedTopics;
    }

    public int hashCode() {
        return (((getRetainedTopics() == null ? 0 : getRetainedTopics().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setRetainedTopics(Collection<RetainedMessageSummary> collection) {
        if (collection == null) {
            this.retainedTopics = null;
        } else {
            this.retainedTopics = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRetainedTopics() != null) {
            sb.append("retainedTopics: " + getRetainedTopics() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListRetainedMessagesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListRetainedMessagesResult withRetainedTopics(RetainedMessageSummary... retainedMessageSummaryArr) {
        if (getRetainedTopics() == null) {
            this.retainedTopics = new ArrayList(retainedMessageSummaryArr.length);
        }
        for (RetainedMessageSummary retainedMessageSummary : retainedMessageSummaryArr) {
            this.retainedTopics.add(retainedMessageSummary);
        }
        return this;
    }

    public ListRetainedMessagesResult withRetainedTopics(Collection<RetainedMessageSummary> collection) {
        setRetainedTopics(collection);
        return this;
    }
}
