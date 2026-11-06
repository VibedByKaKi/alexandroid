package com.amazonaws.services.logs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeDestinationsResult implements Serializable {
    private List<Destination> destinations;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeDestinationsResult)) {
            return false;
        }
        DescribeDestinationsResult describeDestinationsResult = (DescribeDestinationsResult) obj;
        if ((describeDestinationsResult.getDestinations() == null) ^ (getDestinations() == null)) {
            return false;
        }
        if (describeDestinationsResult.getDestinations() != null && !describeDestinationsResult.getDestinations().equals(getDestinations())) {
            return false;
        }
        if ((describeDestinationsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return describeDestinationsResult.getNextToken() == null || describeDestinationsResult.getNextToken().equals(getNextToken());
    }

    public List<Destination> getDestinations() {
        return this.destinations;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getDestinations() == null ? 0 : getDestinations().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setDestinations(Collection<Destination> collection) {
        if (collection == null) {
            this.destinations = null;
        } else {
            this.destinations = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestinations() != null) {
            sb.append("destinations: " + getDestinations() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeDestinationsResult withDestinations(Destination... destinationArr) {
        if (getDestinations() == null) {
            this.destinations = new ArrayList(destinationArr.length);
        }
        for (Destination destination : destinationArr) {
            this.destinations.add(destination);
        }
        return this;
    }

    public DescribeDestinationsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public DescribeDestinationsResult withDestinations(Collection<Destination> collection) {
        setDestinations(collection);
        return this;
    }
}
