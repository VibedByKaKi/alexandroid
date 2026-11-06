package org.bouncycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class ComputeInField {
    private short[][] A;
    short[] x;

    private void computeZerosAbove() throws RuntimeException {
        for (int length = this.A.length - 1; length > 0; length--) {
            for (int i = length - 1; i >= 0; i--) {
                short[][] sArr = this.A;
                short s = sArr[i][length];
                short invElem = GF2Field.invElem(sArr[length][length]);
                if (invElem == 0) {
                    Single$$ExternalSyntheticBUOutline0.m("The matrix is not invertible");
                    return;
                }
                int i2 = length;
                while (true) {
                    short[][] sArr2 = this.A;
                    if (i2 < sArr2.length * 2) {
                        short multElem = GF2Field.multElem(s, GF2Field.multElem(sArr2[length][i2], invElem));
                        short[] sArr3 = this.A[i];
                        sArr3[i2] = GF2Field.addElem(sArr3[i2], multElem);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void computeZerosUnder(boolean r10) throws java.lang.RuntimeException {
        /*
            r9 = this;
            short[][] r0 = r9.A
            if (r10 == 0) goto L8
            int r10 = r0.length
            int r10 = r10 * 2
            goto Lb
        L8:
            int r10 = r0.length
            int r10 = r10 + 1
        Lb:
            r0 = 0
        Lc:
            short[][] r1 = r9.A
            int r1 = r1.length
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L54
            int r1 = r0 + 1
            r2 = r1
        L16:
            short[][] r3 = r9.A
            int r4 = r3.length
            if (r2 >= r4) goto L52
            r4 = r3[r2]
            short r4 = r4[r0]
            r3 = r3[r0]
            short r3 = r3[r0]
            short r3 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.invElem(r3)
            if (r3 == 0) goto L4c
            r5 = r0
        L2a:
            if (r5 >= r10) goto L49
            short[][] r6 = r9.A
            r6 = r6[r0]
            short r6 = r6[r5]
            short r6 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(r6, r3)
            short r6 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(r4, r6)
            short[][] r7 = r9.A
            r7 = r7[r2]
            short r8 = r7[r5]
            short r6 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(r8, r6)
            r7[r5] = r6
            int r5 = r5 + 1
            goto L2a
        L49:
            int r2 = r2 + 1
            goto L16
        L4c:
            java.lang.String r9 = "Matrix not invertible! We have to choose another one!"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r9)
            return
        L52:
            r0 = r1
            goto Lc
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField.computeZerosUnder(boolean):void");
    }

    private void substitute() throws IllegalStateException {
        String str;
        short[][] sArr;
        short invElem = GF2Field.invElem(this.A[r0.length - 1][r0.length - 1]);
        if (invElem != 0) {
            short[] sArr2 = this.x;
            short[][] sArr3 = this.A;
            sArr2[sArr3.length - 1] = GF2Field.multElem(sArr3[sArr3.length - 1][sArr3.length], invElem);
            for (int length = this.A.length - 2; length >= 0; length--) {
                short[][] sArr4 = this.A;
                short s = sArr4[length][sArr4.length];
                int length2 = sArr4.length;
                while (true) {
                    length2--;
                    sArr = this.A;
                    if (length2 <= length) {
                        break;
                    } else {
                        s = GF2Field.addElem(s, GF2Field.multElem(sArr[length][length2], this.x[length2]));
                    }
                }
                short invElem2 = GF2Field.invElem(sArr[length][length]);
                if (invElem2 != 0) {
                    this.x[length] = GF2Field.multElem(s, invElem2);
                } else {
                    str = "Not solvable equation system";
                }
            }
            return;
        }
        str = "The equation system is not solvable";
        Single$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            Single$$ExternalSyntheticBUOutline0.m("Addition is not possible!");
            return null;
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i][i2] = GF2Field.addElem(sArr[i][i2], sArr2[i][i2]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            Single$$ExternalSyntheticBUOutline0.m("Multiplication is not possible!");
            return null;
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr3[i] = GF2Field.addElem(sArr[i], sArr2[i]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        short[][] sArr2;
        Class cls = Short.TYPE;
        try {
            int i = 0;
            this.A = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i2 = 0; i2 < sArr.length; i2++) {
                for (int i3 = 0; i3 < sArr.length; i3++) {
                    this.A[i2][i3] = sArr[i2][i3];
                }
                int length = sArr.length;
                while (true) {
                    int length2 = sArr.length * 2;
                    sArr2 = this.A;
                    if (length < length2) {
                        sArr2[i2][length] = 0;
                        length++;
                    }
                }
                sArr2[i2][sArr2.length + i2] = 1;
            }
            computeZerosUnder(true);
            int i4 = 0;
            while (true) {
                short[][] sArr3 = this.A;
                if (i4 >= sArr3.length) {
                    break;
                }
                short invElem = GF2Field.invElem(sArr3[i4][i4]);
                int i5 = i4;
                while (true) {
                    short[][] sArr4 = this.A;
                    if (i5 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i4];
                        sArr5[i5] = GF2Field.multElem(sArr5[i5], invElem);
                        i5++;
                    }
                }
                i4++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) cls, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.A;
                if (i >= sArr8.length) {
                    return sArr7;
                }
                int length3 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.A;
                    if (length3 < sArr9.length * 2) {
                        sArr7[i][length3 - sArr9.length] = sArr9[i][length3];
                        length3++;
                    }
                }
                i++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = GF2Field.multElem(s, sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i = 0; i < length; i++) {
            sArr2[i] = GF2Field.multElem(s, sArr[i]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            Single$$ExternalSyntheticBUOutline0.m("Multiplication is not possible!");
            return null;
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i][i2] = GF2Field.multElem(sArr[i], sArr2[i2]);
            }
        }
        return sArr3;
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            Single$$ExternalSyntheticBUOutline0.m("Multiplication is not possible!");
            return null;
        }
        this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                for (int i3 = 0; i3 < sArr2[0].length; i3++) {
                    short multElem = GF2Field.multElem(sArr[i][i2], sArr2[i2][i3]);
                    short[] sArr3 = this.A[i];
                    sArr3[i3] = GF2Field.addElem(sArr3[i3], multElem);
                }
            }
        }
        return this.A;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.x = new short[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                for (int i2 = 0; i2 < sArr[0].length; i2++) {
                    this.A[i][i2] = sArr[i][i2];
                }
            }
            for (int i3 = 0; i3 < sArr2.length; i3++) {
                short[] sArr3 = this.A[i3];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i3], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.x;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            Single$$ExternalSyntheticBUOutline0.m("Multiplication is not possible!");
            return null;
        }
        short[] sArr3 = new short[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr2.length; i2++) {
                sArr3[i] = GF2Field.addElem(sArr3[i], GF2Field.multElem(sArr[i][i2], sArr2[i2]));
            }
        }
        return sArr3;
    }
}
