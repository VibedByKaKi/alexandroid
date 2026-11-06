package org.apache.commons.text.similarity;

import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FuzzyScore {
    private final Locale locale;

    public FuzzyScore(Locale locale) {
        if (locale != null) {
            this.locale = locale;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Locale must not be null");
            throw null;
        }
    }

    public Integer fuzzyScore(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("CharSequences must not be null");
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase(this.locale);
        String lowerCase2 = charSequence2.toString().toLowerCase(this.locale);
        int i = Integer.MIN_VALUE;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < lowerCase2.length(); i4++) {
            char charAt = lowerCase2.charAt(i4);
            boolean z = false;
            while (i3 < lowerCase.length() && !z) {
                if (charAt == lowerCase.charAt(i3)) {
                    int i5 = i2 + 1;
                    if (i + 1 == i3) {
                        i5 = i2 + 3;
                    }
                    i2 = i5;
                    z = true;
                    i = i3;
                }
                i3++;
            }
        }
        return Integer.valueOf(i2);
    }

    public Locale getLocale() {
        return this.locale;
    }
}
