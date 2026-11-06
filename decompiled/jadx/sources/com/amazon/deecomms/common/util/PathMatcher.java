package com.amazon.deecomms.common.util;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class PathMatcher {
    private PathMatcher() {
    }

    public static boolean matches(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return Pattern.matches(str.replaceAll("\\{(.*?)\\}", ".*").replace("/", "\\/"), str2);
    }
}
