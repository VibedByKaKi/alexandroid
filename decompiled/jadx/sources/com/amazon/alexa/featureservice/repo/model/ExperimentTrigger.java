package com.amazon.alexa.featureservice.repo.model;

import androidx.annotation.NonNull;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExperimentTrigger {
    private String allocationId;
    private String featureName;
    private String namespace;
    private String recordStatus;
    private Long timeUsed;
    private String treatment;
    private String treatmentUsed;

    public ExperimentTrigger(String str, String str2, String str3, String str4) {
        this.namespace = str;
        this.featureName = str2;
        this.allocationId = str3;
        this.treatmentUsed = str4;
        this.timeUsed = Long.valueOf(System.currentTimeMillis());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExperimentTrigger) {
            ExperimentTrigger experimentTrigger = (ExperimentTrigger) obj;
            if (Objects.equals(this.timeUsed, experimentTrigger.timeUsed) && Objects.equals(this.namespace, experimentTrigger.namespace) && Objects.equals(this.featureName, experimentTrigger.featureName) && Objects.equals(this.allocationId, experimentTrigger.allocationId) && Objects.equals(this.treatmentUsed, experimentTrigger.treatmentUsed) && Objects.equals(this.recordStatus, experimentTrigger.recordStatus) && Objects.equals(this.treatment, experimentTrigger.treatment)) {
                return true;
            }
        }
        return false;
    }

    public String getAllocationId() {
        return this.allocationId;
    }

    public String getFeatureName() {
        return this.featureName;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getRecordStatus() {
        return this.recordStatus;
    }

    public long getTimeUsed() {
        return this.timeUsed.longValue();
    }

    public String getTreatment() {
        return this.treatment;
    }

    public String getTreatmentUsed() {
        return this.treatmentUsed;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public void setAllocationId(String str) {
        this.allocationId = str;
    }

    public void setFeatureName(String str) {
        this.featureName = str;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public void setRecordStatus(String str) {
        this.recordStatus = str;
    }

    public void setTimeUsed(long j) {
        this.timeUsed = Long.valueOf(j);
    }

    public void setTreatment(String str) {
        this.treatment = str;
    }

    public void setTreatmentUsed(String str) {
        this.treatmentUsed = str;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTrigger{namespace='");
        sb.append(this.namespace);
        sb.append("'featureName='");
        sb.append(this.featureName);
        sb.append("', allocationId='");
        sb.append(this.allocationId);
        sb.append("', treatmentUsed='");
        sb.append(this.treatmentUsed);
        sb.append("', timeUsed=");
        sb.append(this.timeUsed);
        sb.append(", recordStatus='");
        sb.append(this.recordStatus);
        sb.append("', treatment='");
        return a$$ExternalSyntheticOutline0.m(sb, this.treatment, "'}");
    }

    public ExperimentTrigger() {
    }
}
