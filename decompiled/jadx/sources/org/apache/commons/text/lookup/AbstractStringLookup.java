package org.apache.commons.text.lookup;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.lang3.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
abstract class AbstractStringLookup implements StringLookup {
    protected static final char SPLIT_CH = ':';
    protected static final String SPLIT_STR = String.valueOf(':');

    public static String toLookupKey(String str, String str2) {
        return toLookupKey(str, SPLIT_STR, str2);
    }

    @Deprecated
    public String substringAfter(String str, char c) {
        return StringUtils.substringAfter(str, c);
    }

    @Deprecated
    public String substringAfterLast(String str, char c) {
        return StringUtils.substringAfterLast(str, c);
    }

    @Deprecated
    public String substringAfter(String str, String str2) {
        return StringUtils.substringAfter(str, str2);
    }

    public static String toLookupKey(String str, String str2, String str3) {
        return a$$ExternalSyntheticOutline0.m$1(str, str2, str3);
    }
}
