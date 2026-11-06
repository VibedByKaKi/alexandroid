package com.amazon.latencyinfra;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LatencySnapshot {
    private final long duration;
    private final String name;
    private long timeFromLastSnapshot;
    private final long timeFromOrigin;

    public LatencySnapshot(String str, long j, long j2) {
        this.name = str;
        this.duration = j;
        this.timeFromOrigin = j2;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getName() {
        return this.name;
    }

    public long getTimeFromLastSnapshot() {
        return this.timeFromLastSnapshot;
    }

    public long getTimeFromOrigin() {
        return this.timeFromOrigin;
    }

    public void setTimeFromLastSnapshot(long j) {
        this.timeFromLastSnapshot = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LatencySnapshot{name='");
        sb.append(this.name);
        sb.append("', duration=");
        sb.append(this.duration);
        sb.append(", timeFromOrigin=");
        sb.append(this.timeFromOrigin);
        sb.append(", timeFromLastSnapshot=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.timeFromLastSnapshot, AbstractJsonLexerKt.END_OBJ);
    }
}
