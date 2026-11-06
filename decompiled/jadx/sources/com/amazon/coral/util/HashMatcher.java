package com.amazon.coral.util;

import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class HashMatcher implements Matcher {
    protected final int[] hashes;
    protected final String[] sequences;

    public HashMatcher(CharSequence... charSequenceArr) {
        if (charSequenceArr == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
        }
        this.sequences = new String[charSequenceArr.length];
        this.hashes = new int[charSequenceArr.length];
        while (true) {
            int[] iArr = this.hashes;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = hash(charSequenceArr[i]);
            this.sequences[i] = charSequenceArr[i].toString();
            i++;
        }
    }

    public String[] getSequences() {
        return (String[]) this.sequences.clone();
    }

    public int hash(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            if (charAt != '\"' && charAt != '\'') {
                if (charAt == ';') {
                    break;
                }
                i = (Character.getNumericValue(Character.toLowerCase(charAt)) + i) * 30;
            }
        }
        return i;
    }

    @Override // com.amazon.coral.util.Matcher
    public boolean matches(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int hash = hash(charSequence);
        int i = 0;
        while (true) {
            int[] iArr = this.hashes;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] == hash) {
                return true;
            }
            i++;
        }
    }
}
