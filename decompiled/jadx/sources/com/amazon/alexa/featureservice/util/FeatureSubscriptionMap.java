package com.amazon.alexa.featureservice.util;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureSubscriptionMap {
    private Map<String, Map<FeatureServiceV2.FeatureUpdateListener, Boolean>> featureToCallbackMap = new HashMap();
    private Map<FeatureServiceV2.FeatureUpdateListener, List<String>> callbackToFeatureMap = new HashMap();

    @Inject
    public FeatureSubscriptionMap() {
    }

    public synchronized void add(String str, FeatureServiceV2.FeatureUpdateListener featureUpdateListener) {
        if (str == null || featureUpdateListener == null) {
            return;
        }
        try {
            if (!this.featureToCallbackMap.containsKey(str)) {
                this.featureToCallbackMap.put(str, new HashMap());
            }
            Map<FeatureServiceV2.FeatureUpdateListener, Boolean> map = this.featureToCallbackMap.get(str);
            if (!map.containsKey(featureUpdateListener)) {
                map.put(featureUpdateListener, Boolean.TRUE);
            }
            if (!this.callbackToFeatureMap.containsKey(featureUpdateListener)) {
                this.callbackToFeatureMap.put(featureUpdateListener, new ArrayList());
            }
            List<String> list = this.callbackToFeatureMap.get(featureUpdateListener);
            if (!list.contains(str)) {
                list.add(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        this.featureToCallbackMap.clear();
        this.callbackToFeatureMap.clear();
    }

    public synchronized Set<FeatureServiceV2.FeatureUpdateListener> getSubscribers(String str) {
        HashSet hashSet = new HashSet();
        if (str != null && this.featureToCallbackMap.get(str) != null) {
            hashSet.addAll(this.featureToCallbackMap.get(str).keySet());
            return hashSet;
        }
        return hashSet;
    }

    public synchronized void remove(FeatureServiceV2.FeatureUpdateListener featureUpdateListener) {
        if (featureUpdateListener == null) {
            return;
        }
        try {
            List<String> list = this.callbackToFeatureMap.get(featureUpdateListener);
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    this.featureToCallbackMap.get(it2.next()).remove(featureUpdateListener);
                }
                if (list.size() == 1) {
                    this.callbackToFeatureMap.remove(featureUpdateListener);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
