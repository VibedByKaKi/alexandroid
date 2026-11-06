package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.eventPayloads;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class AckEvent {
    private String effectsSessionId;
    private String requestId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String effectsSessionId;
        private String requestId;

        public AckEvent build() {
            return new AckEvent(this.requestId, this.effectsSessionId, 0);
        }

        public Builder effectsSessionId(@NonNull String str) {
            this.effectsSessionId = str;
            return this;
        }

        public Builder requestId(@NonNull String str) {
            this.requestId = str;
            return this;
        }
    }

    private AckEvent(@NonNull String str, @NonNull String str2) {
        this.requestId = str;
        this.effectsSessionId = str2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public /* synthetic */ AckEvent(String str, String str2, int i) {
        this(str, str2);
    }
}
