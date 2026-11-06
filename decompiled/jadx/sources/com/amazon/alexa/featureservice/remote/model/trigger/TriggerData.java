package com.amazon.alexa.featureservice.remote.model.trigger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TriggerData {
    private String allocationId;
    private String name;
    private String namespace;
    private String recordStatus;
    private Long timeUsed;
    private String treatment;
    private String treatmentUsed;
    private Boolean triggerOnUse;

    public String getAllocationId() {
        return this.allocationId;
    }

    public String getName() {
        return this.name;
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

    public boolean isTriggerOnUse() {
        return this.triggerOnUse.booleanValue();
    }

    public void setAllocationId(String str) {
        this.allocationId = str;
    }

    public void setName(String str) {
        this.name = str;
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

    public void setTriggerOnUse(boolean z) {
        this.triggerOnUse = Boolean.valueOf(z);
    }
}
