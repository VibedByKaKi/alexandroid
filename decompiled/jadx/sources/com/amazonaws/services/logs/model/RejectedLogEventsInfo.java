package com.amazonaws.services.logs.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RejectedLogEventsInfo implements Serializable {
    private Integer expiredLogEventEndIndex;
    private Integer tooNewLogEventStartIndex;
    private Integer tooOldLogEventEndIndex;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RejectedLogEventsInfo)) {
            return false;
        }
        RejectedLogEventsInfo rejectedLogEventsInfo = (RejectedLogEventsInfo) obj;
        if ((rejectedLogEventsInfo.getTooNewLogEventStartIndex() == null) ^ (getTooNewLogEventStartIndex() == null)) {
            return false;
        }
        if (rejectedLogEventsInfo.getTooNewLogEventStartIndex() != null && !rejectedLogEventsInfo.getTooNewLogEventStartIndex().equals(getTooNewLogEventStartIndex())) {
            return false;
        }
        if ((rejectedLogEventsInfo.getTooOldLogEventEndIndex() == null) ^ (getTooOldLogEventEndIndex() == null)) {
            return false;
        }
        if (rejectedLogEventsInfo.getTooOldLogEventEndIndex() != null && !rejectedLogEventsInfo.getTooOldLogEventEndIndex().equals(getTooOldLogEventEndIndex())) {
            return false;
        }
        if ((rejectedLogEventsInfo.getExpiredLogEventEndIndex() == null) ^ (getExpiredLogEventEndIndex() == null)) {
            return false;
        }
        return rejectedLogEventsInfo.getExpiredLogEventEndIndex() == null || rejectedLogEventsInfo.getExpiredLogEventEndIndex().equals(getExpiredLogEventEndIndex());
    }

    public Integer getExpiredLogEventEndIndex() {
        return this.expiredLogEventEndIndex;
    }

    public Integer getTooNewLogEventStartIndex() {
        return this.tooNewLogEventStartIndex;
    }

    public Integer getTooOldLogEventEndIndex() {
        return this.tooOldLogEventEndIndex;
    }

    public int hashCode() {
        return (((((getTooNewLogEventStartIndex() == null ? 0 : getTooNewLogEventStartIndex().hashCode()) + 31) * 31) + (getTooOldLogEventEndIndex() == null ? 0 : getTooOldLogEventEndIndex().hashCode())) * 31) + (getExpiredLogEventEndIndex() != null ? getExpiredLogEventEndIndex().hashCode() : 0);
    }

    public void setExpiredLogEventEndIndex(Integer num) {
        this.expiredLogEventEndIndex = num;
    }

    public void setTooNewLogEventStartIndex(Integer num) {
        this.tooNewLogEventStartIndex = num;
    }

    public void setTooOldLogEventEndIndex(Integer num) {
        this.tooOldLogEventEndIndex = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTooNewLogEventStartIndex() != null) {
            sb.append("tooNewLogEventStartIndex: " + getTooNewLogEventStartIndex() + ",");
        }
        if (getTooOldLogEventEndIndex() != null) {
            sb.append("tooOldLogEventEndIndex: " + getTooOldLogEventEndIndex() + ",");
        }
        if (getExpiredLogEventEndIndex() != null) {
            sb.append("expiredLogEventEndIndex: " + getExpiredLogEventEndIndex());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RejectedLogEventsInfo withExpiredLogEventEndIndex(Integer num) {
        this.expiredLogEventEndIndex = num;
        return this;
    }

    public RejectedLogEventsInfo withTooNewLogEventStartIndex(Integer num) {
        this.tooNewLogEventStartIndex = num;
        return this;
    }

    public RejectedLogEventsInfo withTooOldLogEventEndIndex(Integer num) {
        this.tooOldLogEventEndIndex = num;
        return this;
    }
}
