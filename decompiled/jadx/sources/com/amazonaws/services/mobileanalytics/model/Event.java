package com.amazonaws.services.mobileanalytics.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class Event implements Serializable {
    private Map<String, String> attributes;
    private String eventType;
    private Map<String, Double> metrics;
    private Session session;
    private String timestamp;
    private String version;

    public Event addattributesEntry(String str, String str2) {
        if (this.attributes == null) {
            this.attributes = new HashMap();
        }
        if (this.attributes.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.attributes.put(str, str2);
        return this;
    }

    public Event addmetricsEntry(String str, Double d) {
        if (this.metrics == null) {
            this.metrics = new HashMap();
        }
        if (this.metrics.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.metrics.put(str, d);
        return this;
    }

    public Event clearattributesEntries() {
        this.attributes = null;
        return this;
    }

    public Event clearmetricsEntries() {
        this.metrics = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if ((event.getEventType() == null) ^ (getEventType() == null)) {
            return false;
        }
        if (event.getEventType() != null && !event.getEventType().equals(getEventType())) {
            return false;
        }
        if ((event.getTimestamp() == null) ^ (getTimestamp() == null)) {
            return false;
        }
        if (event.getTimestamp() != null && !event.getTimestamp().equals(getTimestamp())) {
            return false;
        }
        if ((event.getSession() == null) ^ (getSession() == null)) {
            return false;
        }
        if (event.getSession() != null && !event.getSession().equals(getSession())) {
            return false;
        }
        if ((event.getVersion() == null) ^ (getVersion() == null)) {
            return false;
        }
        if (event.getVersion() != null && !event.getVersion().equals(getVersion())) {
            return false;
        }
        if ((event.getAttributes() == null) ^ (getAttributes() == null)) {
            return false;
        }
        if (event.getAttributes() != null && !event.getAttributes().equals(getAttributes())) {
            return false;
        }
        if ((event.getMetrics() == null) ^ (getMetrics() == null)) {
            return false;
        }
        return event.getMetrics() == null || event.getMetrics().equals(getMetrics());
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public String getEventType() {
        return this.eventType;
    }

    public Map<String, Double> getMetrics() {
        return this.metrics;
    }

    public Session getSession() {
        return this.session;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((getEventType() == null ? 0 : getEventType().hashCode()) + 31) * 31) + (getTimestamp() == null ? 0 : getTimestamp().hashCode())) * 31) + (getSession() == null ? 0 : getSession().hashCode())) * 31) + (getVersion() == null ? 0 : getVersion().hashCode())) * 31) + (getAttributes() == null ? 0 : getAttributes().hashCode())) * 31) + (getMetrics() != null ? getMetrics().hashCode() : 0);
    }

    public void setAttributes(Map<String, String> map) {
        this.attributes = map;
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public void setMetrics(Map<String, Double> map) {
        this.metrics = map;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEventType() != null) {
            sb.append("eventType: " + getEventType() + ",");
        }
        if (getTimestamp() != null) {
            sb.append("timestamp: " + getTimestamp() + ",");
        }
        if (getSession() != null) {
            sb.append("session: " + getSession() + ",");
        }
        if (getVersion() != null) {
            sb.append("version: " + getVersion() + ",");
        }
        if (getAttributes() != null) {
            sb.append("attributes: " + getAttributes() + ",");
        }
        if (getMetrics() != null) {
            sb.append("metrics: " + getMetrics());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Event withAttributes(Map<String, String> map) {
        this.attributes = map;
        return this;
    }

    public Event withEventType(String str) {
        this.eventType = str;
        return this;
    }

    public Event withMetrics(Map<String, Double> map) {
        this.metrics = map;
        return this;
    }

    public Event withSession(Session session) {
        this.session = session;
        return this;
    }

    public Event withTimestamp(String str) {
        this.timestamp = str;
        return this;
    }

    public Event withVersion(String str) {
        this.version = str;
        return this;
    }
}
