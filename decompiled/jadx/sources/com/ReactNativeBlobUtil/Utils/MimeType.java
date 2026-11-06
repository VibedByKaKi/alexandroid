package com.ReactNativeBlobUtil.Utils;

import android.webkit.MimeTypeMap;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.lang3.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class MimeType {
    static String APPLICATION = "application/*";
    static String AUDIO = "audio/*";
    static String BINARY_FILE = "application/octet-stream";
    static String CHEMICAL = "chemical/*";
    static String FONT = "font/*";
    static String IMAGE = "image/*";
    static String MODEL = "model/*";
    static String TEXT = "text/*";
    static String UNKNOWN = "*/*";
    static String VIDEO = "video/*";

    public static String getExtensionFromMimeType(String str) {
        return str != null ? str.equals(BINARY_FILE) ? "bin" : MimeTypeMap.getSingleton().getExtensionFromMimeType(str) : "";
    }

    public static String getExtensionFromMimeTypeOrFileName(String str, String str2) {
        return (str == null || str.equals(UNKNOWN)) ? StringUtils.substringAfterLast(str2, ".") : getExtensionFromMimeType(str);
    }

    public static String getFullFileName(String str, String str2) {
        String extensionFromMimeType = getExtensionFromMimeType(str2);
        if (extensionFromMimeType == null || extensionFromMimeType.isEmpty() || str.endsWith(".".concat(extensionFromMimeType))) {
            return str;
        }
        String m$1 = a$$ExternalSyntheticOutline0.m$1(str, ".", extensionFromMimeType);
        return m$1.endsWith(".") ? StringUtils.stripEnd(m$1, ".") : m$1;
    }

    public static String getMimeTypeFromExtension(String str) {
        if (str.equals("bin")) {
            return BINARY_FILE;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : UNKNOWN;
    }
}
