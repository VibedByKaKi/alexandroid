package com.google.zxing.pdf417.decoder;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class BarcodeValue {
    private final Map<Integer, Integer> values = new HashMap();

    public Integer getConfidence(int i) {
        return this.values.get(Integer.valueOf(i));
    }

    public int[] getValue() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.values.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return PDF417Common.toIntArray(arrayList);
    }

    public void setValue(int i) {
        Integer num = this.values.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.values.put(Integer.valueOf(i), TableInfo$$ExternalSyntheticOutline0.m(1, num));
    }
}
