package com.amazon.alexa.client.core.componentstate;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ComponentState extends ComponentState {
    private final ComponentStateHeader header;
    private final ComponentStatePayload payload;

    public AutoValue_ComponentState(ComponentStateHeader componentStateHeader, ComponentStatePayload componentStatePayload) {
        if (componentStateHeader == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null header");
            throw null;
        }
        this.header = componentStateHeader;
        if (componentStatePayload != null) {
            this.payload = componentStatePayload;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null payload");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComponentState) {
            ComponentState componentState = (ComponentState) obj;
            if (this.header.equals(componentState.getHeader()) && this.payload.equals(componentState.getPayload())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentState
    public ComponentStateHeader getHeader() {
        return this.header;
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentState
    public ComponentStatePayload getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode() ^ ((this.header.hashCode() ^ 1000003) * 1000003);
    }
}
