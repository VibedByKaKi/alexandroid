package com.amazon.alexa.featureservice.recordTrigger;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class TriggerQueue {

    @VisibleForTesting
    final List<RequestTreatment> list;
    private ChangeListener listener;

    @VisibleForTesting
    public TriggerQueue(@NonNull ChangeListener changeListener, @NonNull List<RequestTreatment> list) {
        this.list = new ArrayList(list);
        this.listener = changeListener;
    }

    public synchronized boolean add(@NonNull Collection<RequestTreatment> collection) {
        boolean addAll;
        addAll = this.list.addAll(collection);
        this.listener.onAdd(collection);
        return addAll;
    }

    public synchronized boolean insert(int i, @NonNull Collection<RequestTreatment> collection) {
        boolean addAll;
        addAll = this.list.addAll(i, collection);
        this.listener.onInsert(i, collection);
        return addAll;
    }

    public synchronized boolean isEmpty() {
        return this.list.isEmpty();
    }

    public synchronized List<RequestTreatment> popAll() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.list);
        this.list.clear();
        return arrayList;
    }

    public String toString() {
        return this.list.toString();
    }

    public TriggerQueue(@NonNull ChangeListener changeListener) {
        this(changeListener, new ArrayList());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ChangeListener {
        default void onAdd(@NonNull Collection<RequestTreatment> collection) {
        }

        default void onInsert(int i, @NonNull Collection<RequestTreatment> collection) {
        }
    }
}
