package org.bouncycastle.math.ec.rfc8032;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.security.SecureRandom;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public abstract class Ed448 {
    private static final int COORD_INTS = 14;
    private static final int C_d = -39081;
    private static final int L4_0 = 43969588;
    private static final int L4_1 = 30366549;
    private static final int L4_2 = 163752818;
    private static final int L4_3 = 258169998;
    private static final int L4_4 = 96434764;
    private static final int L4_5 = 227822194;
    private static final int L4_6 = 149865618;
    private static final int L4_7 = 550336261;
    private static final int L_0 = 78101261;
    private static final int L_1 = 141809365;
    private static final int L_2 = 175155932;
    private static final int L_3 = 64542499;
    private static final int L_4 = 158326419;
    private static final int L_5 = 191173276;
    private static final int L_6 = 104575268;
    private static final int L_7 = 137584065;
    private static final long M26L = 67108863;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int POINT_BYTES = 57;
    private static final int PRECOMP_BLOCKS = 5;
    private static final int PRECOMP_MASK = 15;
    private static final int PRECOMP_POINTS = 16;
    private static final int PRECOMP_SPACING = 18;
    private static final int PRECOMP_TEETH = 5;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    private static final int SCALAR_BYTES = 57;
    private static final int SCALAR_INTS = 14;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM4_PREFIX = {83, 105, 103, 69, 100, 52, 52, 56};
    private static final int[] P = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] L = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};
    private static final int[] B_x = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] B_y = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final Object precompLock = new Object();
    private static PointExt[] precompBaseTable = null;
    private static int[] precompBase = null;

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    public static class F extends X448Field {
        private F() {
        }
    }

    public static class PointExt {
        int[] x;
        int[] y;
        int[] z;

        private PointExt() {
            this.x = X448Field.create();
            this.y = X448Field.create();
            this.z = X448Field.create();
        }
    }

    public static class PointPrecomp {
        int[] x;
        int[] y;

        private PointPrecomp() {
            this.x = X448Field.create();
            this.y = X448Field.create();
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        decodeScalar(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        decodeScalar(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        decodeScalar(bArr3, 0, iArr3);
        Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i = 0; i < 28; i++) {
            encode32(iArr[i], bArr4, i * 4);
        }
        return reduceScalar(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        X448Field.sqr(iArr, create2);
        X448Field.sqr(iArr2, create3);
        X448Field.sqr(iArr3, create4);
        X448Field.mul(create2, create3, create);
        X448Field.add(create2, create3, create2);
        X448Field.mul(create2, create4, create2);
        X448Field.sqr(create4, create4);
        X448Field.mul(create, 39081, create);
        X448Field.sub(create, create4, create);
        X448Field.add(create, create2, create);
        X448Field.normalize(create);
        return X448Field.isZero(create);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        decode32(bArr, 0, new int[14], 0, 14);
        return !Nat.gte(14, r2, P);
    }

    private static boolean checkScalarVar(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        decodeScalar(bArr, 0, iArr);
        return !Nat.gte(14, iArr, L);
    }

    private static byte[] copy(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static Xof createPrehash() {
        return createXof();
    }

    private static Xof createXof() {
        return new SHAKEDigest(256);
    }

    private static int decode16(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    private static int decode24(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static boolean decodePointVar(byte[] bArr, int i, boolean z, PointExt pointExt) {
        byte[] copy = copy(bArr, i, 57);
        if (!checkPointVar(copy)) {
            return false;
        }
        byte b = copy[56];
        int i2 = (b & 128) >>> 7;
        copy[56] = (byte) (b & Byte.MAX_VALUE);
        X448Field.decode(copy, 0, pointExt.y);
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        X448Field.sqr(pointExt.y, create);
        X448Field.mul(create, 39081, create2);
        X448Field.negate(create, create);
        X448Field.addOne(create);
        X448Field.addOne(create2);
        if (!X448Field.sqrtRatioVar(create, create2, pointExt.x)) {
            return false;
        }
        X448Field.normalize(pointExt.x);
        if (i2 == 1 && X448Field.isZeroVar(pointExt.x)) {
            return false;
        }
        int[] iArr = pointExt.x;
        if (z ^ (i2 != (iArr[0] & 1))) {
            X448Field.negate(iArr, iArr);
        }
        pointExtendXY(pointExt);
        return true;
    }

    private static void decodeScalar(byte[] bArr, int i, int[] iArr) {
        decode32(bArr, i, iArr, 0, 14);
    }

    private static void dom4(Xof xof, byte b, byte[] bArr) {
        byte[] bArr2 = DOM4_PREFIX;
        int length = bArr2.length;
        int i = length + 2;
        int length2 = bArr.length + i;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        xof.update(bArr3, 0, length2);
    }

    private static void encode24(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
    }

    private static void encode32(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void encode56(long j, byte[] bArr, int i) {
        encode32((int) j, bArr, i);
        encode24((int) (j >>> 32), bArr, i + 4);
    }

    private static int encodePoint(PointExt pointExt, byte[] bArr, int i) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        X448Field.inv(pointExt.z, create2);
        X448Field.mul(pointExt.x, create2, create);
        X448Field.mul(pointExt.y, create2, create2);
        X448Field.normalize(create);
        X448Field.normalize(create2);
        int checkPoint = checkPoint(create, create2);
        X448Field.encode(create2, bArr, i);
        bArr[i + 56] = (byte) ((create[0] & 1) << 7);
        return checkPoint;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        Xof createXof = createXof();
        byte[] bArr3 = new byte[114];
        createXof.update(bArr, i, 57);
        createXof.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i2);
    }

    private static int getWindow4(int[] iArr, int i) {
        return (iArr[i >>> 3] >>> ((i & 7) << 2)) & 15;
    }

    private static byte[] getWnafVar(int[] iArr, int i) {
        int[] iArr2 = new int[28];
        int i2 = 0;
        int i3 = 14;
        int i4 = 28;
        int i5 = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i6 = iArr[i3];
            iArr2[i4 - 1] = (i5 << 16) | (i6 >>> 16);
            i4 -= 2;
            iArr2[i4] = i6;
            i5 = i6;
        }
        byte[] bArr = new byte[447];
        int i7 = 32 - i;
        int i8 = 0;
        int i9 = 0;
        while (i2 < 28) {
            int i10 = iArr2[i2];
            while (i8 < 16) {
                int i11 = i10 >>> i8;
                if ((i11 & 1) == i9) {
                    i8++;
                } else {
                    int i12 = (i11 | 1) << i7;
                    bArr[(i2 << 4) + i8] = (byte) (i12 >> i7);
                    i8 += i;
                    i9 = i12 >>> 31;
                }
            }
            i2++;
            i8 -= 16;
        }
        return bArr;
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, byte b, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        if (!checkContextVar(bArr2)) {
            Single$$ExternalSyntheticBUOutline0.m$3("ctx");
            return;
        }
        Xof createXof = createXof();
        byte[] bArr5 = new byte[114];
        createXof.update(bArr, i, 57);
        createXof.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(createXof, bArr5, bArr6, bArr7, 0, bArr2, b, bArr3, i2, i3, bArr4, i4);
    }

    private static boolean implVerify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4) {
        if (!checkContextVar(bArr3)) {
            Single$$ExternalSyntheticBUOutline0.m$3("ctx");
            return false;
        }
        byte[] copy = copy(bArr, i, 57);
        byte[] copy2 = copy(bArr, i + 57, 57);
        if (!checkPointVar(copy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!checkScalarVar(copy2, iArr)) {
            return false;
        }
        PointExt pointExt = new PointExt();
        if (!decodePointVar(bArr2, i2, true, pointExt)) {
            return false;
        }
        Xof createXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(createXof, b, bArr3);
        createXof.update(copy, 0, 57);
        createXof.update(bArr2, i2, 57);
        createXof.update(bArr4, i3, i4);
        createXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        decodeScalar(reduceScalar(bArr5), 0, iArr2);
        PointExt pointExt2 = new PointExt();
        scalarMultStrausVar(iArr, iArr2, pointExt, pointExt2);
        byte[] bArr6 = new byte[57];
        return encodePoint(pointExt2, bArr6, 0) != 0 && Arrays.areEqual(bArr6, copy);
    }

    private static boolean isNeutralElementVar(int[] iArr, int[] iArr2, int[] iArr3) {
        return X448Field.isZeroVar(iArr) && X448Field.areEqualVar(iArr2, iArr3);
    }

    private static void pointAdd(PointExt pointExt, PointExt pointExt2) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        int[] create8 = X448Field.create();
        X448Field.mul(pointExt.z, pointExt2.z, create);
        X448Field.sqr(create, create2);
        X448Field.mul(pointExt.x, pointExt2.x, create3);
        X448Field.mul(pointExt.y, pointExt2.y, create4);
        X448Field.mul(create3, create4, create5);
        X448Field.mul(create5, 39081, create5);
        X448Field.add(create2, create5, create6);
        X448Field.sub(create2, create5, create7);
        X448Field.add(pointExt.x, pointExt.y, create2);
        X448Field.add(pointExt2.x, pointExt2.y, create5);
        X448Field.mul(create2, create5, create8);
        X448Field.add(create4, create3, create2);
        X448Field.sub(create4, create3, create5);
        X448Field.carry(create2);
        X448Field.sub(create8, create2, create8);
        X448Field.mul(create8, create, create8);
        X448Field.mul(create5, create, create5);
        X448Field.mul(create6, create8, pointExt2.x);
        X448Field.mul(create5, create7, pointExt2.y);
        X448Field.mul(create6, create7, pointExt2.z);
    }

    private static void pointAddPrecomp(PointPrecomp pointPrecomp, PointExt pointExt) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        X448Field.sqr(pointExt.z, create);
        X448Field.mul(pointPrecomp.x, pointExt.x, create2);
        X448Field.mul(pointPrecomp.y, pointExt.y, create3);
        X448Field.mul(create2, create3, create4);
        X448Field.mul(create4, 39081, create4);
        X448Field.add(create, create4, create5);
        X448Field.sub(create, create4, create6);
        X448Field.add(pointPrecomp.x, pointPrecomp.y, create);
        X448Field.add(pointExt.x, pointExt.y, create4);
        X448Field.mul(create, create4, create7);
        X448Field.add(create3, create2, create);
        X448Field.sub(create3, create2, create4);
        X448Field.carry(create);
        X448Field.sub(create7, create, create7);
        X448Field.mul(create7, pointExt.z, create7);
        X448Field.mul(create4, pointExt.z, create4);
        X448Field.mul(create5, create7, pointExt.x);
        X448Field.mul(create4, create6, pointExt.y);
        X448Field.mul(create5, create6, pointExt.z);
    }

    private static void pointAddVar(boolean z, PointExt pointExt, PointExt pointExt2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        int[] create8 = X448Field.create();
        if (z) {
            X448Field.sub(pointExt.y, pointExt.x, create8);
            iArr2 = create2;
            iArr = create5;
            iArr4 = create6;
            iArr3 = create7;
        } else {
            X448Field.add(pointExt.y, pointExt.x, create8);
            iArr = create2;
            iArr2 = create5;
            iArr3 = create6;
            iArr4 = create7;
        }
        X448Field.mul(pointExt.z, pointExt2.z, create);
        X448Field.sqr(create, create2);
        X448Field.mul(pointExt.x, pointExt2.x, create3);
        X448Field.mul(pointExt.y, pointExt2.y, create4);
        X448Field.mul(create3, create4, create5);
        X448Field.mul(create5, 39081, create5);
        X448Field.add(create2, create5, iArr3);
        X448Field.sub(create2, create5, iArr4);
        X448Field.add(pointExt2.x, pointExt2.y, create5);
        X448Field.mul(create8, create5, create8);
        X448Field.add(create4, create3, iArr);
        X448Field.sub(create4, create3, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(create8, create2, create8);
        X448Field.mul(create8, create, create8);
        X448Field.mul(create5, create, create5);
        X448Field.mul(create6, create8, pointExt2.x);
        X448Field.mul(create5, create7, pointExt2.y);
        X448Field.mul(create6, create7, pointExt2.z);
    }

    private static void pointCopy(PointExt pointExt, PointExt pointExt2) {
        X448Field.copy(pointExt.x, 0, pointExt2.x, 0);
        X448Field.copy(pointExt.y, 0, pointExt2.y, 0);
        X448Field.copy(pointExt.z, 0, pointExt2.z, 0);
    }

    private static void pointDouble(PointExt pointExt) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        X448Field.add(pointExt.x, pointExt.y, create);
        X448Field.sqr(create, create);
        X448Field.sqr(pointExt.x, create2);
        X448Field.sqr(pointExt.y, create3);
        X448Field.add(create2, create3, create4);
        X448Field.carry(create4);
        X448Field.sqr(pointExt.z, create5);
        X448Field.add(create5, create5, create5);
        X448Field.carry(create5);
        X448Field.sub(create4, create5, create6);
        X448Field.sub(create, create4, create);
        X448Field.sub(create2, create3, create2);
        X448Field.mul(create, create6, pointExt.x);
        X448Field.mul(create4, create2, pointExt.y);
        X448Field.mul(create4, create6, pointExt.z);
    }

    private static void pointExtendXY(PointExt pointExt) {
        X448Field.one(pointExt.z);
    }

    private static void pointLookup(int[] iArr, int i, int[] iArr2, PointExt pointExt) {
        int window4 = getWindow4(iArr, i);
        int i2 = (window4 >>> 3) ^ 1;
        int i3 = (window4 ^ (-i2)) & 7;
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            int i6 = ((i5 ^ i3) - 1) >> 31;
            X448Field.cmov(i6, iArr2, i4, pointExt.x, 0);
            X448Field.cmov(i6, iArr2, i4 + 16, pointExt.y, 0);
            X448Field.cmov(i6, iArr2, i4 + 32, pointExt.z, 0);
            i4 += 48;
        }
        X448Field.cnegate(i2, pointExt.x);
    }

    private static int[] pointPrecompute(PointExt pointExt, int i) {
        PointExt pointCopy = pointCopy(pointExt);
        PointExt pointCopy2 = pointCopy(pointCopy);
        pointDouble(pointCopy2);
        int[] createTable = X448Field.createTable(i * 3);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            X448Field.copy(pointCopy.x, 0, createTable, i2);
            X448Field.copy(pointCopy.y, 0, createTable, i2 + 16);
            X448Field.copy(pointCopy.z, 0, createTable, i2 + 32);
            i2 += 48;
            i3++;
            if (i3 == i) {
                return createTable;
            }
            pointAdd(pointCopy2, pointCopy);
        }
    }

    private static PointExt[] pointPrecomputeVar(PointExt pointExt, int i) {
        PointExt pointCopy = pointCopy(pointExt);
        pointDouble(pointCopy);
        PointExt[] pointExtArr = new PointExt[i];
        pointExtArr[0] = pointCopy(pointExt);
        for (int i2 = 1; i2 < i; i2++) {
            PointExt pointCopy2 = pointCopy(pointExtArr[i2 - 1]);
            pointExtArr[i2] = pointCopy2;
            pointAddVar(false, pointCopy, pointCopy2);
        }
        return pointExtArr;
    }

    private static void pointSetNeutral(PointExt pointExt) {
        X448Field.zero(pointExt.x);
        X448Field.one(pointExt.y);
        X448Field.one(pointExt.z);
    }

    public static void precompute() {
        synchronized (precompLock) {
            try {
                if (precompBase == null) {
                    PointExt pointExt = new PointExt();
                    X448Field.copy(B_x, 0, pointExt.x, 0);
                    X448Field.copy(B_y, 0, pointExt.y, 0);
                    pointExtendXY(pointExt);
                    precompBaseTable = pointPrecomputeVar(pointExt, 32);
                    precompBase = X448Field.createTable(160);
                    int i = 0;
                    for (int i2 = 0; i2 < 5; i2++) {
                        PointExt[] pointExtArr = new PointExt[5];
                        PointExt pointExt2 = new PointExt();
                        pointSetNeutral(pointExt2);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 5) {
                                break;
                            }
                            pointAddVar(true, pointExt, pointExt2);
                            pointDouble(pointExt);
                            pointExtArr[i3] = pointCopy(pointExt);
                            if (i2 + i3 != 8) {
                                for (int i4 = 1; i4 < 18; i4++) {
                                    pointDouble(pointExt);
                                }
                            }
                            i3++;
                        }
                        PointExt[] pointExtArr2 = new PointExt[16];
                        pointExtArr2[0] = pointExt2;
                        int i5 = 1;
                        for (int i6 = 0; i6 < 4; i6++) {
                            int i7 = 1 << i6;
                            int i8 = 0;
                            while (i8 < i7) {
                                PointExt pointCopy = pointCopy(pointExtArr2[i5 - i7]);
                                pointExtArr2[i5] = pointCopy;
                                pointAddVar(false, pointExtArr[i6], pointCopy);
                                i8++;
                                i5++;
                            }
                        }
                        int[] createTable = X448Field.createTable(16);
                        int[] create = X448Field.create();
                        X448Field.copy(pointExtArr2[0].z, 0, create, 0);
                        X448Field.copy(create, 0, createTable, 0);
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            if (i10 >= 16) {
                                break;
                            }
                            X448Field.mul(create, pointExtArr2[i10].z, create);
                            X448Field.copy(create, 0, createTable, i10 * 16);
                            i9 = i10;
                        }
                        X448Field.invVar(create, create);
                        int[] create2 = X448Field.create();
                        while (i9 > 0) {
                            int i11 = i9 - 1;
                            X448Field.copy(createTable, i11 * 16, create2, 0);
                            X448Field.mul(create2, create, create2);
                            X448Field.copy(create2, 0, createTable, i9 * 16);
                            X448Field.mul(create, pointExtArr2[i9].z, create);
                            i9 = i11;
                        }
                        X448Field.copy(create, 0, createTable, 0);
                        for (int i12 = 0; i12 < 16; i12++) {
                            PointExt pointExt3 = pointExtArr2[i12];
                            X448Field.copy(createTable, i12 * 16, pointExt3.z, 0);
                            int[] iArr = pointExt3.x;
                            X448Field.mul(iArr, pointExt3.z, iArr);
                            int[] iArr2 = pointExt3.y;
                            X448Field.mul(iArr2, pointExt3.z, iArr2);
                            X448Field.copy(pointExt3.x, 0, precompBase, i);
                            X448Field.copy(pointExt3.y, 0, precompBase, i + 16);
                            i += 32;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static byte[] reduceScalar(byte[] bArr) {
        long decode32 = decode32(bArr, 0) & M32L;
        long decode24 = (decode24(bArr, 4) << 4) & M32L;
        long decode322 = decode32(bArr, 7) & M32L;
        long decode242 = (decode24(bArr, 11) << 4) & M32L;
        long decode323 = decode32(bArr, 14) & M32L;
        long decode243 = (decode24(bArr, 18) << 4) & M32L;
        long decode324 = decode32(bArr, 21) & M32L;
        long decode244 = (decode24(bArr, 25) << 4) & M32L;
        long decode325 = decode32(bArr, 28) & M32L;
        long decode245 = (decode24(bArr, 32) << 4) & M32L;
        long decode326 = decode32(bArr, 35) & M32L;
        long decode246 = (decode24(bArr, 39) << 4) & M32L;
        long decode327 = decode32(bArr, 42) & M32L;
        long decode247 = (decode24(bArr, 46) << 4) & M32L;
        long decode328 = decode32(bArr, 49) & M32L;
        long decode248 = (decode24(bArr, 53) << 4) & M32L;
        long decode329 = decode32(bArr, 56) & M32L;
        long decode249 = (decode24(bArr, 60) << 4) & M32L;
        long decode3210 = decode32(bArr, 63) & M32L;
        long decode2410 = (decode24(bArr, 67) << 4) & M32L;
        long decode3211 = decode32(bArr, 70) & M32L;
        long decode2411 = (decode24(bArr, 74) << 4) & M32L;
        long decode3212 = decode32(bArr, 77) & M32L;
        long decode2412 = (decode24(bArr, 81) << 4) & M32L;
        long decode3213 = decode32(bArr, 84);
        long j = decode3213 & M32L;
        long decode2413 = (decode24(bArr, 88) << 4) & M32L;
        long decode3214 = decode32(bArr, 91);
        long j2 = decode3214 & M32L;
        long decode2414 = (decode24(bArr, 95) << 4) & M32L;
        long decode3215 = decode32(bArr, 98);
        long j3 = decode3215 & M32L;
        long decode2415 = (decode24(bArr, 102) << 4) & M32L;
        long decode3216 = decode32(bArr, 105);
        long j4 = decode3216 & M32L;
        long decode2416 = (decode24(bArr, 109) << 4) & M32L;
        long decode16 = decode16(bArr, 112) & M32L;
        long j5 = decode2416 + (j4 >>> 28);
        long j6 = decode3216 & M28L;
        long j7 = (j6 * 163752818) + (j5 * 30366549) + (decode16 * 43969588) + decode329;
        long j8 = (j6 * 258169998) + (j5 * 163752818) + (decode16 * 30366549) + decode249;
        long j9 = (j6 * 96434764) + (j5 * 258169998) + (decode16 * 163752818) + decode3210;
        long j10 = (j6 * 227822194) + (j5 * 96434764) + (decode16 * 258169998) + decode2410;
        long j11 = (j6 * 149865618) + (j5 * 227822194) + (decode16 * 96434764) + decode3211;
        long j12 = decode2415 + (j3 >>> 28);
        long j13 = decode3215 & M28L;
        long j14 = (j12 * 43969588) + decode247;
        long j15 = (j12 * 30366549) + (j6 * 43969588) + decode328;
        long j16 = (j12 * 163752818) + (j6 * 30366549) + (j5 * 43969588) + decode248;
        long j17 = (j12 * 258169998) + j7;
        long j18 = (j12 * 96434764) + j8;
        long j19 = (j12 * 227822194) + j9;
        long j20 = (j12 * 149865618) + j10;
        long j21 = (j12 * 550336261) + j11;
        long j22 = (j13 * 43969588) + decode327;
        long j23 = (j13 * 30366549) + j14;
        long j24 = (j13 * 163752818) + j15;
        long j25 = (j13 * 258169998) + j16;
        long j26 = (j13 * 96434764) + j17;
        long j27 = (j13 * 227822194) + j18;
        long j28 = (j13 * 149865618) + j19;
        long j29 = (j13 * 550336261) + j20;
        long j30 = decode2414 + (j2 >>> 28);
        long j31 = decode3214 & M28L;
        long j32 = (j30 * 163752818) + j23;
        long j33 = (j30 * 258169998) + j24;
        long j34 = (j30 * 149865618) + j27;
        long j35 = (j31 * 43969588) + decode326;
        long j36 = (j31 * 30366549) + (j30 * 43969588) + decode246;
        long j37 = (j31 * 163752818) + (j30 * 30366549) + j22;
        long j38 = (j31 * 258169998) + j32;
        long j39 = (j31 * 96434764) + j33;
        long j40 = (j31 * 227822194) + (j30 * 96434764) + j25;
        long j41 = (j31 * 149865618) + (j30 * 227822194) + j26;
        long j42 = (j31 * 550336261) + j34;
        long j43 = decode2413 + (j >>> 28);
        long j44 = decode3213 & M28L;
        long j45 = (j43 * 43969588) + decode245;
        long j46 = (j43 * 30366549) + j35;
        long j47 = (j43 * 163752818) + j36;
        long j48 = (j43 * 258169998) + j37;
        long j49 = (j43 * 96434764) + j38;
        long j50 = (j43 * 227822194) + j39;
        long j51 = (j43 * 149865618) + j40;
        long j52 = (j43 * 550336261) + j41;
        long j53 = (j6 * 550336261) + (j5 * 149865618) + (decode16 * 227822194) + decode2411 + (j21 >>> 28);
        long j54 = j21 & M28L;
        long j55 = (j5 * 550336261) + (decode16 * 149865618) + decode3212 + (j53 >>> 28);
        long j56 = j53 & M28L;
        long j57 = (decode16 * 550336261) + decode2412 + (j55 >>> 28);
        long j58 = j55 & M28L;
        long j59 = j44 + (j57 >>> 28);
        long j60 = j57 & M28L;
        long j61 = (j59 * 43969588) + decode325;
        long j62 = (j59 * 30366549) + j45;
        long j63 = (j59 * 163752818) + j46;
        long j64 = (j59 * 258169998) + j47;
        long j65 = (j59 * 96434764) + j48;
        long j66 = (j59 * 227822194) + j49;
        long j67 = (j59 * 149865618) + j50;
        long j68 = (j59 * 550336261) + j51;
        long j69 = (j60 * 43969588) + decode244;
        long j70 = (j60 * 30366549) + j61;
        long j71 = (j60 * 163752818) + j62;
        long j72 = (j60 * 258169998) + j63;
        long j73 = (j60 * 96434764) + j64;
        long j74 = (j60 * 227822194) + j65;
        long j75 = (j60 * 149865618) + j66;
        long j76 = (j60 * 550336261) + j67;
        long j77 = (j58 * 43969588) + decode324;
        long j78 = (j58 * 30366549) + j69;
        long j79 = (j58 * 163752818) + j70;
        long j80 = (j58 * 258169998) + j71;
        long j81 = (j58 * 96434764) + j72;
        long j82 = (j58 * 227822194) + j73;
        long j83 = (j58 * 149865618) + j74;
        long j84 = (j58 * 550336261) + j75;
        long j85 = (j30 * 550336261) + j28 + (j42 >>> 28);
        long j86 = j42 & M28L;
        long j87 = j29 + (j85 >>> 28);
        long j88 = j85 & M28L;
        long j89 = j54 + (j87 >>> 28);
        long j90 = j87 & M28L;
        long j91 = j56 + (j89 >>> 28);
        long j92 = j89 & M28L;
        long j93 = (j91 * 43969588) + decode243;
        long j94 = (j91 * 30366549) + j77;
        long j95 = (j91 * 163752818) + j78;
        long j96 = (j91 * 258169998) + j79;
        long j97 = (j91 * 96434764) + j80;
        long j98 = (j91 * 227822194) + j81;
        long j99 = (j91 * 149865618) + j82;
        long j100 = (j92 * 43969588) + decode323;
        long j101 = (j92 * 30366549) + j93;
        long j102 = (j92 * 163752818) + j94;
        long j103 = (j92 * 258169998) + j95;
        long j104 = (j92 * 96434764) + j96;
        long j105 = (j92 * 227822194) + j97;
        long j106 = (j92 * 149865618) + j98;
        long j107 = (j90 * 43969588) + decode242;
        long j108 = (j90 * 30366549) + j100;
        long j109 = (j90 * 163752818) + j101;
        long j110 = (j90 * 258169998) + j102;
        long j111 = (j90 * 96434764) + j103;
        long j112 = (j90 * 227822194) + j104;
        long j113 = (j90 * 149865618) + j105;
        long j114 = (j90 * 550336261) + j106;
        long j115 = j68 + (j76 >>> 28);
        long j116 = j76 & M28L;
        long j117 = j52 + (j115 >>> 28);
        long j118 = j115 & M28L;
        long j119 = j86 + (j117 >>> 28);
        long j120 = j117 & M28L;
        long j121 = j88 + (j119 >>> 28);
        long j122 = j119 & M28L;
        long j123 = (j121 * 43969588) + decode322;
        long j124 = (j121 * 30366549) + j107;
        long j125 = (j121 * 163752818) + j108;
        long j126 = (j121 * 258169998) + j109;
        long j127 = (j121 * 96434764) + j110;
        long j128 = (j121 * 227822194) + j111;
        long j129 = (j121 * 149865618) + j112;
        long j130 = (j121 * 550336261) + j113;
        long j131 = (43969588 * j122) + decode24;
        long j132 = j115 & M26L;
        long j133 = (j120 * 4) + (j118 >>> 26) + 1;
        long j134 = (78101261 * j133) + decode32;
        long j135 = (141809365 * j133) + j131 + (j134 >>> 28);
        long j136 = j134 & M28L;
        long j137 = (175155932 * j133) + (30366549 * j122) + j123 + (j135 >>> 28);
        long j138 = j135 & M28L;
        long j139 = (64542499 * j133) + (163752818 * j122) + j124 + (j137 >>> 28);
        long j140 = j137 & M28L;
        long j141 = (158326419 * j133) + (258169998 * j122) + j125 + (j139 >>> 28);
        long j142 = j139 & M28L;
        long j143 = (191173276 * j133) + (96434764 * j122) + j126 + (j141 >>> 28);
        long j144 = j141 & M28L;
        long j145 = (104575268 * j133) + (227822194 * j122) + j127 + (j143 >>> 28);
        long j146 = j143 & M28L;
        long j147 = (j133 * 137584065) + (149865618 * j122) + j128 + (j145 >>> 28);
        long j148 = j145 & M28L;
        long j149 = (j122 * 550336261) + j129 + (j147 >>> 28);
        long j150 = j147 & M28L;
        long j151 = j130 + (j149 >>> 28);
        long j152 = j149 & M28L;
        long j153 = j114 + (j151 >>> 28);
        long j154 = j151 & M28L;
        long j155 = (j92 * 550336261) + j99 + (j153 >>> 28);
        long j156 = j153 & M28L;
        long j157 = (j91 * 550336261) + j83 + (j155 >>> 28);
        long j158 = j155 & M28L;
        long j159 = j84 + (j157 >>> 28);
        long j160 = j157 & M28L;
        long j161 = j116 + (j159 >>> 28);
        long j162 = j159 & M28L;
        long j163 = j132 + (j161 >>> 28);
        long j164 = j161 & M28L;
        long j165 = j163 & M26L;
        long j166 = (j163 >>> 26) - 1;
        long j167 = j136 - (j166 & 78101261);
        long j168 = (j138 - (j166 & 141809365)) + (j167 >> 28);
        long j169 = j167 & M28L;
        long j170 = (j140 - (j166 & 175155932)) + (j168 >> 28);
        long j171 = j168 & M28L;
        long j172 = (j142 - (j166 & 64542499)) + (j170 >> 28);
        long j173 = j170 & M28L;
        long j174 = (j144 - (j166 & 158326419)) + (j172 >> 28);
        long j175 = j172 & M28L;
        long j176 = (j146 - (j166 & 191173276)) + (j174 >> 28);
        long j177 = j174 & M28L;
        long j178 = (j148 - (j166 & 104575268)) + (j176 >> 28);
        long j179 = j176 & M28L;
        long j180 = (j150 - (j166 & 137584065)) + (j178 >> 28);
        long j181 = j178 & M28L;
        long j182 = j152 + (j180 >> 28);
        long j183 = j180 & M28L;
        long j184 = j154 + (j182 >> 28);
        long j185 = j182 & M28L;
        long j186 = j156 + (j184 >> 28);
        long j187 = j184 & M28L;
        long j188 = j158 + (j186 >> 28);
        long j189 = j186 & M28L;
        long j190 = j160 + (j188 >> 28);
        long j191 = j188 & M28L;
        long j192 = j162 + (j190 >> 28);
        long j193 = j190 & M28L;
        long j194 = j164 + (j192 >> 28);
        long j195 = j192 & M28L;
        long j196 = j165 + (j194 >> 28);
        long j197 = j194 & M28L;
        byte[] bArr2 = new byte[57];
        encode56(j169 | (j171 << 28), bArr2, 0);
        encode56(j173 | (j175 << 28), bArr2, 7);
        encode56((j179 << 28) | j177, bArr2, 14);
        encode56(j181 | (j183 << 28), bArr2, 21);
        encode56(j185 | (j187 << 28), bArr2, 28);
        encode56(j189 | (j191 << 28), bArr2, 35);
        encode56(j193 | (j195 << 28), bArr2, 42);
        encode56(j197 | (j196 << 28), bArr2, 49);
        return bArr2;
    }

    private static void scalarMult(byte[] bArr, PointExt pointExt, PointExt pointExt2) {
        int[] iArr = new int[14];
        decodeScalar(bArr, 0, iArr);
        Nat.shiftDownBits(14, iArr, 2, 0);
        Nat.cadd(14, (~iArr[0]) & 1, iArr, L, iArr);
        Nat.shiftDownBit(14, iArr, 1);
        int[] pointPrecompute = pointPrecompute(pointExt, 8);
        PointExt pointExt3 = new PointExt();
        pointLookup(iArr, 111, pointPrecompute, pointExt2);
        for (int i = 110; i >= 0; i--) {
            for (int i2 = 0; i2 < 4; i2++) {
                pointDouble(pointExt2);
            }
            pointLookup(iArr, i, pointPrecompute, pointExt3);
            pointAdd(pointExt3, pointExt2);
        }
        for (int i3 = 0; i3 < 2; i3++) {
            pointDouble(pointExt2);
        }
    }

    private static void scalarMultBase(byte[] bArr, PointExt pointExt) {
        precompute();
        int[] iArr = new int[15];
        decodeScalar(bArr, 0, iArr);
        iArr[14] = Nat.cadd(14, (~iArr[0]) & 1, iArr, L, iArr) + 4;
        Nat.shiftDownBit(15, iArr, 0);
        PointPrecomp pointPrecomp = new PointPrecomp();
        pointSetNeutral(pointExt);
        int i = 17;
        while (true) {
            int i2 = i;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = 0;
                for (int i5 = 0; i5 < 5; i5++) {
                    i4 = (i4 & (~(1 << i5))) ^ ((iArr[i2 >>> 5] >>> (i2 & 31)) << i5);
                    i2 += 18;
                }
                int i6 = (i4 >>> 4) & 1;
                pointLookup(i3, ((-i6) ^ i4) & 15, pointPrecomp);
                X448Field.cnegate(i6, pointPrecomp.x);
                pointAddPrecomp(pointPrecomp, pointExt);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointExt);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i) {
        PointExt pointExt = new PointExt();
        scalarMultBase(bArr, pointExt);
        if (encodePoint(pointExt, bArr2, i) != 0) {
            return;
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
    }

    public static void scalarMultBaseXY(X448.Friend friend, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (friend == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("This method is only for use by X448");
            return;
        }
        byte[] bArr2 = new byte[57];
        pruneScalar(bArr, i, bArr2);
        PointExt pointExt = new PointExt();
        scalarMultBase(bArr2, pointExt);
        if (checkPoint(pointExt.x, pointExt.y, pointExt.z) == 0) {
            Duration$$ExternalSyntheticBUOutline0.m$1();
        } else {
            X448Field.copy(pointExt.x, 0, iArr, 0);
            X448Field.copy(pointExt.y, 0, iArr2, 0);
        }
    }

    private static void scalarMultOrderVar(PointExt pointExt, PointExt pointExt2) {
        byte[] wnafVar = getWnafVar(L, 5);
        PointExt[] pointPrecomputeVar = pointPrecomputeVar(pointExt, 8);
        pointSetNeutral(pointExt2);
        int i = 446;
        while (true) {
            byte b = wnafVar[i];
            if (b != 0) {
                int i2 = b >> 31;
                pointAddVar(i2 != 0, pointPrecomputeVar[(b ^ i2) >>> 1], pointExt2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointExt2);
            }
        }
    }

    private static void scalarMultStrausVar(int[] iArr, int[] iArr2, PointExt pointExt, PointExt pointExt2) {
        precompute();
        byte[] wnafVar = getWnafVar(iArr, 7);
        byte[] wnafVar2 = getWnafVar(iArr2, 5);
        PointExt[] pointPrecomputeVar = pointPrecomputeVar(pointExt, 8);
        pointSetNeutral(pointExt2);
        int i = 446;
        while (true) {
            byte b = wnafVar[i];
            if (b != 0) {
                int i2 = b >> 31;
                pointAddVar(i2 != 0, precompBaseTable[(b ^ i2) >>> 1], pointExt2);
            }
            byte b2 = wnafVar2[i];
            if (b2 != 0) {
                int i3 = b2 >> 31;
                pointAddVar(i3 != 0, pointPrecomputeVar[(b2 ^ i3) >>> 1], pointExt2);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointExt2);
            }
        }
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4, bArr5, i5);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, Xof xof, byte[] bArr4, int i3) {
        byte[] bArr5 = new byte[64];
        if (64 == xof.doFinal(bArr5, 0, 64)) {
            implSign(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i3);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("ph");
        }
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i) {
        PointExt pointExt = new PointExt();
        if (!decodePointVar(bArr, i, false, pointExt)) {
            return false;
        }
        X448Field.normalize(pointExt.x);
        X448Field.normalize(pointExt.y);
        X448Field.normalize(pointExt.z);
        if (isNeutralElementVar(pointExt.x, pointExt.y, pointExt.z)) {
            return false;
        }
        PointExt pointExt2 = new PointExt();
        scalarMultOrderVar(pointExt, pointExt2);
        X448Field.normalize(pointExt2.x);
        X448Field.normalize(pointExt2.y);
        X448Field.normalize(pointExt2.z);
        return isNeutralElementVar(pointExt2.x, pointExt2.y, pointExt2.z);
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i) {
        return decodePointVar(bArr, i, false, new PointExt());
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4) {
        return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, Xof xof) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, 0, 64);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("ph");
        return false;
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        implSign(bArr, i, bArr2, (byte) 0, bArr3, i2, i3, bArr4, i4);
    }

    private static PointExt pointCopy(PointExt pointExt) {
        PointExt pointExt2 = new PointExt();
        pointCopy(pointExt, pointExt2);
        return pointExt2;
    }

    private static void decode32(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = decode32(bArr, (i4 * 4) + i);
        }
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3) {
        return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5, int i4) {
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64, bArr5, i4);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, Xof xof, byte[] bArr3, int i2) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            implSign(bArr, i, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i2);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("ph");
        }
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, int i3) {
        implSign(bArr, i, bArr2, (byte) 1, bArr3, i2, 64, bArr4, i3);
    }

    private static void pointLookup(int i, int i2, PointPrecomp pointPrecomp) {
        int i3 = i * 512;
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            X448Field.cmov(i5, precompBase, i3, pointPrecomp.x, 0);
            X448Field.cmov(i5, precompBase, i3 + 16, pointPrecomp.y, 0);
            i3 += 32;
        }
    }

    private static int checkPoint(int[] iArr, int[] iArr2) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        X448Field.sqr(iArr, create2);
        X448Field.sqr(iArr2, create3);
        X448Field.mul(create2, create3, create);
        X448Field.add(create2, create3, create2);
        X448Field.mul(create, 39081, create);
        X448Field.subOne(create);
        X448Field.add(create, create2, create);
        X448Field.normalize(create);
        return X448Field.isZero(create);
    }

    private static void implSign(Xof xof, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        dom4(xof, b, bArr4);
        xof.update(bArr, 57, 57);
        xof.update(bArr5, i2, i3);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] reduceScalar = reduceScalar(bArr);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(reduceScalar, bArr7, 0);
        dom4(xof, b, bArr4);
        xof.update(bArr7, 0, 57);
        xof.update(bArr3, i, 57);
        xof.update(bArr5, i2, i3);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] calculateS = calculateS(reduceScalar, reduceScalar(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i4, 57);
        System.arraycopy(calculateS, 0, bArr6, i4 + 57, 57);
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (!checkContextVar(bArr3)) {
            Single$$ExternalSyntheticBUOutline0.m$3("ctx");
            return;
        }
        Xof createXof = createXof();
        byte[] bArr6 = new byte[114];
        createXof.update(bArr, i, 57);
        createXof.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        pruneScalar(bArr6, 0, bArr7);
        implSign(createXof, bArr6, bArr7, bArr2, i2, bArr3, b, bArr4, i3, i4, bArr5, i5);
    }
}
