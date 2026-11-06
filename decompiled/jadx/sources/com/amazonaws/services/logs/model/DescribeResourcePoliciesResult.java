package com.amazonaws.services.logs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeResourcePoliciesResult implements Serializable {
    private String nextToken;
    private List<ResourcePolicy> resourcePolicies;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeResourcePoliciesResult)) {
            return false;
        }
        DescribeResourcePoliciesResult describeResourcePoliciesResult = (DescribeResourcePoliciesResult) obj;
        if ((describeResourcePoliciesResult.getResourcePolicies() == null) ^ (getResourcePolicies() == null)) {
            return false;
        }
        if (describeResourcePoliciesResult.getResourcePolicies() != null && !describeResourcePoliciesResult.getResourcePolicies().equals(getResourcePolicies())) {
            return false;
        }
        if ((describeResourcePoliciesResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return describeResourcePoliciesResult.getNextToken() == null || describeResourcePoliciesResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<ResourcePolicy> getResourcePolicies() {
        return this.resourcePolicies;
    }

    public int hashCode() {
        return (((getResourcePolicies() == null ? 0 : getResourcePolicies().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setResourcePolicies(Collection<ResourcePolicy> collection) {
        if (collection == null) {
            this.resourcePolicies = null;
        } else {
            this.resourcePolicies = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getResourcePolicies() != null) {
            sb.append("resourcePolicies: " + getResourcePolicies() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeResourcePoliciesResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeResourcePoliciesResult withResourcePolicies(ResourcePolicy... resourcePolicyArr) {
        if (getResourcePolicies() == null) {
            this.resourcePolicies = new ArrayList(resourcePolicyArr.length);
        }
        for (ResourcePolicy resourcePolicy : resourcePolicyArr) {
            this.resourcePolicies.add(resourcePolicy);
        }
        return this;
    }

    public DescribeResourcePoliciesResult withResourcePolicies(Collection<ResourcePolicy> collection) {
        setResourcePolicies(collection);
        return this;
    }
}
