package org.bouncycastle.pqc.math.linearalgebra;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class Permutation {
    private int[] perm;

    public Permutation(byte[] bArr) {
        int[] iArr;
        if (bArr.length <= 4) {
            Single$$ExternalSyntheticBUOutline0.m$3("invalid encoding");
            throw null;
        }
        int i = 0;
        int OS2IP = LittleEndianConversions.OS2IP(bArr, 0);
        int ceilLog256 = IntegerFunctions.ceilLog256(OS2IP - 1);
        if (bArr.length != (OS2IP * ceilLog256) + 4) {
            Single$$ExternalSyntheticBUOutline0.m$3("invalid encoding");
            throw null;
        }
        this.perm = new int[OS2IP];
        while (true) {
            iArr = this.perm;
            if (i >= OS2IP) {
                break;
            }
            iArr[i] = LittleEndianConversions.OS2IP(bArr, (i * ceilLog256) + 4, ceilLog256);
            i++;
        }
        if (isPermutation(iArr)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("invalid encoding");
        throw null;
    }

    private boolean isPermutation(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i : iArr) {
            if (i < 0 || i >= length || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public Permutation computeInverse() {
        Permutation permutation = new Permutation(this.perm.length);
        for (int length = this.perm.length - 1; length >= 0; length--) {
            permutation.perm[this.perm[length]] = length;
        }
        return permutation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Permutation) {
            return IntUtils.equals(this.perm, ((Permutation) obj).perm);
        }
        return false;
    }

    public byte[] getEncoded() {
        int length = this.perm.length;
        int ceilLog256 = IntegerFunctions.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * ceilLog256) + 4];
        LittleEndianConversions.I2OSP(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            LittleEndianConversions.I2OSP(this.perm[i], bArr, (i * ceilLog256) + 4, ceilLog256);
        }
        return bArr;
    }

    public int[] getVector() {
        return IntUtils.clone(this.perm);
    }

    public int hashCode() {
        return Arrays.hashCode(this.perm);
    }

    public Permutation rightMultiply(Permutation permutation) {
        int length = permutation.perm.length;
        int[] iArr = this.perm;
        if (length != iArr.length) {
            Single$$ExternalSyntheticBUOutline0.m$3("length mismatch");
            return null;
        }
        Permutation permutation2 = new Permutation(iArr.length);
        for (int length2 = this.perm.length - 1; length2 >= 0; length2--) {
            permutation2.perm[length2] = this.perm[permutation.perm[length2]];
        }
        return permutation2;
    }

    public String toString() {
        String str = MarkdownConstants.LEFT_BRACKET + this.perm[0];
        for (int i = 1; i < this.perm.length; i++) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ", ");
            m1m.append(this.perm[i]);
            str = m1m.toString();
        }
        return str.concat(MarkdownConstants.RIGHT_BRACKET);
    }

    public Permutation(int i, SecureRandom secureRandom) {
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("invalid length");
            throw null;
        }
        this.perm = new int[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            int nextInt = RandUtils.nextInt(secureRandom, i3);
            i3--;
            this.perm[i4] = iArr[nextInt];
            iArr[nextInt] = iArr[i3];
        }
    }

    public Permutation(int i) {
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("invalid length");
            throw null;
        }
        this.perm = new int[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.perm[i2] = i2;
        }
    }

    public Permutation(int[] iArr) {
        if (isPermutation(iArr)) {
            this.perm = IntUtils.clone(iArr);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("array is not a permutation vector");
            throw null;
        }
    }
}
