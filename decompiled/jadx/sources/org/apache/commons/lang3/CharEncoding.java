package org.apache.commons.lang3;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public class CharEncoding {
    public static final String ISO_8859_1 = StandardCharsets.ISO_8859_1.name();
    public static final String US_ASCII = StandardCharsets.US_ASCII.name();
    public static final String UTF_16 = StandardCharsets.UTF_16.name();
    public static final String UTF_16BE = StandardCharsets.UTF_16BE.name();
    public static final String UTF_16LE = StandardCharsets.UTF_16LE.name();
    public static final String UTF_8 = StandardCharsets.UTF_8.name();

    @Deprecated
    public CharEncoding() {
    }

    @Deprecated
    public static boolean isSupported(String str) {
        if (str == null) {
            return false;
        }
        try {
            return Charset.isSupported(str);
        } catch (IllegalCharsetNameException unused) {
            return false;
        }
    }
}
