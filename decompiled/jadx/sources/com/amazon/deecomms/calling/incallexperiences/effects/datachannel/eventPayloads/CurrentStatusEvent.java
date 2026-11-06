package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.eventPayloads;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class CurrentStatusEvent {
    public static final String STATUS_FAILED = "FAILED";
    public static final String STATUS_SUCCESS = "SUCCESS";
    private List<String> activeEffects;
    private String effectsSessionId;
    private String message;
    private String requestId;
    private String status;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private List<String> activeEffects;
        private String effectsSessionId;
        private String message;
        private String requestId;
        private String status;

        public Builder activeEffects(@NonNull List<String> list) {
            this.activeEffects = list;
            return this;
        }

        public CurrentStatusEvent build() {
            return new CurrentStatusEvent(this.requestId, this.effectsSessionId, this.status, this.activeEffects, this.message, 0);
        }

        public Builder effectsSessionId(@NonNull String str) {
            this.effectsSessionId = str;
            return this;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder requestId(@NonNull String str) {
            this.requestId = str;
            return this;
        }

        public Builder status(@NonNull String str) {
            this.status = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Status {
        SUCCESS("SUCCESS"),
        FAILED("FAILED");

        private String value;

        Status(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.value;
        }
    }

    private CurrentStatusEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<String> list, String str4) {
        this.requestId = str;
        this.effectsSessionId = str2;
        this.status = str3;
        this.activeEffects = list;
        this.message = str4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getActiveEffects() {
        return this.activeEffects;
    }

    public String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    public String getMessage() {
        return this.message;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getStatus() {
        return this.status;
    }

    public /* synthetic */ CurrentStatusEvent(String str, String str2, String str3, List list, String str4, int i) {
        this(str, str2, str3, list, str4);
    }
}
