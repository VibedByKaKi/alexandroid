package com.amazon.latencyinfra;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class LatencyNamespaceEvent {
    private String eventName;
    private String namespace;

    public LatencyNamespaceEvent(String str, String str2) {
        this.namespace = str;
        this.eventName = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LatencyNamespaceEvent latencyNamespaceEvent = (LatencyNamespaceEvent) obj;
            if (Objects.equals(this.namespace, latencyNamespaceEvent.namespace) && Objects.equals(this.eventName, latencyNamespaceEvent.eventName)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.namespace, this.eventName);
    }
}
