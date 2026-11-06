package com.amazon.apl.android.utils;

import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLTextUtil {
    public static int[] calculateCharacterOffsetByRange(String str, int i, int i2) {
        return new int[]{nCountCharactersInRange(str, 0, i), (nCountCharactersInRange(str, i, (i2 - i) + 1) + r0) - 1};
    }

    private static native int nCountCharactersInRange(String str, int i, int i2);

    public static String[] splitFontFamilies(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length && (str.charAt(i) == ' ' || str.charAt(i) == ',')) {
            i++;
        }
        while (i < length) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                indexOf = length;
            }
            int i2 = indexOf;
            while (i2 > i && str.charAt(i2 - 1) == ' ') {
                i2--;
            }
            arrayList.add(str.substring(i, i2));
            i = indexOf + 1;
            while (i < length && (str.charAt(i) == ' ' || str.charAt(i) == ',')) {
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
