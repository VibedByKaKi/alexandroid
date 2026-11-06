package junit.framework;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class ComparisonCompactor {
    private static final String DELTA_END = "]";
    private static final String DELTA_START = "[";
    private static final String ELLIPSIS = "...";
    private String fActual;
    private int fContextLength;
    private String fExpected;
    private int fPrefix;
    private int fSuffix;

    public ComparisonCompactor(int i, String str, String str2) {
        this.fContextLength = i;
        this.fExpected = str;
        this.fActual = str2;
    }

    private boolean areStringsEqual() {
        return this.fExpected.equals(this.fActual);
    }

    private String compactString(String str) {
        String m = a$$ExternalSyntheticOutline0.m(new StringBuilder("["), str.substring(this.fPrefix, (str.length() - this.fSuffix) + 1), "]");
        if (this.fPrefix > 0) {
            m = a$$ExternalSyntheticOutline0.m(new StringBuilder(), computeCommonPrefix(), m);
        }
        if (this.fSuffix <= 0) {
            return m;
        }
        StringBuilder m2 = BitVector$$ExternalSyntheticOutline0.m(m);
        m2.append(computeCommonSuffix());
        return m2.toString();
    }

    private String computeCommonPrefix() {
        int i = this.fPrefix;
        int i2 = this.fContextLength;
        return (i > i2 ? ELLIPSIS : "").concat(this.fExpected.substring(Math.max(0, i - i2), this.fPrefix));
    }

    private String computeCommonSuffix() {
        int min = Math.min((this.fExpected.length() - this.fSuffix) + 1 + this.fContextLength, this.fExpected.length());
        String str = this.fExpected;
        return str.substring((str.length() - this.fSuffix) + 1, min).concat((this.fExpected.length() - this.fSuffix) + 1 < this.fExpected.length() - this.fContextLength ? ELLIPSIS : "");
    }

    private void findCommonPrefix() {
        this.fPrefix = 0;
        int min = Math.min(this.fExpected.length(), this.fActual.length());
        while (true) {
            int i = this.fPrefix;
            if (i >= min || this.fExpected.charAt(i) != this.fActual.charAt(this.fPrefix)) {
                return;
            } else {
                this.fPrefix++;
            }
        }
    }

    private void findCommonSuffix() {
        int length = this.fExpected.length() - 1;
        int length2 = this.fActual.length() - 1;
        while (true) {
            int i = this.fPrefix;
            if (length2 < i || length < i || this.fExpected.charAt(length) != this.fActual.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.fSuffix = this.fExpected.length() - length;
    }

    public String compact(String str) {
        if (this.fExpected == null || this.fActual == null || areStringsEqual()) {
            return Assert.format(str, this.fExpected, this.fActual);
        }
        findCommonPrefix();
        findCommonSuffix();
        return Assert.format(str, compactString(this.fExpected), compactString(this.fActual));
    }
}
