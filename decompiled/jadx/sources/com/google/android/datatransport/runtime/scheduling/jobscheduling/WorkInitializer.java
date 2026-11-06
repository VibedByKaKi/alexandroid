package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda14;
import com.mapbox.maps.NativeMapImpl$$ExternalSyntheticLambda2;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class WorkInitializer {
    private final Executor executor;
    private final SynchronizationGuard guard;
    private final WorkScheduler scheduler;
    private final EventStore store;

    @Inject
    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.store = eventStore;
        this.scheduler = workScheduler;
        this.guard = synchronizationGuard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$ensureContextsScheduled$0() {
        Iterator<TransportContext> it2 = this.store.loadActiveContexts().iterator();
        while (it2.hasNext()) {
            this.scheduler.schedule(it2.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureContextsScheduled$1() {
        this.guard.runCriticalSection(new MapboxMap$$ExternalSyntheticLambda14(this, 7));
    }

    public void ensureContextsScheduled() {
        this.executor.execute(new NativeMapImpl$$ExternalSyntheticLambda2(this, 15));
    }
}
