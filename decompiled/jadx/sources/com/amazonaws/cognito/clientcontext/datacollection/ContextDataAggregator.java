package com.amazonaws.cognito.clientcontext.datacollection;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ContextDataAggregator {
    private final List<DataCollector> dataCollectors;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InstanceHolder {
        private static final ContextDataAggregator INSTANCE = new ContextDataAggregator();

        private InstanceHolder() {
        }
    }

    private ContextDataAggregator() {
        this.dataCollectors = getDataCollectors();
    }

    private List<DataCollector> getDataCollectors() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ApplicationDataCollector());
        arrayList.add(new BuildDataCollector());
        arrayList.add(new DeviceDataCollector());
        return arrayList;
    }

    public static ContextDataAggregator getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private void removerNullEntries(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue() == null) {
                map.remove(entry.getKey());
            }
        }
    }

    public Map<String, String> getAggregatedData(Context context) {
        HashMap hashMap = new HashMap();
        Iterator<DataCollector> it2 = this.dataCollectors.iterator();
        while (it2.hasNext()) {
            hashMap.putAll(it2.next().collect(context));
        }
        removerNullEntries(hashMap);
        return hashMap;
    }

    public ContextDataAggregator(List<DataCollector> list) {
        this.dataCollectors = list;
    }
}
