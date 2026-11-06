package com.amazon.coral.util;

import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NaturalComparator implements Comparator<CharSequence> {
    private static final char MAX_LATIN_DIGIT = '9';
    private static final char MIN_LATIN_DIGIT = '0';
    private final boolean caseInsensitive;
    private final boolean useLatinDigitsOnly;
    public static final Comparator<CharSequence> CASE_SENSITIVE_ORDER = new NaturalComparator(false);
    public static final Comparator<CharSequence> CASE_INSENSITIVE_ORDER = new NaturalComparator(true);
    public static final Comparator<CharSequence> CASE_SENSITIVE_ORDER_WITH_LATIN_DIGITS = new NaturalComparator(false, true);
    public static final Comparator<CharSequence> CASE_INSENSITIVE_ORDER_WITH_LATIN_DIGITS = new NaturalComparator(true, true);

    private NaturalComparator(boolean z) {
        this.caseInsensitive = z;
        this.useLatinDigitsOnly = false;
    }

    private boolean isDigit(char c) {
        return this.useLatinDigitsOnly ? c >= '0' && c <= '9' : Character.isDigit(c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
    
        return r3;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compare(java.lang.CharSequence r10, java.lang.CharSequence r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != r11) goto L4
            return r0
        L4:
            r1 = 1
            if (r10 != 0) goto Le
            int r9 = r11.length()
            int r9 = r9 + r1
            int r9 = -r9
            return r9
        Le:
            if (r11 != 0) goto L16
            int r9 = r10.length()
            int r9 = r9 + r1
            return r9
        L16:
            int r2 = r10.length()
            int r3 = r11.length()
            int r2 = java.lang.Math.min(r2, r3)
            r3 = r0
        L23:
            r4 = -1
            if (r0 >= r2) goto L6a
            char r5 = r10.charAt(r0)
            char r6 = r11.charAt(r0)
            boolean r7 = r9.isDigit(r5)
            boolean r8 = r9.isDigit(r6)
            if (r7 == 0) goto L46
            if (r8 == 0) goto L46
            if (r5 >= r6) goto L40
            if (r3 != 0) goto L67
            r3 = r4
            goto L67
        L40:
            if (r5 <= r6) goto L67
            if (r3 != 0) goto L67
            r3 = r1
            goto L67
        L46:
            if (r7 == 0) goto L49
            return r1
        L49:
            if (r8 == 0) goto L4c
            return r4
        L4c:
            if (r3 == 0) goto L4f
            goto L9f
        L4f:
            boolean r7 = r9.caseInsensitive
            if (r7 == 0) goto L61
            char r5 = java.lang.Character.toLowerCase(r5)
            char r6 = java.lang.Character.toLowerCase(r6)
            if (r5 >= r6) goto L5e
            return r4
        L5e:
            if (r5 <= r6) goto L67
            return r1
        L61:
            if (r5 >= r6) goto L64
            return r4
        L64:
            if (r5 <= r6) goto L67
            return r1
        L67:
            int r0 = r0 + 1
            goto L23
        L6a:
            int r9 = r10.length()
            int r0 = r11.length()
            if (r9 != r0) goto L75
            goto L9f
        L75:
            if (r3 == 0) goto La0
            int r9 = r10.length()
            int r0 = r11.length()
            if (r9 <= r0) goto L90
            int r9 = r11.length()
            char r9 = r10.charAt(r9)
            boolean r9 = java.lang.Character.isDigit(r9)
            if (r9 == 0) goto L9f
            return r1
        L90:
            int r9 = r10.length()
            char r9 = r11.charAt(r9)
            boolean r9 = java.lang.Character.isDigit(r9)
            if (r9 == 0) goto L9f
            return r4
        L9f:
            return r3
        La0:
            int r9 = r10.length()
            int r10 = r11.length()
            int r9 = r9 - r10
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.util.NaturalComparator.compare(java.lang.CharSequence, java.lang.CharSequence):int");
    }

    private NaturalComparator(boolean z, boolean z2) {
        this.caseInsensitive = z;
        this.useLatinDigitsOnly = z2;
    }
}
