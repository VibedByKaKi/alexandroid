package org.apache.commons.text.similarity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CosineSimilarity {
    static final CosineSimilarity INSTANCE = new CosineSimilarity();

    private double dot(Map<CharSequence, Integer> map, Map<CharSequence, Integer> map2, Set<CharSequence> set) {
        long j = 0;
        for (CharSequence charSequence : set) {
            j += map.get(charSequence).intValue() * map2.get(charSequence).intValue();
        }
        return j;
    }

    private Set<CharSequence> getIntersection(Map<CharSequence, Integer> map, Map<CharSequence, Integer> map2) {
        HashSet hashSet = new HashSet(map.keySet());
        hashSet.retainAll(map2.keySet());
        return hashSet;
    }

    public Double cosineSimilarity(Map<CharSequence, Integer> map, Map<CharSequence, Integer> map2) {
        if (map == null || map2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Vectors must not be null");
            return null;
        }
        double dot = dot(map, map2, getIntersection(map, map2));
        Iterator<Integer> it2 = map.values().iterator();
        double d = 0.0d;
        double d2 = 0.0d;
        while (it2.hasNext()) {
            d2 += Math.pow(it2.next().intValue(), 2.0d);
        }
        Iterator<Integer> it3 = map2.values().iterator();
        double d3 = 0.0d;
        while (it3.hasNext()) {
            d3 += Math.pow(it3.next().intValue(), 2.0d);
        }
        if (d2 > 0.0d && d3 > 0.0d) {
            d = dot / (Math.sqrt(d3) * Math.sqrt(d2));
        }
        return Double.valueOf(d);
    }
}
