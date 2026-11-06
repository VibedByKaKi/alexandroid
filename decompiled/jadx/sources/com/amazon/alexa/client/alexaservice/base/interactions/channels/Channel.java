package com.amazon.alexa.client.alexaservice.base.interactions.channels;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionIdentifier;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionInterfaceName;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionLifecycle;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class Channel<T extends InteractionLifecycle> {
    private static final int FRONT_INDEX = 0;
    private static final String TAG = "Channel";
    protected final List<T> interactionLifecycles;
    protected final Set<InteractionInterfaceName> interfacesExcludedFromActivity;
    protected final Set<Listener> listeners = a$$ExternalSyntheticOutline0.m();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onUpdated();
    }

    public Channel(Set<InteractionInterfaceName> set, List<T> list) {
        this.interfacesExcludedFromActivity = set;
        this.interactionLifecycles = list;
    }

    private boolean excludedFromActivity(T t) {
        return this.interfacesExcludedFromActivity.contains(t.getInteractionInterfaceName());
    }

    @Nullable
    private T find(InteractionIdentifier interactionIdentifier) {
        for (T t : this.interactionLifecycles) {
            if (interactionIdentifier.equals(t.getInteractionIdentifier())) {
                return t;
            }
        }
        return null;
    }

    public synchronized void clear() {
        if (!isEmpty()) {
            boolean hasActiveInteractions = hasActiveInteractions();
            this.interactionLifecycles.clear();
            onInterfaceChanged(hasActiveInteractions);
        }
    }

    public synchronized boolean contains(InteractionIdentifier interactionIdentifier) {
        return find(interactionIdentifier) != null;
    }

    public void deregisterListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public synchronized void enqueue(T t) {
        this.interactionLifecycles.add(t);
        onInterfaceChanged(!excludedFromActivity(t));
    }

    public synchronized Set<T> getAllInteractions() {
        return new HashSet(this.interactionLifecycles);
    }

    public boolean hasActiveInteractions() {
        return peekActive() != null;
    }

    public synchronized boolean isEmpty() {
        return this.interactionLifecycles.isEmpty();
    }

    public abstract void onInterfaceChanged(boolean z);

    public synchronized T peek() {
        return this.interactionLifecycles.get(0);
    }

    @Nullable
    public T peekActive() {
        for (T t : this.interactionLifecycles) {
            if (!this.interfacesExcludedFromActivity.contains(t.getInteractionInterfaceName())) {
                return t;
            }
        }
        return null;
    }

    public synchronized T pop() {
        T remove;
        remove = this.interactionLifecycles.remove(0);
        onInterfaceChanged(!excludedFromActivity(remove));
        return remove;
    }

    public synchronized void push(T t) {
        this.interactionLifecycles.add(0, t);
        onInterfaceChanged(!excludedFromActivity(t));
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
    }

    public synchronized void remove(InteractionIdentifier interactionIdentifier) {
        T find = find(interactionIdentifier);
        if (find != null && this.interactionLifecycles.remove(find)) {
            onInterfaceChanged(!excludedFromActivity(find));
        }
    }

    public synchronized T replaceTop(T t) {
        T remove;
        try {
            boolean z = false;
            remove = this.interactionLifecycles.remove(0);
            this.interactionLifecycles.add(0, t);
            if (excludedFromActivity(t)) {
                if (!excludedFromActivity(remove)) {
                }
                onInterfaceChanged(z);
            }
            z = true;
            onInterfaceChanged(z);
        } catch (Throwable th) {
            throw th;
        }
        return remove;
    }

    public synchronized void stopAll() {
        for (T t : this.interactionLifecycles) {
            if (!t.isStopped()) {
                t.stop();
            }
        }
    }
}
