package com.amazon.coral.util.observer;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ObservableDefault implements Observable {
    private final Set<Observer> observerSet = new CopyOnWriteArraySet();

    @Override // com.amazon.coral.util.observer.Observable
    public void attach(Observer observer) {
        this.observerSet.add(observer);
    }

    @Override // com.amazon.coral.util.observer.Observable
    public void detach(Observer observer) {
        this.observerSet.remove(observer);
    }

    @Override // com.amazon.coral.util.observer.Observable
    public void notifyObservers(Object obj) {
        Iterator<Observer> it2 = this.observerSet.iterator();
        while (it2.hasNext()) {
            it2.next().update(obj);
        }
    }
}
