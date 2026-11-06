package com.amazon.alexa.client.alexaservice.base.componentstate.events;

import com.amazon.alexa.client.core.messages.Namespace;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalComponentStateProviderChangedEvent extends ExternalComponentStateProviderChangedEvent {
    private final Set<Namespace> namespaces;
    private final boolean present;

    public AutoValue_ExternalComponentStateProviderChangedEvent(Set<Namespace> set, boolean z) {
        if (set == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null namespaces");
            throw null;
        }
        this.namespaces = set;
        this.present = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalComponentStateProviderChangedEvent) {
            ExternalComponentStateProviderChangedEvent externalComponentStateProviderChangedEvent = (ExternalComponentStateProviderChangedEvent) obj;
            if (this.namespaces.equals(externalComponentStateProviderChangedEvent.getNamespaces()) && this.present == externalComponentStateProviderChangedEvent.isPresent()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStateProviderChangedEvent
    public Set<Namespace> getNamespaces() {
        return this.namespaces;
    }

    public int hashCode() {
        return (this.present ? 1231 : 1237) ^ ((this.namespaces.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStateProviderChangedEvent
    public boolean isPresent() {
        return this.present;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalComponentStateProviderChangedEvent{namespaces=");
        sb.append(this.namespaces);
        sb.append(", present=");
        return a$$ExternalSyntheticOutline0.m(sb, this.present, StringSubstitutor.DEFAULT_VAR_END);
    }
}
