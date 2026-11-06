package org.apache.commons.net.util;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ListenerList implements Serializable, Iterable<EventListener> {
    private static final long serialVersionUID = -1934227607974228213L;
    private final CopyOnWriteArrayList<EventListener> listeners = new CopyOnWriteArrayList<>();

    public void addListener(EventListener eventListener) {
        this.listeners.add(eventListener);
    }

    public int getListenerCount() {
        return this.listeners.size();
    }

    @Override // java.lang.Iterable
    public Iterator<EventListener> iterator() {
        return this.listeners.iterator();
    }

    public void removeListener(EventListener eventListener) {
        this.listeners.remove(eventListener);
    }
}
