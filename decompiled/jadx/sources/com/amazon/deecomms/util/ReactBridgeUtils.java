package com.amazon.deecomms.util;

import com.facebook.react.bridge.ReadableArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ReactBridgeUtils {
    private ReactBridgeUtils() {
    }

    public static String getDelimitedStringFromArray(ReadableArray readableArray, String str) {
        if (readableArray == null || readableArray.size() == 0) {
            return "";
        }
        if (readableArray.size() == 1) {
            return readableArray.getString(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(readableArray.getString(0));
        for (int i = 1; i < readableArray.size(); i++) {
            sb.append(str);
            sb.append(readableArray.getString(i));
        }
        return sb.toString();
    }
}
