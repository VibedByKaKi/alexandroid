package com.amazon.alexa.identity.p2a;

import androidx.annotation.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class P2ADetectionResult {
    public final Kind kind;
    public final String transitionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Kind {
        POSITIVE,
        POSITIVE_UNCONFIRMED,
        NO_TRANSITION,
        FETCH_ERROR
    }

    private P2ADetectionResult(@NonNull Kind kind, @NonNull String str) {
        this.kind = kind;
        this.transitionId = str;
    }

    @NonNull
    public static P2ADetectionResult fetchError() {
        return new P2ADetectionResult(Kind.FETCH_ERROR, "");
    }

    @NonNull
    public static P2ADetectionResult noTransition() {
        return new P2ADetectionResult(Kind.NO_TRANSITION, "");
    }

    @NonNull
    public static P2ADetectionResult positive(String str) {
        if (str != null && !str.isEmpty()) {
            return new P2ADetectionResult(Kind.POSITIVE, str);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("positive() requires a non-empty transitionId; use positiveUnconfirmed() instead");
        return null;
    }

    @NonNull
    public static P2ADetectionResult positiveUnconfirmed() {
        return new P2ADetectionResult(Kind.POSITIVE_UNCONFIRMED, "");
    }
}
