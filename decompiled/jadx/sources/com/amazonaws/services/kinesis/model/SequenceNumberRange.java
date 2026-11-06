package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SequenceNumberRange implements Serializable {
    private String endingSequenceNumber;
    private String startingSequenceNumber;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SequenceNumberRange)) {
            return false;
        }
        SequenceNumberRange sequenceNumberRange = (SequenceNumberRange) obj;
        if ((sequenceNumberRange.getStartingSequenceNumber() == null) ^ (getStartingSequenceNumber() == null)) {
            return false;
        }
        if (sequenceNumberRange.getStartingSequenceNumber() != null && !sequenceNumberRange.getStartingSequenceNumber().equals(getStartingSequenceNumber())) {
            return false;
        }
        if ((sequenceNumberRange.getEndingSequenceNumber() == null) ^ (getEndingSequenceNumber() == null)) {
            return false;
        }
        return sequenceNumberRange.getEndingSequenceNumber() == null || sequenceNumberRange.getEndingSequenceNumber().equals(getEndingSequenceNumber());
    }

    public String getEndingSequenceNumber() {
        return this.endingSequenceNumber;
    }

    public String getStartingSequenceNumber() {
        return this.startingSequenceNumber;
    }

    public int hashCode() {
        return (((getStartingSequenceNumber() == null ? 0 : getStartingSequenceNumber().hashCode()) + 31) * 31) + (getEndingSequenceNumber() != null ? getEndingSequenceNumber().hashCode() : 0);
    }

    public void setEndingSequenceNumber(String str) {
        this.endingSequenceNumber = str;
    }

    public void setStartingSequenceNumber(String str) {
        this.startingSequenceNumber = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStartingSequenceNumber() != null) {
            sb.append("StartingSequenceNumber: " + getStartingSequenceNumber() + ",");
        }
        if (getEndingSequenceNumber() != null) {
            sb.append("EndingSequenceNumber: " + getEndingSequenceNumber());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public SequenceNumberRange withEndingSequenceNumber(String str) {
        this.endingSequenceNumber = str;
        return this;
    }

    public SequenceNumberRange withStartingSequenceNumber(String str) {
        this.startingSequenceNumber = str;
        return this;
    }
}
