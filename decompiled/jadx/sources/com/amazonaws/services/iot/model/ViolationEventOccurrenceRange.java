package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ViolationEventOccurrenceRange implements Serializable {
    private Date endTime;
    private Date startTime;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ViolationEventOccurrenceRange)) {
            return false;
        }
        ViolationEventOccurrenceRange violationEventOccurrenceRange = (ViolationEventOccurrenceRange) obj;
        if ((violationEventOccurrenceRange.getStartTime() == null) ^ (getStartTime() == null)) {
            return false;
        }
        if (violationEventOccurrenceRange.getStartTime() != null && !violationEventOccurrenceRange.getStartTime().equals(getStartTime())) {
            return false;
        }
        if ((violationEventOccurrenceRange.getEndTime() == null) ^ (getEndTime() == null)) {
            return false;
        }
        return violationEventOccurrenceRange.getEndTime() == null || violationEventOccurrenceRange.getEndTime().equals(getEndTime());
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((getStartTime() == null ? 0 : getStartTime().hashCode()) + 31) * 31) + (getEndTime() != null ? getEndTime().hashCode() : 0);
    }

    public void setEndTime(Date date) {
        this.endTime = date;
    }

    public void setStartTime(Date date) {
        this.startTime = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStartTime() != null) {
            sb.append("startTime: " + getStartTime() + ",");
        }
        if (getEndTime() != null) {
            sb.append("endTime: " + getEndTime());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ViolationEventOccurrenceRange withEndTime(Date date) {
        this.endTime = date;
        return this;
    }

    public ViolationEventOccurrenceRange withStartTime(Date date) {
        this.startTime = date;
        return this;
    }
}
