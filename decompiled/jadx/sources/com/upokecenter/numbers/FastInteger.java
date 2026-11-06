package com.upokecenter.numbers;

import androidx.collection.SieveCacheKt;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class FastInteger implements Comparable<FastInteger> {
    private static final String Digits = "0123456789ABCDEF";
    private static final EInteger ValueInt32MaxValue;
    private static final EInteger ValueInt32MinValue;
    private static final EInteger ValueNegativeInt32MinValue;
    private boolean frozen;
    private int integerMode;
    private EInteger largeValue;
    private MutableNumber mnum;
    private int smallValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MutableNumber {
        private int[] data;
        private int wordCount;

        public MutableNumber(int i) {
            if (i < 0) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "val(", ") is less than 0 "));
                throw null;
            }
            int[] iArr = new int[4];
            this.data = iArr;
            this.wordCount = i == 0 ? 0 : 1;
            iArr[0] = i;
        }

        public static MutableNumber FromEInteger(EInteger eInteger) {
            MutableNumber mutableNumber = new MutableNumber(0);
            if (eInteger.signum() < 0) {
                CodecsKt$$ExternalSyntheticBUOutline0.m(eInteger.signum(), "bigintVal's sign(", ") is less than 0 ");
                return null;
            }
            byte[] ToBytes = eInteger.ToBytes(true);
            int length = ToBytes.length;
            int max = Math.max(4, (length / 4) + 1);
            if (max > mutableNumber.data.length) {
                mutableNumber.data = new int[max];
            }
            mutableNumber.wordCount = max;
            for (int i = 0; i < length; i += 4) {
                int i2 = ToBytes[i] & 255;
                int i3 = i + 1;
                if (i3 < length) {
                    i2 |= (ToBytes[i3] & 255) << 8;
                }
                int i4 = i + 2;
                if (i4 < length) {
                    i2 |= (ToBytes[i4] & 255) << 16;
                }
                int i5 = i + 3;
                if (i5 < length) {
                    i2 |= (ToBytes[i5] & 255) << 24;
                }
                mutableNumber.data[i >> 2] = i2;
            }
            while (true) {
                int i6 = mutableNumber.wordCount;
                if (i6 == 0 || mutableNumber.data[i6 - 1] != 0) {
                    break;
                }
                mutableNumber.wordCount = i6 - 1;
            }
            return mutableNumber;
        }

        public static MutableNumber FromInt64(long j) {
            if (j < 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("longVal");
                return null;
            }
            if (j == 0) {
                return new MutableNumber(0);
            }
            MutableNumber mutableNumber = new MutableNumber(0);
            int[] iArr = mutableNumber.data;
            iArr[0] = (int) j;
            int i = (int) (j >> 32);
            iArr[1] = i;
            mutableNumber.wordCount = i != 0 ? 2 : 1;
            return mutableNumber;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[LOOP:0: B:10:0x001c->B:21:0x0045, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[EDGE_INSN: B:22:0x0074->B:23:0x0074 BREAK  A[LOOP:0: B:10:0x001c->B:21:0x0045], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.upokecenter.numbers.FastInteger.MutableNumber Add(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L75
                if (r9 == 0) goto L63
                int r0 = r8.wordCount
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L1a
                int[] r0 = r8.data
                int r0 = r0.length
                if (r0 != 0) goto L14
                r0 = 4
                int[] r0 = new int[r0]
                r8.data = r0
            L14:
                int[] r0 = r8.data
                r0[r2] = r2
                r8.wordCount = r1
            L1a:
                r0 = r2
                r3 = r0
            L1c:
                int r4 = r8.wordCount
                if (r0 >= r4) goto L49
                int[] r4 = r8.data
                r5 = r4[r0]
                int r6 = r5 + r9
                int r6 = r6 + r3
                int r3 = r6 >> 31
                int r7 = r5 >> 31
                if (r3 != r7) goto L36
                r3 = 2147483647(0x7fffffff, float:NaN)
                r7 = r6 & r3
                r3 = r3 & r5
                if (r7 >= r3) goto L38
                goto L3f
            L36:
                if (r3 == 0) goto L3f
            L38:
                if (r6 != r5) goto L3d
                if (r9 == 0) goto L3d
                goto L3f
            L3d:
                r3 = r2
                goto L40
            L3f:
                r3 = r1
            L40:
                r4[r0] = r6
                if (r3 != 0) goto L45
                goto L74
            L45:
                int r0 = r0 + 1
                r9 = r2
                goto L1c
            L49:
                if (r3 == 0) goto L63
                int[] r9 = r8.data
                int r0 = r9.length
                if (r4 < r0) goto L5a
                int r4 = r4 + 20
                int[] r0 = new int[r4]
                int r4 = r9.length
                java.lang.System.arraycopy(r9, r2, r0, r2, r4)
                r8.data = r0
            L5a:
                int[] r9 = r8.data
                int r0 = r8.wordCount
                r9[r0] = r3
                int r0 = r0 + r1
                r8.wordCount = r0
            L63:
                int r9 = r8.wordCount
                if (r9 == 0) goto L74
                int[] r0 = r8.data
                int r1 = r9 + (-1)
                r0 = r0[r1]
                if (r0 != 0) goto L74
                int r9 = r9 + (-1)
                r8.wordCount = r9
                goto L63
            L74:
                return r8
            L75:
                java.lang.String r8 = "augend("
                java.lang.String r0 = ") is less than 0 "
                java.lang.String r8 = defpackage.a$$ExternalSyntheticOutline0.m(r9, r8, r0)
                rx.Single$$ExternalSyntheticBUOutline0.m$3(r8)
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.FastInteger.MutableNumber.Add(int):com.upokecenter.numbers.FastInteger$MutableNumber");
        }

        public boolean CanFitInInt32() {
            int i = this.wordCount;
            return i == 0 || (i == 1 && (this.data[0] >> 31) == 0);
        }

        public int CompareToInt(int i) {
            int i2;
            if (i >= 0 && (i2 = this.wordCount) <= 1) {
                if (i2 == 0) {
                    return i == 0 ? 0 : -1;
                }
                int i3 = this.data[0];
                if (i3 == i) {
                    return 0;
                }
                if ((i3 >> 31) != (i >> 31) ? (i3 >> 31) == 0 : (i3 & Integer.MAX_VALUE) < (i & Integer.MAX_VALUE)) {
                    return -1;
                }
            }
            return 1;
        }

        public MutableNumber Copy() {
            MutableNumber mutableNumber = new MutableNumber(0);
            int i = this.wordCount;
            if (i > mutableNumber.data.length) {
                mutableNumber.data = new int[i];
            }
            System.arraycopy(this.data, 0, mutableNumber.data, 0, i);
            mutableNumber.wordCount = this.wordCount;
            return mutableNumber;
        }

        public int[] GetLastWordsInternal(int i) {
            int[] iArr = new int[i];
            System.arraycopy(this.data, 0, iArr, 0, Math.min(i, this.wordCount));
            return iArr;
        }

        public MutableNumber Multiply(int i) {
            int i2;
            long j;
            int i3;
            if (i < 0) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "multiplicand(", ") is less than 0 "));
                return null;
            }
            if (i == 0) {
                int[] iArr = this.data;
                if (iArr.length > 0) {
                    iArr[0] = 0;
                }
                this.wordCount = 0;
                return this;
            }
            if (this.wordCount == 0) {
                if (this.data.length == 0) {
                    this.data = new int[4];
                }
                this.data[0] = 0;
                this.wordCount = 1;
            }
            int i4 = this.wordCount;
            if (i < 65536) {
                if (i4 == 2) {
                    int[] iArr2 = this.data;
                    int i5 = iArr2[1];
                    if ((i5 >> 16) == 0) {
                        long j2 = ((4294967295L & iArr2[0]) | (i5 << 32)) * i;
                        iArr2[0] = (int) j2;
                        iArr2[1] = (int) (j2 >> 32);
                        i3 = 0;
                    }
                }
                if (i4 == 1) {
                    j = (4294967295L & r1[0]) * i;
                    this.data[0] = (int) j;
                    i3 = (int) (j >> 32);
                } else {
                    i2 = 0;
                    int i6 = 0;
                    while (i6 < this.wordCount) {
                        int[] iArr3 = this.data;
                        int i7 = iArr3[i6];
                        int i8 = (i7 & 65535) * i;
                        int i9 = ((i7 >> 16) & 65535) * i;
                        int i10 = ((i8 >> 16) & 65535) + (i9 & 65535);
                        int i11 = ((i9 >> 16) & 65535) + ((i10 >> 16) & 65535);
                        int i12 = ((i10 & 65535) << 16) | (i8 & 65535);
                        int i13 = (((i11 >> 16) & 65535) << 16) | (i11 & 65535);
                        int i14 = i2 + i12;
                        int i15 = i14 >> 31;
                        if (i15 == (i12 >> 31)) {
                            if ((i14 & Integer.MAX_VALUE) >= (i12 & Integer.MAX_VALUE)) {
                                iArr3[i6] = i14;
                                i6++;
                                i2 = i13;
                            }
                            i13++;
                            iArr3[i6] = i14;
                            i6++;
                            i2 = i13;
                        } else {
                            if (i15 != 0) {
                                iArr3[i6] = i14;
                                i6++;
                                i2 = i13;
                            }
                            i13++;
                            iArr3[i6] = i14;
                            i6++;
                            i2 = i13;
                        }
                    }
                    i3 = i2;
                }
            } else if (i4 == 1) {
                j = (4294967295L & r1[0]) * i;
                this.data[0] = (int) j;
                i3 = (int) (j >> 32);
            } else {
                i2 = 0;
                int i16 = 0;
                while (i16 < this.wordCount) {
                    int[] iArr4 = this.data;
                    int i17 = iArr4[i16];
                    int i18 = i17 & 65535;
                    int i19 = i & 65535;
                    int i20 = (i17 >> 16) & 65535;
                    int i21 = (i >> 16) & 65535;
                    int i22 = i18 * i19;
                    int i23 = i18 * i21;
                    int i24 = ((i22 >> 16) & 65535) + (i23 & 65535);
                    int i25 = ((i23 >> 16) & 65535) + ((i24 >> 16) & 65535);
                    int i26 = i19 * i20;
                    int i27 = (i24 & 65535) + (i26 & 65535);
                    int i28 = i25 + ((i26 >> 16) & 65535) + ((i27 >> 16) & 65535);
                    int i29 = i20 * i21;
                    int i30 = (i28 & 65535) + (i29 & 65535);
                    int i31 = ((i27 & 65535) << 16) | (i22 & 65535);
                    int i32 = (i30 & 65535) | (((((i28 >> 16) & 65535) + ((i29 >> 16) & 65535)) + ((i30 >> 16) & 65535)) << 16);
                    int i33 = i2 + i31;
                    int i34 = i33 >> 31;
                    if (i34 == (i31 >> 31)) {
                        if ((i33 & Integer.MAX_VALUE) >= (i31 & Integer.MAX_VALUE)) {
                            iArr4[i16] = i33;
                            i16++;
                            i2 = i32;
                        }
                        i32++;
                        iArr4[i16] = i33;
                        i16++;
                        i2 = i32;
                    } else {
                        if (i34 != 0) {
                            iArr4[i16] = i33;
                            i16++;
                            i2 = i32;
                        }
                        i32++;
                        iArr4[i16] = i33;
                        i16++;
                        i2 = i32;
                    }
                }
                i3 = i2;
            }
            if (i3 != 0) {
                int i35 = this.wordCount;
                int[] iArr5 = this.data;
                if (i35 >= iArr5.length) {
                    int[] iArr6 = new int[i35 + 20];
                    System.arraycopy(iArr5, 0, iArr6, 0, iArr5.length);
                    this.data = iArr6;
                }
                int[] iArr7 = this.data;
                int i36 = this.wordCount;
                iArr7[i36] = i3;
                this.wordCount = i36 + 1;
            }
            while (true) {
                int i37 = this.wordCount;
                if (i37 == 0 || this.data[i37 - 1] != 0) {
                    break;
                }
                this.wordCount = i37 - 1;
            }
            return this;
        }

        public MutableNumber SetInt(int i) {
            if (i < 0) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "val(", ") is less than 0 "));
                return null;
            }
            this.wordCount = i == 0 ? 0 : 1;
            this.data[0] = i;
            return this;
        }

        public MutableNumber Subtract(MutableNumber mutableNumber) {
            int i = this.wordCount;
            int i2 = mutableNumber.wordCount;
            if (i <= i2) {
                i = i2;
            }
            int[] iArr = this.data;
            if (iArr.length < i) {
                int[] iArr2 = new int[i + 20];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                this.data = iArr2;
            }
            int i3 = this.wordCount;
            int i4 = mutableNumber.wordCount;
            if (i3 >= i4) {
                i3 = i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int[] iArr3 = this.data;
                int i7 = iArr3[i6];
                int i8 = mutableNumber.data[i6];
                int i9 = (i7 - i8) - i5;
                int i10 = i7 >> 31;
                if (i10 != (i9 >> 31) ? i10 != 0 : (i7 & Integer.MAX_VALUE) >= (Integer.MAX_VALUE & i9)) {
                    if (i7 != i9 || i8 == 0) {
                        i5 = 0;
                        iArr3[i6] = i9;
                    }
                }
                i5 = 1;
                iArr3[i6] = i9;
            }
            if (i5 != 0) {
                while (i3 < this.wordCount) {
                    int[] iArr4 = this.data;
                    int i11 = iArr4[i3];
                    int i12 = i3 >= mutableNumber.wordCount ? 0 : mutableNumber.data[i3];
                    int i13 = (i11 - i12) - i5;
                    int i14 = i11 >> 31;
                    if (i14 != (i13 >> 31) ? i14 != 0 : (i11 & Integer.MAX_VALUE) >= (i13 & Integer.MAX_VALUE)) {
                        if (i11 != i13 || i12 == 0) {
                            i5 = 0;
                            iArr4[i3] = i13;
                            i3++;
                        }
                    }
                    i5 = 1;
                    iArr4[i3] = i13;
                    i3++;
                }
            }
            while (true) {
                int i15 = this.wordCount;
                if (i15 == 0 || this.data[i15 - 1] != 0) {
                    break;
                }
                this.wordCount = i15 - 1;
            }
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.upokecenter.numbers.FastInteger.MutableNumber SubtractInt(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L74
                if (r9 == 0) goto L73
                int r0 = r8.wordCount
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L1a
                int[] r0 = r8.data
                int r0 = r0.length
                if (r0 != 0) goto L14
                r0 = 4
                int[] r0 = new int[r0]
                r8.data = r0
            L14:
                int[] r0 = r8.data
                r0[r1] = r1
                r8.wordCount = r2
            L1a:
                int[] r0 = r8.data
                r3 = r0[r1]
                int r4 = r3 - r9
                int r5 = r3 >> 31
                int r6 = r4 >> 31
                r7 = 2147483647(0x7fffffff, float:NaN)
                if (r5 != r6) goto L30
                r5 = r3 & r7
                r6 = r4 & r7
                if (r5 >= r6) goto L32
                goto L39
            L30:
                if (r5 == 0) goto L39
            L32:
                if (r3 != r4) goto L37
                if (r9 == 0) goto L37
                goto L39
            L37:
                r9 = r1
                goto L3a
            L39:
                r9 = r2
            L3a:
                r0[r1] = r4
                if (r9 == 0) goto L62
                r0 = r2
            L3f:
                int r3 = r8.wordCount
                if (r0 >= r3) goto L62
                int[] r3 = r8.data
                r4 = r3[r0]
                int r9 = r4 - r9
                int r5 = r4 >> 31
                int r6 = r9 >> 31
                if (r5 != r6) goto L55
                r4 = r4 & r7
                r5 = r9 & r7
                if (r4 >= r5) goto L5b
                goto L59
            L55:
                int r4 = r4 >> 31
                if (r4 != 0) goto L5b
            L59:
                r4 = r2
                goto L5c
            L5b:
                r4 = r1
            L5c:
                r3[r0] = r9
                int r0 = r0 + 1
                r9 = r4
                goto L3f
            L62:
                int r9 = r8.wordCount
                if (r9 == 0) goto L73
                int[] r0 = r8.data
                int r1 = r9 + (-1)
                r0 = r0[r1]
                if (r0 != 0) goto L73
                int r9 = r9 + (-1)
                r8.wordCount = r9
                goto L62
            L73:
                return r8
            L74:
                java.lang.String r8 = "other("
                java.lang.String r0 = ") is less than 0 "
                java.lang.String r8 = defpackage.a$$ExternalSyntheticOutline0.m(r9, r8, r0)
                rx.Single$$ExternalSyntheticBUOutline0.m$3(r8)
                r8 = 0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.FastInteger.MutableNumber.SubtractInt(int):com.upokecenter.numbers.FastInteger$MutableNumber");
        }

        public EInteger ToEInteger() {
            int i = this.wordCount;
            if (i == 1) {
                int i2 = this.data[0];
                if ((i2 >> 31) == 0) {
                    return EInteger.FromInt64(i2);
                }
            }
            if (i == 2) {
                int i3 = this.data[1];
                if ((i3 >> 31) == 0) {
                    return EInteger.FromInt64((r3[0] & 4294967295L) | (i3 << 32));
                }
            }
            return EInteger.FromInts(this.data, i);
        }

        public int ToInt32() {
            if (this.wordCount == 0) {
                return 0;
            }
            return this.data[0];
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
        
            return -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[LOOP:0: B:7:0x000c->B:14:0x002d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compareTo(com.upokecenter.numbers.FastInteger.MutableNumber r8) {
            /*
                r7 = this;
                int r0 = r7.wordCount
                int r1 = r8.wordCount
                r2 = 1
                r3 = -1
                if (r0 == r1) goto Lc
                if (r0 >= r1) goto Lb
                return r3
            Lb:
                return r2
            Lc:
                int r1 = r0 + (-1)
                if (r0 == 0) goto L2f
                int[] r0 = r7.data
                r0 = r0[r1]
                int[] r4 = r8.data
                r4 = r4[r1]
                int r5 = r0 >> 31
                int r6 = r4 >> 31
                if (r5 != r6) goto L27
                r5 = 2147483647(0x7fffffff, float:NaN)
                r6 = r0 & r5
                r5 = r5 & r4
                if (r6 >= r5) goto L2a
                goto L29
            L27:
                if (r5 != 0) goto L2a
            L29:
                return r3
            L2a:
                if (r0 == r4) goto L2d
                return r2
            L2d:
                r0 = r1
                goto Lc
            L2f:
                r7 = 0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.FastInteger.MutableNumber.compareTo(com.upokecenter.numbers.FastInteger$MutableNumber):int");
        }

        public final boolean isEvenNumber() {
            return this.wordCount == 0 || (this.data[0] & 1) == 0;
        }

        public final int signum() {
            return this.wordCount == 0 ? 0 : 1;
        }
    }

    static {
        EInteger FromInt64 = EInteger.FromInt64(SieveCacheKt.NodeMetaAndPreviousMask);
        ValueInt32MinValue = FromInt64;
        ValueInt32MaxValue = EInteger.FromInt64(SieveCacheKt.NodeLinkMask);
        ValueNegativeInt32MinValue = FromInt64.Negate();
    }

    public FastInteger(int i) {
        this.smallValue = i;
    }

    public static FastInteger CopyFrozen(FastInteger fastInteger) {
        FastInteger fastInteger2 = new FastInteger(fastInteger.smallValue);
        fastInteger2.integerMode = fastInteger.integerMode;
        fastInteger2.largeValue = fastInteger.largeValue;
        MutableNumber mutableNumber = fastInteger.mnum;
        fastInteger2.mnum = (mutableNumber == null || fastInteger.integerMode != 1) ? null : mutableNumber.Copy();
        fastInteger2.frozen = true;
        return fastInteger2;
    }

    public static FastInteger FromBig(EInteger eInteger) {
        if (eInteger.CanFitInInt32()) {
            return new FastInteger(eInteger.ToInt32Unchecked());
        }
        if (eInteger.signum() <= 0 || eInteger.GetUnsignedBitLengthAsInt64() >= 2048) {
            FastInteger fastInteger = new FastInteger(0);
            fastInteger.integerMode = 2;
            fastInteger.largeValue = eInteger;
            return fastInteger;
        }
        FastInteger fastInteger2 = new FastInteger(0);
        fastInteger2.integerMode = 1;
        fastInteger2.mnum = MutableNumber.FromEInteger(eInteger);
        return fastInteger2;
    }

    public static FastInteger FromInt64(long j) {
        return (j < SieveCacheKt.NodeMetaAndPreviousMask || j > SieveCacheKt.NodeLinkMask) ? FromBig(EInteger.FromInt64(j)) : new FastInteger((int) j);
    }

    public static int[] GetLastWords(EInteger eInteger, int i) {
        return MutableNumber.FromEInteger(eInteger).GetLastWordsInternal(i);
    }

    public static String IntToString(int i) {
        char[] cArr;
        if (i == 0) {
            return Constants.FEEDBACK_TYPE_DISLIKE;
        }
        if (i == Integer.MIN_VALUE) {
            return "-2147483648";
        }
        boolean z = i < 0;
        if (z) {
            i = -i;
        }
        if (i < 100000) {
            int i2 = 5;
            if (z) {
                cArr = new char[6];
            } else {
                cArr = new char[5];
                i2 = 4;
            }
            while (i > 9) {
                int i3 = (((i >> 1) * 52429) >> 18) & 16383;
                cArr[i2] = Digits.charAt(i - (i3 * 10));
                i = i3;
                i2--;
            }
            if (i != 0) {
                cArr[i2] = Digits.charAt(i);
                i2--;
            }
            if (z) {
                cArr[i2] = '-';
            } else {
                i2++;
            }
            return new String(cArr, i2, cArr.length - i2);
        }
        char[] cArr2 = new char[12];
        int i4 = 11;
        while (i >= 163840) {
            int i5 = i / 10;
            cArr2[i4] = Digits.charAt(i - (i5 * 10));
            i = i5;
            i4--;
        }
        while (i > 9) {
            int i6 = (((i >> 1) * 52429) >> 18) & 16383;
            cArr2[i4] = Digits.charAt(i - (i6 * 10));
            i = i6;
            i4--;
        }
        if (i != 0) {
            cArr2[i4] = Digits.charAt(i);
            i4--;
        }
        if (z) {
            cArr2[i4] = '-';
        } else {
            i4++;
        }
        return new String(cArr2, i4, 12 - i4);
    }

    public static String LongToString(long j) {
        if (j == Long.MIN_VALUE) {
            return "-9223372036854775808";
        }
        if (j == 0) {
            return Constants.FEEDBACK_TYPE_DISLIKE;
        }
        boolean z = j < 0;
        int i = (int) j;
        if (i == j) {
            return IntToString(i);
        }
        char[] cArr = new char[24];
        int i2 = 23;
        if (z) {
            j = -j;
        }
        while (j >= 163840) {
            long j2 = j / 10;
            cArr[i2] = Digits.charAt((int) (j - (10 * j2)));
            i2--;
            j = j2;
        }
        while (j > 9) {
            long j3 = (((j >> 1) * 52429) >> 18) & 16383;
            cArr[i2] = Digits.charAt((int) (j - (j3 * 10)));
            i2--;
            j = j3;
        }
        if (j != 0) {
            cArr[i2] = Digits.charAt((int) j);
            i2--;
        }
        if (z) {
            cArr[i2] = '-';
        } else {
            i2++;
        }
        return new String(cArr, i2, 24 - i2);
    }

    public FastInteger Abs() {
        if (this.frozen) {
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        if (this.integerMode != 0) {
            return signum() < 0 ? Negate() : this;
        }
        int i = this.smallValue;
        if (i == Integer.MIN_VALUE) {
            return Negate();
        }
        this.smallValue = Math.abs(i);
        return this;
    }

    public FastInteger Add(FastInteger fastInteger) {
        int i;
        int i2 = this.integerMode;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.largeValue = this.largeValue.Add(fastInteger.ToEInteger());
                    return this;
                }
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            if (fastInteger.integerMode == 0 && (i = fastInteger.smallValue) >= 0) {
                this.mnum.Add(i);
                return this;
            }
            this.integerMode = 2;
            this.largeValue = this.mnum.ToEInteger();
            this.largeValue = this.largeValue.Add(fastInteger.ToEInteger());
            return this;
        }
        if (fastInteger.integerMode != 0) {
            this.integerMode = 2;
            this.largeValue = EInteger.FromInt32(this.smallValue);
            this.largeValue = this.largeValue.Add(fastInteger.ToEInteger());
            return this;
        }
        int i3 = this.smallValue;
        if ((i3 >= 0 || fastInteger.smallValue >= Integer.MIN_VALUE - i3) && (i3 <= 0 || fastInteger.smallValue <= Integer.MAX_VALUE - i3)) {
            this.smallValue = i3 + fastInteger.smallValue;
            return this;
        }
        if (fastInteger.smallValue >= 0) {
            this.integerMode = 1;
            MutableNumber mutableNumber = new MutableNumber(i3);
            this.mnum = mutableNumber;
            mutableNumber.Add(fastInteger.smallValue);
            return this;
        }
        this.integerMode = 2;
        EInteger FromInt32 = EInteger.FromInt32(i3);
        this.largeValue = FromInt32;
        this.largeValue = FromInt32.Add(EInteger.FromInt64(fastInteger.smallValue));
        return this;
    }

    public FastInteger AddBig(EInteger eInteger) {
        int i = this.integerMode;
        if (i == 0) {
            return eInteger.CanFitInInt32() ? AddInt(eInteger.ToInt32Checked()) : Add(FromBig(eInteger));
        }
        if (i != 1) {
            if (i == 2) {
                this.largeValue = this.largeValue.Add(eInteger);
                return this;
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        this.integerMode = 2;
        EInteger ToEInteger = this.mnum.ToEInteger();
        this.largeValue = ToEInteger;
        this.largeValue = ToEInteger.Add(eInteger);
        return this;
    }

    public FastInteger AddInt(int i) {
        int i2 = this.integerMode;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    Duration$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                this.largeValue = this.largeValue.Add(EInteger.FromInt32(i));
                return this;
            }
            if (i >= 0) {
                this.mnum.Add(i);
                return this;
            }
            this.integerMode = 2;
            this.largeValue = this.mnum.ToEInteger();
            this.largeValue = this.largeValue.Add(EInteger.FromInt32(i));
            return this;
        }
        int i3 = this.smallValue;
        if ((i3 >= 0 || i >= Integer.MIN_VALUE - i3) && (i3 <= 0 || i <= Integer.MAX_VALUE - i3)) {
            this.smallValue = i3 + i;
            return this;
        }
        if (i >= 0) {
            this.integerMode = 1;
            MutableNumber mutableNumber = new MutableNumber(i3);
            this.mnum = mutableNumber;
            mutableNumber.Add(i);
            return this;
        }
        this.integerMode = 2;
        EInteger FromInt32 = EInteger.FromInt32(i3);
        this.largeValue = FromInt32;
        this.largeValue = FromInt32.Add(EInteger.FromInt32(i));
        return this;
    }

    public FastInteger AddInt64(long j) {
        return (j < SieveCacheKt.NodeMetaAndPreviousMask || j > SieveCacheKt.NodeLinkMask) ? AddBig(EInteger.FromInt64(j)) : AddInt((int) j);
    }

    public boolean CanFitInInt32() {
        int i = this.integerMode;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return this.mnum.CanFitInInt32();
        }
        if (i == 2) {
            return this.largeValue.CanFitInInt32();
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return false;
    }

    public boolean CanFitInInt64() {
        int i = this.integerMode;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return ToEInteger().CanFitInInt64();
        }
        if (i == 2) {
            return this.largeValue.CanFitInInt64();
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return false;
    }

    public int CompareToInt(int i) {
        int i2 = this.integerMode;
        if (i2 == 0) {
            int i3 = this.smallValue;
            if (i == i3) {
                return 0;
            }
            return i3 < i ? -1 : 1;
        }
        if (i2 == 1) {
            return this.mnum.ToEInteger().compareTo(EInteger.FromInt32(i));
        }
        if (i2 == 2) {
            return this.largeValue.compareTo(EInteger.FromInt32(i));
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    public FastInteger Copy() {
        FastInteger fastInteger = new FastInteger(this.smallValue);
        fastInteger.integerMode = this.integerMode;
        fastInteger.largeValue = this.largeValue;
        MutableNumber mutableNumber = this.mnum;
        fastInteger.mnum = (mutableNumber == null || this.integerMode != 1) ? null : mutableNumber.Copy();
        return fastInteger;
    }

    public FastInteger Decrement() {
        if (this.integerMode != 0) {
            return SubtractInt(1);
        }
        int i = this.smallValue;
        if (i != Integer.MIN_VALUE) {
            this.smallValue = i - 1;
            return this;
        }
        this.integerMode = 1;
        MutableNumber FromEInteger = MutableNumber.FromEInteger(ValueInt32MinValue);
        this.mnum = FromEInteger;
        FromEInteger.SubtractInt(1);
        return this;
    }

    public FastInteger Divide(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        int i2 = this.integerMode;
        if (i2 == 0) {
            if (i != -1 || this.smallValue != Integer.MIN_VALUE) {
                this.smallValue /= i;
                return this;
            }
            this.integerMode = 1;
            this.mnum = MutableNumber.FromEInteger(ValueNegativeInt32MinValue);
            return this;
        }
        if (i2 == 1) {
            this.integerMode = 2;
            EInteger ToEInteger = this.mnum.ToEInteger();
            this.largeValue = ToEInteger;
            EInteger Divide = ToEInteger.Divide(EInteger.FromInt64(i));
            this.largeValue = Divide;
            if (Divide.isZero()) {
                this.integerMode = 0;
                this.smallValue = 0;
            }
        } else {
            if (i2 != 2) {
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            EInteger Divide2 = this.largeValue.Divide(EInteger.FromInt64(i));
            this.largeValue = Divide2;
            if (Divide2.isZero()) {
                this.integerMode = 0;
                this.smallValue = 0;
                return this;
            }
        }
        return this;
    }

    public FastInteger Increment() {
        if (this.integerMode != 0) {
            return AddInt(1);
        }
        int i = this.smallValue;
        if (i != Integer.MAX_VALUE) {
            this.smallValue = i + 1;
            return this;
        }
        this.integerMode = 1;
        this.mnum = MutableNumber.FromEInteger(ValueNegativeInt32MinValue);
        return this;
    }

    public FastInteger Multiply(int i) {
        if (i == 0) {
            this.smallValue = 0;
            this.integerMode = 0;
            return this;
        }
        int i2 = this.integerMode;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.largeValue = this.largeValue.Multiply(EInteger.FromInt32(i));
                    return this;
                }
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            if (i >= 0) {
                this.mnum.Multiply(i);
                return this;
            }
            this.integerMode = 2;
            EInteger ToEInteger = this.mnum.ToEInteger();
            this.largeValue = ToEInteger;
            this.largeValue = ToEInteger.Multiply(EInteger.FromInt32(i));
            return this;
        }
        long j = i;
        int i3 = this.smallValue;
        long j2 = i3 * j;
        if (j2 <= SieveCacheKt.NodeLinkMask && j2 >= SieveCacheKt.NodeMetaAndPreviousMask) {
            this.smallValue = (int) j2;
            return this;
        }
        boolean z = ((long) i3) > 0;
        boolean z2 = j > 0;
        if (z && z2) {
            this.integerMode = 1;
            this.mnum = MutableNumber.FromInt64(j2);
            return this;
        }
        this.integerMode = 2;
        this.largeValue = EInteger.FromInt64(j2);
        return this;
    }

    public FastInteger Negate() {
        int i = this.integerMode;
        if (i == 0) {
            int i2 = this.smallValue;
            if (i2 != Integer.MIN_VALUE) {
                this.smallValue = -i2;
                return this;
            }
            this.integerMode = 1;
            this.mnum = MutableNumber.FromEInteger(ValueNegativeInt32MinValue);
            return this;
        }
        if (i != 1) {
            if (i == 2) {
                this.largeValue = this.largeValue.Negate();
                return this;
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        this.integerMode = 2;
        EInteger ToEInteger = this.mnum.ToEInteger();
        this.largeValue = ToEInteger;
        this.largeValue = ToEInteger.Negate();
        return this;
    }

    public FastInteger Remainder(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        int i2 = this.integerMode;
        if (i2 == 0) {
            this.smallValue %= i;
            return this;
        }
        if (i2 == 1) {
            EInteger ToEInteger = this.mnum.ToEInteger();
            this.largeValue = ToEInteger;
            EInteger Remainder = ToEInteger.Remainder(EInteger.FromInt64(i));
            this.largeValue = Remainder;
            this.smallValue = Remainder.ToInt32Checked();
            this.integerMode = 0;
            return this;
        }
        if (i2 != 2) {
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        EInteger Remainder2 = this.largeValue.Remainder(EInteger.FromInt64(i));
        this.largeValue = Remainder2;
        this.smallValue = Remainder2.ToInt32Checked();
        this.integerMode = 0;
        return this;
    }

    public FastInteger SetInt(int i) {
        this.smallValue = i;
        this.integerMode = 0;
        return this;
    }

    public EInteger ShiftEIntegerLeftByThis(EInteger eInteger) {
        int i = this.integerMode;
        if (i == 0) {
            return eInteger.ShiftLeft(this.smallValue);
        }
        if (i == 1) {
            return eInteger.ShiftLeft(this.mnum.ToEInteger());
        }
        if (i == 2) {
            return eInteger.ShiftLeft(this.largeValue);
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public FastInteger Subtract(FastInteger fastInteger) {
        int i;
        int i2 = this.integerMode;
        if (i2 == 0) {
            if (fastInteger.integerMode != 0) {
                this.integerMode = 2;
                this.largeValue = EInteger.FromInt32(this.smallValue);
                this.largeValue = this.largeValue.Subtract(fastInteger.ToEInteger());
                return this;
            }
            int i3 = fastInteger.smallValue;
            if ((i3 >= 0 || Integer.MAX_VALUE + i3 >= this.smallValue) && (i3 <= 0 || Integer.MIN_VALUE + i3 <= this.smallValue)) {
                this.smallValue -= i3;
                return this;
            }
            this.integerMode = 2;
            EInteger FromInt32 = EInteger.FromInt32(this.smallValue);
            this.largeValue = FromInt32;
            this.largeValue = FromInt32.Subtract(EInteger.FromInt32(i3));
            return this;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                this.largeValue = this.largeValue.Subtract(fastInteger.ToEInteger());
                return this;
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        if (fastInteger.integerMode == 1 && this.mnum.compareTo(fastInteger.mnum) >= 0 && fastInteger.mnum.CompareToInt(0) >= 0) {
            this.mnum.Subtract(fastInteger.mnum);
            return this;
        }
        if (fastInteger.integerMode == 0 && (i = fastInteger.smallValue) >= 0 && this.mnum.CompareToInt(i) >= 0) {
            this.mnum.SubtractInt(fastInteger.smallValue);
            return this;
        }
        this.integerMode = 2;
        this.largeValue = this.mnum.ToEInteger();
        this.largeValue = this.largeValue.Subtract(fastInteger.ToEInteger());
        return this;
    }

    public FastInteger SubtractBig(EInteger eInteger) {
        if (this.integerMode == 2) {
            this.largeValue = this.largeValue.Subtract(eInteger);
            return this;
        }
        int signum = eInteger.signum();
        return signum == 0 ? this : (signum >= 0 || eInteger.compareTo(ValueInt32MinValue) <= 0) ? (signum <= 0 || eInteger.compareTo(ValueInt32MaxValue) > 0) ? AddBig(eInteger.Negate()) : SubtractInt(eInteger.ToInt32Checked()) : AddInt(-eInteger.ToInt32Checked());
    }

    public FastInteger SubtractInt(int i) {
        if (i == Integer.MIN_VALUE) {
            return AddBig(ValueNegativeInt32MinValue);
        }
        if (this.integerMode != 0) {
            return AddInt(-i);
        }
        if ((i >= 0 || Integer.MAX_VALUE + i >= this.smallValue) && (i <= 0 || Integer.MIN_VALUE + i <= this.smallValue)) {
            this.smallValue -= i;
            return this;
        }
        this.integerMode = 2;
        EInteger FromInt32 = EInteger.FromInt32(this.smallValue);
        this.largeValue = FromInt32;
        this.largeValue = FromInt32.Subtract(EInteger.FromInt32(i));
        return this;
    }

    public FastInteger SubtractInt64(long j) {
        return (j < SieveCacheKt.NodeMetaAndPreviousMask || j > SieveCacheKt.NodeLinkMask) ? SubtractBig(EInteger.FromInt64(j)) : SubtractInt((int) j);
    }

    public EInteger ToEInteger() {
        int i = this.integerMode;
        if (i == 0) {
            return EInteger.FromInt32(this.smallValue);
        }
        if (i == 1) {
            return this.mnum.ToEInteger();
        }
        if (i == 2) {
            return this.largeValue;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public int ToInt32() {
        int i = this.integerMode;
        if (i == 0) {
            return this.smallValue;
        }
        if (i == 1) {
            return this.mnum.ToInt32();
        }
        if (i == 2) {
            return this.largeValue.ToInt32Checked();
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    public long ToInt64() {
        int i = this.integerMode;
        if (i == 0) {
            return this.smallValue;
        }
        if (i == 1) {
            return ToEInteger().ToInt64Unchecked();
        }
        if (i == 2) {
            return this.largeValue.ToInt64Unchecked();
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return 0L;
    }

    @Override // java.lang.Comparable
    public int compareTo(FastInteger fastInteger) {
        switch ((this.integerMode << 2) | fastInteger.integerMode) {
            case 0:
                int i = fastInteger.smallValue;
                int i2 = this.smallValue;
                if (i2 == i) {
                    return 0;
                }
                return i2 < i ? -1 : 1;
            case 1:
                return -fastInteger.mnum.CompareToInt(this.smallValue);
            case 2:
                return -fastInteger.largeValue.compareTo(this.smallValue);
            case 3:
            case 7:
            default:
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return 0;
            case 4:
                return this.mnum.CompareToInt(fastInteger.smallValue);
            case 5:
                return this.mnum.compareTo(fastInteger.mnum);
            case 6:
                return ToEInteger().compareTo(fastInteger.largeValue);
            case 8:
            case 9:
            case 10:
                return this.largeValue.compareTo(fastInteger.ToEInteger());
        }
    }

    public final boolean isEvenNumber() {
        int i = this.integerMode;
        if (i == 0) {
            return (this.smallValue & 1) == 0;
        }
        if (i == 1) {
            return this.mnum.isEvenNumber();
        }
        if (i == 2) {
            return this.largeValue.isEven();
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return false;
    }

    public final boolean isValueZero() {
        int i = this.integerMode;
        if (i == 0) {
            return this.smallValue == 0;
        }
        if (i == 1) {
            return this.mnum.signum() == 0;
        }
        if (i == 2) {
            return this.largeValue.isZero();
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return false;
    }

    public final int signum() {
        int i = this.integerMode;
        if (i == 0) {
            int i2 = this.smallValue;
            if (i2 == 0) {
                return 0;
            }
            return i2 < 0 ? -1 : 1;
        }
        if (i == 1) {
            return this.mnum.signum();
        }
        if (i != 2) {
            return 0;
        }
        return this.largeValue.signum();
    }

    public String toString() {
        int i = this.integerMode;
        return i != 0 ? i != 1 ? i != 2 ? "" : this.largeValue.toString() : this.mnum.ToEInteger().toString() : IntToString(this.smallValue);
    }

    public int compareTo(EInteger eInteger) {
        int i = this.integerMode;
        if (i == 0) {
            return -eInteger.compareTo(this.smallValue);
        }
        if (i == 1) {
            return ToEInteger().compareTo(eInteger);
        }
        if (i == 2) {
            return this.largeValue.compareTo(eInteger);
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }
}
