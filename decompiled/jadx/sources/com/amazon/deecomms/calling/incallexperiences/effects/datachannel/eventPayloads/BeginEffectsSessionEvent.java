package com.amazon.deecomms.calling.incallexperiences.effects.datachannel.eventPayloads;

import androidx.annotation.VisibleForTesting;
import com.amazon.deecomms.calling.incallexperiences.effects.datachannel.model.EffectCategory;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BeginEffectsSessionEvent {
    private List<String> activeEffects;
    private List<EffectCategory> availableEffects;
    private String effectsSessionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private List<String> activeEffects;
        private List<EffectCategory> availableEffects;
        private String effectsSessionId;

        public Builder activeEffects(List<String> list) {
            this.activeEffects = list;
            return this;
        }

        public Builder availableEffects(List<EffectCategory> list) {
            this.availableEffects = list;
            return this;
        }

        public BeginEffectsSessionEvent build() {
            return new BeginEffectsSessionEvent(this.effectsSessionId, this.activeEffects, this.availableEffects);
        }

        public Builder effectsSessionId(String str) {
            this.effectsSessionId = str;
            return this;
        }
    }

    @VisibleForTesting
    public BeginEffectsSessionEvent(String str, List<String> list, List<EffectCategory> list2) {
        this.effectsSessionId = str;
        this.activeEffects = list;
        this.availableEffects = list2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BeginEffectsSessionEvent beginEffectsSessionEvent = (BeginEffectsSessionEvent) obj;
            if (this.effectsSessionId.equals(beginEffectsSessionEvent.effectsSessionId) && this.activeEffects.equals(beginEffectsSessionEvent.activeEffects) && this.availableEffects.equals(beginEffectsSessionEvent.availableEffects)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getActiveEffects() {
        return this.activeEffects;
    }

    public List<EffectCategory> getAvailableEffects() {
        return this.availableEffects;
    }

    public String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    public int hashCode() {
        return Objects.hash(this.effectsSessionId, this.activeEffects, this.availableEffects);
    }

    public void setActiveEffects(List<String> list) {
        this.activeEffects = list;
    }

    public void setAvailableEffects(List<EffectCategory> list) {
        this.availableEffects = list;
    }

    public void setEffectsSessionId(String str) {
        this.effectsSessionId = str;
    }
}
