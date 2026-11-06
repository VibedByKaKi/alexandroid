package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AdminListUserAuthEventsResult implements Serializable {
    private List<AuthEventType> authEvents;
    private String nextToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AdminListUserAuthEventsResult)) {
            return false;
        }
        AdminListUserAuthEventsResult adminListUserAuthEventsResult = (AdminListUserAuthEventsResult) obj;
        if ((adminListUserAuthEventsResult.getAuthEvents() == null) ^ (getAuthEvents() == null)) {
            return false;
        }
        if (adminListUserAuthEventsResult.getAuthEvents() != null && !adminListUserAuthEventsResult.getAuthEvents().equals(getAuthEvents())) {
            return false;
        }
        if ((adminListUserAuthEventsResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return adminListUserAuthEventsResult.getNextToken() == null || adminListUserAuthEventsResult.getNextToken().equals(getNextToken());
    }

    public List<AuthEventType> getAuthEvents() {
        return this.authEvents;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (((getAuthEvents() == null ? 0 : getAuthEvents().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setAuthEvents(Collection<AuthEventType> collection) {
        if (collection == null) {
            this.authEvents = null;
        } else {
            this.authEvents = new ArrayList(collection);
        }
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAuthEvents() != null) {
            sb.append("AuthEvents: " + getAuthEvents() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AdminListUserAuthEventsResult withAuthEvents(AuthEventType... authEventTypeArr) {
        if (getAuthEvents() == null) {
            this.authEvents = new ArrayList(authEventTypeArr.length);
        }
        for (AuthEventType authEventType : authEventTypeArr) {
            this.authEvents.add(authEventType);
        }
        return this;
    }

    public AdminListUserAuthEventsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public AdminListUserAuthEventsResult withAuthEvents(Collection<AuthEventType> collection) {
        setAuthEvents(collection);
        return this;
    }
}
