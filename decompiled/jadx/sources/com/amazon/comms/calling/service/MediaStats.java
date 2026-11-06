package com.amazon.comms.calling.service;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaStats {
    private HashMap<String, String> legacyMetrics;
    private final List<Map<String, String>> mediaStats;
    private final Map<String, String> newMediaStats;

    public MediaStats(List<HashMap<String, String>> list, HashMap<String, String> hashMap) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<HashMap<String, String>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(ImmutableMap.copyOf((Map) it2.next()));
        }
        this.mediaStats = ImmutableList.copyOf((Collection) arrayList);
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            hashMap2.put(entry.getKey(), entry.getValue());
        }
        this.newMediaStats = ImmutableMap.copyOf((Map) hashMap2);
    }

    public HashMap<String, String> getLegacyMetrics() {
        return this.legacyMetrics;
    }

    public List<Map<String, String>> getMediaStats() {
        return this.mediaStats;
    }

    public Map<String, String> getNewMediaStats() {
        return this.newMediaStats;
    }

    public void setLegacyMetrics(HashMap<String, String> hashMap) {
        this.legacyMetrics = hashMap;
    }

    public MediaStats(List<HashMap<String, String>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<HashMap<String, String>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(ImmutableMap.copyOf((Map) it2.next()));
        }
        this.mediaStats = ImmutableList.copyOf((Collection) arrayList);
        this.newMediaStats = new HashMap();
    }
}
