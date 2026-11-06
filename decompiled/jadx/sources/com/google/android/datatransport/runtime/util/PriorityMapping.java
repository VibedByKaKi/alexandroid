package com.google.android.datatransport.runtime.util;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class PriorityMapping {
    private static HashMap<Priority, Integer> PRIORITY_INT_MAP;
    private static SparseArray<Priority> PRIORITY_MAP = new SparseArray<>();

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        PRIORITY_INT_MAP = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        PRIORITY_INT_MAP.put(Priority.VERY_LOW, 1);
        PRIORITY_INT_MAP.put(Priority.HIGHEST, 2);
        for (Priority priority : PRIORITY_INT_MAP.keySet()) {
            PRIORITY_MAP.append(PRIORITY_INT_MAP.get(priority).intValue(), priority);
        }
    }

    public static int toInt(@NonNull Priority priority) {
        Integer num = PRIORITY_INT_MAP.get(priority);
        if (num != null) {
            return num.intValue();
        }
        OnnxMap$$ExternalSyntheticBUOutline0.m(priority, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    @NonNull
    public static Priority valueOf(int i) {
        Priority priority = PRIORITY_MAP.get(i);
        if (priority != null) {
            return priority;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown Priority for value "));
        return null;
    }
}
