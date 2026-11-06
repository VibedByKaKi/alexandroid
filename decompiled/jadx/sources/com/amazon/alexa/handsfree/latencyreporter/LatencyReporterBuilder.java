package com.amazon.alexa.handsfree.latencyreporter;

import android.content.Context;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LatencyReporterBuilder {
    private final Context mContext;
    private final Set<LatencyTimestamp> mLatencyTimestampSet = new HashSet();

    public LatencyReporterBuilder(@NonNull Context context) {
        this.mContext = context;
    }

    public LatencyReporter build() {
        return new LatencyReporter(this.mContext, new ArrayList(this.mLatencyTimestampSet));
    }

    public int getRecorderCount() {
        return this.mLatencyTimestampSet.size();
    }

    public void reset() {
        this.mLatencyTimestampSet.clear();
    }

    public LatencyReporterBuilder withTimestamp(@NonNull Latency latency, @NonNull TimestampType timestampType, @Nullable String str, long j) {
        LatencyTimestamp latencyTimestamp = new LatencyTimestamp(latency, timestampType, str, j);
        this.mLatencyTimestampSet.remove(latencyTimestamp);
        this.mLatencyTimestampSet.add(latencyTimestamp);
        return this;
    }

    public LatencyReporterBuilder withTimestamp(@NonNull Latency latency, @NonNull TimestampType timestampType, long j) {
        return withTimestamp(latency, timestampType, null, j);
    }
}
