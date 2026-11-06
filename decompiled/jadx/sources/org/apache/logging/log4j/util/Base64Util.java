package org.apache.logging.log4j.util;

import java.nio.charset.Charset;
import java.util.Base64;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class Base64Util {
    private static final Base64.Encoder ENCODER = Base64.getEncoder();

    private Base64Util() {
    }

    @Deprecated
    public static String encode(String str) {
        if (str != null) {
            return ENCODER.encodeToString(str.getBytes(Charset.defaultCharset()));
        }
        return null;
    }
}
