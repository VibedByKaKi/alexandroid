package com.amazon.alexa.ttcf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class TTCFRecord {
    private final boolean isInitial;
    private final String name;
    private final long readyTime;
    private final List<TTCFTimedRoute> routings;

    private TTCFRecord(@NonNull String str, @NonNull List<? extends TTCFTimedRoute> list, long j, boolean z) {
        this.name = str;
        this.readyTime = j;
        this.routings = Collections.unmodifiableList(list);
        this.isInitial = z;
    }

    @Nullable
    public static TTCFRecord make(@NonNull String str, @NonNull List<? extends TTCFTimedRoute> list, long j, boolean z) {
        if (list.size() == 0) {
            return null;
        }
        return new TTCFRecord(str, list, j, z);
    }

    public String getName() {
        return this.name;
    }

    public long getReadyTime() {
        return this.readyTime;
    }

    @Nullable
    public Long getRoutingEndTime() {
        return ((TTCFTimedRoute) ErrorUtils$$ExternalSyntheticOutline0.m(this.routings, 1)).getEndTime();
    }

    @NonNull
    public List<TTCFTimedRoute> getRoutings() {
        return this.routings;
    }

    public long getStartTime() {
        return this.routings.get(0).getStartTime();
    }

    public boolean isInitial() {
        return this.isInitial;
    }
}
