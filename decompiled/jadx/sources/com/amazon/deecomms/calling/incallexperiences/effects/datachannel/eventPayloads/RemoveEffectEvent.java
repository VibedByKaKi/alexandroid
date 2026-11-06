package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.eventPayloads;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class RemoveEffectEvent {
    private String effectId;
    private String effectsSessionId;
    private String requestId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String effectId;
        private String effectsSessionId;
        private String requestId;

        public RemoveEffectEvent build() {
            return new RemoveEffectEvent(this.requestId, this.effectsSessionId, this.effectId, 0);
        }

        public Builder effectId(String str) {
            this.effectId = str;
            return this;
        }

        public Builder effectsSessionId(String str) {
            this.effectsSessionId = str;
            return this;
        }

        public Builder requestId(String str) {
            this.requestId = str;
            return this;
        }
    }

    private RemoveEffectEvent(String str, String str2, String str3) {
        this.requestId = str;
        this.effectsSessionId = str2;
        this.effectId = str3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getEffectId() {
        return this.effectId;
    }

    public String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public /* synthetic */ RemoveEffectEvent(String str, String str2, String str3, int i) {
        this(str, str2, str3);
    }
}
