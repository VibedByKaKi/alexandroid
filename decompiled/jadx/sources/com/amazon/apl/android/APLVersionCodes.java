package com.amazon.apl.android;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLVersionCodes {
    public static final int APL_1_0 = 0;
    public static final int APL_1_1 = 1;
    public static final int APL_1_2 = 2;
    public static final int APL_1_3 = 3;
    public static final int APL_1_4 = 4;
    public static final int APL_1_5 = 5;
    public static final int APL_1_6 = 6;
    public static final int APL_1_7 = 7;
    public static final int APL_1_8 = 8;
    public static final int APL_1_9 = 9;
    public static final int APL_2022_1 = 10;
    public static final int APL_2022_2 = 11;
    public static final int APL_2023_1 = 12;
    public static final int APL_2023_2 = 13;
    public static final int APL_2023_3 = 14;
    public static final int APL_LATEST = Integer.MAX_VALUE;
    private static final Map<String, Integer> sVersionCodes;

    static {
        HashMap hashMap = new HashMap();
        sVersionCodes = hashMap;
        TableInfo$$ExternalSyntheticOutline0.m(0, hashMap, "1.0", 1, "1.1");
        TableInfo$$ExternalSyntheticOutline0.m(2, hashMap, "1.2", 3, "1.3");
        TableInfo$$ExternalSyntheticOutline0.m(4, hashMap, "1.4", 5, "1.5");
        TableInfo$$ExternalSyntheticOutline0.m(6, hashMap, "1.6", 7, "1.7");
        TableInfo$$ExternalSyntheticOutline0.m(8, hashMap, "1.8", 9, "1.9");
        hashMap.put("1.10", 10);
        hashMap.put("2022.1", 10);
        TableInfo$$ExternalSyntheticOutline0.m(hashMap, "2022.2", (Integer) 11, 12, "2023.1");
        TableInfo$$ExternalSyntheticOutline0.m(13, hashMap, "2023.2", 14, "2023.3");
    }

    public static int getVersionCode(String str) {
        Integer num = sVersionCodes.get(str);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
