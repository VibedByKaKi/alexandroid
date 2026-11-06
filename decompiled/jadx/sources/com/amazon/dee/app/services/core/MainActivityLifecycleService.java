package com.amazon.dee.app.services.core;

import androidx.annotation.NonNull;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class MainActivityLifecycleService implements MainActivityLifecycleObserverRegistrar {
    private final Executor callbacksExecutor;
    private final Set<MainActivityLifecycleObserver> lifecycleObserverSet;

    public MainActivityLifecycleService(@NonNull Executor executor) {
        Objects.requireNonNull(executor, "Provided executor must be non-null.");
        this.lifecycleObserverSet = new CopyOnWriteArraySet();
        this.callbacksExecutor = executor;
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar
    public void addObserver(@NonNull MainActivityLifecycleObserver mainActivityLifecycleObserver) {
        Objects.requireNonNull(mainActivityLifecycleObserver, "Observer may not be null!");
        this.lifecycleObserverSet.add(mainActivityLifecycleObserver);
    }

    public void notifyOnCreated() {
        Iterator<MainActivityLifecycleObserver> it2 = this.lifecycleObserverSet.iterator();
        while (it2.hasNext()) {
            this.callbacksExecutor.execute(new MainActivityLifecycleService$$ExternalSyntheticLambda0(it2.next(), 1));
        }
    }

    public void notifyOnDestroy() {
        Iterator<MainActivityLifecycleObserver> it2 = this.lifecycleObserverSet.iterator();
        while (it2.hasNext()) {
            this.callbacksExecutor.execute(new MainActivityLifecycleService$$ExternalSyntheticLambda0(it2.next(), 2));
        }
    }

    public void notifyOnPause() {
        Iterator<MainActivityLifecycleObserver> it2 = this.lifecycleObserverSet.iterator();
        while (it2.hasNext()) {
            this.callbacksExecutor.execute(new MainActivityLifecycleService$$ExternalSyntheticLambda0(it2.next(), 0));
        }
    }

    public void notifyOnResume() {
        Iterator<MainActivityLifecycleObserver> it2 = this.lifecycleObserverSet.iterator();
        while (it2.hasNext()) {
            this.callbacksExecutor.execute(new MainActivityLifecycleService$$ExternalSyntheticLambda0(it2.next(), 3));
        }
    }

    public void notifyOnStart() {
        Iterator<MainActivityLifecycleObserver> it2 = this.lifecycleObserverSet.iterator();
        while (it2.hasNext()) {
            this.callbacksExecutor.execute(new MainActivityLifecycleService$$ExternalSyntheticLambda0(it2.next(), 5));
        }
    }

    public void notifyOnStop() {
        Iterator<MainActivityLifecycleObserver> it2 = this.lifecycleObserverSet.iterator();
        while (it2.hasNext()) {
            this.callbacksExecutor.execute(new MainActivityLifecycleService$$ExternalSyntheticLambda0(it2.next(), 4));
        }
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar
    public void removeObserver(@NonNull MainActivityLifecycleObserver mainActivityLifecycleObserver) {
        Objects.requireNonNull(mainActivityLifecycleObserver, "Observer may not be null!");
        this.lifecycleObserverSet.remove(mainActivityLifecycleObserver);
    }
}
