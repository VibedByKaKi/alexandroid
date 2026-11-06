package com.upokecenter.cbor;

import com.upokecenter.util.DataUtilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class OptionsParser {
    private final Map<String, String> dict = new HashMap();

    public OptionsParser(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("options");
            throw null;
        }
        if (str.length() > 0) {
            for (String str2 : SplitAt(str, ";")) {
                int indexOf = str2.indexOf(61);
                if (indexOf < 0) {
                    Single$$ExternalSyntheticBUOutline0.m$3("Invalid options String: ".concat(str));
                    throw null;
                }
                this.dict.put(DataUtilities.ToLowerCaseAscii(str2.substring(0, indexOf)), str2.substring(indexOf + 1));
            }
        }
    }

    private static String[] SplitAt(String str, String str2) {
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("delimiter");
            return null;
        }
        if (str2.length() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("delimiter is empty.");
            return null;
        }
        if (str == null || str.length() == 0) {
            return new String[]{""};
        }
        int length = str2.length();
        boolean z = true;
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                break;
            }
            String substring = str.substring(i, (indexOf - i) + i);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(substring);
            i = indexOf + length;
            z = false;
        }
        if (z) {
            return new String[]{str};
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(str.substring(i));
        return (String[]) arrayList.toArray(new String[0]);
    }

    public boolean GetBoolean(String str, boolean z) {
        String ToLowerCaseAscii = DataUtilities.ToLowerCaseAscii(str);
        if (!this.dict.containsKey(ToLowerCaseAscii)) {
            return z;
        }
        String ToLowerCaseAscii2 = DataUtilities.ToLowerCaseAscii(this.dict.get(ToLowerCaseAscii));
        return ToLowerCaseAscii2.equals("1") || ToLowerCaseAscii2.equals("yes") || ToLowerCaseAscii2.equals("on") || ToLowerCaseAscii2.equals("true");
    }

    public String GetLCString(String str, String str2) {
        String ToLowerCaseAscii = DataUtilities.ToLowerCaseAscii(str);
        return this.dict.containsKey(ToLowerCaseAscii) ? DataUtilities.ToLowerCaseAscii(this.dict.get(ToLowerCaseAscii)) : str2;
    }
}
