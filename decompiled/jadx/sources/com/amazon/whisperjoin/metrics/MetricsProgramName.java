package com.amazon.whisperjoin.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum MetricsProgramName {
    WJv2Provisionable("WJv2Provisionable"),
    WJv2Provisioner("WJv2Provisioner"),
    WJv2ProvisionableGroupId("ymg8cp30"),
    WJv2ProvisionerGroupId("3wb0tumf");

    private final String mProgramName;

    MetricsProgramName(String str) {
        this.mProgramName = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mProgramName;
    }
}
