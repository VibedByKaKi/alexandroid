package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
final class PreFillQueue {
    private final Map<PreFillType, Integer> bitmapsPerType;
    private int bitmapsRemaining;
    private int keyIndex;
    private final List<PreFillType> keyList;

    public PreFillQueue(Map<PreFillType, Integer> map) {
        this.bitmapsPerType = map;
        this.keyList = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.bitmapsRemaining = num.intValue() + this.bitmapsRemaining;
        }
    }

    public int getSize() {
        return this.bitmapsRemaining;
    }

    public boolean isEmpty() {
        return this.bitmapsRemaining == 0;
    }

    public PreFillType remove() {
        PreFillType preFillType = this.keyList.get(this.keyIndex);
        Integer num = this.bitmapsPerType.get(preFillType);
        int intValue = num.intValue();
        Map<PreFillType, Integer> map = this.bitmapsPerType;
        if (intValue == 1) {
            map.remove(preFillType);
            this.keyList.remove(this.keyIndex);
        } else {
            map.put(preFillType, Integer.valueOf(num.intValue() - 1));
        }
        this.bitmapsRemaining--;
        this.keyIndex = this.keyList.isEmpty() ? 0 : (this.keyIndex + 1) % this.keyList.size();
        return preFillType;
    }
}
