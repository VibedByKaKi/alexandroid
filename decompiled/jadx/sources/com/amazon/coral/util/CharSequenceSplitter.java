package com.amazon.coral.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CharSequenceSplitter {
    public static CharSequence[] split(CharSequence charSequence, char c, int i) {
        int i2;
        CharSequence[] charSequenceArr = new CharSequence[i];
        if (charSequence != null) {
            int length = charSequence.length();
            int i3 = 0;
            if (length != 1) {
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    if (charSequence.charAt(i3) == c) {
                        if (i4 == i) {
                            break;
                        }
                        if (i5 != i3) {
                            i2 = i4 + 1;
                            charSequenceArr[i4] = charSequence.subSequence(i5, i3);
                        } else {
                            i2 = i4 + 1;
                            charSequenceArr[i4] = null;
                        }
                        i5 = i3 + 1;
                        i4 = i2;
                    }
                    i3++;
                }
                if (i4 != i && i5 != i3) {
                    charSequenceArr[i4] = charSequence.subSequence(i5, i3);
                }
            } else if (charSequence.charAt(0) != c) {
                charSequenceArr[0] = charSequence;
                return charSequenceArr;
            }
        }
        return charSequenceArr;
    }
}
