package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.base.capabilities.events.PublishCapabilityCacheEvent;
import org.apache.commons.text.StringSubstitutor;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PublishCapabilityCacheEvent extends PublishCapabilityCacheEvent {
    private final PublishCapabilityCacheEvent.CacheType cacheType;

    public AutoValue_PublishCapabilityCacheEvent(PublishCapabilityCacheEvent.CacheType cacheType) {
        if (cacheType != null) {
            this.cacheType = cacheType;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null cacheType");
            throw null;
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.base.capabilities.events.PublishCapabilityCacheEvent
    @NotNull
    public PublishCapabilityCacheEvent.CacheType cacheType() {
        return this.cacheType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PublishCapabilityCacheEvent) {
            return this.cacheType.equals(((PublishCapabilityCacheEvent) obj).cacheType());
        }
        return false;
    }

    public int hashCode() {
        return this.cacheType.hashCode() ^ 1000003;
    }

    public String toString() {
        return "PublishCapabilityCacheEvent{cacheType=" + this.cacheType + StringSubstitutor.DEFAULT_VAR_END;
    }
}
