package com.amazon.minerva.client.common.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum MinervaVersion {
    BASE(5),
    ADDITIONAL_PREDEFINEDS_SET_1(7),
    AGGREGATION(8),
    RECORD_CALLBACK(9),
    RECORD_CALLBACK_MGID_AND_SCHEMA(10),
    LOW_PRIORITY_METRIC_OPTION(11);

    private int mVersionNumber;

    MinervaVersion(int i) {
        this.mVersionNumber = i;
    }

    public int getVersionNumber() {
        return this.mVersionNumber;
    }
}
