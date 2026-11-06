package com.google.auto.value.processor;

import autovalue.shaded.com.google.common.base.Strings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class PropertyNames {
    public static String decapitalizeLikeJavaBeans(String str) {
        return (str == null || str.length() < 2 || !Character.isUpperCase(str.charAt(0)) || !Character.isUpperCase(str.charAt(1))) ? decapitalizeNormally(str) : str;
    }

    public static String decapitalizeNormally(String str) {
        if (Strings.isNullOrEmpty(str)) {
            return str;
        }
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }
}
