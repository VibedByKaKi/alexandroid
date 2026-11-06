package com.amazon.alexa.handsfree.latencyreporter.db;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum LatencyDbMetricType {
    DATABASE_CREATION("DatabaseCreation"),
    DATABASE_UPDATE("DatabaseUpdate"),
    FAILED_DATA_DELETE("LATENCY_DATA_DELETE_FAILURE"),
    FAILED_DATA_UPDATE("LATENCY_DATA_INSERT_FAILURE_UPDATED_ROW_NOT_ONE"),
    FAILED_DATA_INSERT("LATENCY_DATA_INSERT_INSERTED_ID_NEGATIVE"),
    NON_FATAL_FAIL_INSERT_TIMESTAMP("insertTimestamp"),
    NON_FATAL_FAIL_QUERY_REMOVE("queryAndRemovePairedTimestamp"),
    NON_FATAL_FAIL_REMOVE_EXPIRED_TIMESTAMP("removeExpiredTimestamp"),
    NON_FATAL_FAIL_INSERT_ROW("insertRow"),
    NON_FATAL_FAIL_UPDATE_ROW("updateRow"),
    NON_FATAL_FAIL_QUERY_MATCHER("queryMatchedCursor"),
    NON_FATAL_FAIL_QUERY_ASCENDING_TIMESTAMP("queryAscendingTimestampCursor"),
    NON_FATAL_FAIL_REMOVING_ROW("removeRow");

    private final String mValue;

    LatencyDbMetricType(@NonNull String str) {
        this.mValue = str;
    }

    @NonNull
    public String getValue() {
        return this.mValue;
    }
}
