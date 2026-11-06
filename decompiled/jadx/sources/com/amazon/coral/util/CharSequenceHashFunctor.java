package com.amazon.coral.util;

import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CharSequenceHashFunctor implements HashFunctor<CharSequence> {
    private final boolean caseSensitive;
    private final Comparator<CharSequence> comparator;
    public static final HashFunctor<CharSequence> CASE_SENSITIVE = new CharSequenceHashFunctor(CharSequenceComparator.CASE_SENSITIVE_ORDER);
    public static final HashFunctor<CharSequence> CASE_INSENSITIVE = new CharSequenceHashFunctor(CharSequenceComparator.CASE_INSENSITIVE_ORDER);

    private CharSequenceHashFunctor(Comparator<CharSequence> comparator) {
        this.comparator = comparator;
        this.caseSensitive = comparator == CharSequenceComparator.CASE_SENSITIVE_ORDER;
    }

    @Override // com.amazon.coral.util.HashFunctor
    public boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        return this.comparator.compare(charSequence, charSequence2) == 0;
    }

    @Override // com.amazon.coral.util.HashFunctor
    public int hashCode(CharSequence charSequence) {
        if (this.caseSensitive && ((charSequence instanceof String) || (charSequence instanceof TextSequence))) {
            return charSequence.hashCode();
        }
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int i3 = i * 31;
            char charAt = charSequence.charAt(i2);
            if (!this.caseSensitive) {
                charAt = Character.toLowerCase(charAt);
            }
            i = i3 + charAt;
        }
        return i;
    }
}
