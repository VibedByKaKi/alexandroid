package com.bugsnag.android.repackaged.dslplatform.json;

import com.amazon.alexa.accessory.internal.bluetooth.GenericAccessProfile;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import org.openjdk.tools.javac.code.Flags;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
abstract class Grisu3 {
    static final int kFastDtoaMaximalLength = 17;
    static final int minimal_target_exponent = -60;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CachedPowers {
        static final CachedPower[] CACHED_POWERS = {new CachedPower(-1865951482774665761L, -1087, -308), new CachedPower(-6093090917745768758L, -1060, -300), new CachedPower(-38366372719436721L, -1034, -292), new CachedPower(-4731433901725329908L, -1007, -284), new CachedPower(-8228041688891786180L, -980, -276), new CachedPower(-3219690930897053053L, -954, -268), new CachedPower(-7101705404292871755L, -927, -260), new CachedPower(-1541319077368263733L, -901, -252), new CachedPower(-5851220927660403859L, -874, -244), new CachedPower(-9062348037703676329L, -847, -236), new CachedPower(-4462904269766699465L, -821, -228), new CachedPower(-8027971522334779313L, -794, -220), new CachedPower(-2921563150702462265L, -768, -212), new CachedPower(-6879582898840692748L, -741, -204), new CachedPower(-1210330751515841307L, -715, -196), new CachedPower(-5604615407819967858L, -688, -188), new CachedPower(-8878612607581929669L, -661, -180), new CachedPower(-4189117143640191558L, -635, -172), new CachedPower(-7823984217374209642L, -608, -164), new CachedPower(-2617598379430861436L, -582, -156), new CachedPower(-6653111496142234890L, -555, -148), new CachedPower(-872862063775190746L, -529, -140), new CachedPower(-5353181642124984136L, -502, -132), new CachedPower(-8691279853972075893L, -475, -124), new CachedPower(-3909969587797413805L, -449, -116), new CachedPower(-7616003081050118571L, -422, -108), new CachedPower(-2307682335666372931L, -396, -100), new CachedPower(-6422206049907525489L, -369, -92), new CachedPower(-528786136287117932L, -343, -84), new CachedPower(-5096825099203863601L, -316, -76), new CachedPower(-8500279345513818773L, -289, -68), new CachedPower(-3625356651333078602L, -263, -60), new CachedPower(-7403949918844649556L, -236, -52), new CachedPower(-1991698500497491194L, -210, -44), new CachedPower(-6186779746782440749L, -183, -36), new CachedPower(-177973607073265138L, -157, -28), new CachedPower(-4835449396872013077L, -130, -20), new CachedPower(-8305539271883716404L, -103, -12), new CachedPower(-3335171328526686932L, -77, -4), new CachedPower(-7187745005283311616L, -50, 4), new CachedPower(-1669528073709551616L, -24, 12), new CachedPower(-5946744073709551616L, 3, 20), new CachedPower(-9133518327554766460L, 30, 28), new CachedPower(-4568956265895094861L, 56, 36), new CachedPower(-8106986416796705680L, 83, 44), new CachedPower(-3039304518611664792L, 109, 52), new CachedPower(-6967307053960650171L, 136, 60), new CachedPower(-1341049929119499481L, 162, 68), new CachedPower(-5702008784649933400L, 189, 76), new CachedPower(-8951176327949752869L, 216, 84), new CachedPower(-4297245513042813542L, 242, 92), new CachedPower(-7904546130479028392L, 269, 100), new CachedPower(-2737644984756826646L, 295, 108), new CachedPower(-6742553186979055798L, 322, 116), new CachedPower(-1006140569036166267L, 348, 124), new CachedPower(-5452481866653427593L, 375, 132), new CachedPower(-8765264286586255934L, 402, 140), new CachedPower(-4020214983419339459L, 428, 148), new CachedPower(-7698142301602209613L, 455, 156), new CachedPower(-2430079312244744221L, 481, 164), new CachedPower(-6513398903789220827L, 508, 172), new CachedPower(-664674077828931748L, 534, 180), new CachedPower(-5198069505264599346L, 561, 188), new CachedPower(-8575712306248138270L, 588, 196), new CachedPower(-3737760522056206171L, 614, 204), new CachedPower(-7487697328667536417L, 641, 212), new CachedPower(-2116491865831296966L, 667, 220), new CachedPower(-6279758049420528746L, 694, 228), new CachedPower(-316522074587315140L, 720, 236), new CachedPower(-4938676049251384304L, 747, 244), new CachedPower(-8382449121214030822L, 774, 252), new CachedPower(-3449775934753242068L, 800, 260), new CachedPower(-7273132090830278359L, 827, 268), new CachedPower(-1796764746270372707L, 853, 276), new CachedPower(-6041542782089432023L, 880, 284), new CachedPower(-9204148869281624187L, 907, 292), new CachedPower(-4674203974643163859L, 933, 300), new CachedPower(-8185402070463610993L, 960, 308), new CachedPower(-3156152948152813503L, 986, 316), new CachedPower(-7054365918152680535L, 1013, 324), new CachedPower(-1470777745987373095L, 1039, 332), new CachedPower(-5798663540173640085L, 1066, 340)};
        static final int CACHED_POWERS_SPACING = 8;
        static final int GRISU_CACHE_OFFSET = 308;
        static final double kD_1_LOG2_10 = 0.30102999566398114d;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class CachedPower {
            final short binaryExponent;
            final short decimalExponent;
            final long significand;

            public CachedPower(long j, short s, short s2) {
                this.significand = j;
                this.binaryExponent = s;
                this.decimalExponent = s2;
            }
        }

        private CachedPowers() {
        }

        public static int getCachedPower(int i, int i2, DiyFp diyFp) {
            CachedPower cachedPower = CACHED_POWERS[((((int) Math.ceil(((i2 - i) + 63) * kD_1_LOG2_10)) + 307) / 8) + 1];
            diyFp.f = cachedPower.significand;
            diyFp.e = cachedPower.binaryExponent;
            return cachedPower.decimalExponent;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DiyFp {
        private static final long k10MSBits = -18014398509481984L;
        private static final long kM32 = 4294967295L;
        static final int kSignificandSize = 64;
        static final long kUint64MSB = Long.MIN_VALUE;
        long f = 0;
        int e = 0;

        public void multiply(DiyFp diyFp) {
            long j = this.f;
            long j2 = j >>> 32;
            long j3 = j & kM32;
            long j4 = diyFp.f;
            long j5 = j4 >>> 32;
            long j6 = j4 & kM32;
            long j7 = j2 * j5;
            long j8 = j5 * j3;
            long j9 = j2 * j6;
            long j10 = j7 + (j9 >>> 32) + (j8 >>> 32) + ((((((j3 * j6) >>> 32) + (j9 & kM32)) + (kM32 & j8)) + Flags.BRIDGE) >>> 32);
            this.e = diyFp.e + 64 + this.e;
            this.f = j10;
        }

        public void normalize() {
            long j = this.f;
            int i = this.e;
            while ((k10MSBits & j) == 0) {
                j <<= 10;
                i -= 10;
            }
            while ((Long.MIN_VALUE & j) == 0) {
                j <<= 1;
                i--;
            }
            this.f = j;
            this.e = i;
        }

        public void reset() {
            this.e = 0;
            this.f = 0L;
        }

        public void subtract(DiyFp diyFp) {
            this.f -= diyFp.f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[DiyFp f:");
            sb.append(this.f);
            sb.append(", e:");
            return a$$ExternalSyntheticOutline0.m(sb, this.e, MarkdownConstants.RIGHT_BRACKET);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DoubleHelper {
        private static final int kDenormalExponent = -1074;
        private static final int kExponentBias = 1075;
        static final long kExponentMask = 9218868437227405312L;
        static final long kHiddenBit = 4503599627370496L;
        static final long kSignificandMask = 4503599627370495L;
        private static final int kSignificandSize = 52;

        private DoubleHelper() {
        }

        public static void asDiyFp(long j, DiyFp diyFp) {
            diyFp.f = significand(j);
            diyFp.e = exponent(j);
        }

        public static void asNormalizedDiyFp(long j, DiyFp diyFp) {
            long significand = significand(j);
            int exponent = exponent(j);
            while ((4503599627370496L & significand) == 0) {
                significand <<= 1;
                exponent--;
            }
            diyFp.f = significand << 11;
            diyFp.e = exponent - 11;
        }

        public static int exponent(long j) {
            return isDenormal(j) ? kDenormalExponent : ((int) (((j & kExponentMask) >>> 52) & 4294967295L)) - 1075;
        }

        private static boolean isDenormal(long j) {
            return (j & kExponentMask) == 0;
        }

        public static void normalizedBoundaries(DiyFp diyFp, long j, DiyFp diyFp2, DiyFp diyFp3) {
            int i;
            asDiyFp(j, diyFp);
            long j2 = diyFp.f;
            boolean z = j2 == 4503599627370496L;
            diyFp3.f = (j2 << 1) + 1;
            diyFp3.e = diyFp.e - 1;
            diyFp3.normalize();
            if (!z || (i = diyFp.e) == kDenormalExponent) {
                diyFp2.f = (diyFp.f << 1) - 1;
                diyFp2.e = diyFp.e - 1;
            } else {
                diyFp2.f = (diyFp.f << 2) - 1;
                diyFp2.e = i - 2;
            }
            long j3 = diyFp2.f;
            int i2 = diyFp2.e;
            int i3 = diyFp3.e;
            diyFp2.f = j3 << (i2 - i3);
            diyFp2.e = i3;
        }

        public static long significand(long j) {
            long j2 = kSignificandMask & j;
            return !isDenormal(j) ? j2 + 4503599627370496L : j2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FastDtoa {
        static final int kTen4 = 10000;
        static final int kTen5 = 100000;
        static final int kTen6 = 1000000;
        static final int kTen7 = 10000000;
        static final int kTen8 = 100000000;
        static final int kTen9 = 1000000000;

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
        
            if (10 <= r5) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0045, code lost:
        
            if (1 <= r5) goto L36;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static long biggestPowerTen(int r5, int r6) {
            /*
                r0 = 1
                r1 = 0
                switch(r6) {
                    case 0: goto L48;
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L40;
                    case 5: goto L40;
                    case 6: goto L40;
                    case 7: goto L3a;
                    case 8: goto L3a;
                    case 9: goto L3a;
                    case 10: goto L34;
                    case 11: goto L34;
                    case 12: goto L34;
                    case 13: goto L34;
                    case 14: goto L2e;
                    case 15: goto L2e;
                    case 16: goto L2e;
                    case 17: goto L27;
                    case 18: goto L27;
                    case 19: goto L27;
                    case 20: goto L20;
                    case 21: goto L20;
                    case 22: goto L20;
                    case 23: goto L20;
                    case 24: goto L19;
                    case 25: goto L19;
                    case 26: goto L19;
                    case 27: goto L11;
                    case 28: goto L11;
                    case 29: goto L11;
                    case 30: goto L7;
                    case 31: goto L7;
                    case 32: goto L7;
                    default: goto L5;
                }
            L5:
                r0 = r1
                goto L4c
            L7:
                r6 = 1000000000(0x3b9aca00, float:0.0047237873)
                if (r6 > r5) goto L11
                r0 = 9
            Le:
                r1 = r0
                r0 = r6
                goto L4c
            L11:
                r6 = 100000000(0x5f5e100, float:2.3122341E-35)
                if (r6 > r5) goto L19
                r0 = 8
                goto Le
            L19:
                r6 = 10000000(0x989680, float:1.4012985E-38)
                if (r6 > r5) goto L20
                r0 = 7
                goto Le
            L20:
                r6 = 1000000(0xf4240, float:1.401298E-39)
                if (r6 > r5) goto L27
                r0 = 6
                goto Le
            L27:
                r6 = 100000(0x186a0, float:1.4013E-40)
                if (r6 > r5) goto L2e
                r0 = 5
                goto Le
            L2e:
                r6 = 10000(0x2710, float:1.4013E-41)
                if (r6 > r5) goto L34
                r0 = 4
                goto Le
            L34:
                r6 = 1000(0x3e8, float:1.401E-42)
                if (r6 > r5) goto L3a
                r0 = 3
                goto Le
            L3a:
                r6 = 100
                if (r6 > r5) goto L40
                r0 = 2
                goto Le
            L40:
                r6 = 10
                if (r6 > r5) goto L45
                goto Le
            L45:
                if (r0 > r5) goto L48
                goto L4c
            L48:
                r0 = -1
                r4 = r1
                r1 = r0
                r0 = r4
            L4c:
                long r5 = (long) r0
                r0 = 32
                long r5 = r5 << r0
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r0 = (long) r1
                long r0 = r0 & r2
                long r5 = r5 | r0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.Grisu3.FastDtoa.biggestPowerTen(int, int):long");
        }

        public static boolean digitGen(FastDtoaBuilder fastDtoaBuilder, int i) {
            FastDtoaBuilder fastDtoaBuilder2 = fastDtoaBuilder;
            DiyFp diyFp = fastDtoaBuilder2.scaled_boundary_minus;
            DiyFp diyFp2 = fastDtoaBuilder2.scaled_w;
            DiyFp diyFp3 = fastDtoaBuilder2.scaled_boundary_plus;
            DiyFp diyFp4 = fastDtoaBuilder2.too_low;
            long j = 1;
            diyFp4.f = diyFp.f - 1;
            diyFp4.e = diyFp.e;
            DiyFp diyFp5 = fastDtoaBuilder2.too_high;
            diyFp5.f = diyFp3.f + 1;
            diyFp5.e = diyFp3.e;
            DiyFp diyFp6 = fastDtoaBuilder2.unsafe_interval;
            diyFp6.f = diyFp5.f;
            diyFp6.e = diyFp5.e;
            diyFp6.subtract(diyFp4);
            DiyFp diyFp7 = fastDtoaBuilder2.one;
            int i2 = diyFp2.e;
            long j2 = 1 << (-i2);
            diyFp7.f = j2;
            diyFp7.e = i2;
            long j3 = diyFp5.f;
            int i3 = (int) ((j3 >>> (-i2)) & 4294967295L);
            long j4 = j3 & (j2 - 1);
            long biggestPowerTen = biggestPowerTen(i3, 64 - (-i2));
            int i4 = (int) ((biggestPowerTen >>> 32) & 4294967295L);
            int i5 = ((int) (biggestPowerTen & 4294967295L)) + 1;
            while (i5 > 0) {
                fastDtoaBuilder2.append((byte) ((i3 / i4) + 48));
                i3 %= i4;
                i5--;
                long j5 = (i3 << (-diyFp7.e)) + j4;
                if (j5 < diyFp6.f) {
                    fastDtoaBuilder2.point = (fastDtoaBuilder2.end - i) + i5;
                    DiyFp diyFp8 = fastDtoaBuilder2.minus_round;
                    diyFp8.f = diyFp5.f;
                    diyFp8.e = diyFp5.e;
                    diyFp8.subtract(diyFp2);
                    return roundWeed(fastDtoaBuilder2, diyFp8.f, diyFp6.f, j5, i4 << (-diyFp7.e), 1L);
                }
                i4 /= 10;
                j = 1;
            }
            while (true) {
                long j6 = j4 * 5;
                j *= 5;
                diyFp6.f *= 5;
                diyFp6.e++;
                diyFp7.f >>>= 1;
                int i6 = diyFp7.e + 1;
                diyFp7.e = i6;
                fastDtoaBuilder2.append((byte) (((int) ((j6 >>> (-i6)) & 4294967295L)) + 48));
                long j7 = (diyFp7.f - 1) & j6;
                i5--;
                if (j7 < diyFp6.f) {
                    fastDtoaBuilder2.point = (fastDtoaBuilder2.end - i) + i5;
                    DiyFp diyFp9 = fastDtoaBuilder2.minus_round;
                    diyFp9.f = diyFp5.f;
                    diyFp9.e = diyFp5.e;
                    diyFp9.subtract(diyFp2);
                    return roundWeed(fastDtoaBuilder2, diyFp9.f * j, diyFp6.f, j7, diyFp7.f, j);
                }
                fastDtoaBuilder2 = fastDtoaBuilder;
                j4 = j7;
            }
        }

        public static boolean roundWeed(FastDtoaBuilder fastDtoaBuilder, long j, long j2, long j3, long j4, long j5) {
            long j6 = j - j5;
            long j7 = j + j5;
            long j8 = j3;
            while (j8 < j6 && j2 - j8 >= j4) {
                long j9 = j8 + j4;
                if (j9 >= j6 && j6 - j8 < j9 - j6) {
                    break;
                }
                fastDtoaBuilder.decreaseLast();
                j8 = j9;
            }
            if (j8 < j7 && j2 - j8 >= j4) {
                long j10 = j8 + j4;
                if (j10 < j7 || j7 - j8 > j10 - j7) {
                    return false;
                }
            }
            return 2 * j5 <= j8 && j8 <= j2 - (4 * j5);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FastDtoaBuilder {
        static final byte[] digits = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        private int point;
        private final DiyFp v = new DiyFp();
        private final DiyFp w = new DiyFp();
        private final DiyFp boundary_minus = new DiyFp();
        private final DiyFp boundary_plus = new DiyFp();
        private final DiyFp ten_mk = new DiyFp();
        private final DiyFp scaled_w = new DiyFp();
        private final DiyFp scaled_boundary_minus = new DiyFp();
        private final DiyFp scaled_boundary_plus = new DiyFp();
        private final DiyFp too_low = new DiyFp();
        private final DiyFp too_high = new DiyFp();
        private final DiyFp unsafe_interval = new DiyFp();
        private final DiyFp one = new DiyFp();
        private final DiyFp minus_round = new DiyFp();
        private final byte[] chars = new byte[27];
        private int end = 0;

        private void toExponentialFormat(int i, int i2) {
            byte b;
            int i3 = this.end;
            if (i3 - i > 1) {
                int i4 = i + 1;
                byte[] bArr = this.chars;
                System.arraycopy(bArr, i4, bArr, i + 2, i3 - i4);
                this.chars[i4] = 46;
                this.end++;
            }
            byte[] bArr2 = this.chars;
            int i5 = this.end;
            int i6 = i5 + 1;
            this.end = i6;
            bArr2[i5] = 69;
            int i7 = i2 - 1;
            if (i7 < 0) {
                i7 = -i7;
                b = 45;
            } else {
                b = GenericAccessProfile.MESH_BEACON;
            }
            int i8 = i5 + 2;
            this.end = i8;
            bArr2[i6] = b;
            if (i7 > 99) {
                i8 = i5 + 4;
            } else if (i7 > 9) {
                i8 = i5 + 3;
            }
            this.end = i8 + 1;
            while (true) {
                int i9 = i8 - 1;
                this.chars[i8] = digits[i7 % 10];
                i7 /= 10;
                if (i7 == 0) {
                    return;
                } else {
                    i8 = i9;
                }
            }
        }

        private void toFixedFormat(int i, int i2) {
            byte[] bArr;
            int i3 = this.point;
            int i4 = this.end;
            if (i3 < i4) {
                if (i2 <= 0) {
                    int i5 = 2 - i2;
                    int i6 = i4 + i;
                    while (true) {
                        bArr = this.chars;
                        if (i6 < i) {
                            break;
                        }
                        bArr[i6 + i5] = bArr[i6];
                        i6--;
                    }
                    bArr[i] = 48;
                    bArr[i + 1] = 46;
                    if (i2 < 0) {
                        int i7 = i + 2;
                        int i8 = i7 - i2;
                        while (i7 < i8) {
                            this.chars[i7] = 48;
                            i7++;
                        }
                    }
                    this.end += i5;
                    return;
                }
                while (true) {
                    int i9 = this.point;
                    byte[] bArr2 = this.chars;
                    if (i4 < i9) {
                        bArr2[i9] = 46;
                        this.end++;
                        return;
                    } else {
                        bArr2[i4 + 1] = bArr2[i4];
                        i4--;
                    }
                }
            } else {
                if (i3 <= i4) {
                    byte[] bArr3 = this.chars;
                    bArr3[i4] = 46;
                    bArr3[i4 + 1] = 48;
                    this.end = i4 + 2;
                    return;
                }
                while (true) {
                    int i10 = this.point;
                    if (i4 >= i10) {
                        int i11 = this.end;
                        int i12 = (i10 - i11) + i11;
                        this.end = i12;
                        byte[] bArr4 = this.chars;
                        bArr4[i12] = 46;
                        bArr4[i12 + 1] = 48;
                        this.end = i12 + 2;
                        return;
                    }
                    this.chars[i4] = 48;
                    i4++;
                }
            }
        }

        public void append(byte b) {
            byte[] bArr = this.chars;
            int i = this.end;
            this.end = i + 1;
            bArr[i] = b;
        }

        public int copyTo(byte[] bArr, int i) {
            int i2 = 0;
            while (true) {
                int i3 = this.end;
                if (i2 >= i3) {
                    return i3;
                }
                bArr[i2 + i] = this.chars[i2];
                i2++;
            }
        }

        public void decreaseLast() {
            this.chars[this.end - 1] = (byte) (r0[r2] - 1);
        }

        public int initialize(long j) {
            DoubleHelper.asNormalizedDiyFp(j, this.w);
            this.boundary_minus.reset();
            this.boundary_plus.reset();
            DoubleHelper.normalizedBoundaries(this.v, j, this.boundary_minus, this.boundary_plus);
            this.ten_mk.reset();
            int cachedPower = CachedPowers.getCachedPower(this.w.e + 64, Grisu3.minimal_target_exponent, this.ten_mk);
            DiyFp diyFp = this.scaled_w;
            DiyFp diyFp2 = this.w;
            diyFp.f = diyFp2.f;
            diyFp.e = diyFp2.e;
            diyFp.multiply(this.ten_mk);
            DiyFp diyFp3 = this.scaled_boundary_minus;
            DiyFp diyFp4 = this.boundary_minus;
            diyFp3.f = diyFp4.f;
            diyFp3.e = diyFp4.e;
            diyFp3.multiply(this.ten_mk);
            DiyFp diyFp5 = this.scaled_boundary_plus;
            DiyFp diyFp6 = this.boundary_plus;
            diyFp5.f = diyFp6.f;
            diyFp5.e = diyFp6.e;
            diyFp5.multiply(this.ten_mk);
            return cachedPower;
        }

        public void reset() {
            this.end = 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[chars:");
            sb.append(new String(this.chars, 0, this.end));
            sb.append(", point:");
            return a$$ExternalSyntheticOutline0.m(sb, this.point, MarkdownConstants.RIGHT_BRACKET);
        }

        public void write(int i) {
            int i2 = this.point - i;
            if (i2 < -5 || i2 > 21) {
                toExponentialFormat(i, i2);
            } else {
                toFixedFormat(i, i2);
            }
        }
    }

    public static boolean tryConvert(double d, FastDtoaBuilder fastDtoaBuilder) {
        long doubleToLongBits;
        int i;
        fastDtoaBuilder.reset();
        if (d < 0.0d) {
            fastDtoaBuilder.append((byte) 45);
            doubleToLongBits = Double.doubleToLongBits(-d);
            i = 1;
        } else {
            doubleToLongBits = Double.doubleToLongBits(d);
            i = 0;
        }
        if (!FastDtoa.digitGen(fastDtoaBuilder, fastDtoaBuilder.initialize(doubleToLongBits))) {
            return false;
        }
        fastDtoaBuilder.write(i);
        return true;
    }
}
