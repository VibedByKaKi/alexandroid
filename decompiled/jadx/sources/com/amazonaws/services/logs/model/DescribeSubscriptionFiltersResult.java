package com.amazonaws.services.logs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeSubscriptionFiltersResult implements Serializable {
    private String nextToken;
    private List<SubscriptionFilter> subscriptionFilters;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeSubscriptionFiltersResult)) {
            return false;
        }
        DescribeSubscriptionFiltersResult describeSubscriptionFiltersResult = (DescribeSubscriptionFiltersResult) obj;
        if ((describeSubscriptionFiltersResult.getSubscriptionFilters() == null) ^ (getSubscriptionFilters() == null)) {
            return false;
        }
        if (describeSubscriptionFiltersResult.getSubscriptionFilters() != null && !describeSubscriptionFiltersResult.getSubscriptionFilters().equals(getSubscriptionFilters())) {
            return false;
        }
        if ((describeSubscriptionFiltersResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return describeSubscriptionFiltersResult.getNextToken() == null || describeSubscriptionFiltersResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<SubscriptionFilter> getSubscriptionFilters() {
        return this.subscriptionFilters;
    }

    public int hashCode() {
        return (((getSubscriptionFilters() == null ? 0 : getSubscriptionFilters().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setSubscriptionFilters(Collection<SubscriptionFilter> collection) {
        if (collection == null) {
            this.subscriptionFilters = null;
        } else {
            this.subscriptionFilters = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSubscriptionFilters() != null) {
            sb.append("subscriptionFilters: " + getSubscriptionFilters() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeSubscriptionFiltersResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeSubscriptionFiltersResult withSubscriptionFilters(SubscriptionFilter... subscriptionFilterArr) {
        if (getSubscriptionFilters() == null) {
            this.subscriptionFilters = new ArrayList(subscriptionFilterArr.length);
        }
        for (SubscriptionFilter subscriptionFilter : subscriptionFilterArr) {
            this.subscriptionFilters.add(subscriptionFilter);
        }
        return this;
    }

    public DescribeSubscriptionFiltersResult withSubscriptionFilters(Collection<SubscriptionFilter> collection) {
        setSubscriptionFilters(collection);
        return this;
    }
}
