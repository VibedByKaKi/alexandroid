package com.amazonaws.services.logs.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricFilterMatchRecord implements Serializable {
    private String eventMessage;
    private Long eventNumber;
    private Map<String, String> extractedValues;

    public MetricFilterMatchRecord addextractedValuesEntry(String str, String str2) {
        if (this.extractedValues == null) {
            this.extractedValues = new HashMap();
        }
        if (this.extractedValues.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.extractedValues.put(str, str2);
        return this;
    }

    public MetricFilterMatchRecord clearextractedValuesEntries() {
        this.extractedValues = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MetricFilterMatchRecord)) {
            return false;
        }
        MetricFilterMatchRecord metricFilterMatchRecord = (MetricFilterMatchRecord) obj;
        if ((metricFilterMatchRecord.getEventNumber() == null) ^ (getEventNumber() == null)) {
            return false;
        }
        if (metricFilterMatchRecord.getEventNumber() != null && !metricFilterMatchRecord.getEventNumber().equals(getEventNumber())) {
            return false;
        }
        if ((metricFilterMatchRecord.getEventMessage() == null) ^ (getEventMessage() == null)) {
            return false;
        }
        if (metricFilterMatchRecord.getEventMessage() != null && !metricFilterMatchRecord.getEventMessage().equals(getEventMessage())) {
            return false;
        }
        if ((metricFilterMatchRecord.getExtractedValues() == null) ^ (getExtractedValues() == null)) {
            return false;
        }
        return metricFilterMatchRecord.getExtractedValues() == null || metricFilterMatchRecord.getExtractedValues().equals(getExtractedValues());
    }

    public String getEventMessage() {
        return this.eventMessage;
    }

    public Long getEventNumber() {
        return this.eventNumber;
    }

    public Map<String, String> getExtractedValues() {
        return this.extractedValues;
    }

    public int hashCode() {
        return (((((getEventNumber() == null ? 0 : getEventNumber().hashCode()) + 31) * 31) + (getEventMessage() == null ? 0 : getEventMessage().hashCode())) * 31) + (getExtractedValues() != null ? getExtractedValues().hashCode() : 0);
    }

    public void setEventMessage(String str) {
        this.eventMessage = str;
    }

    public void setEventNumber(Long l) {
        this.eventNumber = l;
    }

    public void setExtractedValues(Map<String, String> map) {
        this.extractedValues = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getEventNumber() != null) {
            sb.append("eventNumber: " + getEventNumber() + ",");
        }
        if (getEventMessage() != null) {
            sb.append("eventMessage: " + getEventMessage() + ",");
        }
        if (getExtractedValues() != null) {
            sb.append("extractedValues: " + getExtractedValues());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MetricFilterMatchRecord withEventMessage(String str) {
        this.eventMessage = str;
        return this;
    }

    public MetricFilterMatchRecord withEventNumber(Long l) {
        this.eventNumber = l;
        return this;
    }

    public MetricFilterMatchRecord withExtractedValues(Map<String, String> map) {
        this.extractedValues = map;
        return this;
    }
}
