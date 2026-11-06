package com.amazon.coral.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ExactHashMatcher extends HashMatcher {
    private final boolean ignoreCase;

    public ExactHashMatcher(boolean z, CharSequence... charSequenceArr) {
        super(charSequenceArr);
        this.ignoreCase = z;
    }

    @Override // com.amazon.coral.util.HashMatcher, com.amazon.coral.util.Matcher
    public boolean matches(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int hash = hash(charSequence);
        String str = null;
        int i = 0;
        while (true) {
            int[] iArr = this.hashes;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] == hash) {
                if (str == null) {
                    str = charSequence.toString();
                }
                boolean z = this.ignoreCase;
                String[] strArr = this.sequences;
                if (z) {
                    if (strArr[i].equalsIgnoreCase(str)) {
                        return true;
                    }
                } else if (strArr[i].equals(str)) {
                    return true;
                }
            }
            i++;
        }
    }

    public ExactHashMatcher(CharSequence... charSequenceArr) {
        this(true, charSequenceArr);
    }
}
