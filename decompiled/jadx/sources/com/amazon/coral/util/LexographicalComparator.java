package com.amazon.coral.util;

import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LexographicalComparator implements Comparator<CharSequence> {
    private final boolean caseInsensitive;
    public static final Comparator<CharSequence> CASE_SENSITIVE_ORDER = new LexographicalComparator(false);
    public static final Comparator<CharSequence> CASE_INSENSITIVE_ORDER = new LexographicalComparator(true);

    private LexographicalComparator(boolean z) {
        this.caseInsensitive = z;
    }

    @Override // java.util.Comparator
    public int compare(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return -(charSequence2.length() + 1);
        }
        if (charSequence2 == null) {
            return charSequence.length() + 1;
        }
        for (int i = 0; i < Math.min(charSequence.length(), charSequence2.length()); i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (this.caseInsensitive) {
                char lowerCase = Character.toLowerCase(charAt);
                char lowerCase2 = Character.toLowerCase(charAt2);
                if (lowerCase < lowerCase2) {
                    return -1;
                }
                if (lowerCase > lowerCase2) {
                    return 1;
                }
            } else {
                if (charAt < charAt2) {
                    return -1;
                }
                if (charAt > charAt2) {
                    return 1;
                }
            }
        }
        return charSequence.length() - charSequence2.length();
    }
}
