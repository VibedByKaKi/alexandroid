package com.amazonaws.services.logs.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetLogEventsResult implements Serializable {
    private List<OutputLogEvent> events;
    private String nextBackwardToken;
    private String nextForwardToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetLogEventsResult)) {
            return false;
        }
        GetLogEventsResult getLogEventsResult = (GetLogEventsResult) obj;
        if ((getLogEventsResult.getEvents() == null) ^ (getEvents() == null)) {
            return false;
        }
        if (getLogEventsResult.getEvents() != null && !getLogEventsResult.getEvents().equals(getEvents())) {
            return false;
        }
        if ((getLogEventsResult.getNextForwardToken() == null) ^ (getNextForwardToken() == null)) {
            return false;
        }
        if (getLogEventsResult.getNextForwardToken() != null && !getLogEventsResult.getNextForwardToken().equals(getNextForwardToken())) {
            return false;
        }
        if ((getLogEventsResult.getNextBackwardToken() == null) ^ (getNextBackwardToken() == null)) {
            return false;
        }
        return getLogEventsResult.getNextBackwardToken() == null || getLogEventsResult.getNextBackwardToken().equals(getNextBackwardToken());
    }

    public List<OutputLogEvent> getEvents() {
        return this.events;
    }

    public String getNextBackwardToken() {
        return this.nextBackwardToken;
    }

    public String getNextForwardToken() {
        return this.nextForwardToken;
    }

    public int hashCode() {
        return (((((getEvents() == null ? 0 : getEvents().hashCode()) + 31) * 31) + (getNextForwardToken() == null ? 0 : getNextForwardToken().hashCode())) * 31) + (getNextBackwardToken() != null ? getNextBackwardToken().hashCode() : 0);
    }

    public void setEvents(Collection<OutputLogEvent> collection) {
        if (collection == null) {
            this.events = null;
        } else {
            this.events = new ArrayList(collection);
        }
    }

    public void setNextBackwardToken(String str) {
        this.nextBackwardToken = str;
    }

    public void setNextForwardToken(String str) {
        this.nextForwardToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEvents() != null) {
            sb.append("events: " + getEvents() + ",");
        }
        if (getNextForwardToken() != null) {
            sb.append("nextForwardToken: " + getNextForwardToken() + ",");
        }
        if (getNextBackwardToken() != null) {
            sb.append("nextBackwardToken: " + getNextBackwardToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public GetLogEventsResult withEvents(OutputLogEvent... outputLogEventArr) {
        if (getEvents() == null) {
            this.events = new ArrayList(outputLogEventArr.length);
        }
        for (OutputLogEvent outputLogEvent : outputLogEventArr) {
            this.events.add(outputLogEvent);
        }
        return this;
    }

    public GetLogEventsResult withNextBackwardToken(String str) {
        this.nextBackwardToken = str;
        return this;
    }

    public GetLogEventsResult withNextForwardToken(String str) {
        this.nextForwardToken = str;
        return this;
    }

    public GetLogEventsResult withEvents(Collection<OutputLogEvent> collection) {
        setEvents(collection);
        return this;
    }
}
