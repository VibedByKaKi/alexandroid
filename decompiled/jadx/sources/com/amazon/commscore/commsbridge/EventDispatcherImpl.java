package com.amazon.commscore.commsbridge;

import androidx.annotation.NonNull;
import com.amazon.commscore.api.commsbridge.EventListener;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class EventDispatcherImpl implements EventDispatcher {
    private final EventRegistry mRegistry;

    public EventDispatcherImpl(@NonNull EventRegistry eventRegistry) {
        this.mRegistry = eventRegistry;
    }

    @Override // com.amazon.commscore.commsbridge.EventDispatcher
    public void dispatch(@NonNull EventMessage eventMessage) {
        String name = eventMessage.getName();
        String obj = eventMessage.getPayload() != null ? eventMessage.getPayload().toString() : null;
        Iterator<EventListener<String>> it2 = this.mRegistry.getEventListeners(name).iterator();
        while (it2.hasNext()) {
            it2.next().onEvent(obj);
        }
    }
}
