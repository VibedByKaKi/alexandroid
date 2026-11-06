package org.apache.http.client.utils;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes11.dex */
public class Punycode {
    private static final Idn impl;

    static {
        Idn rfc3492Idn;
        try {
            rfc3492Idn = new JdkIdn();
        } catch (Exception unused) {
            rfc3492Idn = new Rfc3492Idn();
        }
        impl = rfc3492Idn;
    }

    public static String toUnicode(String str) {
        return impl.toUnicode(str);
    }
}
