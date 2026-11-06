package com.amazon.clouddrive.android.core.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class LogsCollectionEntry<TValue> {
    private static final String LOGS_KEY_SEPARATOR = "###########################";
    private static final String NEW_LINE = "\n";
    private final LogsCollectionType logsCollectionType;
    private final TValue logsValue;

    public LogsCollectionEntry(LogsCollectionType logsCollectionType, TValue tvalue) {
        this.logsCollectionType = logsCollectionType;
        this.logsValue = tvalue;
    }

    public LogsCollectionType getLogsCollectionType() {
        return this.logsCollectionType;
    }

    @VisibleForTesting
    public TValue getLogsValue() {
        return this.logsValue;
    }

    @NonNull
    public String toString() {
        return "\n###########################\n" + this.logsCollectionType.toString() + "\n###########################\n" + this.logsValue.toString();
    }
}
