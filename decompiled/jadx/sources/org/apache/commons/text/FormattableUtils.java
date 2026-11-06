package org.apache.commons.text;

import java.util.Formattable;
import java.util.Formatter;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FormattableUtils {
    private static final String SIMPLEST_FORMAT = "%s";

    public static Formatter append(CharSequence charSequence, Formatter formatter, int i, int i2, int i3, char c, CharSequence charSequence2) {
        if (charSequence2 != null && i3 >= 0 && charSequence2.length() > i3) {
            Buffer$$ExternalSyntheticBUOutline0.m("Specified ellipsis '%s' exceeds precision of %s", new Object[]{charSequence2, Integer.valueOf(i3)});
            return null;
        }
        StringBuilder sb = new StringBuilder(charSequence);
        if (i3 >= 0 && i3 < charSequence.length()) {
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            sb.replace(i3 - charSequence2.length(), charSequence.length(), charSequence2.toString());
        }
        boolean z = (i & 1) == 1;
        for (int length = sb.length(); length < i2; length++) {
            sb.insert(z ? length : 0, c);
        }
        formatter.format(sb.toString(), new Object[0]);
        return formatter;
    }

    public static String toString(Formattable formattable) {
        return String.format(SIMPLEST_FORMAT, formattable);
    }

    public static Formatter append(CharSequence charSequence, Formatter formatter, int i, int i2, int i3, char c) {
        return append(charSequence, formatter, i, i2, i3, c, null);
    }

    public static Formatter append(CharSequence charSequence, Formatter formatter, int i, int i2, int i3) {
        return append(charSequence, formatter, i, i2, i3, ' ', null);
    }

    public static Formatter append(CharSequence charSequence, Formatter formatter, int i, int i2, int i3, CharSequence charSequence2) {
        return append(charSequence, formatter, i, i2, i3, ' ', charSequence2);
    }
}
