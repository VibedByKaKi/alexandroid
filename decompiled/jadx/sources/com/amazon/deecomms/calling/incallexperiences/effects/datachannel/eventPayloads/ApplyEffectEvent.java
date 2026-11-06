package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.eventPayloads;

import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.incallexperiences.effects.EffectParameter;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ApplyEffectEvent {
    private String effectId;
    private String effectsSessionId;
    private List<EffectParameter> parameters;
    private String requestId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String effectId;
        private String effectsSessionId;
        private List<EffectParameter> parameters;
        private String requestId;

        public ApplyEffectEvent build() {
            return new ApplyEffectEvent(this.requestId, this.effectsSessionId, this.effectId, this.parameters);
        }

        public Builder withEffectId(@NonNull String str) {
            this.effectId = str;
            return this;
        }

        public Builder withEffectsSessionId(@NonNull String str) {
            this.effectsSessionId = str;
            return this;
        }

        public Builder withParameters(@NonNull List<EffectParameter> list) {
            this.parameters = list;
            return this;
        }

        public Builder withRequestId(@NonNull String str) {
            this.requestId = str;
            return this;
        }
    }

    public ApplyEffectEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<EffectParameter> list) {
        this.requestId = str;
        this.effectsSessionId = str2;
        this.effectId = str3;
        this.parameters = list;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ApplyEffectEvent applyEffectEvent = (ApplyEffectEvent) obj;
            if (this.requestId.equals(applyEffectEvent.requestId) && this.effectsSessionId.equals(applyEffectEvent.effectsSessionId) && this.effectId.equals(applyEffectEvent.effectId) && Objects.equals(this.parameters, applyEffectEvent.parameters)) {
                return true;
            }
        }
        return false;
    }

    public String getEffectId() {
        return this.effectId;
    }

    public String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    public List<EffectParameter> getParameters() {
        return this.parameters;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return Objects.hash(this.requestId, this.effectsSessionId, this.effectId, this.parameters);
    }
}
