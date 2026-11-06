package com.amazon.coral.util;

import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CharSequenceComparator implements Comparator<CharSequence> {
    private final boolean ignoreCase;
    public static final CharSequenceComparator CASE_SENSITIVE_ORDER = new CharSequenceComparator(false);
    public static final CharSequenceComparator CASE_INSENSITIVE_ORDER = new CharSequenceComparator(true);

    public CharSequenceComparator(boolean z) {
        this.ignoreCase = z;
    }

    @Override // java.util.Comparator
    public int compare(CharSequence charSequence, CharSequence charSequence2) {
        int i = 0;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return -(charSequence2.length() + 1);
        }
        if (charSequence2 == null) {
            return charSequence.length() + 1;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            String str = (String) charSequence;
            String str2 = (String) charSequence2;
            return this.ignoreCase ? String.CASE_INSENSITIVE_ORDER.compare(str, str2) : str.compareTo(str2);
        }
        int min = Math.min(charSequence.length(), charSequence2.length());
        while (true) {
            int i2 = min - 1;
            if (min == 0) {
                return charSequence.length() - charSequence2.length();
            }
            char charAt = charSequence.charAt(i);
            int i3 = i + 1;
            char charAt2 = charSequence2.charAt(i);
            if (this.ignoreCase) {
                charAt = Character.toLowerCase(charAt);
                charAt2 = Character.toLowerCase(charAt2);
            }
            if (charAt != charAt2) {
                return charAt - charAt2;
            }
            min = i2;
            i = i3;
        }
    }
}
