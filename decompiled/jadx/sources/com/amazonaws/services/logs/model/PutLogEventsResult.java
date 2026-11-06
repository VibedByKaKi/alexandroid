package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class PutLogEventsResult implements Serializable {
    private String nextSequenceToken;
    private RejectedLogEventsInfo rejectedLogEventsInfo;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutLogEventsResult)) {
            return false;
        }
        PutLogEventsResult putLogEventsResult = (PutLogEventsResult) obj;
        if ((putLogEventsResult.getNextSequenceToken() == null) ^ (getNextSequenceToken() == null)) {
            return false;
        }
        if (putLogEventsResult.getNextSequenceToken() != null && !putLogEventsResult.getNextSequenceToken().equals(getNextSequenceToken())) {
            return false;
        }
        if ((putLogEventsResult.getRejectedLogEventsInfo() == null) ^ (getRejectedLogEventsInfo() == null)) {
            return false;
        }
        return putLogEventsResult.getRejectedLogEventsInfo() == null || putLogEventsResult.getRejectedLogEventsInfo().equals(getRejectedLogEventsInfo());
    }

    public String getNextSequenceToken() {
        return this.nextSequenceToken;
    }

    public RejectedLogEventsInfo getRejectedLogEventsInfo() {
        return this.rejectedLogEventsInfo;
    }

    public int hashCode() {
        return (((getNextSequenceToken() == null ? 0 : getNextSequenceToken().hashCode()) + 31) * 31) + (getRejectedLogEventsInfo() != null ? getRejectedLogEventsInfo().hashCode() : 0);
    }

    public void setNextSequenceToken(String str) {
        this.nextSequenceToken = str;
    }

    public void setRejectedLogEventsInfo(RejectedLogEventsInfo rejectedLogEventsInfo) {
        this.rejectedLogEventsInfo = rejectedLogEventsInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getNextSequenceToken() != null) {
            sb.append("nextSequenceToken: " + getNextSequenceToken() + ",");
        }
        if (getRejectedLogEventsInfo() != null) {
            sb.append("rejectedLogEventsInfo: " + getRejectedLogEventsInfo());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public PutLogEventsResult withNextSequenceToken(String str) {
        this.nextSequenceToken = str;
        return this;
    }

    public PutLogEventsResult withRejectedLogEventsInfo(RejectedLogEventsInfo rejectedLogEventsInfo) {
        this.rejectedLogEventsInfo = rejectedLogEventsInfo;
        return this;
    }
}
