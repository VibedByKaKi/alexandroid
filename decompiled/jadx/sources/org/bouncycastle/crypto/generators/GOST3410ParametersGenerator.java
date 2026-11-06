package org.bouncycastle.crypto.generators;

import com.amazon.alexa.ra.core.data.model.Constants;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;
import org.bouncycastle.util.BigIntegers;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    private int procedure_A(int i, int i2, BigInteger[] bigIntegerArr, int i3) {
        int i4;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        int i5;
        BigInteger[] bigIntegerArr3;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int i6 = i;
        while (true) {
            if (i6 >= 0 && i6 <= 65536) {
                break;
            }
            i6 = this.init_random.nextInt() / 32768;
        }
        int i7 = i2;
        while (true) {
            i4 = 1;
            if (i7 >= 0 && i7 <= 65536 && i7 / 2 != 0) {
                break;
            }
            i7 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Integer.toString(i7));
        BigInteger bigInteger5 = new BigInteger("19381");
        BigInteger bigInteger6 = new BigInteger(Integer.toString(i6));
        int i8 = 0;
        BigInteger[] bigIntegerArr4 = {bigInteger6};
        int[] iArr = {i3};
        int i9 = 0;
        int i10 = 0;
        while (iArr[i9] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i10 = i9 + 1;
            iArr[i10] = iArr[i9] / 2;
            i9 = i10;
        }
        BigInteger[] bigIntegerArr5 = new BigInteger[i10 + 1];
        int i11 = 16;
        bigIntegerArr5[i10] = new BigInteger("8003", 16);
        int i12 = i10 - 1;
        int i13 = 0;
        while (true) {
            if (i13 >= i10) {
                bigInteger = bigIntegerArr4[i8];
                break;
            }
            int i14 = iArr[i12] / i11;
            while (true) {
                int length2 = bigIntegerArr4.length;
                BigInteger[] bigIntegerArr6 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr4, i8, bigIntegerArr6, i8, bigIntegerArr4.length);
                bigIntegerArr2 = new BigInteger[i14 + 1];
                System.arraycopy(bigIntegerArr6, i8, bigIntegerArr2, i8, length2);
                int i15 = i8;
                while (i15 < i14) {
                    int i16 = i15 + 1;
                    bigIntegerArr2[i16] = bigIntegerArr2[i15].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i11));
                    i15 = i16;
                }
                BigInteger bigInteger7 = new BigInteger(Constants.FEEDBACK_TYPE_DISLIKE);
                int i17 = i8;
                while (i17 < i14) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i17].multiply(TWO.pow(i17 * 16)));
                    i17++;
                    i8 = i8;
                }
                i5 = i8;
                bigIntegerArr2[i5] = bigIntegerArr2[i14];
                BigInteger bigInteger8 = TWO;
                int i18 = i12 + 1;
                BigInteger add = bigInteger8.pow(iArr[i12] - i4).divide(bigIntegerArr5[i18]).add(bigInteger8.pow(iArr[i12] - i4).multiply(bigInteger7).divide(bigIntegerArr5[i18].multiply(bigInteger8.pow(i14 * 16))));
                BigInteger mod = add.mod(bigInteger8);
                BigInteger bigInteger9 = ONE;
                if (mod.compareTo(bigInteger9) == 0) {
                    add = add.add(bigInteger9);
                }
                BigInteger bigInteger10 = add;
                int i19 = i5;
                while (true) {
                    bigIntegerArr3 = bigIntegerArr5;
                    long j = i19;
                    BigInteger multiply = bigIntegerArr5[i18].multiply(bigInteger10.add(BigInteger.valueOf(j)));
                    BigInteger bigInteger11 = ONE;
                    BigInteger add2 = multiply.add(bigInteger11);
                    bigIntegerArr3[i12] = add2;
                    bigInteger2 = bigInteger4;
                    BigInteger bigInteger12 = TWO;
                    bigInteger3 = bigInteger5;
                    if (add2.compareTo(bigInteger12.pow(iArr[i12])) != 1) {
                        if (bigInteger12.modPow(bigIntegerArr3[i18].multiply(bigInteger10.add(BigInteger.valueOf(j))), bigIntegerArr3[i12]).compareTo(bigInteger11) == 0 && bigInteger12.modPow(bigInteger10.add(BigInteger.valueOf(j)), bigIntegerArr3[i12]).compareTo(bigInteger11) != 0) {
                            break;
                        }
                        i19 += 2;
                        bigIntegerArr5 = bigIntegerArr3;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                    } else {
                        break;
                    }
                }
                i8 = i5;
                i4 = 1;
                bigIntegerArr5 = bigIntegerArr3;
                bigIntegerArr4 = bigIntegerArr2;
                bigInteger4 = bigInteger2;
                bigInteger5 = bigInteger3;
                i11 = 16;
            }
            i12--;
            if (i12 < 0) {
                bigIntegerArr[i5] = bigIntegerArr3[i5];
                bigIntegerArr[1] = bigIntegerArr3[1];
                bigInteger = bigIntegerArr2[i5];
                break;
            }
            i13++;
            i4 = 1;
            i11 = 16;
            i8 = i5;
            bigIntegerArr5 = bigIntegerArr3;
            bigIntegerArr4 = bigIntegerArr2;
            bigInteger4 = bigInteger2;
            bigInteger5 = bigInteger3;
        }
        return bigInteger.intValue();
    }

    private long procedure_Aa(long j, long j2, BigInteger[] bigIntegerArr, int i) {
        int i2;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        int i3;
        BigInteger bigInteger2;
        int[] iArr;
        long j3 = j;
        while (true) {
            if (j3 >= 0 && j3 <= 4294967296L) {
                break;
            }
            j3 = this.init_random.nextInt() * 2;
        }
        long j4 = j2;
        while (true) {
            i2 = 1;
            if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                break;
            }
            j4 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger3 = new BigInteger(Long.toString(j4));
        BigInteger bigInteger4 = new BigInteger("97781173");
        BigInteger bigInteger5 = new BigInteger(Long.toString(j3));
        int i4 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger5};
        int[] iArr2 = {i};
        int i5 = 0;
        int i6 = 0;
        while (iArr2[i5] >= 33) {
            int length = iArr2.length + 1;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = new int[length];
            System.arraycopy(iArr3, 0, iArr2, 0, length);
            i6 = i5 + 1;
            iArr2[i6] = iArr2[i5] / 2;
            i5 = i6;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i6 + 1];
        bigIntegerArr4[i6] = new BigInteger("8000000B", 16);
        int i7 = i6 - 1;
        int i8 = 0;
        while (true) {
            if (i8 >= i6) {
                bigInteger = bigIntegerArr3[i4];
                break;
            }
            int i9 = 32;
            int i10 = iArr2[i7] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i4, bigIntegerArr5, i4, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i10 + 1];
                System.arraycopy(bigIntegerArr5, i4, bigIntegerArr2, i4, length2);
                int i11 = i4;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    bigIntegerArr2[i12] = bigIntegerArr2[i11].multiply(bigInteger4).add(bigInteger3).mod(TWO.pow(i9));
                    i11 = i12;
                }
                BigInteger bigInteger6 = new BigInteger(Constants.FEEDBACK_TYPE_DISLIKE);
                int i13 = i4;
                while (i13 < i10) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i13].multiply(TWO.pow(i13 * 32)));
                    i13++;
                    i4 = i4;
                }
                i3 = i4;
                bigIntegerArr2[i3] = bigIntegerArr2[i10];
                BigInteger bigInteger7 = TWO;
                int i14 = i7 + 1;
                BigInteger add = bigInteger7.pow(iArr2[i7] - i2).divide(bigIntegerArr4[i14]).add(bigInteger7.pow(iArr2[i7] - i2).multiply(bigInteger6).divide(bigIntegerArr4[i14].multiply(bigInteger7.pow(i10 * 32))));
                BigInteger mod = add.mod(bigInteger7);
                BigInteger bigInteger8 = ONE;
                if (mod.compareTo(bigInteger8) == 0) {
                    add = add.add(bigInteger8);
                }
                BigInteger bigInteger9 = add;
                int i15 = i3;
                while (true) {
                    long j5 = i15;
                    BigInteger multiply = bigIntegerArr4[i14].multiply(bigInteger9.add(BigInteger.valueOf(j5)));
                    BigInteger bigInteger10 = ONE;
                    BigInteger add2 = multiply.add(bigInteger10);
                    bigIntegerArr4[i7] = add2;
                    bigInteger2 = bigInteger3;
                    BigInteger bigInteger11 = TWO;
                    iArr = iArr2;
                    if (add2.compareTo(bigInteger11.pow(iArr[i7])) != 1) {
                        if (bigInteger11.modPow(bigIntegerArr4[i14].multiply(bigInteger9.add(BigInteger.valueOf(j5))), bigIntegerArr4[i7]).compareTo(bigInteger10) == 0 && bigInteger11.modPow(bigInteger9.add(BigInteger.valueOf(j5)), bigIntegerArr4[i7]).compareTo(bigInteger10) != 0) {
                            break;
                        }
                        i15 += 2;
                        bigInteger3 = bigInteger2;
                        iArr2 = iArr;
                    } else {
                        break;
                    }
                }
                i4 = i3;
                bigInteger3 = bigInteger2;
                iArr2 = iArr;
                i2 = 1;
                bigIntegerArr3 = bigIntegerArr2;
                i9 = 32;
            }
            i7--;
            if (i7 < 0) {
                bigIntegerArr[i3] = bigIntegerArr4[i3];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i3];
                break;
            }
            i8++;
            i2 = 1;
            i4 = i3;
            bigInteger3 = bigInteger2;
            iArr2 = iArr;
            bigIntegerArr3 = bigIntegerArr2;
        }
        return bigInteger.longValue();
    }

    private void procedure_B(int i, int i2, BigInteger[] bigIntegerArr) {
        int i3;
        int i4 = i;
        while (true) {
            if (i4 >= 0 && i4 <= 65536) {
                break;
            } else {
                i4 = this.init_random.nextInt() / 32768;
            }
        }
        int i5 = i2;
        while (true) {
            i3 = 1;
            if (i5 >= 0 && i5 <= 65536 && i5 / 2 != 0) {
                break;
            } else {
                i5 = (this.init_random.nextInt() / 32768) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(i5));
        BigInteger bigInteger2 = new BigInteger("19381");
        int procedure_A = procedure_A(i4, i5, bigIntegerArr2, 256);
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int procedure_A2 = procedure_A(procedure_A, i5, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(procedure_A2));
        while (true) {
            int i6 = 0;
            while (i6 < 64) {
                int i7 = i6 + 1;
                bigIntegerArr3[i7] = bigIntegerArr3[i6].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i6 = i7;
            }
            BigInteger bigInteger5 = new BigInteger(Constants.FEEDBACK_TYPE_DISLIKE);
            for (int i8 = 0; i8 < 64; i8++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i8].multiply(TWO.pow(i8 * 16)));
            }
            bigIntegerArr3[0] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            BigInteger add = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger mod = add.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (mod.compareTo(bigInteger7) == 0) {
                add = add.add(bigInteger7);
            }
            BigInteger bigInteger8 = add;
            int i9 = 0;
            while (true) {
                long j = i9;
                BigInteger multiply = bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j)));
                BigInteger bigInteger9 = ONE;
                BigInteger add2 = multiply.add(bigInteger9);
                BigInteger bigInteger10 = TWO;
                if (add2.compareTo(bigInteger10.pow(1024)) == i3) {
                    break;
                }
                int i10 = i3;
                if (bigInteger10.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j))), add2).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger3.multiply(bigInteger8.add(BigInteger.valueOf(j))), add2).compareTo(bigInteger9) != 0) {
                    bigIntegerArr[0] = add2;
                    bigIntegerArr[i10] = bigInteger3;
                    return;
                } else {
                    i9 += 2;
                    i3 = i10;
                }
            }
        }
    }

    private void procedure_Bb(long j, long j2, BigInteger[] bigIntegerArr) {
        int i;
        long j3 = j;
        while (true) {
            if (j3 >= 0 && j3 <= 4294967296L) {
                break;
            } else {
                j3 = this.init_random.nextInt() * 2;
            }
        }
        long j4 = j2;
        while (true) {
            i = 1;
            if (j4 >= 0 && j4 <= 4294967296L && j4 / 2 != 0) {
                break;
            }
            long j5 = j3;
            j4 = (this.init_random.nextInt() * 2) + 1;
            j3 = j5;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(j4));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long procedure_Aa = procedure_Aa(j3, j4, bigIntegerArr2, 256);
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long procedure_Aa2 = procedure_Aa(procedure_Aa, j4, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(procedure_Aa2));
        while (true) {
            int i2 = 0;
            while (i2 < 32) {
                int i3 = i2 + 1;
                bigIntegerArr3[i3] = bigIntegerArr3[i2].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i2 = i3;
            }
            BigInteger bigInteger5 = new BigInteger(Constants.FEEDBACK_TYPE_DISLIKE);
            for (int i4 = 0; i4 < 32; i4++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i4].multiply(TWO.pow(i4 * 32)));
            }
            bigIntegerArr3[0] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            BigInteger add = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger mod = add.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (mod.compareTo(bigInteger7) == 0) {
                add = add.add(bigInteger7);
            }
            int i5 = 0;
            while (true) {
                long j6 = i5;
                BigInteger multiply = bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j6)));
                BigInteger bigInteger8 = ONE;
                BigInteger add2 = multiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                if (add2.compareTo(bigInteger9.pow(1024)) == i) {
                    break;
                }
                int i6 = i;
                if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j6))), add2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(add.add(BigInteger.valueOf(j6))), add2).compareTo(bigInteger8) != 0) {
                    bigIntegerArr[0] = add2;
                    bigIntegerArr[i6] = bigInteger3;
                    return;
                } else {
                    i5 += 2;
                    i = i6;
                }
            }
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger subtract = bigInteger.subtract(ONE);
        BigInteger divide = subtract.divide(bigInteger2);
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(bitLength, this.init_random);
            BigInteger bigInteger3 = ONE;
            if (createRandomBigInteger.compareTo(bigInteger3) > 0 && createRandomBigInteger.compareTo(subtract) < 0) {
                BigInteger modPow = createRandomBigInteger.modPow(divide, bigInteger);
                if (modPow.compareTo(bigInteger3) != 0) {
                    return modPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        long j;
        GOST3410ParametersGenerator gOST3410ParametersGenerator;
        BigInteger[] bigIntegerArr = new BigInteger[2];
        int i = this.typeproc;
        SecureRandom secureRandom = this.init_random;
        if (i == 1) {
            int nextInt = secureRandom.nextInt();
            int nextInt2 = this.init_random.nextInt();
            int i2 = this.size;
            if (i2 == 512) {
                procedure_A(nextInt, nextInt2, bigIntegerArr, 512);
            } else {
                if (i2 != 1024) {
                    Single$$ExternalSyntheticBUOutline0.m$3("Ooops! key size 512 or 1024 bit.");
                    return null;
                }
                procedure_B(nextInt, nextInt2, bigIntegerArr);
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(nextInt, nextInt2));
        }
        long nextLong = secureRandom.nextLong();
        long nextLong2 = this.init_random.nextLong();
        int i3 = this.size;
        if (i3 == 512) {
            j = nextLong;
            gOST3410ParametersGenerator = this;
            gOST3410ParametersGenerator.procedure_Aa(j, nextLong2, bigIntegerArr, 512);
        } else {
            if (i3 != 1024) {
                Single$$ExternalSyntheticBUOutline0.m$2("Ooops! key size 512 or 1024 bit.");
                return null;
            }
            j = nextLong;
            gOST3410ParametersGenerator = this;
            gOST3410ParametersGenerator.procedure_Bb(j, nextLong2, bigIntegerArr);
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, gOST3410ParametersGenerator.procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(j, nextLong2));
    }

    public void init(int i, int i2, SecureRandom secureRandom) {
        this.size = i;
        this.typeproc = i2;
        this.init_random = secureRandom;
    }
}
