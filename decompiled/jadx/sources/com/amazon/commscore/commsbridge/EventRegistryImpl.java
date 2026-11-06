package com.amazon.commscore.commsbridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.commscore.api.commsbridge.EventListener;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class EventRegistryImpl implements EventRegistry {

    @VisibleForTesting
    final ConcurrentHashMap<String, HashSet<EventListener<String>>> mEventListenersByName = new ConcurrentHashMap<>();

    @VisibleForTesting
    final ConcurrentHashMap<UUID, EventListener<String>> mEventListenerByUuid = new ConcurrentHashMap<>();

    @Override // com.amazon.commscore.commsbridge.EventRegistry
    public boolean addEventListener(@NonNull String str, @NonNull EventListener<String> eventListener, @NonNull UUID uuid) {
        this.mEventListenerByUuid.putIfAbsent(uuid, eventListener);
        if (this.mEventListenersByName.containsKey(str)) {
            this.mEventListenersByName.get(str).add(eventListener);
            return true;
        }
        HashSet<EventListener<String>> hashSet = new HashSet<>();
        hashSet.add(eventListener);
        this.mEventListenersByName.put(str, hashSet);
        return true;
    }

    @Override // com.amazon.commscore.commsbridge.EventRegistry
    @Nullable
    public EventListener<String> getEventListener(@NonNull UUID uuid) {
        return this.mEventListenerByUuid.get(uuid);
    }

    @Override // com.amazon.commscore.commsbridge.EventRegistry
    public Set<EventListener<String>> getEventListeners(@NonNull String str) {
        return this.mEventListenersByName.containsKey(str) ? Collections.unmodifiableSet(this.mEventListenersByName.get(str)) : Collections.EMPTY_SET;
    }

    @Override // com.amazon.commscore.commsbridge.EventRegistry
    public EventListener<String> removeEventListener(@NonNull UUID uuid) {
        EventListener<String> remove = this.mEventListenerByUuid.remove(uuid);
        if (remove != null) {
            Iterator<HashSet<EventListener<String>>> it2 = this.mEventListenersByName.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                HashSet<EventListener<String>> next = it2.next();
                if (next.contains(remove)) {
                    next.remove(remove);
                    break;
                }
            }
        }
        return remove;
    }
}
