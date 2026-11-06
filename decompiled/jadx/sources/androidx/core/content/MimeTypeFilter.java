package androidx.core.content;

import java.util.ArrayList;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class MimeTypeFilter {
    private MimeTypeFilter() {
    }

    public static String matches(String str, String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(split, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    public static String[] matchesMany(String[] strArr, String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(str2.split("/"), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean mimeTypeAgainstFilter(String[] strArr, String[] strArr2) {
        if (strArr2.length != 2) {
            Single$$ExternalSyntheticBUOutline0.m$3("Ill-formatted MIME type filter. Must be type/subtype.");
            return false;
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Ill-formatted MIME type filter. Type or subtype empty.");
            return false;
        }
        if (strArr.length != 2) {
            return false;
        }
        if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }

    public static boolean matches(String str, String str2) {
        if (str == null) {
            return false;
        }
        return mimeTypeAgainstFilter(str.split("/"), str2.split("/"));
    }

    public static String matches(String[] strArr, String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(str2.split("/"), split)) {
                return str2;
            }
        }
        return null;
    }
}
