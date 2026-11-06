package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListViolationEventsResult implements Serializable {
    private String nextToken;
    private List<ViolationEvent> violationEvents;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListViolationEventsResult)) {
            return false;
        }
        ListViolationEventsResult listViolationEventsResult = (ListViolationEventsResult) obj;
        if ((listViolationEventsResult.getViolationEvents() == null) ^ (getViolationEvents() == null)) {
            return false;
        }
        if (listViolationEventsResult.getViolationEvents() != null && !listViolationEventsResult.getViolationEvents().equals(getViolationEvents())) {
            return false;
        }
        if ((listViolationEventsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listViolationEventsResult.getNextToken() == null || listViolationEventsResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<ViolationEvent> getViolationEvents() {
        return this.violationEvents;
    }

    public int hashCode() {
        return (((getViolationEvents() == null ? 0 : getViolationEvents().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setViolationEvents(Collection<ViolationEvent> collection) {
        if (collection == null) {
            this.violationEvents = null;
        } else {
            this.violationEvents = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getViolationEvents() != null) {
            sb.append("violationEvents: " + getViolationEvents() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListViolationEventsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListViolationEventsResult withViolationEvents(ViolationEvent... violationEventArr) {
        if (getViolationEvents() == null) {
            this.violationEvents = new ArrayList(violationEventArr.length);
        }
        for (ViolationEvent violationEvent : violationEventArr) {
            this.violationEvents.add(violationEvent);
        }
        return this;
    }

    public ListViolationEventsResult withViolationEvents(Collection<ViolationEvent> collection) {
        setViolationEvents(collection);
        return this;
    }
}
