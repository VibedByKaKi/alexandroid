package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTopicRuleDestinationsResult implements Serializable {
    private List<TopicRuleDestinationSummary> destinationSummaries;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTopicRuleDestinationsResult)) {
            return false;
        }
        ListTopicRuleDestinationsResult listTopicRuleDestinationsResult = (ListTopicRuleDestinationsResult) obj;
        if ((listTopicRuleDestinationsResult.getDestinationSummaries() == null) ^ (getDestinationSummaries() == null)) {
            return false;
        }
        if (listTopicRuleDestinationsResult.getDestinationSummaries() != null && !listTopicRuleDestinationsResult.getDestinationSummaries().equals(getDestinationSummaries())) {
            return false;
        }
        if ((listTopicRuleDestinationsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listTopicRuleDestinationsResult.getNextToken() == null || listTopicRuleDestinationsResult.getNextToken().equals(getNextToken());
    }

    public List<TopicRuleDestinationSummary> getDestinationSummaries() {
        return this.destinationSummaries;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getDestinationSummaries() == null ? 0 : getDestinationSummaries().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setDestinationSummaries(Collection<TopicRuleDestinationSummary> collection) {
        if (collection == null) {
            this.destinationSummaries = null;
        } else {
            this.destinationSummaries = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestinationSummaries() != null) {
            sb.append("destinationSummaries: " + getDestinationSummaries() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTopicRuleDestinationsResult withDestinationSummaries(TopicRuleDestinationSummary... topicRuleDestinationSummaryArr) {
        if (getDestinationSummaries() == null) {
            this.destinationSummaries = new ArrayList(topicRuleDestinationSummaryArr.length);
        }
        for (TopicRuleDestinationSummary topicRuleDestinationSummary : topicRuleDestinationSummaryArr) {
            this.destinationSummaries.add(topicRuleDestinationSummary);
        }
        return this;
    }

    public ListTopicRuleDestinationsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListTopicRuleDestinationsResult withDestinationSummaries(Collection<TopicRuleDestinationSummary> collection) {
        setDestinationSummaries(collection);
        return this;
    }
}
