package com.amazon.minerva.client.thirdparty.kpi;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class AbstractKPIReporter {
    protected static Set<String> mKPIKeys;
    protected HashMap<String, HashMap<String, Long>> mKPIMap = new HashMap<>();

    static {
        HashSet hashSet = new HashSet();
        for (KPIMetric kPIMetric : KPIMetric.values()) {
            hashSet.add(kPIMetric.getMetricName());
        }
        mKPIKeys = Collections.unmodifiableSet(hashSet);
    }

    public synchronized void clear() {
        this.mKPIMap.clear();
    }

    public synchronized Map<String, HashMap<String, Long>> getAndClear() {
        HashMap<String, HashMap<String, Long>> hashMap;
        hashMap = this.mKPIMap;
        this.mKPIMap = new HashMap<>();
        return hashMap;
    }

    public synchronized void report(String str, String str2, long j) {
        try {
            Objects.requireNonNull(str, "kpiKey cannot be null in report method.");
            Objects.requireNonNull(str2, "MetricGroupId cannot be null in report method.");
            if (!mKPIKeys.contains(str) || str2.isEmpty() || j < 0) {
                throw new IllegalArgumentException("Key, MetricGroupID, or Value is invalid in report method.");
            }
            if (j == 0) {
                return;
            }
            HashMap<String, Long> hashMap = this.mKPIMap.get(str2);
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.mKPIMap.put(str2, hashMap);
            }
            if (hashMap.containsKey(str)) {
                j += hashMap.get(str).longValue();
            }
            hashMap.put(str, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void shutdown();

    public synchronized int size() {
        return this.mKPIMap.size();
    }
}
