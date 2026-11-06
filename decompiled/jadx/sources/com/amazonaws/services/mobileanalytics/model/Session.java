package com.amazonaws.services.mobileanalytics.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class Session implements Serializable {
    private Long duration;
    private String id;
    private String startTimestamp;
    private String stopTimestamp;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        if ((session.getId() == null) ^ (getId() == null)) {
            return false;
        }
        if (session.getId() != null && !session.getId().equals(getId())) {
            return false;
        }
        if ((session.getDuration() == null) ^ (getDuration() == null)) {
            return false;
        }
        if (session.getDuration() != null && !session.getDuration().equals(getDuration())) {
            return false;
        }
        if ((session.getStartTimestamp() == null) ^ (getStartTimestamp() == null)) {
            return false;
        }
        if (session.getStartTimestamp() != null && !session.getStartTimestamp().equals(getStartTimestamp())) {
            return false;
        }
        if ((session.getStopTimestamp() == null) ^ (getStopTimestamp() == null)) {
            return false;
        }
        return session.getStopTimestamp() == null || session.getStopTimestamp().equals(getStopTimestamp());
    }

    public Long getDuration() {
        return this.duration;
    }

    public String getId() {
        return this.id;
    }

    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    public String getStopTimestamp() {
        return this.stopTimestamp;
    }

    public int hashCode() {
        return (((((((getId() == null ? 0 : getId().hashCode()) + 31) * 31) + (getDuration() == null ? 0 : getDuration().hashCode())) * 31) + (getStartTimestamp() == null ? 0 : getStartTimestamp().hashCode())) * 31) + (getStopTimestamp() != null ? getStopTimestamp().hashCode() : 0);
    }

    public void setDuration(Long l) {
        this.duration = l;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setStartTimestamp(String str) {
        this.startTimestamp = str;
    }

    public void setStopTimestamp(String str) {
        this.stopTimestamp = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getId() != null) {
            sb.append("id: " + getId() + ",");
        }
        if (getDuration() != null) {
            sb.append("duration: " + getDuration() + ",");
        }
        if (getStartTimestamp() != null) {
            sb.append("startTimestamp: " + getStartTimestamp() + ",");
        }
        if (getStopTimestamp() != null) {
            sb.append("stopTimestamp: " + getStopTimestamp());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Session withDuration(Long l) {
        this.duration = l;
        return this;
    }

    public Session withId(String str) {
        this.id = str;
        return this;
    }

    public Session withStartTimestamp(String str) {
        this.startTimestamp = str;
        return this;
    }

    public Session withStopTimestamp(String str) {
        this.stopTimestamp = str;
        return this;
    }
}
