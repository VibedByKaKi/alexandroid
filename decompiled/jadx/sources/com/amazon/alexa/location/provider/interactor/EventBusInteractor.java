package com.amazon.alexa.location.provider.interactor;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.location.provider.interactor.sync.SyncInteractor;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class EventBusInteractor {
    private static final String TAG = "EventBusInteractor";

    @VisibleForTesting
    final Map<SyncInteractor, MultiFilterSubscriber.FilterUuid> activeSyncInteractors = new HashMap();
    private final LazyComponent<EventBus> eventBus;

    @VisibleForTesting
    MultiFilterSubscriber eventBusSubscriber;

    public EventBusInteractor(@NonNull LazyComponent<EventBus> lazyComponent) {
        this.eventBus = lazyComponent;
    }

    public void subscribeToEventBus(@NonNull SyncInteractor syncInteractor) {
        if (this.activeSyncInteractors.containsKey(syncInteractor)) {
            syncInteractor.getName();
            return;
        }
        if (this.eventBusSubscriber == null) {
            this.eventBusSubscriber = this.eventBus.get().getNewSubscriber();
        }
        syncInteractor.getName();
        this.activeSyncInteractors.put(syncInteractor, this.eventBusSubscriber.subscribeFilter(syncInteractor.getMessageFilter(), syncInteractor.getMessageHandler()));
    }

    public void unsubscribeToEventBus(@NonNull SyncInteractor syncInteractor) {
        if (!this.activeSyncInteractors.containsKey(syncInteractor)) {
            String name = syncInteractor.getName();
            StringBuilder sb = new StringBuilder("Interactor ");
            sb.append(name);
            sb.append(" isn't subscribing to Event Bus; ignoring unsubscribe request");
            return;
        }
        if (this.eventBusSubscriber == null) {
            Log.e(TAG, "Subscriber lost - clearing remaining sync interactor entries");
            this.activeSyncInteractors.clear();
            return;
        }
        String name2 = syncInteractor.getName();
        StringBuilder sb2 = new StringBuilder("Stopping interactor ");
        sb2.append(name2);
        sb2.append("'s subscription to Event Bus");
        MultiFilterSubscriber multiFilterSubscriber = this.eventBusSubscriber;
        MultiFilterSubscriber.FilterUuid filterUuid = this.activeSyncInteractors.get(syncInteractor);
        Objects.requireNonNull(filterUuid);
        multiFilterSubscriber.unsubscribeFilter(filterUuid);
        this.activeSyncInteractors.remove(syncInteractor);
        if (this.activeSyncInteractors.isEmpty()) {
            this.eventBusSubscriber = null;
        }
    }
}
