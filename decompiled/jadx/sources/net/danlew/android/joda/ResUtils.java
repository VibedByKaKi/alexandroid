package net.danlew.android.joda;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class ResUtils {
    private static final String TZDATA_PREFIX = "joda_";
    private static Map<Class<?>, Map<String, Integer>> sIdentifierCache = new ConcurrentHashMap();

    private static String convertPathToResource(String str) {
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(file.getName());
            file = file.getParentFile();
        } while (file != null);
        StringBuffer stringBuffer = new StringBuffer();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("_");
            }
            stringBuffer.append((String) arrayList.get(size));
        }
        return stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US);
    }

    public static int getIdentifier(Class<?> cls, String str) {
        Map<String, Integer> map;
        if (sIdentifierCache.containsKey(cls)) {
            map = sIdentifierCache.get(cls);
        } else {
            map = new ConcurrentHashMap<>();
            sIdentifierCache.put(cls, map);
        }
        if (map.containsKey(str)) {
            return map.get(str).intValue();
        }
        try {
            int i = cls.getField(str).getInt(null);
            if (i == 0) {
                return i;
            }
            map.put(str, Integer.valueOf(i));
            return i;
        } catch (Exception e) {
            Log.e("JodaTimeAndroid", "Failed to retrieve identifier: type=" + cls + " name=" + str, e);
            return 0;
        }
    }

    public static String getTzResource(String str) {
        return TZDATA_PREFIX + convertPathToResource(str);
    }

    public static String getZoneInfoMapResource() {
        return TZDATA_PREFIX + convertPathToResource("ZoneInfoMap");
    }
}
