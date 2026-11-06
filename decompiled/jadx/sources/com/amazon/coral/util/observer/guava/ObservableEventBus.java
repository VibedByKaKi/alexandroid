package com.amazon.coral.util.observer.guava;

import com.amazon.coral.google.common.eventbus.EventBus;
import com.amazon.coral.google.common.eventbus.Subscribe;
import com.amazon.coral.util.observer.Observable;
import com.amazon.coral.util.observer.Observer;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ObservableEventBus implements Observable {
    private final EventBus eventBus;
    private final Set<Observer> observerSet;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class EventBusToObserversDispatcher {
        private EventBusToObserversDispatcher() {
        }

        @Subscribe
        public void handle(Object obj) {
            Iterator it2 = ObservableEventBus.this.observerSet.iterator();
            while (it2.hasNext()) {
                ((Observer) it2.next()).update(obj);
            }
        }
    }

    public ObservableEventBus() {
        EventBus eventBus = new EventBus(ObservableEventBus.class.getName() + "-" + hashCode());
        this.eventBus = eventBus;
        this.observerSet = new CopyOnWriteArraySet();
        eventBus.register(new EventBusToObserversDispatcher());
    }

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
        this.eventBus.post(obj);
    }
}
