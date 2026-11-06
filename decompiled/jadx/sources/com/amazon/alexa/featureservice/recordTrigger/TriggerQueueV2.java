package com.amazon.alexa.featureservice.recordTrigger;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class TriggerQueueV2 {

    @VisibleForTesting
    final ConcurrentHashMap<String, RequestTreatment> list;
    private ChangeListener listener;

    @VisibleForTesting
    public TriggerQueueV2(@NonNull ChangeListener changeListener, @NonNull ConcurrentHashMap<String, RequestTreatment> concurrentHashMap) {
        this.list = new ConcurrentHashMap<>(concurrentHashMap);
        this.listener = changeListener;
    }

    public synchronized void add(@NonNull Collection<RequestTreatment> collection) {
        try {
            for (RequestTreatment requestTreatment : collection) {
                this.list.putIfAbsent(requestTreatment.getFeatureName(), requestTreatment);
            }
            this.listener.onAdd(collection);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean isEmpty() {
        return this.list.isEmpty();
    }

    public synchronized List<RequestTreatment> popAll() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.list.values());
        this.list.clear();
        return arrayList;
    }

    public String toString() {
        return this.list.toString();
    }

    public TriggerQueueV2(@NonNull ChangeListener changeListener) {
        this(changeListener, new ConcurrentHashMap());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ChangeListener {
        default void onAdd(@NonNull Collection<RequestTreatment> collection) {
        }

        default void onInsert(int i, @NonNull Collection<RequestTreatment> collection) {
        }
    }
}
