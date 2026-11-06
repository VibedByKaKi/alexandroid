package com.amazon.alexa.featureservice.remote.model.trigger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TriggerRecordResult {
    private String allocationId;
    private String name;
    private String namespace;
    private String recordStatus;
    private String treatment;
    private boolean triggerOnUse;

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

    public String getTreatment() {
        return this.treatment;
    }

    public boolean isTriggerOnUse() {
        return this.triggerOnUse;
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

    public void setTreatment(String str) {
        this.treatment = str;
    }

    public void setTriggerOnUse(boolean z) {
        this.triggerOnUse = z;
    }
}
