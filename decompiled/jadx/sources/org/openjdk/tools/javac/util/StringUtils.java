package org.openjdk.tools.javac.util;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class StringUtils {
    public static int indexOfIgnoreCase(String str, String str2, int i) {
        Matcher matcher = Pattern.compile(Pattern.quote(str2), 2).matcher(str);
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase(Locale.US);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase(Locale.US);
    }

    public static int indexOfIgnoreCase(String str, String str2) {
        return indexOfIgnoreCase(str, str2, 0);
    }
}
