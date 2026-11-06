package com.amazon.alexa.featureservice.recordTrigger;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TriggerThrottler {

    @VisibleForTesting
    ConcurrentMap<String, RequestTreatment> incomingRequests;

    public TriggerThrottler() {
        this(new ConcurrentHashMap());
    }

    public synchronized RequestTreatment add(@NonNull RequestTreatment requestTreatment) {
        return this.incomingRequests.putIfAbsent(requestTreatment.getFeatureName(), requestTreatment);
    }

    public synchronized boolean isEmpty() {
        return this.incomingRequests.isEmpty();
    }

    @NonNull
    public synchronized List<RequestTreatment> removeAll() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.incomingRequests.values());
        this.incomingRequests.clear();
        return arrayList;
    }

    @VisibleForTesting
    public TriggerThrottler(@NonNull ConcurrentMap<String, RequestTreatment> concurrentMap) {
        this.incomingRequests = concurrentMap;
    }
}
