package com.reactnativecommunity.cameraroll;

import android.webkit.MimeTypeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class Utils {
    public static String getExtension(String str) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
    }

    public static String getMimeType(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String substring = lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : null;
        if (substring != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
        }
        return null;
    }
}
