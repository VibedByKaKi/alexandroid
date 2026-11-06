package com.amazon.dee.app.services.core;

import androidx.annotation.NonNull;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final class DefaultApplicationLifecycleService implements ApplicationLifecycleService {
    private final Executor callbacksExecutor;
    private final Set<ApplicationLifecycleObserver> lifecycleObservers;

    public DefaultApplicationLifecycleService(@NonNull Executor executor) {
        Objects.requireNonNull(executor, "Must provide a non-null executor.");
        this.lifecycleObservers = new CopyOnWriteArraySet();
        this.callbacksExecutor = executor;
    }

    @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService
    public void addObserver(@NonNull ApplicationLifecycleObserver applicationLifecycleObserver) {
        Objects.requireNonNull(applicationLifecycleObserver, "Observer must be non-null.");
        this.lifecycleObservers.add(applicationLifecycleObserver);
    }

    public void notifyOnStart() {
        Iterator<ApplicationLifecycleObserver> it2 = this.lifecycleObservers.iterator();
        while (it2.hasNext()) {
            this.callbacksExecutor.execute(new DefaultApplicationLifecycleService$$ExternalSyntheticLambda0(it2.next(), 0));
        }
    }

    public void notifyOnStop() {
        Iterator<ApplicationLifecycleObserver> it2 = this.lifecycleObservers.iterator();
        while (it2.hasNext()) {
            this.callbacksExecutor.execute(new DefaultApplicationLifecycleService$$ExternalSyntheticLambda0(it2.next(), 1));
        }
    }

    @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService
    public void removeObserver(@NonNull ApplicationLifecycleObserver applicationLifecycleObserver) {
        Objects.requireNonNull(applicationLifecycleObserver, "Observer must be non-null.");
        this.lifecycleObservers.remove(applicationLifecycleObserver);
    }
}
