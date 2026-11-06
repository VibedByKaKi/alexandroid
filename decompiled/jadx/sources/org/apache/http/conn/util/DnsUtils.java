package org.apache.http.conn.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DnsUtils {
    private DnsUtils() {
    }

    private static boolean isUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String normalize(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i = 0;
        while (length > 0 && !isUpper(str.charAt(i))) {
            i++;
            length--;
        }
        if (length <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i);
        while (length > 0) {
            char charAt = str.charAt(i);
            if (isUpper(charAt)) {
                sb.append((char) (charAt + ' '));
            } else {
                sb.append(charAt);
            }
            i++;
            length--;
        }
        return sb.toString();
    }
}
