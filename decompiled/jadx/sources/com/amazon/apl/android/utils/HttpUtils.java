package com.amazon.apl.android.utils;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HttpUtils {
    private static final String HEADER_DELIMITER = ": ";
    private static final String HEADER_NAME_REGEX = "\\s+$";

    public static Map<String, String> listToHeadersMap(String[] strArr) {
        HashMap hashMap = new HashMap();
        if (strArr != null) {
            for (String str : strArr) {
                if (str != null) {
                    int indexOf = str.indexOf(": ");
                    if (indexOf == -1) {
                        hashMap.put(str.replaceAll(HEADER_NAME_REGEX, ""), "");
                    } else {
                        hashMap.put(str.substring(0, indexOf).replaceAll(HEADER_NAME_REGEX, ""), str.substring(indexOf + 1).trim());
                    }
                }
            }
        }
        return hashMap;
    }
}
