package com.google.zxing.client.result;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
abstract class AbstractDoCoMoResultParser extends ResultParser {
    public static String[] matchDoCoMoPrefixedField(String str, String str2) {
        return ResultParser.matchPrefixedField(str, str2, ';', true);
    }

    public static String matchSingleDoCoMoPrefixedField(String str, String str2, boolean z) {
        return ResultParser.matchSinglePrefixedField(str, str2, ';', z);
    }
}
