package org.apache.commons.net.util;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Charsets {
    public static Charset toCharset(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static Charset toCharset(String str, String str2) {
        return str == null ? Charset.forName(str2) : Charset.forName(str);
    }
}
