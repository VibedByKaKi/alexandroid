package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;
import java.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class ConversationLoadSourceHistory {
    private final long[] elapsedRealtimeMs;
    private final long revision;
    private final String[] sources;

    public ConversationLoadSourceHistory(@NonNull String[] strArr, @NonNull long[] jArr, long j) {
        if (strArr == null || jArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The provided transition arrays must not be null.");
            throw null;
        }
        if (Arrays.asList(strArr).contains(null)) {
            Single$$ExternalSyntheticBUOutline0.m$3("The provided sources must not contain null.");
            throw null;
        }
        if (strArr.length != jArr.length) {
            Single$$ExternalSyntheticBUOutline0.m$3("The provided transition arrays differ in length.");
            throw null;
        }
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("The provided revision is negative.");
            throw null;
        }
        this.sources = (String[]) Arrays.copyOf(strArr, strArr.length);
        this.elapsedRealtimeMs = Arrays.copyOf(jArr, jArr.length);
        this.revision = j;
    }

    @NonNull
    public long[] getElapsedRealtimeMs() {
        long[] jArr = this.elapsedRealtimeMs;
        return Arrays.copyOf(jArr, jArr.length);
    }

    public long getRevision() {
        return this.revision;
    }

    @NonNull
    public String[] getSources() {
        String[] strArr = this.sources;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }
}
