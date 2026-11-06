package org.apache.commons.lang;

import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CharEncoding {
    public static final String ISO_8859_1 = "ISO-8859-1";
    public static final String US_ASCII = "US-ASCII";
    public static final String UTF_16 = "UTF-16";
    public static final String UTF_16BE = "UTF-16BE";
    public static final String UTF_16LE = "UTF-16LE";
    public static final String UTF_8 = "UTF-8";

    public static boolean isSupported(String str) {
        if (str == null) {
            return false;
        }
        try {
            new String(ArrayUtils.EMPTY_BYTE_ARRAY, str);
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }
}
