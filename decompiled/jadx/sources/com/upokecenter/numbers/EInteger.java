package com.upokecenter.numbers;

import androidx.collection.SieveCacheKt;
import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.core.view.DisplayCompat$$ExternalSyntheticBUOutline0;
import androidx.core.view.MotionEventCompat;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.protocol.Accessories;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import io.branch.referral.BranchError;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import kotlin.UShort;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class EInteger implements Comparable<EInteger> {
    private static final int CacheLast = 128;
    private static final String Digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int MultRecursionThreshold = 10;
    private static final int RecursiveDivisionLimit = 201;
    private static final int ShortMask = 65535;
    private static final int Toom3Threshold = 100;
    private static final int Toom4Threshold = 400;
    private final boolean negative;
    private final int wordCount;
    private final short[] words;
    static final int[] CharToDigit = {36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 36, 36, 36, 36, 36, 36, 36, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 36, 36, 36, 36, 36, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 36, 36, 36, 36};
    static final int[] MaxSafeInts = {LockFreeTaskQueueCore.MAX_CAPACITY_MASK, 715827881, 536870911, 429496728, 357913940, 306783377, 268435455, 238609293, 214748363, 195225785, 178956969, 165191048, 153391688, 143165575, 134217727, 126322566, 119304646, 113025454, 107374181, 102261125, 97612892, 93368853, 89478484, 85899344, 82595523, 79536430, 76695843, 74051159, 71582787, 69273665, RectListKt.Lower26Bits, 65075261, 63161282, 61356674, 59652322};
    private static final EInteger ValueOne = new EInteger(1, new short[]{1}, false);
    private static final EInteger ValueTen = new EInteger(1, new short[]{10}, false);
    private static final EInteger ValueZero = new EInteger(0, new short[]{0}, false);
    private static final int CacheFirst = -24;
    private static final EInteger[] Cache = EIntegerCache(CacheFirst, 128);
    static final int[] DigitsInWord = {0, 0, 1600, 1010, 800, 690, 619, 570, FTPReply.REQUEST_DENIED, 505, NNTPReply.AUTHENTICATION_REJECTED, 463, 447, 433, 421, 410, 400, 392, 384, Accessories.Response.UPDATE_VISION_CAPTURE_CONFIG_RESPONSE_FIELD_NUMBER, 371, Accessories.Response.GET_CAMERA_CONFIGURATIONS_RESPONSE_FIELD_NUMBER, 359, 354, 349, 345, 341, 337, 333, 330, 327, 323, 320, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 315, 312, 310, 308};
    private static int[] estimatedHalfDigitCountPerWord = {0, 0, 128, 80, 64, 55, 49, 45, 42, 40, 38, 37, 35, 34, 33, 32, 32, 31, 30, 30, 29, 29, 28, 28, 27, 27, 27, 26, 26, 26, 26, 25, 25, 25, 25, 24, 24};

    public EInteger(int i, short[] sArr, boolean z) {
        this.wordCount = i;
        this.words = sArr;
        this.negative = z;
    }

    private static int AddInternal(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4) {
        int i5 = 0;
        boolean z = (i4 & 1) == 0;
        if (!z) {
            i4--;
        }
        int i6 = 0;
        while (i5 < i4) {
            int i7 = (sArr2[i2 + i5] & UShort.MAX_VALUE) + (sArr3[i3 + i5] & UShort.MAX_VALUE) + (i6 >> 16);
            sArr[i + i5] = (short) i7;
            int i8 = i5 + 1;
            int i9 = (i7 >> 16) + (sArr2[i2 + i8] & UShort.MAX_VALUE) + (65535 & sArr3[i3 + i8]);
            sArr[i8 + i] = (short) i9;
            i5 += 2;
            i6 = i9;
        }
        if (!z) {
            i6 = (sArr2[i2 + i4] & UShort.MAX_VALUE) + (sArr3[i3 + i4] & UShort.MAX_VALUE) + (i6 >> 16);
            sArr[i + i4] = (short) i6;
        }
        return i6 >> 16;
    }

    private static int AddUnevenSize(short[] sArr, int i, short[] sArr2, int i2, int i3, short[] sArr3, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 = ((short) (i6 >> 16)) + (sArr2[i2 + i7] & UShort.MAX_VALUE) + (65535 & sArr3[i4 + i7]);
            sArr[i + i7] = (short) i6;
        }
        while (i5 < i3) {
            i6 = (sArr2[i2 + i5] & UShort.MAX_VALUE) + ((short) (i6 >> 16));
            sArr[i + i5] = (short) i6;
            i5++;
        }
        return (i6 >> 16) & 65535;
    }

    private static void AndWords(short[] sArr, short[] sArr2, short[] sArr3, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = (short) (sArr2[i2] & sArr3[i2]);
        }
    }

    private static void AsymmetricMultiply(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4, short[] sArr4, int i5, int i6) {
        short[] sArr5;
        int i7;
        short[] sArr6;
        int i8;
        int i9 = i4;
        int i10 = i6;
        if (i9 == i10) {
            if (i3 == i5 && sArr3 == sArr4) {
                RecursiveSquare(sArr, i, sArr2, i2, sArr3, i3, i4);
                return;
            } else if (i9 == 2) {
                BaselineMultiply2(sArr, i, sArr3, i3, sArr4, i5);
                return;
            } else {
                SameSizeMultiply(sArr, i, sArr2, i2, sArr3, i3, sArr4, i5, i9);
                return;
            }
        }
        if (i9 > i10) {
            i9 = i10;
            i10 = i9;
            sArr6 = sArr3;
            i8 = i3;
            sArr5 = sArr4;
            i7 = i5;
        } else {
            sArr5 = sArr3;
            i7 = i3;
            sArr6 = sArr4;
            i8 = i5;
        }
        if (i9 == 1 || (i9 == 2 && sArr5[i7 + 1] == 0)) {
            int i11 = i8;
            int i12 = i10;
            short s = sArr5[i7];
            if (s == 0) {
                Arrays.fill(sArr, i, 2 + i12 + i, (short) 0);
                return;
            }
            if (s != 1) {
                int i13 = i + i12;
                sArr[i13] = LinearMultiply(sArr, i, sArr6, i11, s, i12);
                sArr[i13 + 1] = 0;
                return;
            } else {
                System.arraycopy(sArr6, i11, sArr, i, i12);
                int i14 = i + i12;
                sArr[i14] = 0;
                sArr[i14 + 1] = 0;
                return;
            }
        }
        if (i9 == 2 && (i10 & 1) == 0) {
            int i15 = sArr5[i7] & UShort.MAX_VALUE;
            int i16 = 65535 & sArr5[i7 + 1];
            int i17 = i + i10;
            sArr[i17] = 0;
            sArr[i17 + 1] = 0;
            int i18 = i10;
            short[] sArr7 = sArr6;
            int i19 = i8;
            AtomicMultiplyOpt(sArr, i, i15, i16, sArr7, i19, 0, i18);
            AtomicMultiplyAddOpt(sArr, i, i15, i16, sArr7, i19, 2, i18);
            return;
        }
        int i20 = i8;
        int i21 = i10;
        if (i9 <= 10 && i21 <= 10) {
            SchoolbookMultiply(sArr, i, sArr5, i7, i9, sArr6, i20, i21);
            return;
        }
        if (i9 >= 400 && i21 >= 400) {
            Toom4(sArr, i, sArr5, i7, i9, sArr6, i20, i21);
            return;
        }
        if (i9 >= 100 && i21 >= 100) {
            Toom3(sArr, i, sArr5, i7, i9, sArr6, i20, i21);
            return;
        }
        int i22 = (i21 / i9) & 1;
        if (i21 % i9 != 0) {
            int i23 = i9 + i21;
            int i24 = i9 << 2;
            if (i23 >= i24) {
                ChunkedLinearMultiply(sArr, i, sArr2, i2, sArr6, i20, i21, sArr5, i7, i9);
                return;
            }
            if (i9 + 1 != i21 && (i9 + 2 != i21 || sArr6[(i20 + i21) - 1] != 0)) {
                ChunkedLinearMultiply(sArr, i, new short[i24], 0, sArr6, i20, i21, sArr5, i7, i9);
                return;
            }
            Arrays.fill(sArr, i, i + i23, (short) 0);
            SameSizeMultiply(sArr, i, sArr2, i2, sArr5, i7, sArr6, i20, i9);
            int i25 = i + i9;
            sArr[i25 + i9] = LinearMultiplyAdd(sArr, i25, sArr5, i7, sArr6[i20 + i9], i9);
            return;
        }
        if (i22 == 0) {
            short[] sArr8 = sArr;
            SameSizeMultiply(sArr8, i, sArr2, i2, sArr5, i7, sArr6, i20, i9);
            int i26 = i9 << 1;
            short[] sArr9 = sArr2;
            System.arraycopy(sArr8, i + i9, sArr9, i2 + i26, i9);
            int i27 = i26;
            while (i27 < i21) {
                short[] sArr10 = sArr5;
                int i28 = i9;
                short[] sArr11 = sArr6;
                int i29 = i7;
                SameSizeMultiply(sArr9, i2 + i9 + i27, sArr2, i2, sArr10, i29, sArr11, i20 + i27, i28);
                sArr5 = sArr10;
                i7 = i29;
                sArr6 = sArr11;
                i9 = i28;
                i27 += i26;
                sArr9 = sArr2;
            }
            int i30 = i9;
            while (i30 < i21) {
                SameSizeMultiply(sArr8, i + i30, sArr2, i2, sArr5, i7, sArr6, i20 + i30, i9);
                i30 += i26;
                sArr8 = sArr;
            }
        } else {
            for (int i31 = 0; i31 < i21; i31 += i9 << 1) {
                SameSizeMultiply(sArr, i + i31, sArr2, i2, sArr5, i7, sArr6, i20 + i31, i9);
            }
            int i32 = i9;
            while (i32 < i21) {
                short[] sArr12 = sArr5;
                int i33 = i9;
                short[] sArr13 = sArr6;
                int i34 = i7;
                SameSizeMultiply(sArr2, i2 + i9 + i32, sArr2, i2, sArr12, i34, sArr13, i20 + i32, i33);
                sArr5 = sArr12;
                i7 = i34;
                sArr6 = sArr13;
                i9 = i33;
                i32 += i9 << 1;
            }
        }
        int i35 = i + i9;
        if (AddInternal(sArr, i35, sArr, i35, sArr2, i2 + (i9 << 1), i21 - i9) != 0) {
            IncrementWords(sArr, i + i21, i9, (short) 1);
        }
    }

    private static void AtomicMultiplyAddOpt(short[] sArr, int i, int i2, int i3, short[] sArr2, int i4, int i5, int i6) {
        int i7;
        short s;
        short s2;
        int i8;
        short s3 = UShort.MAX_VALUE;
        int i9 = (i3 - i2) & 65535;
        int i10 = i3 & 65535;
        int i11 = i2 & 65535;
        if (i10 < i11) {
            for (int i12 = i5; i12 < i6; i12 += 4) {
                int i13 = i4 + i12;
                int i14 = sArr2[i13] & UShort.MAX_VALUE;
                int i15 = sArr2[i13 + 1] & UShort.MAX_VALUE;
                int i16 = i + i12;
                if (i14 > i15) {
                    s = (short) ((i14 - i15) & 65535);
                    i7 = (s & UShort.MAX_VALUE) * i9;
                } else {
                    i7 = ((i15 - i14) & 65535) * ((i11 - i10) & 65535);
                    s = 0;
                }
                int i17 = i14 * i11;
                int i18 = (i17 >> 16) & 65535;
                int i19 = (sArr[i16] & UShort.MAX_VALUE) + i17;
                sArr[i16] = (short) (i19 & 65535);
                int i20 = i15 * i10;
                int i21 = i20 & 65535;
                int i22 = (i20 >> 16) & 65535;
                int i23 = ((i19 >> 16) & 65535) + (i17 & 65535) + (i7 & 65535) + i21;
                int i24 = i16 + 1;
                int i25 = i23 + (sArr[i24] & UShort.MAX_VALUE);
                sArr[i24] = (short) (i25 & 65535);
                int i26 = ((((((i25 >> 16) & 65535) + i21) + i18) + ((i7 >> 16) & 65535)) + i22) - (s & UShort.MAX_VALUE);
                int i27 = i16 + 2;
                int i28 = i26 + (sArr[i27] & UShort.MAX_VALUE);
                sArr[i27] = (short) (i28 & 65535);
                int i29 = ((i28 >> 16) & 65535) + i22;
                int i30 = i16 + 3;
                int i31 = i29 + (sArr[i30] & UShort.MAX_VALUE);
                sArr[i30] = (short) (i31 & 65535);
                if ((i31 >> 16) != 0) {
                    int i32 = i16 + 4;
                    short s4 = (short) (sArr[i32] + 1);
                    sArr[i32] = s4;
                    int i33 = i16 + 5;
                    sArr[i33] = (short) (sArr[i33] + ((short) (s4 == 0 ? 1 : 0)));
                }
            }
            return;
        }
        int i34 = i5;
        while (i34 < i6) {
            int i35 = i4 + i34;
            int i36 = sArr2[i35] & s3;
            int i37 = sArr2[i35 + 1] & s3;
            int i38 = i + i34;
            if (i36 >= i37) {
                i8 = ((i36 - i37) & s3) * i9;
                s2 = 0;
            } else {
                short s5 = (short) i9;
                s2 = s5;
                i8 = (s5 & s3) * ((i36 - i37) & s3);
            }
            int i39 = i36 * i11;
            int i40 = (i39 >> 16) & s3;
            int i41 = (sArr[i38] & s3) + i39;
            sArr[i38] = (short) (i41 & s3);
            int i42 = i37 * i10;
            int i43 = i42 & s3;
            int i44 = (i42 >> 16) & s3;
            int i45 = ((i41 >> 16) & s3) + (i39 & s3) + (i8 & s3) + i43;
            int i46 = i38 + 1;
            int i47 = i45 + (sArr[i46] & s3);
            short s6 = s3;
            sArr[i46] = (short) (i47 & s6);
            int i48 = i38 + 2;
            int i49 = (((((((i47 >> 16) & s6) + i43) + i40) + ((i8 >> 16) & s6)) + i44) - (s2 & s6)) + (sArr[i48] & s6);
            sArr[i48] = (short) (i49 & s6);
            int i50 = ((i49 >> 16) & s6) + i44;
            int i51 = i38 + 3;
            int i52 = i50 + (sArr[i51] & s6);
            sArr[i51] = (short) (i52 & s6);
            if ((i52 >> 16) != 0) {
                int i53 = i38 + 4;
                short s7 = (short) (sArr[i53] + 1);
                sArr[i53] = s7;
                int i54 = i38 + 5;
                sArr[i54] = (short) (sArr[i54] + ((short) (s7 == 0 ? 1 : 0)));
            }
            i34 += 4;
            s3 = s6;
        }
    }

    private static void AtomicMultiplyOpt(short[] sArr, int i, int i2, int i3, short[] sArr2, int i4, int i5, int i6) {
        int i7;
        short s;
        short s2;
        int i8;
        int i9 = (i3 - i2) & 65535;
        int i10 = i3 & 65535;
        int i11 = i2 & 65535;
        if (i10 < i11) {
            for (int i12 = i5; i12 < i6; i12 += 4) {
                int i13 = i4 + i12;
                int i14 = sArr2[i13] & UShort.MAX_VALUE;
                int i15 = sArr2[i13 + 1] & UShort.MAX_VALUE;
                int i16 = i + i12;
                if (i14 > i15) {
                    s = (short) ((i14 - i15) & 65535);
                    i7 = (s & UShort.MAX_VALUE) * i9;
                } else {
                    i7 = ((i15 - i14) & 65535) * ((i11 - i10) & 65535);
                    s = 0;
                }
                int i17 = i14 * i11;
                int i18 = (i17 >> 16) & 65535;
                int i19 = i17 & 65535;
                sArr[i16] = (short) i19;
                int i20 = i15 * i10;
                int i21 = i19 + i18 + (i7 & 65535) + (i20 & 65535);
                sArr[i16 + 1] = (short) i21;
                int i22 = ((((((i21 >> 16) & 65535) + i20) + i18) + ((i7 >> 16) & 65535)) + ((i20 >> 16) & 65535)) - (s & UShort.MAX_VALUE);
                sArr[i16 + 2] = (short) i22;
                sArr[i16 + 3] = (short) (i22 >> 16);
            }
            return;
        }
        for (int i23 = i5; i23 < i6; i23 += 4) {
            int i24 = i4 + i23;
            int i25 = sArr2[i24] & UShort.MAX_VALUE;
            int i26 = sArr2[i24 + 1] & UShort.MAX_VALUE;
            int i27 = i + i23;
            if (i25 >= i26) {
                i8 = ((i25 - i26) & 65535) * i9;
                s2 = 0;
            } else {
                short s3 = (short) i9;
                s2 = s3;
                i8 = (s3 & UShort.MAX_VALUE) * ((i25 - i26) & 65535);
            }
            int i28 = i25 * i11;
            int i29 = i28 & 65535;
            sArr[i27] = (short) i29;
            int i30 = (i28 >> 16) & 65535;
            int i31 = i26 * i10;
            int i32 = i29 + i30 + (i8 & 65535) + (i31 & 65535);
            sArr[i27 + 1] = (short) i32;
            int i33 = ((((((i32 >> 16) & 65535) + i31) + i30) + ((i8 >> 16) & 65535)) + ((i31 >> 16) & 65535)) - (s2 & UShort.MAX_VALUE);
            sArr[i27 + 2] = (short) i33;
            sArr[i27 + 3] = (short) (i33 >> 16);
        }
    }

    private static EInteger BL(EInteger eInteger) {
        return eInteger.isZero() ? FromInt32(0) : eInteger.GetUnsignedBitLengthAsEInteger();
    }

    private static EInteger BaseGcd(EInteger eInteger, EInteger eInteger2) {
        EInteger Add;
        EInteger Remainder;
        EInteger Subtract;
        EInteger Subtract2;
        EInteger Subtract3;
        if (eInteger.CanFitInInt64() && eInteger2.CanFitInInt64()) {
            return FromInt64(GcdLong(eInteger.ToInt64Unchecked(), eInteger2.ToInt64Unchecked()));
        }
        if (eInteger.compareTo(eInteger2) < 0) {
            eInteger2 = eInteger;
            eInteger = eInteger2;
        }
        while (eInteger2.wordCount > 3) {
            EInteger Subtract4 = eInteger.GetUnsignedBitLengthAsEInteger().Subtract(48);
            EInteger ShiftRight = eInteger.ShiftRight(Subtract4);
            EInteger ShiftRight2 = eInteger2.ShiftRight(Subtract4);
            EInteger eInteger3 = ShiftRight;
            EInteger FromInt32 = FromInt32(1);
            EInteger FromInt322 = FromInt32(0);
            EInteger eInteger4 = FromInt32;
            EInteger eInteger5 = FromInt322;
            while (true) {
                EInteger Add2 = ShiftRight2.Add(eInteger5);
                EInteger Add3 = ShiftRight2.Add(eInteger4);
                if (Add2.isZero() || Add3.isZero()) {
                    break;
                }
                EInteger Divide = eInteger3.Add(FromInt32).Divide(Add2);
                if (Divide.equals(eInteger3.Add(FromInt322).Divide(Add3))) {
                    if (Divide.CanFitInInt32() && eInteger4.CanFitInInt32() && eInteger5.CanFitInInt32()) {
                        int ToInt32Checked = Divide.ToInt32Checked();
                        Subtract = eInteger3.Subtract(ShiftRight2.Multiply(ToInt32Checked));
                        long j = ToInt32Checked;
                        Subtract2 = FromInt32.Subtract(eInteger5.ToInt32Checked() * j);
                        Subtract3 = FromInt322.Subtract(eInteger4.ToInt32Checked() * j);
                    } else {
                        Subtract = eInteger3.Subtract(ShiftRight2.Multiply(Divide));
                        Subtract2 = FromInt32.Subtract(eInteger5.Multiply(Divide));
                        Subtract3 = FromInt322.Subtract(eInteger4.Multiply(Divide));
                    }
                    EInteger eInteger6 = ShiftRight2;
                    ShiftRight2 = Subtract;
                    eInteger3 = eInteger6;
                    EInteger eInteger7 = Subtract2;
                    FromInt32 = eInteger5;
                    eInteger5 = eInteger7;
                    EInteger eInteger8 = Subtract3;
                    FromInt322 = eInteger4;
                    eInteger4 = eInteger8;
                } else {
                    Add = FromInt322.isZero() ? eInteger2 : eInteger.Multiply(FromInt32).Add(eInteger2.Multiply(FromInt322));
                    Remainder = FromInt322.isZero() ? eInteger.Remainder(eInteger2) : eInteger.Multiply(eInteger5).Add(eInteger2.Multiply(eInteger4));
                }
            }
            Add = FromInt322.isZero() ? eInteger2 : eInteger.Multiply(FromInt32).Add(eInteger2.Multiply(FromInt322));
            Remainder = FromInt322.isZero() ? eInteger.Remainder(eInteger2) : eInteger.Multiply(eInteger5).Add(eInteger2.Multiply(eInteger4));
            eInteger2 = Remainder;
            eInteger = Add;
        }
        if (eInteger2.isZero()) {
            return eInteger;
        }
        while (true) {
            EInteger eInteger9 = eInteger2;
            EInteger eInteger10 = eInteger;
            eInteger = eInteger9;
            if (eInteger.isZero()) {
                return eInteger10;
            }
            if (eInteger10.wordCount <= 3 && eInteger.wordCount <= 3) {
                return FromInt64(GcdLong(eInteger10.ToInt64Checked(), eInteger.ToInt64Checked()));
            }
            eInteger2 = eInteger10.Remainder(eInteger);
        }
    }

    private static void BaselineMultiply2(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3) {
        int i4 = sArr2[i2] & UShort.MAX_VALUE;
        int i5 = sArr2[i2 + 1] & UShort.MAX_VALUE;
        int i6 = sArr3[i3] & UShort.MAX_VALUE;
        int i7 = sArr3[i3 + 1] & UShort.MAX_VALUE;
        int i8 = i4 * i6;
        sArr[i] = (short) i8;
        int i9 = (i4 * i7) + (((short) ((i8 >> 16) & 65535)) & UShort.MAX_VALUE);
        int i10 = (i6 * i5) + (((short) i9) & UShort.MAX_VALUE);
        sArr[i + 1] = (short) i10;
        int i11 = (i5 * i7) + ((i9 >> 16) & 65535) + ((i10 >> 16) & 65535);
        sArr[i + 2] = (short) i11;
        sArr[i + 3] = (short) (i11 >> 16);
    }

    private static void BaselineMultiply4(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3) {
        long j = (sArr2[i2] & WebSocketProtocol.PAYLOAD_SHORT_MAX) | ((sArr2[i2 + 1] & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16);
        long j2 = (sArr2[i2 + 2] & WebSocketProtocol.PAYLOAD_SHORT_MAX) | ((sArr2[i2 + 3] & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16);
        long j3 = (sArr3[i3] & WebSocketProtocol.PAYLOAD_SHORT_MAX) | ((sArr3[i3 + 1] & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16);
        long j4 = ((WebSocketProtocol.PAYLOAD_SHORT_MAX & sArr3[i3 + 3]) << 16) | (sArr3[i3 + 2] & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        long j5 = j * j3;
        sArr[i] = (short) j5;
        sArr[i + 1] = (short) (j5 >> 16);
        long j6 = (j3 * j2) + (((int) r0) & 4294967295L);
        sArr[i + 2] = (short) j6;
        sArr[i + 3] = (short) (j6 >> 16);
        sArr[i + 4] = (short) ((j2 * j4) + ((((j5 >> 32) & 4294967295L) >> 32) & 4294967295L) + ((((j * j4) + (((int) r12) & 4294967295L)) >> 32) & 4294967295L) + ((j6 >> 32) & 4294967295L));
        sArr[i + 5] = (short) (r4 >> 16);
        sArr[i + 6] = (short) (r4 >> 32);
        sArr[i + 7] = (short) (r4 >> 48);
    }

    private static void BaselineMultiply8(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3) {
        int i4 = sArr2[i2] & UShort.MAX_VALUE;
        int i5 = sArr2[i2 + 1] & UShort.MAX_VALUE;
        int i6 = sArr2[i2 + 2] & UShort.MAX_VALUE;
        int i7 = sArr2[i2 + 3] & UShort.MAX_VALUE;
        int i8 = sArr2[i2 + 4] & UShort.MAX_VALUE;
        int i9 = sArr2[i2 + 5] & UShort.MAX_VALUE;
        int i10 = sArr2[i2 + 6] & UShort.MAX_VALUE;
        int i11 = sArr2[i2 + 7] & UShort.MAX_VALUE;
        int i12 = sArr3[i3] & UShort.MAX_VALUE;
        int i13 = sArr3[i3 + 1] & UShort.MAX_VALUE;
        int i14 = sArr3[i3 + 2] & UShort.MAX_VALUE;
        int i15 = sArr3[i3 + 3] & UShort.MAX_VALUE;
        int i16 = sArr3[i3 + 4] & UShort.MAX_VALUE;
        int i17 = sArr3[i3 + 5] & UShort.MAX_VALUE;
        int i18 = sArr3[i3 + 6] & UShort.MAX_VALUE;
        int i19 = sArr3[i3 + 7] & UShort.MAX_VALUE;
        int i20 = i4 * i12;
        sArr[i] = (short) i20;
        int i21 = (i4 * i13) + (((short) ((i20 >> 16) & 65535)) & UShort.MAX_VALUE);
        short s = (short) i21;
        int i22 = (i21 >> 16) & 65535;
        int i23 = (i5 * i12) + (s & UShort.MAX_VALUE);
        short s2 = (short) i23;
        int i24 = i22 + ((i23 >> 16) & 65535);
        sArr[i + 1] = s2;
        short s3 = (short) i24;
        int i25 = (i24 >> 16) & 65535;
        int i26 = (i4 * i14) + (s3 & UShort.MAX_VALUE);
        short s4 = (short) i26;
        int i27 = i25 + ((i26 >> 16) & 65535);
        int i28 = (i5 * i13) + (s4 & UShort.MAX_VALUE);
        short s5 = (short) i28;
        int i29 = i27 + ((i28 >> 16) & 65535);
        int i30 = (i6 * i12) + (s5 & UShort.MAX_VALUE);
        short s6 = (short) i30;
        int i31 = i29 + ((i30 >> 16) & 65535);
        sArr[i + 2] = s6;
        short s7 = (short) i31;
        int i32 = (i31 >> 16) & 65535;
        int i33 = (i4 * i15) + (s7 & UShort.MAX_VALUE);
        short s8 = (short) i33;
        int i34 = i32 + ((i33 >> 16) & 65535);
        int i35 = (i5 * i14) + (s8 & UShort.MAX_VALUE);
        short s9 = (short) i35;
        int i36 = i34 + ((i35 >> 16) & 65535);
        int i37 = (i6 * i13) + (s9 & UShort.MAX_VALUE);
        short s10 = (short) i37;
        int i38 = i36 + ((i37 >> 16) & 65535);
        int i39 = (i7 * i12) + (s10 & UShort.MAX_VALUE);
        short s11 = (short) i39;
        int i40 = i38 + ((i39 >> 16) & 65535);
        sArr[i + 3] = s11;
        short s12 = (short) i40;
        int i41 = (i40 >> 16) & 65535;
        int i42 = (i4 * i16) + (s12 & UShort.MAX_VALUE);
        short s13 = (short) i42;
        int i43 = (i5 * i15) + (s13 & UShort.MAX_VALUE);
        int i44 = i41 + ((i42 >> 16) & 65535) + ((i43 >> 16) & 65535);
        int i45 = (i6 * i14) + (i43 & 65535);
        int i46 = (i7 * i13) + (i45 & 65535);
        int i47 = i44 + ((i45 >> 16) & 65535) + ((i46 >> 16) & 65535);
        int i48 = (i8 * i12) + (i46 & 65535);
        int i49 = i47 + ((i48 >> 16) & 65535);
        sArr[i + 4] = (short) i48;
        short s14 = (short) i49;
        int i50 = (i49 >> 16) & 65535;
        int i51 = (i4 * i17) + (s14 & UShort.MAX_VALUE);
        short s15 = (short) i51;
        int i52 = i50 + ((i51 >> 16) & 65535);
        int i53 = (i5 * i16) + (s15 & UShort.MAX_VALUE);
        short s16 = (short) i53;
        int i54 = i52 + ((i53 >> 16) & 65535);
        int i55 = (i6 * i15) + (s16 & UShort.MAX_VALUE);
        short s17 = (short) i55;
        int i56 = i54 + ((i55 >> 16) & 65535);
        int i57 = (i7 * i14) + (s17 & UShort.MAX_VALUE);
        short s18 = (short) i57;
        int i58 = i56 + ((i57 >> 16) & 65535);
        int i59 = (i8 * i13) + (s18 & UShort.MAX_VALUE);
        short s19 = (short) i59;
        int i60 = i58 + ((i59 >> 16) & 65535);
        int i61 = (i9 * i12) + (s19 & UShort.MAX_VALUE);
        short s20 = (short) i61;
        int i62 = i60 + ((i61 >> 16) & 65535);
        sArr[i + 5] = s20;
        short s21 = (short) i62;
        int i63 = (i62 >> 16) & 65535;
        int i64 = (i4 * i18) + (s21 & UShort.MAX_VALUE);
        short s22 = (short) i64;
        int i65 = i63 + ((i64 >> 16) & 65535);
        int i66 = (i5 * i17) + (s22 & UShort.MAX_VALUE);
        short s23 = (short) i66;
        int i67 = i65 + ((i66 >> 16) & 65535);
        int i68 = (i6 * i16) + (s23 & UShort.MAX_VALUE);
        short s24 = (short) i68;
        int i69 = i67 + ((i68 >> 16) & 65535);
        int i70 = (i7 * i15) + (s24 & UShort.MAX_VALUE);
        short s25 = (short) i70;
        int i71 = i69 + ((i70 >> 16) & 65535);
        int i72 = (i8 * i14) + (s25 & UShort.MAX_VALUE);
        short s26 = (short) i72;
        int i73 = i71 + ((i72 >> 16) & 65535);
        int i74 = (i9 * i13) + (s26 & UShort.MAX_VALUE);
        short s27 = (short) i74;
        int i75 = i73 + ((i74 >> 16) & 65535);
        int i76 = (i10 * i12) + (s27 & UShort.MAX_VALUE);
        short s28 = (short) i76;
        int i77 = i75 + ((i76 >> 16) & 65535);
        sArr[i + 6] = s28;
        short s29 = (short) i77;
        int i78 = (i77 >> 16) & 65535;
        int i79 = (i4 * i19) + (s29 & UShort.MAX_VALUE);
        short s30 = (short) i79;
        int i80 = i78 + ((i79 >> 16) & 65535);
        int i81 = (i5 * i18) + (s30 & UShort.MAX_VALUE);
        short s31 = (short) i81;
        int i82 = i80 + ((i81 >> 16) & 65535);
        int i83 = (i6 * i17) + (s31 & UShort.MAX_VALUE);
        short s32 = (short) i83;
        int i84 = i82 + ((i83 >> 16) & 65535);
        int i85 = (i7 * i16) + (s32 & UShort.MAX_VALUE);
        short s33 = (short) i85;
        int i86 = i84 + ((i85 >> 16) & 65535);
        int i87 = (i8 * i15) + (s33 & UShort.MAX_VALUE);
        short s34 = (short) i87;
        int i88 = i86 + ((i87 >> 16) & 65535);
        int i89 = (i9 * i14) + (s34 & UShort.MAX_VALUE);
        short s35 = (short) i89;
        int i90 = i88 + ((i89 >> 16) & 65535);
        int i91 = (i10 * i13) + (s35 & UShort.MAX_VALUE);
        short s36 = (short) i91;
        int i92 = i90 + ((i91 >> 16) & 65535);
        int i93 = (i12 * i11) + (s36 & UShort.MAX_VALUE);
        int i94 = i92 + ((i93 >> 16) & 65535);
        sArr[i + 7] = (short) i93;
        int i95 = (i5 * i19) + (((short) i94) & UShort.MAX_VALUE);
        int i96 = ((i94 >> 16) & 65535) + ((i95 >> 16) & 65535);
        int i97 = (i6 * i18) + (((short) i95) & UShort.MAX_VALUE);
        int i98 = i96 + ((i97 >> 16) & 65535);
        int i99 = (i7 * i17) + (((short) i97) & UShort.MAX_VALUE);
        int i100 = i98 + ((i99 >> 16) & 65535);
        int i101 = (i8 * i16) + (((short) i99) & UShort.MAX_VALUE);
        int i102 = i100 + ((i101 >> 16) & 65535);
        int i103 = (i9 * i15) + (((short) i101) & UShort.MAX_VALUE);
        int i104 = i102 + ((i103 >> 16) & 65535);
        int i105 = (i10 * i14) + (((short) i103) & UShort.MAX_VALUE);
        int i106 = (i13 * i11) + (((short) i105) & UShort.MAX_VALUE);
        int i107 = i104 + ((i105 >> 16) & 65535) + ((i106 >> 16) & 65535);
        sArr[i + 8] = (short) i106;
        int i108 = (i6 * i19) + (((short) i107) & UShort.MAX_VALUE);
        int i109 = (i7 * i18) + (((short) i108) & UShort.MAX_VALUE);
        int i110 = ((i107 >> 16) & 65535) + ((i108 >> 16) & 65535) + ((i109 >> 16) & 65535);
        int i111 = (i8 * i17) + (((short) i109) & UShort.MAX_VALUE);
        int i112 = i110 + ((i111 >> 16) & 65535);
        int i113 = (i9 * i16) + (((short) i111) & UShort.MAX_VALUE);
        int i114 = i112 + ((i113 >> 16) & 65535);
        int i115 = (i10 * i15) + (((short) i113) & UShort.MAX_VALUE);
        int i116 = (i14 * i11) + (((short) i115) & UShort.MAX_VALUE);
        int i117 = i114 + ((i115 >> 16) & 65535) + ((i116 >> 16) & 65535);
        sArr[i + 9] = (short) i116;
        int i118 = (i7 * i19) + (((short) i117) & UShort.MAX_VALUE);
        int i119 = (i8 * i18) + (((short) i118) & UShort.MAX_VALUE);
        int i120 = ((i117 >> 16) & 65535) + ((i118 >> 16) & 65535) + ((i119 >> 16) & 65535);
        int i121 = (i9 * i17) + (((short) i119) & UShort.MAX_VALUE);
        int i122 = i120 + ((i121 >> 16) & 65535);
        int i123 = (i10 * i16) + (((short) i121) & UShort.MAX_VALUE);
        int i124 = (i15 * i11) + (((short) i123) & UShort.MAX_VALUE);
        int i125 = i122 + ((i123 >> 16) & 65535) + ((i124 >> 16) & 65535);
        sArr[i + 10] = (short) i124;
        int i126 = (i8 * i19) + (((short) i125) & UShort.MAX_VALUE);
        int i127 = (i9 * i18) + (((short) i126) & UShort.MAX_VALUE);
        int i128 = ((i125 >> 16) & 65535) + ((i126 >> 16) & 65535) + ((i127 >> 16) & 65535);
        int i129 = (i10 * i17) + (((short) i127) & UShort.MAX_VALUE);
        int i130 = (i16 * i11) + (((short) i129) & UShort.MAX_VALUE);
        int i131 = i128 + ((i129 >> 16) & 65535) + ((i130 >> 16) & 65535);
        sArr[i + 11] = (short) i130;
        int i132 = (i9 * i19) + (((short) i131) & UShort.MAX_VALUE);
        int i133 = (i10 * i18) + (((short) i132) & UShort.MAX_VALUE);
        int i134 = (i17 * i11) + (((short) i133) & UShort.MAX_VALUE);
        int i135 = ((i131 >> 16) & 65535) + ((i132 >> 16) & 65535) + ((i133 >> 16) & 65535) + ((i134 >> 16) & 65535);
        sArr[i + 12] = (short) i134;
        int i136 = (i10 * i19) + (((short) i135) & UShort.MAX_VALUE);
        int i137 = (i18 * i11) + (((short) i136) & UShort.MAX_VALUE);
        sArr[i + 13] = (short) i137;
        int i138 = (i11 * i19) + ((i135 >> 16) & 65535) + ((i136 >> 16) & 65535) + ((i137 >> 16) & 65535);
        sArr[i + 14] = (short) i138;
        sArr[i + 15] = (short) (i138 >> 16);
    }

    private static void BaselineSquare2(short[] sArr, int i, short[] sArr2, int i2) {
        short s = sArr2[i2];
        int i3 = (s & UShort.MAX_VALUE) * (s & UShort.MAX_VALUE);
        sArr[i] = (short) i3;
        int i4 = (i3 >> 16) & 65535;
        int i5 = sArr2[i2] & UShort.MAX_VALUE;
        int i6 = i2 + 1;
        int i7 = i5 * (sArr2[i6] & UShort.MAX_VALUE);
        short s2 = (short) i7;
        int i8 = (((i7 >> 16) & 65535) << 1) + ((s2 >> 15) & 1);
        int i9 = i4 + (((short) (s2 << 1)) & UShort.MAX_VALUE);
        sArr[i + 1] = (short) i9;
        short s3 = sArr2[i6];
        int i10 = ((s3 & UShort.MAX_VALUE) * (s3 & UShort.MAX_VALUE)) + i8 + ((i9 >> 16) & 65535);
        sArr[i + 2] = (short) i10;
        sArr[i + 3] = (short) (i10 >> 16);
    }

    private static void BaselineSquare4(short[] sArr, int i, short[] sArr2, int i2) {
        short s = sArr2[i2];
        int i3 = (s & UShort.MAX_VALUE) * (s & UShort.MAX_VALUE);
        sArr[i] = (short) i3;
        int i4 = (i3 >> 16) & 65535;
        int i5 = i2 + 1;
        int i6 = (sArr2[i2] & UShort.MAX_VALUE) * (sArr2[i5] & UShort.MAX_VALUE);
        short s2 = (short) i6;
        int i7 = (((i6 >> 16) & 65535) << 1) + ((s2 >> 15) & 1);
        int i8 = i4 + (((short) (s2 << 1)) & UShort.MAX_VALUE);
        int i9 = i7 + ((i8 >> 16) & 65535);
        sArr[i + 1] = (short) i8;
        int i10 = i2 + 2;
        int i11 = (sArr2[i2] & UShort.MAX_VALUE) * (sArr2[i10] & UShort.MAX_VALUE);
        short s3 = (short) i11;
        int i12 = (((i11 >> 16) & 65535) << 1) + ((s3 >> 15) & 1);
        short s4 = sArr2[i5];
        int i13 = ((s4 & UShort.MAX_VALUE) * (s4 & UShort.MAX_VALUE)) + (((short) (s3 << 1)) & UShort.MAX_VALUE);
        int i14 = i9 + (((short) i13) & UShort.MAX_VALUE);
        int i15 = i12 + ((i13 >> 16) & 65535) + ((i14 >> 16) & 65535);
        sArr[i + 2] = (short) i14;
        int i16 = sArr2[i2] & UShort.MAX_VALUE;
        int i17 = i2 + 3;
        int i18 = i16 * (sArr2[i17] & UShort.MAX_VALUE);
        int i19 = ((sArr2[i5] & UShort.MAX_VALUE) * (sArr2[i10] & UShort.MAX_VALUE)) + (((short) i18) & UShort.MAX_VALUE);
        short s5 = (short) i19;
        int i20 = ((((i18 >> 16) & 65535) + ((i19 >> 16) & 65535)) << 1) + ((s5 >> 15) & 1);
        int i21 = i15 + (((short) (s5 << 1)) & UShort.MAX_VALUE);
        int i22 = i20 + ((i21 >> 16) & 65535);
        sArr[i + 3] = (short) i21;
        int i23 = (sArr2[i5] & UShort.MAX_VALUE) * (sArr2[i17] & UShort.MAX_VALUE);
        short s6 = (short) i23;
        int i24 = (((i23 >> 16) & 65535) << 1) + ((s6 >> 15) & 1);
        short s7 = sArr2[i10];
        int i25 = ((s7 & UShort.MAX_VALUE) * (s7 & UShort.MAX_VALUE)) + (((short) (s6 << 1)) & UShort.MAX_VALUE);
        int i26 = i22 + (((short) i25) & UShort.MAX_VALUE);
        int i27 = i24 + ((i25 >> 16) & 65535) + ((i26 >> 16) & 65535);
        sArr[i + 4] = (short) i26;
        int i28 = (sArr2[i10] & UShort.MAX_VALUE) * (sArr2[i17] & UShort.MAX_VALUE);
        short s8 = (short) i28;
        int i29 = (((i28 >> 16) & 65535) << 1) + ((s8 >> 15) & 1);
        int i30 = i27 + (((short) (s8 << 1)) & UShort.MAX_VALUE);
        sArr[i + 5] = (short) i30;
        short s9 = sArr2[i17];
        int i31 = ((s9 & UShort.MAX_VALUE) * (s9 & UShort.MAX_VALUE)) + i29 + ((i30 >> 16) & 65535);
        sArr[i + 6] = (short) i31;
        sArr[i + 7] = (short) (i31 >> 16);
    }

    private static void BaselineSquare8(short[] sArr, int i, short[] sArr2, int i2) {
        short s = sArr2[i2];
        int i3 = (s & UShort.MAX_VALUE) * (s & UShort.MAX_VALUE);
        sArr[i] = (short) i3;
        int i4 = (i3 >> 16) & 65535;
        int i5 = i2 + 1;
        int i6 = (sArr2[i2] & UShort.MAX_VALUE) * (sArr2[i5] & UShort.MAX_VALUE);
        short s2 = (short) i6;
        int i7 = (((i6 >> 16) & 65535) << 1) + ((s2 >> 15) & 1);
        int i8 = i4 + (((short) (s2 << 1)) & UShort.MAX_VALUE);
        int i9 = i7 + ((i8 >> 16) & 65535);
        sArr[i + 1] = (short) i8;
        int i10 = i2 + 2;
        int i11 = (sArr2[i2] & UShort.MAX_VALUE) * (sArr2[i10] & UShort.MAX_VALUE);
        short s3 = (short) i11;
        int i12 = (((i11 >> 16) & 65535) << 1) + ((s3 >> 15) & 1);
        short s4 = sArr2[i5];
        int i13 = ((s4 & UShort.MAX_VALUE) * (s4 & UShort.MAX_VALUE)) + (((short) (s3 << 1)) & UShort.MAX_VALUE);
        int i14 = i9 + (((short) i13) & UShort.MAX_VALUE);
        int i15 = i12 + ((i13 >> 16) & 65535) + ((i14 >> 16) & 65535);
        sArr[i + 2] = (short) i14;
        int i16 = i2 + 3;
        int i17 = (sArr2[i2] & UShort.MAX_VALUE) * (sArr2[i16] & UShort.MAX_VALUE);
        int i18 = ((sArr2[i5] & UShort.MAX_VALUE) * (sArr2[i10] & UShort.MAX_VALUE)) + (((short) i17) & UShort.MAX_VALUE);
        short s5 = (short) i18;
        int i19 = ((((i17 >> 16) & 65535) + ((i18 >> 16) & 65535)) << 1) + ((s5 >> 15) & 1);
        int i20 = i15 + (((short) (s5 << 1)) & UShort.MAX_VALUE);
        int i21 = i19 + ((i20 >> 16) & 65535);
        sArr[i + 3] = (short) i20;
        int i22 = i2 + 4;
        int i23 = (sArr2[i2] & UShort.MAX_VALUE) * (sArr2[i22] & UShort.MAX_VALUE);
        int i24 = ((sArr2[i5] & UShort.MAX_VALUE) * (sArr2[i16] & UShort.MAX_VALUE)) + (((short) i23) & UShort.MAX_VALUE);
        short s6 = (short) i24;
        int i25 = ((((i23 >> 16) & 65535) + ((i24 >> 16) & 65535)) << 1) + ((s6 >> 15) & 1);
        short s7 = sArr2[i10];
        int i26 = ((s7 & UShort.MAX_VALUE) * (s7 & UShort.MAX_VALUE)) + (((short) (s6 << 1)) & UShort.MAX_VALUE);
        int i27 = i21 + (((short) i26) & UShort.MAX_VALUE);
        int i28 = i25 + ((i26 >> 16) & 65535) + ((i27 >> 16) & 65535);
        sArr[i + 4] = (short) i27;
        int i29 = i2 + 5;
        int i30 = (sArr2[i2] & UShort.MAX_VALUE) * (sArr2[i29] & UShort.MAX_VALUE);
        int i31 = ((sArr2[i5] & UShort.MAX_VALUE) * (sArr2[i22] & UShort.MAX_VALUE)) + (((short) i30) & UShort.MAX_VALUE);
        int i32 = ((i30 >> 16) & 65535) + ((i31 >> 16) & 65535);
        int i33 = ((sArr2[i10] & UShort.MAX_VALUE) * (sArr2[i16] & UShort.MAX_VALUE)) + (((short) i31) & UShort.MAX_VALUE);
        short s8 = (short) i33;
        int i34 = ((i32 + ((i33 >> 16) & 65535)) << 1) + ((s8 >> 15) & 1);
        int i35 = i28 + (((short) (s8 << 1)) & UShort.MAX_VALUE);
        int i36 = i34 + ((i35 >> 16) & 65535);
        sArr[i + 5] = (short) i35;
        int i37 = i2 + 6;
        int i38 = (sArr2[i2] & UShort.MAX_VALUE) * (sArr2[i37] & UShort.MAX_VALUE);
        int i39 = ((sArr2[i5] & UShort.MAX_VALUE) * (sArr2[i29] & UShort.MAX_VALUE)) + (((short) i38) & UShort.MAX_VALUE);
        int i40 = ((i38 >> 16) & 65535) + ((i39 >> 16) & 65535);
        int i41 = ((sArr2[i10] & UShort.MAX_VALUE) * (sArr2[i22] & UShort.MAX_VALUE)) + (((short) i39) & UShort.MAX_VALUE);
        short s9 = (short) i41;
        int i42 = ((i40 + ((i41 >> 16) & 65535)) << 1) + ((s9 >> 15) & 1);
        short s10 = sArr2[i16];
        int i43 = ((s10 & UShort.MAX_VALUE) * (s10 & UShort.MAX_VALUE)) + (((short) (s9 << 1)) & UShort.MAX_VALUE);
        int i44 = i36 + (((short) i43) & UShort.MAX_VALUE);
        int i45 = i42 + ((i43 >> 16) & 65535) + ((i44 >> 16) & 65535);
        sArr[i + 6] = (short) i44;
        int i46 = sArr2[i2] & UShort.MAX_VALUE;
        int i47 = i2 + 7;
        int i48 = i46 * (sArr2[i47] & UShort.MAX_VALUE);
        int i49 = ((sArr2[i5] & UShort.MAX_VALUE) * (sArr2[i37] & UShort.MAX_VALUE)) + (((short) i48) & UShort.MAX_VALUE);
        int i50 = ((i48 >> 16) & 65535) + ((i49 >> 16) & 65535);
        int i51 = ((sArr2[i10] & UShort.MAX_VALUE) * (sArr2[i29] & UShort.MAX_VALUE)) + (((short) i49) & UShort.MAX_VALUE);
        int i52 = i50 + ((i51 >> 16) & 65535);
        int i53 = ((sArr2[i16] & UShort.MAX_VALUE) * (sArr2[i22] & UShort.MAX_VALUE)) + (((short) i51) & UShort.MAX_VALUE);
        short s11 = (short) i53;
        int i54 = ((i52 + ((i53 >> 16) & 65535)) << 1) + ((s11 >> 15) & 1);
        int i55 = i45 + (((short) (s11 << 1)) & UShort.MAX_VALUE);
        int i56 = i54 + ((i55 >> 16) & 65535);
        sArr[i + 7] = (short) i55;
        int i57 = (sArr2[i5] & UShort.MAX_VALUE) * (sArr2[i47] & UShort.MAX_VALUE);
        int i58 = ((sArr2[i10] & UShort.MAX_VALUE) * (sArr2[i37] & UShort.MAX_VALUE)) + (((short) i57) & UShort.MAX_VALUE);
        int i59 = ((i57 >> 16) & 65535) + ((i58 >> 16) & 65535);
        int i60 = ((sArr2[i16] & UShort.MAX_VALUE) * (sArr2[i29] & UShort.MAX_VALUE)) + (((short) i58) & UShort.MAX_VALUE);
        short s12 = (short) i60;
        int i61 = ((i59 + ((i60 >> 16) & 65535)) << 1) + ((s12 >> 15) & 1);
        short s13 = sArr2[i22];
        int i62 = ((s13 & UShort.MAX_VALUE) * (s13 & UShort.MAX_VALUE)) + (((short) (s12 << 1)) & UShort.MAX_VALUE);
        int i63 = i56 + (((short) i62) & UShort.MAX_VALUE);
        int i64 = i61 + ((i62 >> 16) & 65535) + ((i63 >> 16) & 65535);
        sArr[i + 8] = (short) i63;
        int i65 = (sArr2[i10] & UShort.MAX_VALUE) * (sArr2[i47] & UShort.MAX_VALUE);
        int i66 = ((sArr2[i16] & UShort.MAX_VALUE) * (sArr2[i37] & UShort.MAX_VALUE)) + (((short) i65) & UShort.MAX_VALUE);
        int i67 = ((i65 >> 16) & 65535) + ((i66 >> 16) & 65535);
        int i68 = ((sArr2[i22] & UShort.MAX_VALUE) * (sArr2[i29] & UShort.MAX_VALUE)) + (((short) i66) & UShort.MAX_VALUE);
        short s14 = (short) i68;
        int i69 = ((i67 + ((i68 >> 16) & 65535)) << 1) + ((s14 >> 15) & 1);
        int i70 = i64 + (((short) (s14 << 1)) & UShort.MAX_VALUE);
        int i71 = i69 + ((i70 >> 16) & 65535);
        sArr[i + 9] = (short) i70;
        int i72 = (sArr2[i16] & UShort.MAX_VALUE) * (sArr2[i47] & UShort.MAX_VALUE);
        int i73 = ((sArr2[i22] & UShort.MAX_VALUE) * (sArr2[i37] & UShort.MAX_VALUE)) + (((short) i72) & UShort.MAX_VALUE);
        short s15 = (short) i73;
        int i74 = ((((i72 >> 16) & 65535) + ((i73 >> 16) & 65535)) << 1) + ((s15 >> 15) & 1);
        short s16 = sArr2[i29];
        int i75 = ((s16 & UShort.MAX_VALUE) * (s16 & UShort.MAX_VALUE)) + (((short) (s15 << 1)) & UShort.MAX_VALUE);
        int i76 = i71 + (((short) i75) & UShort.MAX_VALUE);
        int i77 = i74 + ((i75 >> 16) & 65535) + ((i76 >> 16) & 65535);
        sArr[i + 10] = (short) i76;
        int i78 = (sArr2[i22] & UShort.MAX_VALUE) * (sArr2[i47] & UShort.MAX_VALUE);
        int i79 = ((sArr2[i29] & UShort.MAX_VALUE) * (sArr2[i37] & UShort.MAX_VALUE)) + (((short) i78) & UShort.MAX_VALUE);
        short s17 = (short) i79;
        int i80 = ((((i78 >> 16) & 65535) + ((i79 >> 16) & 65535)) << 1) + ((s17 >> 15) & 1);
        int i81 = i77 + (((short) (s17 << 1)) & UShort.MAX_VALUE);
        int i82 = i80 + ((i81 >> 16) & 65535);
        sArr[i + 11] = (short) i81;
        int i83 = (sArr2[i29] & UShort.MAX_VALUE) * (sArr2[i47] & UShort.MAX_VALUE);
        short s18 = (short) i83;
        int i84 = (((i83 >> 16) & 65535) << 1) + ((s18 >> 15) & 1);
        short s19 = sArr2[i37];
        int i85 = ((s19 & UShort.MAX_VALUE) * (s19 & UShort.MAX_VALUE)) + (((short) (s18 << 1)) & UShort.MAX_VALUE);
        int i86 = i82 + (((short) i85) & UShort.MAX_VALUE);
        int i87 = i84 + ((i85 >> 16) & 65535) + ((i86 >> 16) & 65535);
        sArr[i + 12] = (short) i86;
        int i88 = (sArr2[i37] & UShort.MAX_VALUE) * (sArr2[i47] & UShort.MAX_VALUE);
        short s20 = (short) i88;
        int i89 = (((i88 >> 16) & 65535) << 1) + ((s20 >> 15) & 1);
        int i90 = i87 + (((short) (s20 << 1)) & UShort.MAX_VALUE);
        sArr[i + 13] = (short) i90;
        short s21 = sArr2[i47];
        int i91 = ((s21 & UShort.MAX_VALUE) * (s21 & UShort.MAX_VALUE)) + i89 + ((i90 >> 16) & 65535);
        sArr[i + 14] = (short) i91;
        sArr[i + 15] = (short) (i91 >> 16);
    }

    private static int BitPrecision(short s) {
        int i;
        if (s == 0) {
            return 0;
        }
        if ((s >> 8) == 0) {
            s = (short) (s << 8);
            i = 8;
        } else {
            i = 16;
        }
        if ((s >> 12) == 0) {
            s = (short) (s << 4);
            i -= 4;
        }
        if ((s >> 14) == 0) {
            s = (short) (s << 2);
            i -= 2;
        }
        return (s >> 15) == 0 ? i - 1 : i;
    }

    private static int BitsToWords(int i) {
        int i2 = i & 15;
        int i3 = i >> 4;
        return i2 == 0 ? i3 : i3 + 1;
    }

    private int ByteCount() {
        int i = this.wordCount;
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        short s = this.words[i2];
        int i3 = i2 << 1;
        return s == 0 ? i3 : (s >> 8) == 0 ? i3 + 1 : i3 + 2;
    }

    private static void ChunkedLinearMultiply(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4, short[] sArr4, int i5, int i6) {
        int i7;
        int i8 = i4;
        int i9 = i6;
        Arrays.fill(sArr, i, i + i9, (short) 0);
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            int i12 = i8 - i10;
            if (i12 > i9) {
                SameSizeMultiply(sArr2, i2, sArr2, i2 + i9 + i9, sArr3, i3 + i10, sArr4, i5, i9);
                int i13 = i6 + i6;
                i7 = i10;
                AddUnevenSize(sArr2, i2, sArr2, i2, i13, sArr, i + i11, i6);
                System.arraycopy(sArr2, i2, sArr, i + i7, i13);
                i11 += i6;
            } else {
                i7 = i10;
                AsymmetricMultiply(sArr2, i2, sArr2, i2 + i12 + i6, sArr3, i3 + i7, i12, sArr4, i5, i6);
                int i14 = i12 + i6;
                AddUnevenSize(sArr2, i2, sArr2, i2, i14, sArr, i + i11, i6);
                System.arraycopy(sArr2, i2, sArr, i + i7, i14);
            }
            i10 = i7 + i6;
            i8 = i4;
            i9 = i6;
        }
    }

    public static short[] CleanGrow(short[] sArr, int i) {
        if (i <= sArr.length) {
            return sArr;
        }
        short[] sArr2 = new short[i];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    private static int Compare(short[] sArr, int i, short[] sArr2, int i2, int i3) {
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return 0;
            }
            int i5 = sArr[i + i4] & UShort.MAX_VALUE;
            int i6 = 65535 & sArr2[i2 + i4];
            if (i5 > i6) {
                return 1;
            }
            if (i5 < i6) {
                return -1;
            }
            i3 = i4;
        }
    }

    private static int CompareWithWords1IsOneBigger(short[] sArr, int i, short[] sArr2, int i2, int i3) {
        if (sArr[(i + i3) - 1] != 0) {
            return 1;
        }
        int i4 = i3 - 1;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return 0;
            }
            int i6 = sArr[i + i5] & UShort.MAX_VALUE;
            int i7 = 65535 & sArr2[i2 + i5];
            if (i6 > i7) {
                return 1;
            }
            if (i6 < i7) {
                return -1;
            }
            i4 = i5;
        }
    }

    private short[] Copy() {
        short[] sArr = this.words;
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, this.wordCount);
        return sArr2;
    }

    public static int CountWords(short[] sArr, int i, int i2) {
        while (i2 != 0 && sArr[(i + i2) - 1] == 0) {
            i2--;
        }
        return i2;
    }

    private static int DecrementWords(short[] sArr, int i, int i2, short s) {
        short s2 = sArr[i];
        short s3 = (short) (s2 - s);
        sArr[i] = s3;
        if ((s3 & UShort.MAX_VALUE) <= (s2 & UShort.MAX_VALUE)) {
            return 0;
        }
        for (int i3 = 1; i3 < i2; i3++) {
            int i4 = i + i3;
            short s4 = sArr[i4];
            sArr[i4] = (short) (s4 - 1);
            if (s4 != 0) {
                return 0;
            }
        }
        return 1;
    }

    private static short Divide32By16(int i, short s, boolean z) {
        int i2 = s & UShort.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            int i5 = i3 >> 31;
            i3 = (i3 << 1) | ((i >> 31) & 1);
            i <<= 1;
            int i6 = i5 | i3;
            if ((i6 >> 31) != 0 || i6 >= i2) {
                i3 -= i2;
                i++;
            }
        }
        return (short) (z ? i3 & 65535 : i & 65535);
    }

    private static void DivideThreeBlocksByTwo(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4, short[] sArr4, int i5, short[] sArr5, int i6, short[] sArr6) {
        short[] sArr7;
        short[] sArr8;
        int i7;
        int i8;
        short[] sArr9;
        short[] sArr10;
        int i9;
        int i10 = i3 + i4;
        if (WordsCompare(sArr2, i2 + i4, i4, sArr3, i10, i4) < 0) {
            RecursiveDivideInner(sArr2, i2, sArr3, i10, sArr4, i5, sArr5, i6, i4);
            sArr8 = sArr5;
            i7 = i6;
            i8 = i4;
            sArr7 = sArr4;
            System.arraycopy(sArr8, i7, sArr6, i8 * 4, i8);
            int i11 = i8 * 5;
            Arrays.fill(sArr6, i11, i11 + i8, (short) 0);
            sArr9 = sArr6;
        } else {
            sArr7 = sArr4;
            sArr8 = sArr5;
            i7 = i6;
            for (int i12 = 0; i12 < i4; i12++) {
                sArr7[i5 + i12] = -1;
            }
            int i13 = i5 + i4;
            Arrays.fill(sArr7, i13, i13 + i4, (short) 0);
            int i14 = i4 * 4;
            System.arraycopy(sArr2, i2, sArr6, i14, i4 * 2);
            int i15 = i4 * 5;
            SubtractInternal(sArr6, i15, sArr6, i15, sArr3, i10, i4);
            i8 = i4;
            sArr9 = sArr6;
            IncrementWords(sArr9, i15, i8, (short) AddInternal(sArr9, i14, sArr6, i14, sArr3, i10, i8));
        }
        int i16 = i8 * 2;
        short[] sArr11 = sArr7;
        AsymmetricMultiply(sArr9, 0, sArr6, i16, sArr11, i5, i8, sArr3, i3, i4);
        int i17 = i16;
        int i18 = i8;
        int i19 = i18 * 3;
        System.arraycopy(sArr, i, sArr9, i19, i18);
        Arrays.fill(sArr9, i17, i17 + i18, (short) 0);
        if (SubtractInternal(sArr9, i19, sArr6, i19, sArr6, 0, i19) != 0) {
            while (true) {
                sArr10 = sArr6;
                i9 = i17;
                int IncrementWords = IncrementWords(sArr10, i18 * 5, i18, (short) AddInternal(sArr10, i19, sArr6, i19, sArr3, i3, i9));
                DecrementWords(sArr11, i5, i9, (short) 1);
                if (IncrementWords != 0) {
                    break;
                } else {
                    i17 = i9;
                }
            }
        } else {
            sArr10 = sArr6;
            i9 = i17;
        }
        System.arraycopy(sArr10, i19, sArr8, i7, i9);
    }

    private static short DivideUnsigned(int i, short s) {
        return (short) ((i >> 31) == 0 ? i / (s & UShort.MAX_VALUE) : (int) ((i & 4294967295L) / (s & UShort.MAX_VALUE)));
    }

    private static EInteger[] EIntegerCache(int i, int i2) {
        EInteger[] eIntegerArr = new EInteger[(i2 - i) + 1];
        int i3 = i;
        while (i3 <= i2) {
            if (i3 == 0) {
                eIntegerArr[i3 - i] = ValueZero;
            } else if (i3 == 1) {
                eIntegerArr[i3 - i] = ValueOne;
            } else if (i3 == 10) {
                eIntegerArr[i3 - i] = ValueTen;
            } else {
                eIntegerArr[i3 - i] = new EInteger(1, new short[]{(short) Math.abs(i3)}, i3 < 0);
            }
            i3++;
        }
        return eIntegerArr;
    }

    private static void FastDivide(short[] sArr, short[] sArr2, int i, short s) {
        if (s == 2) {
            FastDivideAndRemainderTwo(sArr, 0, sArr2, 0, i);
        } else if (s != 10) {
            FastDivideAndRemainder(sArr, 0, sArr2, 0, i, s);
        } else {
            FastDivideAndRemainderTen(sArr, 0, sArr2, 0, i);
        }
    }

    private static short FastDivideAndRemainder(short[] sArr, int i, short[] sArr2, int i2, int i3, short s) {
        int i4;
        int DivideUnsigned;
        int i5 = s & UShort.MAX_VALUE;
        int i6 = (i2 + i3) - 1;
        int i7 = (i + i3) - 1;
        int i8 = 0;
        if (i5 < 32768) {
            i4 = 0;
            while (i8 < i3) {
                int i9 = (i4 << 16) | (sArr2[i6] & UShort.MAX_VALUE);
                int i10 = i9 / i5;
                sArr[i7] = (short) i10;
                i4 = i9 - (i10 * i5);
                i6--;
                i7--;
                i8++;
            }
        } else {
            int i11 = 0;
            while (i8 < i3) {
                int i12 = (i11 << 16) | (sArr2[i6] & UShort.MAX_VALUE);
                if ((i12 >> 31) == 0) {
                    DivideUnsigned = i12 / i5;
                    sArr[i7] = (short) DivideUnsigned;
                } else {
                    DivideUnsigned = DivideUnsigned(i12, s) & UShort.MAX_VALUE;
                    sArr[i7] = (short) DivideUnsigned;
                }
                i11 = i12 - (DivideUnsigned * i5);
                i6--;
                i7--;
                i8++;
            }
            i4 = i11;
        }
        return (short) i4;
    }

    private static short FastDivideAndRemainderTen(short[] sArr, int i, short[] sArr2, int i2, int i3) {
        int i4 = (i2 + i3) - 1;
        int i5 = (i + i3) - 1;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i6 << 16) | (sArr2[i4] & UShort.MAX_VALUE);
            int i9 = i8 >= 81920 ? i8 / 10 : ((52429 * i8) >> 19) & 8191;
            sArr[i5] = (short) i9;
            i6 = i8 - (i9 * 10);
            i4--;
            i5--;
        }
        return (short) i6;
    }

    private static short FastDivideAndRemainderTwo(short[] sArr, int i, short[] sArr2, int i2, int i3) {
        int i4 = (i2 + i3) - 1;
        int i5 = (i + i3) - 1;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i6 << 16) | (sArr2[i4] & UShort.MAX_VALUE);
            sArr[i5] = (short) (i8 >> 1);
            i6 = i8 & 1;
            i4--;
            i5--;
        }
        return (short) i6;
    }

    private static short FastRemainder(short[] sArr, int i, short s) {
        short s2 = 0;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return s2;
            }
            s2 = RemainderUnsigned((sArr[i2] & UShort.MAX_VALUE) | (s2 << 16), s);
            i = i2;
        }
    }

    public static EInteger FromBoolean(boolean z) {
        return z ? ValueOne : ValueZero;
    }

    public static EInteger FromByte(byte b) {
        return FromInt32(b & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if ((r11[(r12 + r13) - 1] & 128) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007a, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a7, code lost:
    
        if ((r11[r12] & 128) != 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.upokecenter.numbers.EInteger FromBytes(byte[] r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EInteger.FromBytes(byte[], int, int, boolean):com.upokecenter.numbers.EInteger");
    }

    public static EInteger FromInt16(short s) {
        return FromInt32(s);
    }

    public static EInteger FromInt32(int i) {
        short[] sArr;
        if (i >= CacheFirst && i <= 128) {
            return Cache[i - CacheFirst];
        }
        boolean z = i < 0;
        if ((i >> 15) == 0) {
            sArr = new short[2];
            if (z) {
                i = -i;
            }
            sArr[0] = (short) (i & 65535);
        } else if (i == Integer.MIN_VALUE) {
            sArr = new short[]{0, ShortCompanionObject.MIN_VALUE};
            r1 = 2;
        } else {
            if (z) {
                i = -i;
            }
            short[] sArr2 = {(short) (i & 65535), (short) ((i >> 16) & 65535)};
            r1 = sArr2[1] != 0 ? 2 : 1;
            sArr = sArr2;
        }
        return new EInteger(r1, sArr, z);
    }

    public static EInteger FromInt64(long j) {
        short[] sArr;
        if (j >= -24 && j <= 128) {
            return Cache[(int) (j - (-24))];
        }
        int i = 1;
        boolean z = j < 0;
        if ((j >> 16) == 0) {
            int i2 = (int) j;
            if (z) {
                i2 = -i2;
            }
            sArr = new short[]{(short) (i2 & 65535)};
        } else if ((j >> 31) == 0) {
            int i3 = (int) j;
            if (z) {
                i3 = -i3;
            }
            sArr = new short[]{(short) (i3 & 65535), (short) ((i3 >> 16) & 65535)};
            i = 2;
        } else if (j == Long.MIN_VALUE) {
            sArr = new short[]{0, 0, 0, ShortCompanionObject.MIN_VALUE};
            i = 4;
        } else {
            if (z) {
                j = -j;
            }
            sArr = new short[]{(short) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX), (short) ((j >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX), (short) ((j >> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX), (short) ((j >> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)};
            i = 4;
            while (i != 0 && sArr[i - 1] == 0) {
                i--;
            }
        }
        return new EInteger(i, sArr, z);
    }

    public static EInteger FromInt64AsUnsigned(long j) {
        return j >= 0 ? FromInt64(j) : FromInt32(1).ShiftLeft(64).Add(j);
    }

    public static EInteger FromInts(int[] iArr, int i) {
        int i2 = i << 1;
        short[] sArr = new short[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = iArr[i3];
            sArr[i4] = (short) i5;
            sArr[i4 + 1] = (short) (i5 >> 16);
            i3++;
            i4 += 2;
        }
        while (i2 != 0 && sArr[i2 - 1] == 0) {
            i2--;
        }
        return i2 == 0 ? FromInt32(0) : new EInteger(i2, sArr, false);
    }

    public static EInteger FromRadixString(String str, int i) {
        if (str != null) {
            return FromRadixSubstring(str, i, 0, str.length());
        }
        Single$$ExternalSyntheticBUOutline0.m$1("str");
        return null;
    }

    public static EInteger FromRadixSubstring(String str, int i, int i2, int i3) {
        if (str != null) {
            return EIntegerTextString.FromRadixSubstringImpl(str, i, i2, i3, true);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("str");
        return null;
    }

    public static EInteger FromString(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("str");
            return null;
        }
        int length = str.length();
        if (length != 1) {
            return FromRadixSubstring(str, 10, 0, length);
        }
        char charAt = str.charAt(0);
        if (charAt >= '0' && charAt <= '9') {
            return FromInt32(charAt - '0');
        }
        DisplayCompat$$ExternalSyntheticBUOutline0.m7672m();
        return null;
    }

    public static EInteger FromSubstring(char[] cArr, int i, int i2) {
        if (cArr != null) {
            return FromRadixSubstring(cArr, 10, i, i2);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("cs");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0046, code lost:
    
        return r14 << r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long GcdLong(long r12, long r14) {
        /*
            r0 = 0
            r1 = r0
        L2:
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L42
            int r5 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r5 == 0) goto L42
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 == 0) goto L42
            r6 = 1
            long r8 = r12 & r6
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r8 = 1
            if (r4 != 0) goto L1b
            r4 = r8
            goto L1c
        L1b:
            r4 = r0
        L1c:
            long r6 = r6 & r14
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L23
            r2 = r8
            goto L24
        L23:
            r2 = r0
        L24:
            if (r4 == 0) goto L2d
            if (r2 == 0) goto L2d
            int r1 = r1 + 1
            long r12 = r12 >> r8
        L2b:
            long r14 = r14 >> r8
            goto L2
        L2d:
            if (r4 == 0) goto L33
            if (r2 != 0) goto L33
        L31:
            long r12 = r12 >> r8
            goto L2
        L33:
            if (r4 != 0) goto L38
            if (r2 == 0) goto L38
            goto L2b
        L38:
            if (r5 < 0) goto L3c
            long r12 = r12 - r14
            goto L31
        L3c:
            long r14 = r14 - r12
            long r14 = r14 >> r8
            r10 = r14
            r14 = r12
            r12 = r10
            goto L2
        L42:
            if (r4 != 0) goto L47
            long r12 = r14 << r1
            return r12
        L47:
            long r12 = r12 << r1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EInteger.GcdLong(long, long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x018a, code lost:
    
        if (((r4 * r27) & 4294967295L) > r12) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ad, code lost:
    
        if (((r0 * r27) & 4294967295L) > r12) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void GeneralDivide(short[] r24, int r25, int r26, short[] r27, int r28, int r29, short[] r30, int r31, short[] r32, int r33) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EInteger.GeneralDivide(short[], int, int, short[], int, int, short[], int, short[], int):void");
    }

    private static short GetHighHalfAsBorrow(int i) {
        return (short) (0 - ((i >> 16) & 65535));
    }

    private static int GetLowHalf(int i) {
        return i & 65535;
    }

    private static int GetUnsignedBitLengthEx(int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = (i2 - 1) << 4;
        if (i == 0) {
            return i3;
        }
        int i4 = i3 + 16;
        if ((i >> 8) == 0) {
            i <<= 8;
            i4 = i3 + 8;
        }
        if ((i >> 12) == 0) {
            i <<= 4;
            i4 -= 4;
        }
        if ((i >> 14) == 0) {
            i <<= 2;
            i4 -= 2;
        }
        return (i >> 15) == 0 ? i4 - 1 : i4;
    }

    public static short[] GrowForCarry(short[] sArr, short s) {
        int length = sArr.length;
        short[] CleanGrow = CleanGrow(sArr, length + 1);
        CleanGrow[length] = s;
        return CleanGrow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0199, code lost:
    
        io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0.m$1("Internal error: eia=", r22, " oeib=", r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.upokecenter.numbers.EInteger[] HalfGCD(com.upokecenter.numbers.EInteger r22, com.upokecenter.numbers.EInteger r23) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EInteger.HalfGCD(com.upokecenter.numbers.EInteger, com.upokecenter.numbers.EInteger):com.upokecenter.numbers.EInteger[]");
    }

    public static int IncrementWords(short[] sArr, int i, int i2, short s) {
        short s2 = sArr[i];
        short s3 = (short) (s + s2);
        sArr[i] = s3;
        if ((s3 & UShort.MAX_VALUE) >= (s2 & UShort.MAX_VALUE)) {
            return 0;
        }
        for (int i3 = 1; i3 < i2; i3++) {
            int i4 = i + i3;
            short s4 = (short) (sArr[i4] + 1);
            sArr[i4] = s4;
            if (s4 != 0) {
                return 0;
            }
        }
        return 1;
    }

    private static EInteger Interpolate(EInteger[] eIntegerArr, int[] iArr, int i) {
        EInteger FromInt32 = FromInt32(0);
        for (int i2 = 0; i2 < eIntegerArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                FromInt32 = i3 == 1 ? FromInt32.Add(eIntegerArr[i2]) : i3 == -1 ? FromInt32.Subtract(eIntegerArr[i2]) : FromInt32.Add(eIntegerArr[i2].Multiply(i3));
            }
        }
        return FromInt32.Divide(i);
    }

    private static int LBL(long j) {
        if (j == 0) {
            return 0;
        }
        return NumberUtility.BitLength(Math.abs(j));
    }

    private static long[] LHalfGCD(long j, long j2) {
        long j3;
        long j4;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        int i;
        int i2;
        long j5;
        long j6;
        String str;
        char c6;
        if (j == 0) {
            j3 = 0;
            j4 = 1;
            c = 3;
            c2 = 2;
            c3 = 0;
            c4 = 4;
            c5 = 5;
            i = 6;
        } else {
            if (j2 != 0) {
                long[] jArr = new long[6];
                int max = Math.max(LBL(j), LBL(j2));
                int min = Math.min(LBL(j), LBL(j2));
                int i3 = max >> 1;
                int i4 = i3 + 1;
                if (min <= i4) {
                    return new long[]{j, j2, 1, 0, 0, 1};
                }
                int i5 = (max * 3) >> 2;
                if (min > i5 + 2) {
                    long j7 = (1 << i3) - 1;
                    i2 = i3;
                    long j8 = j & j7;
                    long j9 = j2 & j7;
                    long[] LHalfGCD = LHalfGCD(j >> i2, j2 >> i2);
                    if (LHalfGCD == null) {
                        return null;
                    }
                    jArr = jArr;
                    System.arraycopy(LHalfGCD, 0, jArr, 0, 6);
                    long j10 = (LHalfGCD[5] * j8) - (LHalfGCD[3] * j9);
                    long j11 = (j9 * LHalfGCD[2]) - (j8 * LHalfGCD[4]);
                    j5 = j10 + (LHalfGCD[0] << i2);
                    j6 = j11 + (LHalfGCD[1] << i2);
                    if (j5 < 0 || j6 < 0) {
                        StringBuilder m = a$$ExternalSyntheticOutline0.m("Internal error: longa=", j, " olongb=");
                        m.append(j2);
                        throw new IllegalStateException(m.toString());
                    }
                } else {
                    i2 = i3;
                    jArr[2] = 1;
                    jArr[3] = 0;
                    jArr[4] = 0;
                    jArr[5] = 1;
                    j5 = j;
                    j6 = j2;
                }
                jArr[0] = j5;
                jArr[1] = j6;
                while (Math.max(LBL(jArr[0]), LBL(jArr[1])) > i5 + 1 && LBL(jArr[0] - jArr[1]) > i4) {
                    if (jArr[0] < 0 || jArr[1] < 0) {
                        StringBuilder m2 = a$$ExternalSyntheticOutline0.m("Internal error: longa=", j, " olongb=");
                        m2.append(j2);
                        throw new IllegalStateException(m2.toString());
                    }
                    LSDivStep(jArr, i4);
                }
                long j12 = jArr[0];
                long j13 = jArr[1];
                if (Math.min(LBL(j12), LBL(j13)) > i2 + 3) {
                    int max2 = ((i4 * 2) - Math.max(LBL(j12), LBL(j13))) + 1;
                    long j14 = (1 << max2) - 1;
                    c6 = 0;
                    long j15 = j12 >> max2;
                    long j16 = j12 & j14;
                    str = "Internal error";
                    long j17 = j13 >> max2;
                    long j18 = j13 & j14;
                    long[] LHalfGCD2 = LHalfGCD(j15, j17);
                    if (LHalfGCD2 == null) {
                        return null;
                    }
                    long j19 = LHalfGCD2[5];
                    long j20 = LHalfGCD2[3];
                    long j21 = (j16 * j19) - (j18 * j20);
                    long j22 = LHalfGCD2[2];
                    long j23 = LHalfGCD2[4];
                    long j24 = (j18 * j22) - (j16 * j23);
                    j12 = (LHalfGCD2[0] << max2) + j21;
                    j13 = j24 + (LHalfGCD2[1] << max2);
                    if (j12 < 0 || j13 < 0) {
                        Single$$ExternalSyntheticBUOutline0.m$2(str);
                        return null;
                    }
                    long j25 = jArr[2];
                    long j26 = jArr[3];
                    long j27 = (j26 * j23) + (j25 * j22);
                    long j28 = (j26 * j19) + (j25 * j20);
                    long j29 = jArr[4];
                    long j30 = jArr[5];
                    jArr[2] = j27;
                    jArr[3] = j28;
                    jArr[4] = (j23 * j30) + (j22 * j29);
                    jArr[5] = (j30 * j19) + (j29 * j20);
                } else {
                    str = "Internal error";
                    c6 = 0;
                }
                jArr[c6] = j12;
                jArr[1] = j13;
                while (LBL(jArr[c6] - jArr[1]) > i4) {
                    if (jArr[c6] < 0 || jArr[1] < 0) {
                        Single$$ExternalSyntheticBUOutline0.m$2(str);
                        return null;
                    }
                    LSDivStep(jArr, i4);
                }
                if (jArr[c6] >= 0 && jArr[1] >= 0) {
                    return jArr;
                }
                Single$$ExternalSyntheticBUOutline0.m$2(str);
                return null;
            }
            j3 = 0;
            i = 6;
            j4 = 1;
            c = 3;
            c2 = 2;
            c3 = 0;
            c4 = 4;
            c5 = 5;
        }
        long[] jArr2 = new long[i];
        jArr2[c3] = j;
        jArr2[1] = j2;
        jArr2[c2] = j4;
        jArr2[c] = j3;
        jArr2[c4] = j3;
        jArr2[c5] = j4;
        return jArr2;
    }

    private static void LSDivStep(long[] jArr, long j) {
        long j2 = jArr[0];
        if (j2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(jArr[0], ") is not greater or equal to 0", new StringBuilder("longam[0] (")));
            return;
        }
        long j3 = jArr[1];
        if (j3 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(jArr[1], ") is not greater or equal to 0", new StringBuilder("longam[1] (")));
            return;
        }
        if (j2 > j3) {
            long j4 = j2 / j3;
            long[] jArr2 = {j4, j2 - (j4 * j3)};
            if (LBL(r1) <= j) {
                long j5 = jArr2[0] - 1;
                jArr2[0] = j5;
                if (j5 < 0) {
                    Duration$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                jArr2[1] = jArr2[1] + j3;
            }
            long j6 = jArr[3];
            long j7 = jArr[2];
            long j8 = jArr2[0];
            jArr[3] = (j7 * j8) + j6;
            jArr[5] = (jArr[4] * j8) + jArr[5];
            jArr[0] = jArr2[1];
            return;
        }
        long j9 = j3 / j2;
        long[] jArr3 = {j9, j3 - (j9 * j2)};
        if (LBL(r7) <= j) {
            long j10 = jArr3[0] - 1;
            jArr3[0] = j10;
            if (j10 < 0) {
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            jArr3[1] = jArr3[1] + j2;
        }
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr3[0];
        jArr[2] = (j12 * j13) + j11;
        jArr[4] = (jArr[5] * j13) + jArr[4];
        jArr[1] = jArr3[1];
    }

    private static EInteger LeftShiftBigIntVar(EInteger eInteger, EInteger eInteger2) {
        if (eInteger.isZero()) {
            return eInteger;
        }
        while (eInteger2.signum() > 0) {
            int ToInt32Checked = eInteger2.compareTo(FromInt64(1000000L)) < 0 ? eInteger2.ToInt32Checked() : 1000000;
            eInteger = eInteger.ShiftLeft(ToInt32Checked);
            eInteger2 = eInteger2.Subtract(FromInt32(ToInt32Checked));
        }
        return eInteger;
    }

    private static short LinearMultiply(short[] sArr, int i, short[] sArr2, int i2, short s, int i3) {
        int i4 = s & UShort.MAX_VALUE;
        short s2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = ((sArr2[i2 + i5] & UShort.MAX_VALUE) * i4) + (s2 & UShort.MAX_VALUE);
            sArr[i + i5] = (short) i6;
            s2 = (short) (i6 >> 16);
        }
        return s2;
    }

    private static short LinearMultiplyAdd(short[] sArr, int i, short[] sArr2, int i2, short s, int i3) {
        int i4 = s & UShort.MAX_VALUE;
        short s2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = ((sArr2[i2 + i5] & UShort.MAX_VALUE) * i4) + (s2 & UShort.MAX_VALUE);
            int i7 = i + i5;
            int i8 = i6 + (sArr[i7] & UShort.MAX_VALUE);
            sArr[i7] = (short) i8;
            s2 = (short) (i8 >> 16);
        }
        return s2;
    }

    private static int LinearMultiplySubtractMinuend1Bigger(short[] sArr, int i, short[] sArr2, int i2, int i3, short[] sArr3, int i4, int i5) {
        int i6;
        int i7 = 0;
        if (i3 == 0) {
            i6 = 0;
            while (i7 < i5) {
                int i8 = (sArr2[i2 + i7] & UShort.MAX_VALUE) - i6;
                sArr[i + i7] = (short) i8;
                i6 = (i8 >> 31) & 1;
                i7++;
            }
        } else {
            int i9 = 0;
            while (i7 < i5) {
                int i10 = ((sArr3[i4 + i7] & UShort.MAX_VALUE) * i3) + i9;
                int i11 = (sArr2[i2 + i7] & UShort.MAX_VALUE) - (i10 & 65535);
                sArr[i + i7] = (short) i11;
                i9 = ((i10 >> 16) + ((i11 >> 31) & 1)) & 65535;
                i7++;
            }
            i6 = i9;
        }
        int i12 = (sArr2[i2 + i5] & UShort.MAX_VALUE) - i6;
        sArr[i + i5] = (short) i12;
        return (i12 >> 31) & 1;
    }

    private static EInteger MakeEInteger(short[] sArr, int i, int i2, int i3) {
        if (i2 >= i) {
            return FromInt32(0);
        }
        int min = Math.min(i3, i - i2);
        while (min != 0 && sArr[(i2 + min) - 1] == 0) {
            min--;
        }
        if (min == 0) {
            return FromInt32(0);
        }
        short[] sArr2 = new short[min];
        System.arraycopy(sArr, i2, sArr2, 0, min);
        return new EInteger(min, sArr2, false);
    }

    public static EInteger Max(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(DefaultPreloadManager.METRIC_PATH_FIRST);
            return null;
        }
        if (eInteger2 != null) {
            return eInteger.compareTo(eInteger2) > 0 ? eInteger : eInteger2;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("second");
        return null;
    }

    private static EInteger MaxBitLength(EInteger eInteger, EInteger eInteger2) {
        return Max(BL(eInteger), BL(eInteger2));
    }

    public static EInteger MaxMagnitude(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(DefaultPreloadManager.METRIC_PATH_FIRST);
            return null;
        }
        if (eInteger2 != null) {
            int compareTo = eInteger.Abs().compareTo(eInteger2.Abs());
            return compareTo == 0 ? Max(eInteger, eInteger2) : compareTo > 0 ? eInteger : eInteger2;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("second");
        return null;
    }

    public static EInteger Min(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(DefaultPreloadManager.METRIC_PATH_FIRST);
            return null;
        }
        if (eInteger2 != null) {
            return eInteger.compareTo(eInteger2) < 0 ? eInteger : eInteger2;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("second");
        return null;
    }

    private static EInteger MinBitLength(EInteger eInteger, EInteger eInteger2) {
        return Min(BL(eInteger), BL(eInteger2));
    }

    public static EInteger MinMagnitude(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(DefaultPreloadManager.METRIC_PATH_FIRST);
            return null;
        }
        if (eInteger2 != null) {
            int compareTo = eInteger.Abs().compareTo(eInteger2.Abs());
            return compareTo == 0 ? Min(eInteger, eInteger2) : compareTo < 0 ? eInteger : eInteger2;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("second");
        return null;
    }

    private static void NotWords(short[] sArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = (short) (~sArr[i2]);
        }
    }

    private static void OrWords(short[] sArr, short[] sArr2, short[] sArr3, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = (short) (sArr2[i2] | sArr3[i2]);
        }
    }

    private int PositiveCompare(EInteger eInteger) {
        int i = this.wordCount;
        int i2 = eInteger.wordCount;
        return i == i2 ? Compare(this.words, 0, eInteger.words, 0, i) : i > i2 ? 1 : -1;
    }

    private static void RecursiveDivide(short[] sArr, int i, int i2, short[] sArr2, int i3, int i4, short[] sArr3, int i5, short[] sArr4, int i6) {
        int i7;
        int i8;
        int min;
        int i9 = 201;
        while (i9 < i4) {
            i9 <<= 1;
        }
        short[] sArr5 = new short[i9];
        int i10 = i9 - i4;
        System.arraycopy(sArr2, i3, sArr5, i10, i4);
        int i11 = i2 + i10;
        short s = sArr2[i4 - 1];
        short s2 = 0;
        if ((s & ShortCompanionObject.MIN_VALUE) == 0) {
            int i12 = 0;
            for (int i13 = s; (i13 & 32768) == 0; i13 <<= 1) {
                i12++;
            }
            int i14 = 0;
            for (int i15 = sArr[i2 - 1]; (i15 & 32768) == 0; i15 <<= 1) {
                i14++;
            }
            i7 = i14 < i12 ? 1 : 0;
            ShiftWordsLeftByBits(sArr5, i9 - i4, i4, i12);
            i8 = i12;
        } else {
            i7 = 0;
            i8 = 0;
        }
        int i16 = ((i9 - 1) + (i11 + i7)) / i9;
        short[] sArr6 = new short[i16 * i9];
        System.arraycopy(sArr, i, sArr6, i10, i2);
        ShiftWordsLeftByBits(sArr6, i10, i2 + i7, i8);
        short[] sArr7 = new short[i9 * 5];
        int i17 = i16 - 1;
        while (i17 >= 0) {
            int i18 = i17 * i9;
            System.arraycopy(sArr6, i18, sArr7, i9, i9);
            int i19 = i9 * 3;
            int i20 = i9 << 1;
            Arrays.fill(sArr7, i19, i19 + i20, s2);
            int i21 = i8;
            short s3 = s2;
            int i22 = i17;
            short[] sArr8 = sArr6;
            short[] sArr9 = sArr7;
            RecursiveDivideInner(sArr9, i9, sArr5, 0, sArr7, i19, sArr7, 0, i9);
            if (sArr3 != null && (min = Math.min(i9, sArr3.length - i18)) > 0) {
                System.arraycopy(sArr9, i19, sArr3, i5 + i18, min);
            }
            System.arraycopy(sArr9, s3, sArr9, i20, i9);
            i17 = i22 - 1;
            i8 = i21;
            s2 = s3;
            sArr7 = sArr9;
            sArr6 = sArr8;
        }
        short[] sArr10 = sArr7;
        int i23 = i8;
        if (sArr4 != null) {
            System.arraycopy(sArr10, i10, sArr4, i6, i4);
            ShiftWordsRightByBits(sArr4, i6, i4, i23);
        }
    }

    private static void RecursiveDivideInner(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, short[] sArr4, int i4, int i5) {
        if (i5 < 201 || (i5 & 1) == 1) {
            GeneralDivide(sArr, i, i5 * 2, sArr2, i2, i5, sArr3, i3, sArr4, i4);
            return;
        }
        int i6 = i5 >> 1;
        short[] sArr5 = new short[i6 * 10];
        Arrays.fill(sArr3, i3, (i5 * 2) + i3, (short) 0);
        Arrays.fill(sArr4, i4, i4 + i5, (short) 0);
        int i7 = i6 * 6;
        int i8 = i6 * 8;
        DivideThreeBlocksByTwo(sArr, i + i6, sArr, i + i5, sArr2, i2, i6, sArr5, i7, sArr5, i8, sArr5);
        DivideThreeBlocksByTwo(sArr, i, sArr5, i8, sArr2, i2, i6, sArr3, i3, sArr4, i4, sArr5);
        System.arraycopy(sArr5, i7, sArr3, i3 + i6, i6);
    }

    private static void RecursiveSquare(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4) {
        if (i4 <= 10) {
            if (i4 == 2) {
                BaselineSquare2(sArr, i, sArr3, i3);
                return;
            }
            if (i4 == 4) {
                BaselineSquare4(sArr, i, sArr3, i3);
                return;
            } else if (i4 != 8) {
                SchoolbookSquare(sArr, i, sArr3, i3, i4);
                return;
            } else {
                BaselineSquare8(sArr, i, sArr3, i3);
                return;
            }
        }
        if (i4 >= 400) {
            Toom4(sArr, i, sArr3, i3, i4, sArr3, i3, i4);
            return;
        }
        if (i4 >= 100) {
            Toom3(sArr, i, sArr3, i3, i4, sArr3, i3, i4);
            return;
        }
        if ((i4 & 1) != 0) {
            SameSizeMultiply(sArr, i, sArr2, i2, sArr3, i3, sArr3, i3, i4);
            return;
        }
        int i5 = i4 >> 1;
        int i6 = i2 + i4;
        RecursiveSquare(sArr, i, sArr2, i6, sArr3, i3, i5);
        int i7 = i + i4;
        int i8 = i3 + i5;
        RecursiveSquare(sArr, i7, sArr2, i6, sArr3, i8, i5);
        SameSizeMultiply(sArr2, i2, sArr2, i6, sArr3, i3, sArr3, i8, i5);
        int i9 = i + i5;
        IncrementWords(sArr, i7 + i5, i5, (short) (AddInternal(sArr, i9, sArr, i9, sArr2, i2, i4) + AddInternal(sArr, i9, sArr, i9, sArr2, i2, i4)));
    }

    private static short RemainderUnsigned(int i, short s) {
        return (i >> 31) == 0 ? (short) ((i % (s & UShort.MAX_VALUE)) & 65535) : Divide32By16(i, s, true);
    }

    private static void ReverseChars(char[] cArr, int i, int i2) {
        int i3 = i2 >> 1;
        int i4 = (i2 + i) - 1;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i + i5;
            char c = cArr[i6];
            cArr[i6] = cArr[i4];
            cArr[i4] = c;
            i5++;
            i4--;
        }
    }

    private EInteger[] RootRemInternal(EInteger eInteger, boolean z) {
        if (eInteger.compareTo(1) == 0) {
            return new EInteger[]{this, FromInt32(0)};
        }
        if (eInteger.compareTo(1) < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("root");
            return null;
        }
        if (eInteger.compareTo(2) == 0) {
            return SqrtRemInternal(z);
        }
        if (signum() <= 0) {
            return new EInteger[]{FromInt32(0), FromInt32(0)};
        }
        if (equals(FromInt32(1))) {
            return new EInteger[]{FromInt32(1), FromInt32(0)};
        }
        EInteger GetUnsignedBitLengthAsEInteger = GetUnsignedBitLengthAsEInteger();
        EInteger Subtract = eInteger.Subtract(1);
        EInteger ShiftRight = ShiftRight(Max(FromInt32(0), GetUnsignedBitLengthAsEInteger.Multiply(Subtract).Divide(eInteger).Subtract(1)));
        if (ShiftRight.signum() > 0) {
            while (true) {
                EInteger Divide = Divide(ShiftRight.Pow(Subtract)).Add(ShiftRight.Multiply(Subtract)).Divide(eInteger);
                if (ShiftRight.equals(Divide)) {
                    ShiftRight = Divide;
                    break;
                }
                if (Divide.compareTo(ShiftRight) > 0) {
                    break;
                }
                ShiftRight = Divide;
            }
        }
        if (!z) {
            return new EInteger[]{ShiftRight, null};
        }
        EInteger Subtract2 = Subtract(ShiftRight.Pow(eInteger));
        if (Subtract2.signum() >= 0) {
            return new EInteger[]{ShiftRight, Subtract2};
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    private static void SDivStep(EInteger[] eIntegerArr, EInteger eInteger) {
        if (eIntegerArr[0].compareTo(eIntegerArr[1]) > 0) {
            EInteger eInteger2 = eIntegerArr[0];
            EInteger eInteger3 = eIntegerArr[1];
            EInteger[] DivRem = eInteger2.DivRem(eInteger3);
            if (BL(DivRem[1]).compareTo(eInteger) <= 0) {
                EInteger Subtract = DivRem[0].Subtract(1);
                DivRem[0] = Subtract;
                if (Subtract.signum() < 0) {
                    Duration$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                DivRem[1] = DivRem[1].Add(eInteger3);
            }
            eIntegerArr[3] = eIntegerArr[3].Add(eIntegerArr[2].Multiply(DivRem[0]));
            eIntegerArr[5] = eIntegerArr[5].Add(eIntegerArr[4].Multiply(DivRem[0]));
            eIntegerArr[0] = DivRem[1];
            return;
        }
        EInteger eInteger4 = eIntegerArr[1];
        EInteger eInteger5 = eIntegerArr[0];
        EInteger[] DivRem2 = eInteger4.DivRem(eInteger5);
        if (BL(DivRem2[1]).compareTo(eInteger) <= 0) {
            EInteger Subtract2 = DivRem2[0].Subtract(1);
            DivRem2[0] = Subtract2;
            if (Subtract2.signum() < 0) {
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            DivRem2[1] = DivRem2[1].Add(eInteger5);
        }
        eIntegerArr[2] = eIntegerArr[2].Add(eIntegerArr[3].Multiply(DivRem2[0]));
        eIntegerArr[4] = eIntegerArr[4].Add(eIntegerArr[5].Multiply(DivRem2[0]));
        eIntegerArr[1] = DivRem2[1];
    }

    private static void SameSizeMultiply(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, short[] sArr4, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        short[] sArr5;
        int AddInternal;
        short[] sArr6;
        int AddInternal2;
        if (i5 <= 10) {
            if (i5 == 2) {
                BaselineMultiply2(sArr, i, sArr3, i3, sArr4, i4);
                return;
            }
            if (i5 == 4) {
                BaselineMultiply4(sArr, i, sArr3, i3, sArr4, i4);
                return;
            } else if (i5 != 8) {
                SchoolbookMultiply(sArr, i, sArr3, i3, i5, sArr4, i4, i5);
                return;
            } else {
                BaselineMultiply8(sArr, i, sArr3, i3, sArr4, i4);
                return;
            }
        }
        if (i5 >= 400) {
            Toom4(sArr, i, sArr3, i3, i5, sArr4, i4, i5);
            return;
        }
        if (i5 >= 100) {
            Toom3(sArr, i, sArr3, i3, i5, sArr4, i4, i5);
            return;
        }
        int i10 = i5;
        while (i10 != 0 && sArr3[(i3 + i10) - 1] == 0) {
            i10--;
        }
        int i11 = i5;
        while (i11 != 0 && sArr4[(i4 + i11) - 1] == 0) {
            i11--;
        }
        if (i10 == 0 || i11 == 0) {
            Arrays.fill(sArr, i, (i5 << 1) + i, (short) 0);
            return;
        }
        if ((i5 & 1) == 0) {
            int i12 = i5 >> 1;
            if (i10 <= i12 && i11 <= i12) {
                int i13 = i + i5;
                Arrays.fill(sArr, i13, i13 + i5, (short) 0);
                if (i12 == 8) {
                    BaselineMultiply8(sArr, i, sArr3, i3, sArr4, i4);
                    return;
                } else {
                    SameSizeMultiply(sArr, i, sArr2, i2, sArr3, i3, sArr4, i4, i12);
                    return;
                }
            }
            int i14 = i + i5;
            int i15 = i14 + i12;
            int i16 = i + i12;
            int i17 = i2 + i5;
            int i18 = i3 + i12;
            int i19 = Compare(sArr3, i3, sArr3, i18, i12) > 0 ? 0 : i12;
            int i20 = i19;
            SubtractInternal(sArr, i, sArr3, i3 + i19, sArr3, i3 + (i12 ^ i19), i12);
            int i21 = 0;
            int i22 = i4 + i12;
            if (Compare(sArr4, i4, sArr4, i22, i12) <= 0) {
                i21 = i12;
            }
            int i23 = i21;
            SubtractInternal(sArr, i16, sArr4, i4 + i21, sArr4, i4 + (i12 ^ i21), i12);
            SameSizeMultiply(sArr, i14, sArr2, i17, sArr3, i18, sArr4, i22, i12);
            SameSizeMultiply(sArr2, i2, sArr2, i17, sArr, i, sArr, i16, i12);
            SameSizeMultiply(sArr, i, sArr2, i17, sArr3, i3, sArr4, i4, i12);
            int AddInternal3 = AddInternal(sArr, i14, sArr, i14, sArr, i16, i12);
            int AddInternal4 = AddInternal3 + AddInternal(sArr, i16, sArr, i14, sArr, i, i12);
            int AddInternal5 = AddInternal3 + AddInternal(sArr, i14, sArr, i14, sArr, i15, i12);
            if (i20 == i23) {
                sArr6 = sArr;
                AddInternal2 = AddInternal5 - SubtractInternal(sArr, i16, sArr6, i16, sArr2, i2, i5);
            } else {
                sArr6 = sArr;
                AddInternal2 = AddInternal5 + AddInternal(sArr, i16, sArr, i16, sArr2, i2, i5);
            }
            int IncrementWords = IncrementWords(sArr6, i14, i12, (short) AddInternal4) + AddInternal2;
            if (IncrementWords != 0) {
                IncrementWords(sArr6, i15, i12, (short) IncrementWords);
                return;
            }
            return;
        }
        int i24 = i5 >> 1;
        int i25 = i5 - i24;
        int i26 = i3 + i25;
        int i27 = CompareWithWords1IsOneBigger(sArr3, i3, sArr3, i26, i25) > 0 ? 0 : i25;
        if (i27 == 0) {
            i6 = 0;
            SubtractWords1IsOneBigger(sArr, i, sArr3, i3, sArr3, i26, i25);
            i7 = i26;
        } else {
            i6 = 0;
            SubtractWords2IsOneBigger(sArr, i, sArr3, i26, sArr3, i3, i25);
            i7 = i26;
        }
        int i28 = i4 + i25;
        if (CompareWithWords1IsOneBigger(sArr4, i4, sArr4, i28, i25) <= 0) {
            i6 = i25;
        }
        if (i6 == 0) {
            SubtractWords1IsOneBigger(sArr2, i2, sArr4, i4, sArr4, i28, i25);
            i8 = i28;
        } else {
            SubtractWords2IsOneBigger(sArr2, i2, sArr4, i28, sArr4, i4, i25);
            i8 = i28;
        }
        int i29 = i24 << 1;
        int i30 = i25 << 1;
        int i31 = i2 + i29;
        SameSizeMultiply(sArr2, i31, sArr, i + i29, sArr, i, sArr2, i2, i25);
        short s = sArr2[i31];
        int i32 = i31 + 1;
        short s2 = sArr2[i32];
        int i33 = i + i30;
        SameSizeMultiply(sArr, i33, sArr, i, sArr3, i7, sArr4, i8, i24);
        SameSizeMultiply(sArr, i, sArr2, i2, sArr3, i3, sArr4, i4, i25);
        sArr2[i31] = s;
        sArr2[i32] = s2;
        int i34 = i + i25;
        int AddInternal6 = AddInternal(sArr, i33, sArr, i33, sArr, i34, i25);
        int AddInternal7 = AddInternal6 + AddInternal(sArr, i34, sArr, i33, sArr, i, i25);
        int i35 = i33 + i25;
        int i36 = i25 - 2;
        int AddUnevenSize = AddInternal6 + AddUnevenSize(sArr, i33, sArr, i33, i25, sArr, i35, i36);
        if (i27 == i6) {
            sArr5 = sArr;
            i9 = i36;
            AddInternal = AddUnevenSize - SubtractInternal(sArr5, i34, sArr, i34, sArr2, i31, i30);
        } else {
            i9 = i36;
            sArr5 = sArr;
            AddInternal = AddUnevenSize + AddInternal(sArr5, i34, sArr, i34, sArr2, i31, i30);
        }
        int IncrementWords2 = IncrementWords(sArr5, i33, i25, (short) AddInternal7) + AddInternal;
        if (IncrementWords2 != 0) {
            IncrementWords(sArr5, i35, i9, (short) IncrementWords2);
        }
    }

    private static void SchoolbookMultiply(short[] sArr, int i, short[] sArr2, int i2, int i3, short[] sArr3, int i4, int i5) {
        if (i3 < i5) {
            int i6 = sArr2[i2] & UShort.MAX_VALUE;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = ((sArr3[i4 + i8] & UShort.MAX_VALUE) * i6) + i7;
                sArr[i + i8] = (short) i9;
                i7 = (i9 >> 16) & 65535;
            }
            sArr[i + i5] = (short) i7;
            for (int i10 = 1; i10 < i3; i10++) {
                int i11 = i + i10;
                int i12 = sArr2[i2 + i10] & UShort.MAX_VALUE;
                int i13 = 0;
                int i14 = 0;
                int i15 = i11;
                while (i13 < i5) {
                    int i16 = ((sArr3[i4 + i13] & UShort.MAX_VALUE) * i12) + i14 + (sArr[i15] & UShort.MAX_VALUE);
                    sArr[i15] = (short) i16;
                    i14 = (i16 >> 16) & 65535;
                    i13++;
                    i15++;
                }
                sArr[i11 + i5] = (short) i14;
            }
            return;
        }
        int i17 = sArr3[i4] & UShort.MAX_VALUE;
        int i18 = 0;
        for (int i19 = 0; i19 < i3; i19++) {
            int i20 = ((sArr2[i2 + i19] & UShort.MAX_VALUE) * i17) + i18;
            sArr[i + i19] = (short) i20;
            i18 = (i20 >> 16) & 65535;
        }
        sArr[i + i3] = (short) i18;
        for (int i21 = 1; i21 < i5; i21++) {
            int i22 = i + i21;
            int i23 = sArr3[i4 + i21] & UShort.MAX_VALUE;
            int i24 = 0;
            int i25 = 0;
            int i26 = i22;
            while (i24 < i3) {
                int i27 = ((sArr2[i2 + i24] & UShort.MAX_VALUE) * i23) + i25 + (sArr[i26] & UShort.MAX_VALUE);
                sArr[i26] = (short) i27;
                i25 = (i27 >> 16) & 65535;
                i24++;
                i26++;
            }
            sArr[i22 + i3] = (short) i25;
        }
    }

    private static void SchoolbookMultiplySameLengthEven(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4) {
        long j;
        short s = sArr3[i3];
        short s2 = UShort.MAX_VALUE;
        long j2 = s & UShort.MAX_VALUE;
        long j3 = sArr3[i3 + 1];
        long j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
        char c = 16;
        long j5 = j2 | ((j3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16);
        int i5 = 0;
        long j6 = 0;
        while (true) {
            j = 4294967295L;
            if (i5 >= i4) {
                break;
            }
            int i6 = i2 + i5;
            char c2 = c;
            long j7 = j5;
            long j8 = (j7 + j6) * ((sArr2[i6] & s2) | ((sArr2[i6 + 1] & WebSocketProtocol.PAYLOAD_SHORT_MAX) << c2));
            int i7 = i + i5;
            sArr[i7] = (short) j8;
            sArr[i7 + 1] = (short) (j8 >> c2);
            j6 = (j8 >> 32) & 4294967295L;
            i5 += 2;
            s2 = s2;
            c = c2;
            j5 = j7;
        }
        char c3 = c;
        short s3 = s2;
        int i8 = i + i4;
        sArr[i8] = (short) j6;
        sArr[i8 + 1] = (short) (j6 >> c3);
        for (int i9 = 2; i9 < i4; i9 += 2) {
            int i10 = i + i9;
            int i11 = i3 + i9;
            long j9 = (sArr3[i11] & s3) | ((sArr3[i11 + 1] & j4) << c3);
            int i12 = i10;
            int i13 = 0;
            long j10 = 0;
            while (i13 < i4) {
                int i14 = i2 + i13;
                long j11 = j4;
                long j12 = j;
                long j13 = ((j10 + j9) * ((sArr2[i14] & s3) | ((sArr2[i14 + 1] & j11) << c3))) + (sArr[i12] & s3) + ((sArr[r1] & s3) << 16);
                sArr[i12] = (short) j13;
                sArr[i12 + 1] = (short) (j13 >> c3);
                j10 = (j13 >> 32) & j12;
                i13 += 2;
                i12 += 2;
                j4 = j11;
                j = j12;
            }
            int i15 = i10 + i4;
            sArr[i15] = (short) j10;
            sArr[i15 + 1] = (short) (j10 >> c3);
        }
    }

    private static void SchoolbookMultiplySameLengthOdd(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4) {
        long j;
        long j2;
        long j3;
        long j4;
        short s = sArr3[i3];
        short s2 = UShort.MAX_VALUE;
        long j5 = s & UShort.MAX_VALUE;
        long j6 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
        char c = 16;
        long j7 = j5 | (i4 > 1 ? (sArr3[i3 + 1] & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16 : 0L);
        int i5 = 0;
        long j8 = 0;
        while (true) {
            j = 4294967295L;
            if (i5 >= i4) {
                break;
            }
            char c2 = c;
            short s3 = s2;
            long j9 = j7;
            long j10 = sArr2[i2 + i5] & s2;
            int i6 = i5 + 1;
            if (i6 < i4) {
                j4 = j6;
                j10 |= sArr2[r17 + 1] & j4;
            } else {
                j4 = j6;
            }
            long j11 = (j9 + j8) * j10;
            int i7 = i + i5;
            sArr[i7] = (short) j11;
            if (i6 < i4) {
                sArr[i7 + 1] = (short) (j11 >> c2);
            }
            j8 = (j11 >> 32) & 4294967295L;
            i5 += 2;
            s2 = s3;
            c = c2;
            j7 = j9;
            j6 = j4;
        }
        char c3 = c;
        short s4 = s2;
        long j12 = j6;
        int i8 = i + i4;
        sArr[i8] = (short) j8;
        if (i4 > 1) {
            sArr[i8 + 1] = (short) (j8 >> c3);
        }
        int i9 = 2;
        while (i9 < i4) {
            int i10 = i + i9;
            long j13 = sArr3[i3 + i9] & s4;
            int i11 = i9 + 1;
            if (i11 < i4) {
                j13 |= (sArr3[r3 + 1] & j12) << c3;
            }
            int i12 = i10;
            int i13 = 0;
            long j14 = 0;
            while (i13 < i4) {
                long j15 = sArr2[i2 + i13] & s4;
                int i14 = i13 + 1;
                if (i14 < i4) {
                    j2 = j;
                    j15 |= (sArr2[r13 + 1] & j12) << c3;
                } else {
                    j2 = j;
                }
                long j16 = ((j14 + j13) * j15) + (sArr[i12] & s4);
                if (i14 < i4) {
                    long j17 = j16 + ((sArr[r7] & s4) << 16);
                    sArr[i12] = (short) j17;
                    sArr[i12 + 1] = (short) (j17 >> c3);
                    j3 = (j17 >> 32) & j2;
                } else {
                    sArr[i12] = (short) j16;
                    j3 = j16 >> c3;
                }
                j14 = j3;
                i13 += 2;
                i12 += 2;
                j = j2;
            }
            long j18 = j;
            int i15 = i10 + i4;
            sArr[i15] = (short) j14;
            if (i11 < i4) {
                sArr[i15 + 1] = (short) (j14 >> c3);
            }
            i9 += 2;
            j = j18;
        }
    }

    private static void SchoolbookSquare(short[] sArr, int i, short[] sArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            int i6 = sArr2[i2 + i4] & UShort.MAX_VALUE;
            short s = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = ((sArr2[i2 + i7] & UShort.MAX_VALUE) * i6) + (s & UShort.MAX_VALUE);
                if (i4 != 0) {
                    i8 += sArr[i5 + i7] & UShort.MAX_VALUE;
                }
                sArr[i5 + i7] = (short) i8;
                s = (short) (i8 >> 16);
            }
            sArr[i5 + i3] = s;
        }
    }

    private static short ShiftWordsLeftByBits(short[] sArr, int i, int i2, int i3) {
        int i4 = 0;
        if (i3 != 0) {
            int i5 = 16 - i3;
            int i6 = 0;
            while (i4 < i2) {
                short s = sArr[i];
                sArr[i] = (short) (i6 | (s << i3));
                i6 = (65535 & s) >> i5;
                i4++;
                i++;
            }
            i4 = i6;
        }
        return (short) i4;
    }

    private static void ShiftWordsLeftByWords(short[] sArr, int i, int i2, int i3) {
        int min = Math.min(i3, i2);
        if (min != 0) {
            for (int i4 = i2 - 1; i4 >= min; i4--) {
                int i5 = i + i4;
                sArr[i5] = sArr[i5 - min];
            }
            Arrays.fill(sArr, i, min + i, (short) 0);
        }
    }

    private static short ShiftWordsRightByBits(short[] sArr, int i, int i2, int i3) {
        short s = 0;
        if (i3 != 0) {
            while (i2 > 0) {
                int i4 = (i + i2) - 1;
                int i5 = sArr[i4] & UShort.MAX_VALUE;
                sArr[i4] = (short) ((s & UShort.MAX_VALUE) | ((i5 >> i3) & 65535));
                s = (short) (i5 << (16 - i3));
                i2--;
            }
        }
        return s;
    }

    private static short ShiftWordsRightByBitsSignExtend(short[] sArr, int i, int i2, int i3) {
        int i4 = 16 - i3;
        short s = (short) (65535 << i4);
        if (i3 != 0) {
            while (i2 > 0) {
                int i5 = (i + i2) - 1;
                int i6 = sArr[i5] & UShort.MAX_VALUE;
                sArr[i5] = (short) ((s & UShort.MAX_VALUE) | (i6 >> i3));
                s = (short) (i6 << i4);
                i2--;
            }
        }
        return s;
    }

    private static void ShiftWordsRightByWordsSignExtend(short[] sArr, int i, int i2, int i3) {
        int min = Math.min(i3, i2);
        if (min != 0) {
            for (int i4 = 0; i4 + min < i2; i4++) {
                int i5 = i + i4;
                sArr[i5] = sArr[i5 + min];
            }
            int i6 = (i2 - min) + i;
            for (int i7 = 0; i7 < min; i7++) {
                sArr[i6 + i7] = -1;
            }
        }
    }

    private static short[] ShortenArray(short[] sArr, int i) {
        if (sArr.length <= 32 || i >= sArr.length || sArr.length - i < 16) {
            return sArr;
        }
        short[] sArr2 = new short[i];
        System.arraycopy(sArr, 0, sArr2, 0, Math.min(i, sArr.length));
        return sArr2;
    }

    private static EInteger[] SlowSgcd(EInteger eInteger, EInteger eInteger2) {
        EInteger[] eIntegerArr = {eInteger, eInteger2, FromInt32(1), FromInt32(0), FromInt32(0), FromInt32(1)};
        EInteger Add = Max(BL(eInteger), BL(eInteger2)).ShiftRight(1).Add(1);
        while (BL(eIntegerArr[0].Subtract(eIntegerArr[1])).compareTo(Add) > 0) {
            SDivStep(eIntegerArr, Add);
        }
        return eIntegerArr;
    }

    private EInteger[] SqrtRemInternal(boolean z) {
        EInteger eInteger;
        if (signum() <= 0) {
            return new EInteger[]{FromInt32(0), FromInt32(0)};
        }
        if (equals(FromInt32(1))) {
            return new EInteger[]{FromInt32(1), FromInt32(0)};
        }
        if (CanFitInInt32()) {
            int ToInt32Checked = ToInt32Checked();
            int ToInt32Checked2 = 1 << ((GetUnsignedBitLengthAsEInteger().ToInt32Checked() + 1) / 2);
            while (true) {
                int i = ((ToInt32Checked / ToInt32Checked2) + ToInt32Checked2) >> 1;
                if (i >= ToInt32Checked2) {
                    break;
                }
                ToInt32Checked2 = i;
            }
            if (z) {
                return new EInteger[]{FromInt32(ToInt32Checked2), FromInt32(ToInt32Checked - (ToInt32Checked2 * ToInt32Checked2))};
            }
            return new EInteger[]{FromInt32(ToInt32Checked2), null};
        }
        EInteger Divide = GetUnsignedBitLengthAsEInteger().Add(1).Divide(2);
        int i2 = this.wordCount;
        if (i2 < 4) {
            FromInt32(0);
            EInteger ShiftLeft = FromInt32(1).ShiftLeft(Divide);
            while (true) {
                EInteger ShiftRight = Divide(ShiftLeft).Add(ShiftLeft).ShiftRight(1);
                if (ShiftRight == null || ShiftRight.compareTo(ShiftLeft) >= 0) {
                    break;
                }
                ShiftLeft = ShiftRight;
            }
            return !z ? new EInteger[]{ShiftLeft, null} : new EInteger[]{ShiftLeft, Subtract(ShiftLeft.Multiply(ShiftLeft))};
        }
        int i3 = (i2 >> 2) + ((i2 & 3) > 0 ? 1 : 0);
        long j = i3 * 16;
        EInteger FromInt64 = FromInt64(j);
        long j2 = j * 4;
        EInteger GetUnsignedBitLengthAsEInteger = GetUnsignedBitLengthAsEInteger();
        boolean isEven = GetUnsignedBitLengthAsEInteger.isEven();
        EInteger FromInt32 = FromInt32(0);
        if (GetUnsignedBitLengthAsEInteger.compareTo(FromInt64(j2).Subtract(1)) < 0) {
            if (!isEven) {
                j2--;
            }
            FromInt32 = FromInt64(j2).Subtract(GetUnsignedBitLengthAsEInteger);
            eInteger = ShiftLeft(FromInt32);
        } else {
            eInteger = this;
        }
        short[] sArr = eInteger.words;
        short[] sArr2 = new short[i3];
        short[] sArr3 = new short[i3];
        int i4 = i3 * 2;
        short[] sArr4 = new short[i4];
        System.arraycopy(sArr, 0, sArr2, 0, i3);
        System.arraycopy(sArr, i3, sArr3, 0, i3);
        System.arraycopy(sArr, i4, sArr4, 0, i4);
        EInteger eInteger2 = new EInteger(CountWords(sArr2), sArr2, false);
        EInteger eInteger3 = new EInteger(CountWords(sArr3), sArr3, false);
        EInteger[] SqrtRemInternal = new EInteger(CountWords(sArr4), sArr4, false).SqrtRemInternal(true);
        EInteger[] DivRem = SqrtRemInternal[1].ShiftLeft(FromInt64).Add(eInteger3).DivRem(SqrtRemInternal[0].ShiftLeft(1));
        EInteger Add = SqrtRemInternal[0].ShiftLeft(FromInt64).Add(DivRem[0]);
        EInteger Add2 = DivRem[1].ShiftLeft(FromInt64).Add(eInteger2);
        EInteger eInteger4 = DivRem[0];
        EInteger Subtract = Add2.Subtract(eInteger4.Multiply(eInteger4));
        if (Subtract.signum() < 0) {
            if (z) {
                Subtract = Subtract.Add(Add.ShiftLeft(1)).Subtract(FromInt32(1));
            }
            Add = Add.Subtract(FromInt32(1));
        }
        EInteger[] eIntegerArr = new EInteger[2];
        eIntegerArr[0] = Add.ShiftRight(FromInt32.ShiftRight(1));
        if (z) {
            if (FromInt32.isZero()) {
                eIntegerArr[1] = Subtract;
                return eIntegerArr;
            }
            EInteger eInteger5 = eIntegerArr[0];
            eIntegerArr[1] = Subtract(eInteger5.Multiply(eInteger5));
        }
        return eIntegerArr;
    }

    private static EInteger SubquadraticGCD(EInteger eInteger, EInteger eInteger2) {
        EInteger MaxBitLength = MaxBitLength(eInteger, eInteger2);
        EInteger[] eIntegerArr = {eInteger, eInteger2};
        while (MaxBitLength.compareTo(48) >= 0) {
            EInteger ShiftRight = MaxBitLength.ShiftRight(1);
            EInteger ShiftRight2 = eIntegerArr[0].ShiftRight(ShiftRight);
            EInteger LowBits = eIntegerArr[0].LowBits(ShiftRight);
            EInteger ShiftRight3 = eIntegerArr[1].ShiftRight(ShiftRight);
            EInteger LowBits2 = eIntegerArr[1].LowBits(ShiftRight);
            EInteger[] HalfGCD = HalfGCD(ShiftRight2, ShiftRight3);
            if (HalfGCD == null) {
                break;
            }
            EInteger Subtract = LowBits.Multiply(HalfGCD[5]).Subtract(LowBits2.Multiply(HalfGCD[3]));
            EInteger Subtract2 = LowBits2.Multiply(HalfGCD[2]).Subtract(LowBits.Multiply(HalfGCD[4]));
            EInteger Add = Subtract.Add(HalfGCD[0].ShiftLeft(ShiftRight));
            EInteger Add2 = Subtract2.Add(HalfGCD[1].ShiftLeft(ShiftRight));
            if (Add.signum() < 0 || Add2.signum() < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("eia=" + eIntegerArr[0] + "\n");
                sb.append("eib=" + eIntegerArr[1] + "\n");
                for (int i = 0; i < 6; i++) {
                    StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(i, "hgcd_", "=");
                    m0m.append(HalfGCD[i].ToRadixString(16));
                    sb.append(m0m.toString());
                    sb.append("\n");
                }
                Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Internal error\n", sb));
                return null;
            }
            if (eIntegerArr[0].equals(Add) && eIntegerArr[1].equals(Add2)) {
                break;
            }
            MaxBitLength = MaxBitLength(Add, Add2);
            eIntegerArr[0] = Add;
            eIntegerArr[1] = Add2;
        }
        return BaseGcd(eIntegerArr[0], eIntegerArr[1]);
    }

    private static int SubtractInternal(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4) {
        int i5 = 0;
        boolean z = (i4 & 1) != 0;
        if (z) {
            i4--;
        }
        int i6 = 0;
        while (i5 < i4) {
            int i7 = sArr3[i3] & UShort.MAX_VALUE;
            int i8 = sArr3[i3 + 1] & UShort.MAX_VALUE;
            int i9 = sArr2[i2] & UShort.MAX_VALUE;
            int i10 = 65535 & sArr2[i2 + 1];
            int i11 = (i9 - i7) - ((i6 >> 31) & 1);
            int i12 = i + 1;
            sArr[i] = (short) i11;
            int i13 = (i10 - i8) - ((i11 >> 31) & 1);
            i += 2;
            sArr[i12] = (short) i13;
            i2 += 2;
            i3 += 2;
            i5 += 2;
            i6 = i13;
        }
        if (z) {
            i6 = ((sArr2[i2] & UShort.MAX_VALUE) - (sArr3[i3] & UShort.MAX_VALUE)) - ((i6 >> 31) & 1);
            sArr[i] = (short) i6;
        }
        return (i6 >> 31) & 1;
    }

    private static int SubtractWords1IsOneBigger(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4) {
        int i5 = i4 - 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            i7 = ((sArr2[i2] & UShort.MAX_VALUE) - (65535 & sArr3[i3])) - ((i7 >> 31) & 1);
            sArr[i] = (short) i7;
            i2++;
            i3++;
            i6++;
            i++;
        }
        int i8 = (sArr2[i2] & UShort.MAX_VALUE) - ((i7 >> 31) & 1);
        sArr[i] = (short) i8;
        return (i8 >> 31) & 1;
    }

    private static int SubtractWords2IsOneBigger(short[] sArr, int i, short[] sArr2, int i2, short[] sArr3, int i3, int i4) {
        int i5 = i4 - 1;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            i7 = ((sArr2[i2] & UShort.MAX_VALUE) - (65535 & sArr3[i3])) - ((i7 >> 31) & 1);
            sArr[i] = (short) i7;
            i2++;
            i3++;
            i6++;
            i++;
        }
        int i8 = 0 - ((sArr3[i3] & UShort.MAX_VALUE) - ((i7 >> 31) & 1));
        sArr[i] = (short) i8;
        return (i8 >> 31) & 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15, types: [int] */
    /* JADX WARN: Type inference failed for: r9v11, types: [short] */
    /* JADX WARN: Type inference failed for: r9v12, types: [int] */
    /* JADX WARN: Type inference failed for: r9v14 */
    private void ToRadixStringGeneral(StringBuilder sb, int i) {
        short s;
        short s2;
        short s3;
        short s4;
        int i2 = this.wordCount;
        if (i2 >= 100) {
            StringBuilder sb2 = new StringBuilder();
            long j = (estimatedHalfDigitCountPerWord[i] * this.wordCount) / 16;
            EInteger[] DivRem = DivRem(i == 10 ? NumberUtility.FindPowerOfTen(j) : i == 5 ? NumberUtility.FindPowerOfFiveFromBig(FromInt64(j)) : FromInt32(i).Pow(FromInt64(j)));
            DivRem[0].ToRadixStringGeneral(sb, i);
            DivRem[1].ToRadixStringGeneral(sb2, i);
            for (int length = sb2.length(); length < j; length++) {
                sb.append('0');
            }
            sb.append(sb2.toString());
            return;
        }
        if (i != 10) {
            short[] sArr = new short[i2];
            System.arraycopy(this.words, 0, sArr, 0, i2);
            while (i2 != 0 && sArr[i2 - 1] == 0) {
                i2--;
            }
            char[] cArr = new char[(i2 << 4) + 1];
            int i3 = 0;
            while (true) {
                if (i2 == 0) {
                    break;
                }
                if (i2 == 1 && (s2 = sArr[0]) > 0 && s2 <= 32767) {
                    while (s2 != 0) {
                        int i4 = s2 / i;
                        cArr[i3] = Digits.charAt(s2 - (i4 * i));
                        s2 = i4;
                        i3++;
                    }
                } else if (i2 != 2 || (s = sArr[1]) <= 0 || s > Short.MAX_VALUE) {
                    int i5 = i2;
                    short s5 = 0;
                    while (true) {
                        int i6 = i5 - 1;
                        if (i5 <= 0) {
                            break;
                        }
                        int i7 = (sArr[i6] & UShort.MAX_VALUE) | (s5 << 16);
                        int i8 = i7 / i;
                        sArr[i6] = (short) i8;
                        s5 = (short) (i7 - (i8 * i));
                        i5 = i6;
                    }
                    while (i2 != 0 && sArr[i2 - 1] == 0) {
                        i2--;
                    }
                    cArr[i3] = Digits.charAt(s5);
                    i3++;
                } else {
                    int i9 = (sArr[0] & UShort.MAX_VALUE) | ((s & UShort.MAX_VALUE) << 16);
                    while (i9 != 0) {
                        int i10 = i9 / i;
                        cArr[i3] = Digits.charAt(i9 - (i10 * i));
                        i9 = i10;
                        i3++;
                    }
                }
            }
            ReverseChars(cArr, 0, i3);
            sb.append(cArr, 0, i3);
            return;
        }
        if (CanFitInInt64()) {
            sb.append(FastInteger.LongToString(ToInt64Unchecked()));
            return;
        }
        int i11 = this.wordCount;
        short[] sArr2 = new short[i11];
        System.arraycopy(this.words, 0, sArr2, 0, i11);
        while (i11 != 0 && sArr2[i11 - 1] == 0) {
            i11--;
        }
        char[] cArr2 = new char[(i11 << 4) + 1];
        int i12 = 0;
        while (true) {
            if (i11 == 0) {
                break;
            }
            if (i11 == 1 && (s4 = sArr2[0]) > 0 && s4 <= Short.MAX_VALUE) {
                while (s4 != 0) {
                    ?? r15 = (s4 * 26215) >> 18;
                    cArr2[i12] = Digits.charAt(s4 - (r15 * 10));
                    s4 = r15;
                    i12++;
                }
            } else if (i11 != 2 || (s3 = sArr2[1]) <= 0 || s3 > Short.MAX_VALUE) {
                int i13 = i11;
                short s6 = 0;
                while (true) {
                    int i14 = i13 - 1;
                    if (i13 <= 0) {
                        break;
                    }
                    int i15 = (sArr2[i14] & UShort.MAX_VALUE) | (s6 << 16);
                    int i16 = i15 / 10000;
                    sArr2[i14] = (short) i16;
                    s6 = (short) (i15 - (i16 * 10000));
                    i13 = i14;
                }
                while (i11 != 0 && sArr2[i11 - 1] == 0) {
                    i11--;
                }
                int i17 = (s6 * 3277) >> 15;
                cArr2[i12] = Digits.charAt(s6 - (i17 * 10));
                int i18 = (i17 * 3277) >> 15;
                cArr2[i12 + 1] = Digits.charAt(i17 - (i18 * 10));
                int i19 = (i18 * 3277) >> 15;
                int i20 = i12 + 3;
                cArr2[i12 + 2] = Digits.charAt(i18 - (i19 * 10));
                i12 += 4;
                cArr2[i20] = Digits.charAt(i19);
            } else {
                int i21 = (sArr2[0] & UShort.MAX_VALUE) | ((s3 & UShort.MAX_VALUE) << 16);
                while (i21 != 0) {
                    int i22 = i21 < 81920 ? ((52429 * i21) >> 19) & 8191 : i21 / 10;
                    cArr2[i12] = Digits.charAt(i21 - (i22 * 10));
                    i21 = i22;
                    i12++;
                }
            }
        }
        ReverseChars(cArr2, 0, i12);
        sb.append(cArr2, 0, i12);
    }

    private static void Toom3(short[] sArr, int i, short[] sArr2, int i2, int i3, short[] sArr3, int i4, int i5) {
        EInteger Multiply;
        EInteger Multiply2;
        EInteger eInteger;
        EInteger eInteger2;
        EInteger eInteger3;
        EInteger Add;
        int max = Math.max(i3, i5);
        int i6 = (((max % 3) + 2) / 3) + (max / 3);
        EInteger ShiftLeft = FromInt32(i6).ShiftLeft(4);
        int i7 = i2 + i3;
        EInteger MakeEInteger = MakeEInteger(sArr2, i7, i2, i6);
        EInteger MakeEInteger2 = MakeEInteger(sArr2, i7, i2 + i6, i6);
        int i8 = i6 * 2;
        EInteger MakeEInteger3 = MakeEInteger(sArr2, i7, i2 + i8, i6);
        int i9 = 1;
        if (sArr2 == sArr3 && i2 == i4 && i3 == i5) {
            eInteger = MakeEInteger.Multiply(MakeEInteger);
            eInteger2 = MakeEInteger3.Multiply(MakeEInteger3);
            EInteger Add2 = MakeEInteger3.Add(MakeEInteger);
            EInteger Add3 = Add2.Add(MakeEInteger2);
            EInteger Subtract = Add2.Subtract(MakeEInteger2);
            EInteger Add4 = MakeEInteger3.ShiftLeft(2).Add(MakeEInteger2.ShiftLeft(1)).Add(MakeEInteger);
            eInteger3 = Add3.Multiply(Add3);
            Multiply = Subtract.Multiply(Subtract);
            Multiply2 = Add4.Multiply(Add4);
        } else {
            int i10 = i4 + i5;
            EInteger MakeEInteger4 = MakeEInteger(sArr3, i10, i4, i6);
            EInteger MakeEInteger5 = MakeEInteger(sArr3, i10, i4 + i6, i6);
            EInteger MakeEInteger6 = MakeEInteger(sArr3, i10, i4 + i8, i6);
            EInteger Multiply3 = MakeEInteger.Multiply(MakeEInteger4);
            EInteger Multiply4 = MakeEInteger3.Multiply(MakeEInteger6);
            EInteger Add5 = MakeEInteger3.Add(MakeEInteger);
            EInteger Add6 = MakeEInteger6.Add(MakeEInteger4);
            EInteger Multiply5 = Add5.Add(MakeEInteger2).Multiply(Add6.Add(MakeEInteger5));
            Multiply = Add5.Subtract(MakeEInteger2).Multiply(Add6.Subtract(MakeEInteger5));
            i9 = 1;
            Multiply2 = MakeEInteger3.ShiftLeft(2).Add(MakeEInteger2.ShiftLeft(1)).Add(MakeEInteger).Multiply(MakeEInteger6.ShiftLeft(2).Add(MakeEInteger5.ShiftLeft(1)).Add(MakeEInteger4));
            eInteger = Multiply3;
            eInteger2 = Multiply4;
            eInteger3 = Multiply5;
        }
        EInteger ShiftLeft2 = eInteger2.ShiftLeft(i9);
        EInteger Multiply6 = ShiftLeft2.Multiply(6);
        EInteger Multiply7 = eInteger.Multiply(3);
        EInteger Divide = Multiply7.Subtract(Multiply6).Subtract(eInteger3.Multiply(3)).Subtract(Multiply).Add(Multiply2).Divide(6);
        EInteger ShiftRight = eInteger3.Add(Multiply).Subtract(eInteger.ShiftLeft(1)).Subtract(ShiftLeft2).ShiftRight(1);
        EInteger Divide2 = eInteger3.Multiply(6).Add(Multiply6).Subtract(Multiply2).Subtract(Multiply).Subtract(Multiply).Subtract(Multiply7).Divide(6);
        if (ShiftLeft.compareTo(1879048192) < 0) {
            int i11 = i6 << 4;
            Add = eInteger.Add(Divide2.ShiftLeft(i11)).Add(ShiftRight.ShiftLeft(i11 * 2)).Add(Divide.ShiftLeft(i11 * 3)).Add(eInteger2.ShiftLeft(i11 * 4));
        } else {
            Add = eInteger.Add(Divide2.ShiftLeft(ShiftLeft)).Add(ShiftRight.ShiftLeft(ShiftLeft.Multiply(2))).Add(Divide.ShiftLeft(ShiftLeft.Multiply(3))).Add(eInteger2.ShiftLeft(ShiftLeft.Multiply(4)));
        }
        int i12 = i3 + i5;
        Arrays.fill(sArr, i, i + i12, (short) 0);
        System.arraycopy(Add.words, 0, sArr, i, Math.min(i12, Add.wordCount));
    }

    private static void Toom4(short[] sArr, int i, short[] sArr2, int i2, int i3, short[] sArr3, int i4, int i5) {
        int i6;
        EInteger eInteger;
        EInteger eInteger2;
        EInteger eInteger3;
        EInteger eInteger4;
        EInteger eInteger5;
        EInteger eInteger6;
        EInteger eInteger7;
        EInteger eInteger8;
        EInteger Add;
        int max = Math.max(i3, i5);
        int i7 = (((max % 4) + 3) / 4) + (max / 4);
        EInteger ShiftLeft = FromInt32(i7).ShiftLeft(4);
        int i8 = i2 + i3;
        EInteger MakeEInteger = MakeEInteger(sArr2, i8, i2, i7);
        EInteger MakeEInteger2 = MakeEInteger(sArr2, i8, i2 + i7, i7);
        int i9 = i7 * 2;
        EInteger MakeEInteger3 = MakeEInteger(sArr2, i8, i2 + i9, i7);
        int i10 = i7 * 3;
        EInteger MakeEInteger4 = MakeEInteger(sArr2, i8, i2 + i10, i7);
        if (sArr2 == sArr3 && i2 == i4 && i3 == i5) {
            EInteger Multiply = MakeEInteger.Multiply(MakeEInteger);
            EInteger Multiply2 = MakeEInteger4.Multiply(MakeEInteger4);
            EInteger ShiftLeft2 = MakeEInteger3.ShiftLeft(1);
            EInteger ShiftLeft3 = MakeEInteger2.ShiftLeft(2);
            EInteger ShiftLeft4 = MakeEInteger.ShiftLeft(3);
            EInteger Add2 = MakeEInteger2.Add(MakeEInteger4);
            EInteger Add3 = MakeEInteger.Add(MakeEInteger3);
            EInteger Add4 = MakeEInteger4.Add(ShiftLeft2).Add(ShiftLeft3).Add(ShiftLeft4);
            EInteger Add5 = MakeEInteger4.Negate().Add(ShiftLeft2).Subtract(ShiftLeft3).Add(ShiftLeft4);
            EInteger Add6 = Add3.Add(Add2);
            EInteger Subtract = Add3.Subtract(Add2);
            EInteger Add7 = MakeEInteger.Add(MakeEInteger4.ShiftLeft(3)).Add(MakeEInteger3.ShiftLeft(2)).Add(MakeEInteger2.ShiftLeft(1));
            EInteger Multiply3 = Add4.Multiply(Add4);
            EInteger Multiply4 = Add5.Multiply(Add5);
            EInteger Multiply5 = Add6.Multiply(Add6);
            eInteger3 = Subtract.Multiply(Subtract);
            i6 = i7;
            eInteger = ShiftLeft;
            eInteger2 = Multiply4;
            eInteger4 = Multiply;
            eInteger5 = Multiply2;
            eInteger7 = Multiply5;
            eInteger8 = Add7.Multiply(Add7);
            eInteger6 = Multiply3;
        } else {
            int i11 = i4 + i5;
            EInteger MakeEInteger5 = MakeEInteger(sArr3, i11, i4, i7);
            EInteger MakeEInteger6 = MakeEInteger(sArr3, i11, i4 + i7, i7);
            EInteger MakeEInteger7 = MakeEInteger(sArr3, i11, i4 + i9, i7);
            EInteger MakeEInteger8 = MakeEInteger(sArr3, i11, i4 + i10, i7);
            EInteger Multiply6 = MakeEInteger.Multiply(MakeEInteger5);
            EInteger Multiply7 = MakeEInteger4.Multiply(MakeEInteger8);
            EInteger ShiftLeft5 = MakeEInteger3.ShiftLeft(1);
            EInteger ShiftLeft6 = MakeEInteger2.ShiftLeft(2);
            EInteger ShiftLeft7 = MakeEInteger.ShiftLeft(3);
            i6 = i7;
            EInteger ShiftLeft8 = MakeEInteger7.ShiftLeft(1);
            EInteger ShiftLeft9 = MakeEInteger6.ShiftLeft(2);
            EInteger ShiftLeft10 = MakeEInteger5.ShiftLeft(3);
            EInteger Add8 = MakeEInteger2.Add(MakeEInteger4);
            eInteger = ShiftLeft;
            EInteger Add9 = MakeEInteger.Add(MakeEInteger3);
            EInteger Add10 = MakeEInteger6.Add(MakeEInteger8);
            EInteger Add11 = MakeEInteger5.Add(MakeEInteger7);
            EInteger Multiply8 = MakeEInteger4.Add(ShiftLeft5).Add(ShiftLeft6).Add(ShiftLeft7).Multiply(MakeEInteger8.Add(ShiftLeft8).Add(ShiftLeft9).Add(ShiftLeft10));
            EInteger Multiply9 = MakeEInteger4.Negate().Add(ShiftLeft5).Subtract(ShiftLeft6).Add(ShiftLeft7).Multiply(MakeEInteger8.Negate().Add(ShiftLeft8).Subtract(ShiftLeft9).Add(ShiftLeft10));
            EInteger Multiply10 = Add9.Add(Add8).Multiply(Add11.Add(Add10));
            EInteger Multiply11 = Add9.Subtract(Add8).Multiply(Add11.Subtract(Add10));
            EInteger Multiply12 = MakeEInteger.Add(MakeEInteger4.ShiftLeft(3)).Add(MakeEInteger3.ShiftLeft(2)).Add(MakeEInteger2.ShiftLeft(1)).Multiply(MakeEInteger5.Add(MakeEInteger8.ShiftLeft(3)).Add(MakeEInteger7.ShiftLeft(2)).Add(MakeEInteger6.ShiftLeft(1)));
            eInteger2 = Multiply9;
            eInteger3 = Multiply11;
            eInteger4 = Multiply6;
            eInteger5 = Multiply7;
            eInteger6 = Multiply8;
            eInteger7 = Multiply10;
            eInteger8 = Multiply12;
        }
        EInteger[] eIntegerArr = {eInteger4, eInteger6, eInteger2, eInteger7, eInteger3, eInteger8, eInteger5};
        EInteger eInteger9 = eInteger4;
        EInteger eInteger10 = eInteger5;
        EInteger Interpolate = Interpolate(eIntegerArr, new int[]{-90, 5, -3, -60, 20, 2, -90}, 180);
        EInteger Interpolate2 = Interpolate(eIntegerArr, new int[]{BranchError.ERR_BRANCH_TASK_TIMEOUT, 1, 1, -4, -4, 0, 6}, 24);
        EInteger Interpolate3 = Interpolate(eIntegerArr, new int[]{45, -1, 0, 27, -7, -1, 45}, 18);
        EInteger Interpolate4 = Interpolate(eIntegerArr, new int[]{96, -1, -1, 16, 16, 0, -30}, 24);
        EInteger Interpolate5 = Interpolate(eIntegerArr, new int[]{-360, 5, 3, BranchError.ERR_BRANCH_TASK_TIMEOUT, -40, 8, -360}, 180);
        EInteger eInteger11 = eInteger;
        if (eInteger11.compareTo(1879048192) < 0) {
            int i12 = i6 << 4;
            Add = eInteger9.Add(Interpolate.ShiftLeft(i12)).Add(Interpolate2.ShiftLeft(i12 * 2)).Add(Interpolate3.ShiftLeft(i12 * 3)).Add(Interpolate4.ShiftLeft(i12 * 4)).Add(Interpolate5.ShiftLeft(i12 * 5)).Add(eInteger10.ShiftLeft(i12 * 6));
        } else {
            Add = eInteger9.Add(Interpolate.ShiftLeft(eInteger11)).Add(Interpolate2.ShiftLeft(eInteger11.Multiply(2))).Add(Interpolate3.ShiftLeft(eInteger11.Multiply(3))).Add(Interpolate4.ShiftLeft(eInteger11.Multiply(4))).Add(Interpolate5.ShiftLeft(eInteger11.Multiply(5))).Add(eInteger10.ShiftLeft(eInteger11.Multiply(6)));
        }
        int i13 = i3 + i5;
        Arrays.fill(sArr, i, i + i13, (short) 0);
        System.arraycopy(Add.words, 0, sArr, i, Math.min(i13, Add.wordCount));
    }

    private static void TwosComplement(short[] sArr, int i, int i2) {
        DecrementWords(sArr, i, i2, (short) 1);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            sArr[i4] = (short) (~sArr[i4]);
        }
    }

    private static int WordsCompare(short[] sArr, int i, int i2, short[] sArr2, int i3, int i4) {
        if (i2 == 0) {
            return i4 == 0 ? 0 : -1;
        }
        if (i4 == 0) {
            return 1;
        }
        if (i2 != i4) {
            return i2 > i4 ? 1 : -1;
        }
        if (i2 == 1 && sArr[i] == sArr2[i3]) {
            return 0;
        }
        int i5 = (i + i2) - 1;
        int i6 = (i3 + i2) - 1;
        while (true) {
            int i7 = i2 - 1;
            if (i2 == 0) {
                return 0;
            }
            int i8 = sArr[i5] & UShort.MAX_VALUE;
            int i9 = 65535 & sArr2[i6];
            if (i8 > i9) {
                return 1;
            }
            if (i8 < i9) {
                return -1;
            }
            i5--;
            i6--;
            i2 = i7;
        }
    }

    private static boolean WordsEqual(short[] sArr, int i, short[] sArr2, int i2) {
        if (i != i2) {
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (sArr[i3] != sArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    private static boolean WordsIsEven(short[] sArr, int i) {
        return i == 0 || (sArr[0] & 1) == 0;
    }

    private static int WordsShiftRightEight(short[] sArr, int i) {
        if (i == 0) {
            return i;
        }
        int i2 = i - 1;
        int i3 = 0;
        int i4 = i2;
        while (i4 >= 0) {
            short s = sArr[i4];
            int i5 = i3 | ((s & 65280) >> 8);
            int i6 = (s << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK;
            sArr[i4] = (short) i5;
            i4--;
            i3 = i6;
        }
        return sArr[i2] == 0 ? i - 1 : i;
    }

    private static int WordsShiftRightFour(short[] sArr, int i) {
        if (i == 0) {
            return i;
        }
        int i2 = i - 1;
        int i3 = 0;
        int i4 = i2;
        while (i4 >= 0) {
            short s = sArr[i4];
            sArr[i4] = (short) (i3 | ((65520 & s) >> 4));
            i4--;
            i3 = (s << 12) & 61440;
        }
        return sArr[i2] == 0 ? i - 1 : i;
    }

    private static int WordsShiftRightOne(short[] sArr, int i) {
        if (i == 0) {
            return i;
        }
        int i2 = i - 1;
        int i3 = 0;
        int i4 = i2;
        while (i4 >= 0) {
            short s = sArr[i4];
            sArr[i4] = (short) (i3 | ((65534 & s) >> 1));
            i4--;
            i3 = (s << 15) & 32768;
        }
        return sArr[i2] == 0 ? i - 1 : i;
    }

    private static int WordsShiftRightTwo(short[] sArr, int i) {
        if (i == 0) {
            return i;
        }
        int i2 = i - 1;
        int i3 = 0;
        int i4 = i2;
        while (i4 >= 0) {
            short s = sArr[i4];
            sArr[i4] = (short) (i3 | ((65532 & s) >> 2));
            i4--;
            i3 = (s << 14) & 49152;
        }
        return sArr[i2] == 0 ? i - 1 : i;
    }

    private static int WordsSubtract(short[] sArr, int i, short[] sArr2, int i2) {
        short SubtractInternal = (short) SubtractInternal(sArr, 0, sArr, 0, sArr2, 0, i2);
        if (SubtractInternal != 0) {
            DecrementWords(sArr, i2, i - i2, SubtractInternal);
        }
        while (i != 0 && sArr[i - 1] == 0) {
            i--;
        }
        return i;
    }

    private static long WordsToLongUnchecked(short[] sArr, int i) {
        if (i == 0) {
            return 0L;
        }
        int i2 = sArr[0] & UShort.MAX_VALUE;
        if (i > 1) {
            i2 |= (sArr[1] & UShort.MAX_VALUE) << 16;
        }
        if (i <= 2) {
            return i2 & 4294967295L;
        }
        int i3 = sArr[2] & UShort.MAX_VALUE;
        if (i > 3) {
            i3 |= (sArr[3] & UShort.MAX_VALUE) << 16;
        }
        return (i2 & 4294967295L) | (i3 << 32);
    }

    private static String WordsToString(short[] sArr, int i, int i2) {
        while (i2 != 0 && sArr[(i + i2) - 1] == 0) {
            i2--;
        }
        if (i2 == 0) {
            return "\"0\"";
        }
        short[] sArr2 = new short[i2];
        System.arraycopy(sArr, i, sArr2, 0, i2);
        return DeviceConfigConstants.DOUBLE_QUOTE + new EInteger(i2, sArr2, false).toString() + DeviceConfigConstants.DOUBLE_QUOTE;
    }

    private static String WordsToString2(short[] sArr, int i, int i2, short[] sArr2, int i3, int i4) {
        int i5 = i2 + i4;
        short[] sArr3 = new short[i5];
        System.arraycopy(sArr, i, sArr3, 0, i2);
        System.arraycopy(sArr2, i3, sArr3, i2, i4);
        while (i5 != 0 && sArr3[i5 - 1] == 0) {
            i5--;
        }
        if (i5 == 0) {
            return "\"0\"";
        }
        return DeviceConfigConstants.DOUBLE_QUOTE + new EInteger(i5, sArr3, false).toString() + DeviceConfigConstants.DOUBLE_QUOTE;
    }

    private static String WordsToStringHex(short[] sArr, int i, int i2) {
        while (i2 != 0 && sArr[(i + i2) - 1] == 0) {
            i2--;
        }
        if (i2 == 0) {
            return "\"0\"";
        }
        short[] sArr2 = new short[i2];
        System.arraycopy(sArr, i, sArr2, 0, i2);
        return DeviceConfigConstants.DOUBLE_QUOTE + new EInteger(i2, sArr2, false).ToRadixString(16) + DeviceConfigConstants.DOUBLE_QUOTE;
    }

    private static void XorWords(short[] sArr, short[] sArr2, short[] sArr3, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = (short) (sArr2[i2] ^ sArr3[i2]);
        }
    }

    public static EInteger getOne() {
        return ValueOne;
    }

    public static EInteger getTen() {
        return ValueTen;
    }

    public static EInteger getZero() {
        return ValueZero;
    }

    public EInteger Abs() {
        int i = this.wordCount;
        return (i == 0 || !this.negative) ? this : new EInteger(i, this.words, false);
    }

    public EInteger Add(EInteger eInteger) {
        short[] sArr;
        boolean z;
        boolean z2;
        short[] sArr2;
        int IncrementWords;
        boolean z3;
        EInteger eInteger2 = this;
        EInteger eInteger3 = eInteger;
        if (eInteger3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bigintAugend");
            return null;
        }
        int i = eInteger2.wordCount;
        if (i == 0) {
            return eInteger3;
        }
        int i2 = eInteger3.wordCount;
        if (i2 == 0) {
            return eInteger2;
        }
        if (i2 == 1 && i == 1) {
            boolean z4 = eInteger2.negative;
            boolean z5 = eInteger3.negative;
            short[] sArr3 = eInteger2.words;
            if (z4 != z5) {
                int i3 = sArr3[0] & UShort.MAX_VALUE;
                int i4 = eInteger3.words[0] & UShort.MAX_VALUE;
                return i3 == i4 ? FromInt32(0) : i3 > i4 ? new EInteger(1, new short[]{(short) (i3 - i4), 0}, z4) : new EInteger(1, new short[]{(short) (i4 - i3), 0}, !z4);
            }
            int i5 = (sArr3[0] & UShort.MAX_VALUE) + (eInteger3.words[0] & UShort.MAX_VALUE);
            short s = (short) i5;
            int i6 = i5 >> 16;
            return new EInteger(i6 == 0 ? 1 : 2, new short[]{s, (short) i6}, z4);
        }
        boolean z6 = eInteger2.negative;
        if ((!z6) != (!eInteger3.negative)) {
            if (z6) {
                eInteger3 = eInteger2;
                eInteger2 = eInteger3;
            }
            int i7 = eInteger2.wordCount;
            int i8 = eInteger3.wordCount;
            short[] sArr4 = new short[Math.max(eInteger2.words.length, eInteger3.words.length)];
            if (i7 == i8) {
                if (Compare(eInteger2.words, 0, eInteger3.words, 0, i7) >= 0) {
                    sArr = sArr4;
                    SubtractInternal(sArr, 0, eInteger2.words, 0, eInteger3.words, 0, i7);
                    z = false;
                } else {
                    sArr = sArr4;
                    SubtractInternal(sArr, 0, eInteger3.words, 0, eInteger2.words, 0, i7);
                    z = true;
                }
            } else if (i7 > i8) {
                int SubtractInternal = SubtractInternal(sArr4, 0, eInteger2.words, 0, eInteger3.words, 0, i8);
                sArr = sArr4;
                int i9 = i7 - i8;
                System.arraycopy(eInteger2.words, i8, sArr, i8, i9);
                DecrementWords(sArr, i8, i9, (short) SubtractInternal);
                z = false;
            } else {
                sArr = sArr4;
                short SubtractInternal2 = (short) SubtractInternal(sArr, 0, eInteger3.words, 0, eInteger2.words, 0, i7);
                int i10 = i8 - i7;
                System.arraycopy(eInteger3.words, i7, sArr, i7, i10);
                DecrementWords(sArr, i7, i10, SubtractInternal2);
                z = true;
            }
            int CountWords = CountWords(sArr);
            return CountWords == 0 ? FromInt32(0) : new EInteger(CountWords, ShortenArray(sArr, CountWords), z);
        }
        if (i2 <= 2 && i <= 2 && ((i < 2 || (eInteger2.words[1] >> 15) == 0) && (i2 < 2 || (eInteger3.words[1] >> 15) == 0))) {
            short[] sArr5 = eInteger2.words;
            int i11 = sArr5[0] & UShort.MAX_VALUE;
            if (i == 2) {
                i11 |= (sArr5[1] & UShort.MAX_VALUE) << 16;
            }
            short[] sArr6 = eInteger3.words;
            int i12 = sArr6[0] & UShort.MAX_VALUE;
            if (i2 == 2) {
                i12 |= (sArr6[1] & UShort.MAX_VALUE) << 16;
            }
            int i13 = i11 + i12;
            short[] sArr7 = {(short) (i13 & 65535), (short) ((i13 >> 16) & 65535)};
            return new EInteger(sArr7[1] == 0 ? 1 : 2, sArr7, z6);
        }
        if (i2 <= 2 && i <= 2) {
            short[] sArr8 = eInteger2.words;
            int i14 = sArr8[0] & UShort.MAX_VALUE;
            if (i == 2) {
                i14 |= (sArr8[1] & UShort.MAX_VALUE) << 16;
            }
            short[] sArr9 = eInteger3.words;
            int i15 = sArr9[0] & UShort.MAX_VALUE;
            if (i2 == 2) {
                i15 |= (sArr9[1] & UShort.MAX_VALUE) << 16;
            }
            long j = (i14 & 4294967295L) + (i15 & 4294967295L);
            if ((j >> 32) == 0) {
                int i16 = (int) j;
                short[] sArr10 = {(short) (i16 & 65535), (short) ((i16 >> 16) & 65535)};
                return new EInteger(sArr10[1] == 0 ? 1 : 2, sArr10, z6);
            }
        }
        short[] sArr11 = new short[Math.max(eInteger2.words.length, eInteger3.words.length)];
        int max = Math.max(i, i2);
        if (i == i2) {
            int AddInternal = AddInternal(sArr11, 0, eInteger2.words, 0, eInteger3.words, 0, i);
            sArr2 = sArr11;
            IncrementWords = AddInternal;
            z2 = true;
        } else {
            short[] sArr12 = eInteger2.words;
            if (i > i2) {
                z2 = true;
                int AddInternal2 = AddInternal(sArr11, 0, sArr12, 0, eInteger3.words, 0, i2);
                int i17 = i - i2;
                System.arraycopy(eInteger2.words, i2, sArr11, i2, i17);
                if (AddInternal2 != 0) {
                    AddInternal2 = IncrementWords(sArr11, i2, i17, (short) AddInternal2);
                }
                IncrementWords = AddInternal2;
                sArr2 = sArr11;
            } else {
                z2 = true;
                sArr2 = sArr11;
                int AddInternal3 = AddInternal(sArr2, 0, sArr12, 0, eInteger3.words, 0, i);
                int i18 = i2 - i;
                System.arraycopy(eInteger3.words, i, sArr2, i, i18);
                IncrementWords = AddInternal3 != 0 ? IncrementWords(sArr2, i, i18, (short) AddInternal3) : AddInternal3;
            }
        }
        if (IncrementWords != 0) {
            sArr2 = CleanGrow(sArr2, max + 1);
            sArr2[max] = (short) IncrementWords;
            z3 = false;
        } else {
            z3 = z2;
        }
        int CountWords2 = CountWords(sArr2);
        if (CountWords2 == 0) {
            return FromInt32(0);
        }
        if (z3) {
            sArr2 = ShortenArray(sArr2, CountWords2);
        }
        return new EInteger(CountWords2, sArr2, eInteger2.negative);
    }

    public EInteger And(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER);
            return null;
        }
        if (eInteger.isZero() || isZero()) {
            return FromInt32(0);
        }
        if (!this.negative && !eInteger.negative) {
            int min = Math.min(this.wordCount, eInteger.wordCount);
            int i = this.wordCount;
            short[] sArr = i == min ? this.words : eInteger.words;
            if (i == min) {
                this = eInteger;
            }
            short[] sArr2 = this.words;
            short[] sArr3 = new short[min];
            for (int i2 = 0; i2 < min; i2++) {
                sArr3[i2] = (short) (sArr[i2] & sArr2[i2]);
            }
            int CountWords = CountWords(sArr3);
            return CountWords == 0 ? FromInt32(0) : new EInteger(CountWords, sArr3, false);
        }
        int i3 = this.wordCount;
        short[] sArr4 = new short[i3];
        System.arraycopy(this.words, 0, sArr4, 0, i3);
        int i4 = eInteger.wordCount;
        short[] sArr5 = new short[i4];
        System.arraycopy(eInteger.words, 0, sArr5, 0, i4);
        boolean z = this.negative;
        boolean z2 = eInteger.negative;
        short[] CleanGrow = CleanGrow(sArr4, Math.max(i3, i4));
        short[] CleanGrow2 = CleanGrow(sArr5, Math.max(CleanGrow.length, i4));
        if (z) {
            TwosComplement(CleanGrow, 0, CleanGrow.length);
        }
        if (z2) {
            TwosComplement(CleanGrow2, 0, CleanGrow2.length);
        }
        boolean z3 = z & z2;
        AndWords(CleanGrow, CleanGrow, CleanGrow2, CleanGrow.length);
        if (z3) {
            TwosComplement(CleanGrow, 0, CleanGrow.length);
        }
        int CountWords2 = CountWords(CleanGrow);
        return CountWords2 == 0 ? FromInt32(0) : new EInteger(CountWords2, CleanGrow, z3);
    }

    public EInteger AndNot(EInteger eInteger) {
        if (eInteger != null) {
            return And(eInteger.Not());
        }
        Single$$ExternalSyntheticBUOutline0.m$1("second");
        return null;
    }

    @Deprecated
    public int AsInt32Checked() {
        return ToInt32Checked();
    }

    @Deprecated
    public int AsInt32Unchecked() {
        return ToInt32Unchecked();
    }

    @Deprecated
    public long AsInt64Checked() {
        return ToInt64Checked();
    }

    @Deprecated
    public long AsInt64Unchecked() {
        return ToInt64Unchecked();
    }

    public boolean CanFitInInt32() {
        int i = this.wordCount;
        if (i > 2) {
            return false;
        }
        if (i == 2) {
            short[] sArr = this.words;
            short s = sArr[1];
            if ((32768 & s) != 0) {
                return this.negative && s == Short.MIN_VALUE && sArr[0] == 0;
            }
        }
        return true;
    }

    public boolean CanFitInInt64() {
        int i = this.wordCount;
        if (i > 4) {
            return false;
        }
        if (i == 4) {
            short[] sArr = this.words;
            short s = sArr[3];
            if ((32768 & s) != 0) {
                return this.negative && s == Short.MIN_VALUE && sArr[2] == 0 && sArr[1] == 0 && sArr[0] == 0;
            }
        }
        return true;
    }

    public EInteger Decrement() {
        return Subtract(FromInt32(1));
    }

    public EInteger[] DivRem(EInteger eInteger) {
        int FastDivideAndRemainderTwo;
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("divisor");
            return null;
        }
        int i = this.wordCount;
        int i2 = eInteger.wordCount;
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        if (i < i2) {
            return new EInteger[]{FromInt32(0), this};
        }
        if (i2 == 1) {
            short[] sArr = new short[i];
            short s = eInteger.words[0];
            if (s != 2) {
                short[] sArr2 = this.words;
                FastDivideAndRemainderTwo = s != 10 ? FastDivideAndRemainder(sArr, 0, sArr2, 0, i, s) & UShort.MAX_VALUE : FastDivideAndRemainderTen(sArr, 0, sArr2, 0, i);
            } else {
                FastDivideAndRemainderTwo = FastDivideAndRemainderTwo(sArr, 0, this.words, 0, i);
            }
            int i3 = this.wordCount;
            while (i3 != 0 && sArr[i3 - 1] == 0) {
                i3--;
            }
            if (i3 == 0) {
                return new EInteger[]{FromInt32(0), this};
            }
            EInteger eInteger2 = new EInteger(i3, ShortenArray(sArr, i3), eInteger.negative ^ this.negative);
            if (this.negative) {
                FastDivideAndRemainderTwo = -FastDivideAndRemainderTwo;
            }
            return new EInteger[]{eInteger2, FromInt64(FastDivideAndRemainderTwo)};
        }
        if (CanFitInInt32() && eInteger.CanFitInInt32()) {
            long ToInt32Checked = ToInt32Checked();
            long ToInt32Checked2 = eInteger.ToInt32Checked();
            if (ToInt32Checked != SieveCacheKt.NodeMetaAndPreviousMask || ToInt32Checked2 != -1) {
                long j = ToInt32Checked / ToInt32Checked2;
                return new EInteger[]{FromInt64(j), FromInt64(ToInt32Checked - (ToInt32Checked2 * j))};
            }
        } else if (CanFitInInt64() && eInteger.CanFitInInt64()) {
            long ToInt64Checked = ToInt64Checked();
            long ToInt64Checked2 = eInteger.ToInt64Checked();
            if (ToInt64Checked != Long.MIN_VALUE || ToInt64Checked2 != -1) {
                long j2 = ToInt64Checked / ToInt64Checked2;
                return new EInteger[]{FromInt64(j2), FromInt64(ToInt64Checked - (ToInt64Checked2 * j2))};
            }
        }
        short[] sArr3 = new short[i2];
        short[] sArr4 = new short[(i - i2) + 1];
        GeneralDivide(this.words, 0, this.wordCount, eInteger.words, 0, eInteger.wordCount, sArr4, 0, sArr3, 0);
        int CountWords = CountWords(sArr3);
        int CountWords2 = CountWords(sArr4);
        short[] ShortenArray = ShortenArray(sArr3, CountWords);
        return new EInteger[]{CountWords2 == 0 ? FromInt32(0) : new EInteger(CountWords2, ShortenArray(sArr4, CountWords2), this.negative ^ eInteger.negative), CountWords == 0 ? FromInt32(0) : new EInteger(CountWords, ShortenArray, this.negative)};
    }

    public EInteger Divide(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bigintDivisor");
            return null;
        }
        int i = this.wordCount;
        int i2 = eInteger.wordCount;
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        if (i < i2) {
            return FromInt32(0);
        }
        if (i <= 2 && i2 <= 2 && CanFitInInt32() && eInteger.CanFitInInt32()) {
            int ToInt32Checked = ToInt32Checked();
            int ToInt32Checked2 = eInteger.ToInt32Checked();
            if (ToInt32Checked != Integer.MIN_VALUE || ToInt32Checked2 != -1) {
                return FromInt32(ToInt32Checked / ToInt32Checked2);
            }
        }
        if (i <= 4 && i2 <= 4 && CanFitInInt64() && eInteger.CanFitInInt64()) {
            long ToInt64Checked = ToInt64Checked();
            long ToInt64Checked2 = eInteger.ToInt64Checked();
            if (ToInt64Checked != Long.MIN_VALUE || ToInt64Checked2 != -1) {
                return FromInt64(ToInt64Checked / ToInt64Checked2);
            }
        }
        if (i2 != 1) {
            short[] sArr = new short[(i - i2) + 1];
            GeneralDivide(this.words, 0, this.wordCount, eInteger.words, 0, eInteger.wordCount, sArr, 0, null, 0);
            int CountWords = CountWords(sArr);
            return CountWords != 0 ? new EInteger(CountWords, ShortenArray(sArr, CountWords), this.negative ^ eInteger.negative) : FromInt32(0);
        }
        short[] sArr2 = this.words;
        short[] sArr3 = new short[sArr2.length];
        int i3 = this.wordCount;
        FastDivide(sArr3, sArr2, i, eInteger.words[0]);
        while (i3 != 0 && sArr3[i3 - 1] == 0) {
            i3--;
        }
        return i3 != 0 ? new EInteger(i3, sArr3, this.negative ^ eInteger.negative) : FromInt32(0);
    }

    public EInteger Eqv(EInteger eInteger) {
        if (eInteger != null) {
            return XorNot(eInteger);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("second");
        return null;
    }

    public EInteger Gcd(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bigintSecond");
            return null;
        }
        if (isZero()) {
            return eInteger.Abs();
        }
        EInteger Abs = Abs();
        if (eInteger.isZero()) {
            return Abs;
        }
        EInteger Abs2 = eInteger.Abs();
        return (Abs2.equals(FromInt32(1)) || Abs.equals(Abs2)) ? Abs2 : Abs.equals(FromInt32(1)) ? Abs : Math.max(Abs.wordCount, Abs2.wordCount) > 12 ? SubquadraticGCD(Abs, Abs2) : BaseGcd(Abs, Abs2);
    }

    @Deprecated
    public int GetDigitCount() {
        long GetDigitCountAsInt64 = GetDigitCountAsInt64();
        if (GetDigitCountAsInt64 < SieveCacheKt.NodeMetaAndPreviousMask || GetDigitCountAsInt64 > SieveCacheKt.NodeLinkMask) {
            throw new ArithmeticException();
        }
        return (int) GetDigitCountAsInt64;
    }

    public EInteger GetDigitCountAsEInteger() {
        return FromInt64(GetDigitCountAsInt64());
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x011d, code lost:
    
        return r5 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02ea, code lost:
    
        r3 = r4[r24] & kotlin.UShort.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02ee, code lost:
    
        if (r3 < 10000) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02f4, code lost:
    
        if (r3 < 1000) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02fa, code lost:
    
        if (r3 < 100) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02fe, code lost:
    
        if (r3 < 10) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01f2, code lost:
    
        r5 = r5 + r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ee, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e8, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e2, code lost:
    
        r5 = r5 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ec, code lost:
    
        if (r3 >= 10) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long GetDigitCountAsInt64() {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EInteger.GetDigitCountAsInt64():long");
    }

    @Deprecated
    public int GetLowBit() {
        return GetLowBitAsEInteger().ToInt32Checked();
    }

    public EInteger GetLowBitAsEInteger() {
        return FromInt64(GetLowBitAsInt64());
    }

    public long GetLowBitAsInt64() {
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < this.wordCount; i2++) {
            int i3 = this.words[i2] & UShort.MAX_VALUE;
            if (i3 != 0) {
                if (((i3 << 15) & 65535) == 0) {
                    i = 1;
                    if (((i3 << 14) & 65535) == 0) {
                        i = ((i3 << 13) & 65535) != 0 ? 2 : ((i3 << 12) & 65535) != 0 ? 3 : ((i3 << 11) & 65535) != 0 ? 4 : ((i3 << 10) & 65535) != 0 ? 5 : ((i3 << 9) & 65535) != 0 ? 6 : ((i3 << 8) & 65535) != 0 ? 7 : ((i3 << 7) & 65535) != 0 ? 8 : ((i3 << 6) & 65535) != 0 ? 9 : ((i3 << 5) & 65535) != 0 ? 10 : ((i3 << 4) & 65535) != 0 ? 11 : ((i3 << 3) & 65535) != 0 ? 12 : ((i3 << 2) & 65535) != 0 ? 13 : ((i3 << 1) & 65535) != 0 ? 14 : 15;
                    }
                }
                return j + i;
            }
            j += 16;
        }
        return -1L;
    }

    public boolean GetSignedBit(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bigIndex");
            return false;
        }
        if (eInteger.signum() < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("bigIndex");
            return false;
        }
        if (!this.negative) {
            return GetUnsignedBit(eInteger);
        }
        if (eInteger.CanFitInInt32()) {
            return GetSignedBit(eInteger.ToInt32Checked());
        }
        EInteger Divide = eInteger.Divide(16);
        if (Divide.compareTo(this.words.length) >= 0) {
            return true;
        }
        long j = 0;
        while (Divide.compareTo(FromInt64(j)) > 0 && this.words[(int) j] == 0) {
            j++;
        }
        int ToInt32Checked = Divide.ToInt32Checked();
        short s = this.words[ToInt32Checked];
        if (j == ToInt32Checked) {
            s = (short) (s - 1);
        }
        return ((((short) (~s)) >> eInteger.Remainder(16).ToInt32Checked()) & 1) != 0;
    }

    @Deprecated
    public int GetSignedBitLength() {
        return GetSignedBitLengthAsEInteger().ToInt32Checked();
    }

    public EInteger GetSignedBitLengthAsEInteger() {
        return FromInt64(GetSignedBitLengthAsInt64());
    }

    public long GetSignedBitLengthAsInt64() {
        int i;
        int i2 = this.wordCount;
        if (i2 == 0) {
            return 0L;
        }
        if (this.negative) {
            EInteger Abs = Abs();
            long GetSignedBitLengthAsInt64 = Abs.GetSignedBitLengthAsInt64();
            return Abs.isPowerOfTwo() ? GetSignedBitLengthAsInt64 - 1 : GetSignedBitLengthAsInt64;
        }
        int i3 = this.words[i2 - 1] & UShort.MAX_VALUE;
        if (i3 != 0) {
            if ((i3 >> 8) == 0) {
                i3 <<= 8;
                i = 8;
            } else {
                i = 16;
            }
            if ((i3 >> 12) == 0) {
                i3 <<= 4;
                i -= 4;
            }
            if ((i3 >> 14) == 0) {
                i3 <<= 2;
                i -= 2;
            }
            if ((i3 >> 15) == 0) {
                i--;
            }
        } else {
            i = 0;
        }
        return ((i2 - 1) * 16) + i;
    }

    public boolean GetUnsignedBit(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bigIndex");
            return false;
        }
        if (eInteger.signum() < 0) {
            XML$$ExternalSyntheticBUOutline0.m("bigIndex(", eInteger, ") is less than 0");
            return false;
        }
        if (eInteger.CanFitInInt32()) {
            return GetUnsignedBit(eInteger.ToInt32Checked());
        }
        if (eInteger.Divide(16).compareTo(this.words.length) < 0) {
            return false;
        }
        return ((this.words[eInteger.ShiftRight(4).ToInt32Checked()] >> eInteger.Remainder(16).ToInt32Checked()) & 1) != 0;
    }

    @Deprecated
    public int GetUnsignedBitLength() {
        return GetUnsignedBitLengthAsEInteger().ToInt32Checked();
    }

    public EInteger GetUnsignedBitLengthAsEInteger() {
        return FromInt64(GetUnsignedBitLengthAsInt64());
    }

    public long GetUnsignedBitLengthAsInt64() {
        int i;
        int i2 = this.wordCount;
        if (i2 == 0) {
            return 0L;
        }
        int i3 = this.words[i2 - 1] & UShort.MAX_VALUE;
        long j = (i2 - 1) << 4;
        if (i3 == 0) {
            return j;
        }
        if ((i3 >> 8) == 0) {
            i3 <<= 8;
            i = 8;
        } else {
            i = 16;
        }
        if ((i3 >> 12) == 0) {
            i3 <<= 4;
            i -= 4;
        }
        if ((i3 >> 14) == 0) {
            i3 <<= 2;
            i -= 2;
        }
        if ((i3 >> 15) == 0) {
            i--;
        }
        return j + i;
    }

    public EInteger Imp(EInteger eInteger) {
        return OrNot(eInteger);
    }

    public EInteger Increment() {
        return Add(FromInt32(1));
    }

    public EInteger LowBits(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bigBitCount");
            return null;
        }
        if (eInteger.signum() < 0) {
            CodecsKt$$ExternalSyntheticBUOutline0.m(eInteger.signum(), "\"bigBitCount.signum()\" (", ") is not greater or equal to 0");
            return null;
        }
        if (eInteger.signum() == 0 || signum() == 0) {
            return FromInt32(0);
        }
        if (signum() > 0) {
            if (GetUnsignedBitLengthAsEInteger().compareTo(eInteger) > 0) {
                if (eInteger.CanFitInInt32()) {
                    return LowBits(eInteger.ToInt32Checked());
                }
            }
            return this;
        }
        if (this.negative) {
            return And(FromInt32(1).ShiftLeft(eInteger).Subtract(1));
        }
        EInteger Divide = eInteger.Add(15).Divide(16);
        if (FromInt32(this.wordCount).compareTo(Divide) >= 0) {
            long ToInt32Checked = Divide.ToInt32Checked();
            if (ToInt32Checked == 0) {
                return FromInt32(0);
            }
            int i = (int) ToInt32Checked;
            int ToInt32Checked2 = eInteger.Remainder(16).ToInt32Checked();
            Math.min(this.wordCount, i);
            short[] sArr = new short[i];
            short[] sArr2 = this.words;
            if (ToInt32Checked2 == 0) {
                System.arraycopy(sArr2, 0, sArr, 0, i);
            } else {
                int i2 = i - 1;
                System.arraycopy(sArr2, 0, sArr, 0, i2);
                sArr[i2] = (short) (this.words[i2] & ((short) ((1 << ToInt32Checked2) - 1)));
            }
            int CountWords = CountWords(sArr);
            return CountWords == 0 ? FromInt32(0) : new EInteger(CountWords, sArr, false);
        }
        return this;
    }

    public EInteger Mod(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("divisor");
            return null;
        }
        if (eInteger.signum() >= 0) {
            EInteger Remainder = Remainder(eInteger);
            return Remainder.signum() < 0 ? eInteger.Add(Remainder) : Remainder;
        }
        Duration$$ExternalSyntheticBUOutline0.m("Divisor is negative");
        return null;
    }

    public EInteger ModPow(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("pow");
            return null;
        }
        if (eInteger2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("mod");
            return null;
        }
        if (eInteger.signum() < 0) {
            XML$$ExternalSyntheticBUOutline0.m("pow(", eInteger, ") is less than 0");
            return null;
        }
        if (eInteger2.signum() <= 0) {
            XML$$ExternalSyntheticBUOutline0.m("mod(", eInteger2, ") is not greater than 0");
            return null;
        }
        EInteger FromInt32 = FromInt32(1);
        while (!eInteger.isZero()) {
            if (!eInteger.isEven()) {
                FromInt32 = FromInt32.Multiply(this).Mod(eInteger2);
            }
            eInteger = eInteger.ShiftRight(1);
            if (!eInteger.isZero()) {
                this = this.Multiply(this).Mod(eInteger2);
            }
        }
        return FromInt32;
    }

    public EInteger Multiply(EInteger eInteger) {
        int i;
        short[] sArr;
        int i2;
        int i3;
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bigintMult");
            return null;
        }
        int i4 = this.wordCount;
        boolean z = false;
        if (i4 == 0 || (i = eInteger.wordCount) == 0) {
            return FromInt32(0);
        }
        if (i4 == 1 && this.words[0] == 1) {
            return this.negative ? eInteger.Negate() : eInteger;
        }
        if (i == 1 && eInteger.words[0] == 1) {
            return eInteger.negative ? Negate() : this;
        }
        if (i4 == 1) {
            if (i == 1) {
                int i5 = (this.words[0] & UShort.MAX_VALUE) * (eInteger.words[0] & UShort.MAX_VALUE);
                short[] sArr2 = {(short) (i5 & 65535), (short) ((i5 >> 16) & 65535)};
                return new EInteger(sArr2[1] != 0 ? 2 : 1, sArr2, this.negative ^ eInteger.negative);
            }
            i2 = i + 1;
            sArr = new short[i2];
            sArr[i] = LinearMultiply(sArr, 0, eInteger.words, 0, this.words[0], i);
        } else if (i == 1) {
            int i6 = i4 + 1;
            short[] sArr3 = new short[i6];
            sArr3[i4] = LinearMultiply(sArr3, 0, this.words, 0, eInteger.words[0], i4);
            sArr = sArr3;
            i2 = i6;
        } else {
            boolean equals = equals(eInteger);
            int i7 = this.wordCount;
            if (equals) {
                int i8 = i7 + i7;
                sArr = new short[i8];
                RecursiveSquare(sArr, 0, new short[i8], 0, this.words, 0, i7);
                z = true;
                i2 = i8;
            } else if (i7 > 10 || (i3 = eInteger.wordCount) > 10) {
                int i9 = eInteger.wordCount;
                int i10 = i7 + i9;
                sArr = new short[i10];
                AsymmetricMultiply(sArr, 0, new short[i10], 0, this.words, 0, i7, eInteger.words, 0, i9);
                z = true;
                i2 = i10;
            } else {
                i2 = i7 + i3;
                sArr = new short[i2];
                SchoolbookMultiply(sArr, 0, this.words, 0, i7, eInteger.words, 0, i3);
            }
        }
        while (i2 != 0 && sArr[i2 - 1] == 0) {
            i2--;
        }
        if (z) {
            sArr = ShortenArray(sArr, i2);
        }
        return new EInteger(i2, sArr, this.negative ^ eInteger.negative);
    }

    public EInteger Negate() {
        int i = this.wordCount;
        return i == 0 ? this : new EInteger(i, this.words, !this.negative);
    }

    public EInteger Not() {
        int i = this.wordCount;
        if (i == 0) {
            return FromInt32(-1);
        }
        short[] sArr = new short[i];
        System.arraycopy(this.words, 0, sArr, 0, i);
        if (this.negative) {
            TwosComplement(sArr, 0, i);
        }
        NotWords(sArr, i);
        if (this.negative) {
            TwosComplement(sArr, 0, i);
        }
        boolean z = !this.negative;
        int CountWords = CountWords(sArr);
        return CountWords == 0 ? FromInt32(0) : new EInteger(CountWords, sArr, z);
    }

    public EInteger Or(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("second");
            return null;
        }
        int i = this.wordCount;
        if (i == 0) {
            return eInteger;
        }
        int i2 = eInteger.wordCount;
        if (i2 == 0) {
            return this;
        }
        if (!this.negative && !eInteger.negative) {
            int min = Math.min(i, i2);
            int max = Math.max(this.wordCount, eInteger.wordCount);
            int i3 = this.wordCount;
            short[] sArr = i3 == min ? this.words : eInteger.words;
            if (i3 == min) {
                this = eInteger;
            }
            short[] sArr2 = this.words;
            short[] sArr3 = new short[max];
            for (int i4 = 0; i4 < min; i4++) {
                sArr3[i4] = (short) (sArr[i4] | sArr2[i4]);
            }
            System.arraycopy(sArr2, min, sArr3, min, max - min);
            return new EInteger(max, sArr3, false);
        }
        short[] sArr4 = new short[i];
        System.arraycopy(this.words, 0, sArr4, 0, i);
        int i5 = eInteger.wordCount;
        short[] sArr5 = new short[i5];
        System.arraycopy(eInteger.words, 0, sArr5, 0, i5);
        boolean z = this.negative;
        boolean z2 = eInteger.negative;
        short[] CleanGrow = CleanGrow(sArr4, Math.max(i, i5));
        short[] CleanGrow2 = CleanGrow(sArr5, Math.max(CleanGrow.length, i5));
        if (z) {
            TwosComplement(CleanGrow, 0, CleanGrow.length);
        }
        if (z2) {
            TwosComplement(CleanGrow2, 0, CleanGrow2.length);
        }
        boolean z3 = z | z2;
        OrWords(CleanGrow, CleanGrow, CleanGrow2, CleanGrow.length);
        if (z3) {
            TwosComplement(CleanGrow, 0, CleanGrow.length);
        }
        int CountWords = CountWords(CleanGrow);
        return CountWords == 0 ? FromInt32(0) : new EInteger(CountWords, CleanGrow, z3);
    }

    public EInteger OrNot(EInteger eInteger) {
        if (eInteger != null) {
            return Or(eInteger.Not());
        }
        Single$$ExternalSyntheticBUOutline0.m$1("second");
        return null;
    }

    public EInteger Pow(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("bigPower");
            return null;
        }
        if (eInteger.signum() < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("bigPower is negative");
            return null;
        }
        if (eInteger.signum() == 0) {
            return FromInt32(1);
        }
        if (eInteger.compareTo(1) == 0 || isZero() || compareTo(1) == 0) {
            return this;
        }
        if (compareTo(-1) == 0) {
            return eInteger.isEven() ? FromInt32(1) : this;
        }
        EInteger GetUnsignedBitLengthAsEInteger = GetUnsignedBitLengthAsEInteger();
        if (!isPowerOfTwo()) {
            GetUnsignedBitLengthAsEInteger.Subtract(1);
        }
        if (eInteger.CanFitInInt32()) {
            return Pow(eInteger.ToInt32Checked());
        }
        EInteger FromInt32 = FromInt32(1);
        EInteger Pow = Pow(Integer.MAX_VALUE);
        while (!eInteger.CanFitInInt32()) {
            FromInt32 = FromInt32.Multiply(Pow);
            eInteger = eInteger.Subtract(Integer.MAX_VALUE);
        }
        int ToInt32Checked = eInteger.ToInt32Checked();
        return ToInt32Checked == Integer.MAX_VALUE ? FromInt32.Multiply(Pow) : FromInt32.Multiply(Pow(ToInt32Checked));
    }

    @Deprecated
    public EInteger PowBigIntVar(EInteger eInteger) {
        if (eInteger != null) {
            return Pow(eInteger);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("power");
        return null;
    }

    public EInteger Remainder(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("divisor");
            return null;
        }
        int i = this.wordCount;
        int i2 = eInteger.wordCount;
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        if (i >= i2) {
            if (i2 == 1) {
                int FastRemainder = FastRemainder(this.words, i, eInteger.words[0]) & UShort.MAX_VALUE;
                if (this.negative) {
                    FastRemainder = -FastRemainder;
                }
                return FromInt64(FastRemainder);
            }
            if (PositiveCompare(eInteger) >= 0) {
                short[] sArr = new short[i2];
                GeneralDivide(this.words, 0, this.wordCount, eInteger.words, 0, eInteger.wordCount, null, 0, sArr, 0);
                int CountWords = CountWords(sArr);
                return CountWords == 0 ? FromInt32(0) : new EInteger(CountWords, ShortenArray(sArr, CountWords), this.negative);
            }
        }
        return this;
    }

    public EInteger Root(EInteger eInteger) {
        if (eInteger != null) {
            return RootRemInternal(eInteger, false)[0];
        }
        Single$$ExternalSyntheticBUOutline0.m$1("root");
        return null;
    }

    public EInteger[] RootRem(EInteger eInteger) {
        if (eInteger != null) {
            return RootRemInternal(eInteger, true);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("root");
        return null;
    }

    public EInteger ShiftLeft(int i) {
        int i2;
        if (i == 0 || (i2 = this.wordCount) == 0) {
            return this;
        }
        if (i < 0) {
            return i == Integer.MIN_VALUE ? ShiftRight(1).ShiftRight(Integer.MAX_VALUE) : ShiftRight(-i);
        }
        int i3 = i >> 4;
        int i4 = i & 15;
        if (!this.negative) {
            int BitsToWords = NumberUtility.BitLength(this.words[i2 + (-1)] & UShort.MAX_VALUE) + i4 <= 16 ? i2 + i3 : BitsToWords(i) + i2;
            short[] sArr = new short[BitsToWords];
            System.arraycopy(this.words, 0, sArr, i3, i2);
            ShiftWordsLeftByBits(sArr, i3, BitsToWords - i3, i4);
            return new EInteger(BitsToWords, sArr, false);
        }
        int BitsToWords2 = BitsToWords(i) + i2;
        short[] sArr2 = new short[BitsToWords2];
        System.arraycopy(this.words, 0, sArr2, 0, i2);
        TwosComplement(sArr2, 0, BitsToWords2);
        ShiftWordsLeftByWords(sArr2, 0, i2 + i3, i3);
        ShiftWordsLeftByBits(sArr2, i3, i2 + BitsToWords(i4), i4);
        TwosComplement(sArr2, 0, BitsToWords2);
        return new EInteger(CountWords(sArr2), sArr2, true);
    }

    public EInteger ShiftRight(int i) {
        int i2;
        short[] sArr;
        int i3;
        if (i == 0 || (i2 = this.wordCount) == 0) {
            return this;
        }
        if (i < 0) {
            return i == Integer.MIN_VALUE ? ShiftLeft(1).ShiftLeft(Integer.MAX_VALUE) : ShiftLeft(-i);
        }
        int i4 = i >> 4;
        int i5 = i & 15;
        if (this.negative) {
            short[] sArr2 = this.words;
            i3 = sArr2.length;
            sArr = new short[i3];
            System.arraycopy(sArr2, 0, sArr, 0, i2);
            TwosComplement(sArr, 0, i3);
            ShiftWordsRightByWordsSignExtend(sArr, 0, i2, i4);
            if (i2 > i4) {
                ShiftWordsRightByBitsSignExtend(sArr, 0, i2 - i4, i5);
            }
            TwosComplement(sArr, 0, i3);
        } else {
            if (i4 >= i2) {
                return FromInt32(0);
            }
            short[] sArr3 = this.words;
            sArr = new short[sArr3.length];
            i3 = i2 - i4;
            System.arraycopy(sArr3, i4, sArr, 0, i3);
            if (i5 != 0) {
                ShiftWordsRightByBits(sArr, 0, i3, i5);
            }
        }
        while (i3 != 0 && sArr[i3 - 1] == 0) {
            i3--;
        }
        if (i3 == 0) {
            return FromInt32(0);
        }
        if (i4 > 2) {
            sArr = ShortenArray(sArr, i3);
        }
        return new EInteger(i3, sArr, this.negative);
    }

    public EInteger Sqrt() {
        return SqrtRemInternal(false)[0];
    }

    public EInteger[] SqrtRem() {
        return SqrtRemInternal(true);
    }

    public EInteger Subtract(EInteger eInteger) {
        if (eInteger != null) {
            return this.wordCount == 0 ? eInteger.Negate() : eInteger.wordCount == 0 ? this : Add(eInteger.Negate());
        }
        Single$$ExternalSyntheticBUOutline0.m$1("subtrahend");
        return null;
    }

    public byte ToByteChecked() {
        int ToInt32Checked = ToInt32Checked();
        if (ToInt32Checked >= 0 && ToInt32Checked <= 255) {
            return (byte) (ToInt32Checked & 255);
        }
        Duration$$ExternalSyntheticBUOutline0.m("This Object's value is out of range");
        return (byte) 0;
    }

    public byte ToByteUnchecked() {
        return (byte) (ToInt32Unchecked() & 255);
    }

    public byte[] ToBytes(boolean z) {
        int signum = signum();
        int i = 0;
        if (signum == 0) {
            return new byte[]{0};
        }
        if (signum > 0) {
            int ByteCount = ByteCount();
            int i2 = GetUnsignedBit((ByteCount * 8) - 1) ? ByteCount + 1 : ByteCount;
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i < ByteCount) {
                int i4 = z ? i : (i2 - 1) - i;
                int i5 = z ? i + 1 : (i2 - 2) - i;
                short s = this.words[i3];
                bArr[i4] = (byte) (s & 255);
                if (i5 >= 0 && i5 < i2) {
                    bArr[i5] = (byte) ((s >> 8) & 255);
                }
                i += 2;
                i3++;
            }
            return bArr;
        }
        short[] sArr = this.words;
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        TwosComplement(sArr2, 0, length);
        int i6 = length * 2;
        int i7 = length - 1;
        int i8 = i6;
        while (true) {
            if (i7 < 0) {
                break;
            }
            short s2 = sArr2[i7];
            if (s2 == -1) {
                i8 -= 2;
                i7--;
            } else if ((s2 & 65408) == 65408) {
                i8--;
            } else if ((s2 & ShortCompanionObject.MIN_VALUE) != 32768) {
                i8++;
            }
        }
        int i9 = i8 != 0 ? i8 : 1;
        byte[] bArr2 = new byte[i9];
        bArr2[z ? i9 - 1 : 0] = -1;
        int min = Math.min(i9, i6);
        int i10 = 0;
        while (i < min) {
            int i11 = z ? i : (i9 - 1) - i;
            int i12 = z ? i + 1 : (i9 - 2) - i;
            short s3 = sArr2[i10];
            bArr2[i11] = (byte) (s3 & 255);
            if (i12 >= 0 && i12 < min) {
                bArr2[i12] = (byte) ((s3 >> 8) & 255);
            }
            i += 2;
            i10++;
        }
        return bArr2;
    }

    public short ToInt16Checked() {
        int ToInt32Checked = ToInt32Checked();
        if (ToInt32Checked >= -32768 && ToInt32Checked <= 32767) {
            return (short) (ToInt32Checked & 65535);
        }
        Duration$$ExternalSyntheticBUOutline0.m("This Object's value is out of range");
        return (short) 0;
    }

    public short ToInt16Unchecked() {
        return (short) (ToInt32Unchecked() & 65535);
    }

    public int ToInt32Checked() {
        int i = this.wordCount;
        if (i == 0) {
            return 0;
        }
        if (i > 2) {
            throw new ArithmeticException();
        }
        if (i == 2) {
            short[] sArr = this.words;
            short s = sArr[1];
            if ((32768 & s) != 0) {
                if (this.negative && s == Short.MIN_VALUE && sArr[0] == 0) {
                    return Integer.MIN_VALUE;
                }
                throw new ArithmeticException();
            }
        }
        return ToInt32Unchecked();
    }

    public int ToInt32Unchecked() {
        int i = this.wordCount;
        if (i == 0) {
            return 0;
        }
        short[] sArr = this.words;
        int i2 = sArr[0] & UShort.MAX_VALUE;
        if (i > 1) {
            i2 |= (sArr[1] & UShort.MAX_VALUE) << 16;
        }
        return this.negative ? ~(i2 - 1) : i2;
    }

    public long ToInt64Checked() {
        int i = this.wordCount;
        if (i == 0) {
            return 0L;
        }
        if (i > 4) {
            throw new ArithmeticException();
        }
        if (i == 4) {
            short[] sArr = this.words;
            short s = sArr[3];
            if ((32768 & s) != 0) {
                if (this.negative && s == Short.MIN_VALUE && sArr[2] == 0 && sArr[1] == 0 && sArr[0] == 0) {
                    return Long.MIN_VALUE;
                }
                throw new ArithmeticException();
            }
        }
        return ToInt64Unchecked();
    }

    public long ToInt64Unchecked() {
        int i;
        int i2 = this.wordCount;
        if (i2 == 0) {
            return 0L;
        }
        short[] sArr = this.words;
        int i3 = sArr[0] & UShort.MAX_VALUE;
        if (i2 > 1) {
            i3 |= (sArr[1] & UShort.MAX_VALUE) << 16;
        }
        if (i2 <= 2) {
            long j = i3 & 4294967295L;
            return this.negative ? -j : j;
        }
        int i4 = sArr[2] & UShort.MAX_VALUE;
        if (i2 > 3) {
            i4 |= (sArr[3] & UShort.MAX_VALUE) << 16;
        }
        if (this.negative) {
            if (i3 == 0) {
                i = i3 - 1;
                i4--;
            } else {
                i = i3 - 1;
            }
            i3 = ~i;
            i4 = ~i4;
        }
        return (i3 & 4294967295L) | (i4 << 32);
    }

    public String ToRadixString(int i) {
        if (i < 2) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "radix(", ") is less than 2"));
            return null;
        }
        if (i > 36) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "radix(", ") is more than 36"));
            return null;
        }
        if (this.wordCount == 0) {
            return Constants.FEEDBACK_TYPE_DISLIKE;
        }
        if (i == 10) {
            if (CanFitInInt64()) {
                return FastInteger.LongToString(ToInt64Unchecked());
            }
            StringBuilder sb = new StringBuilder();
            if (this.negative) {
                sb.append('-');
            }
            Abs().ToRadixStringGeneral(sb, i);
            return sb.toString();
        }
        boolean z = true;
        if (i == 16) {
            StringBuilder sb2 = new StringBuilder();
            if (this.negative) {
                sb2.append('-');
            }
            int i2 = 0;
            int i3 = this.words[this.wordCount - 1];
            while (i2 < 4) {
                if (!z || (61440 & i3) != 0) {
                    sb2.append(Digits.charAt((i3 >> 12) & 15));
                    z = false;
                }
                i2++;
                i3 <<= 4;
            }
            for (int i4 = this.wordCount - 2; i4 >= 0; i4--) {
                int i5 = 0;
                int i6 = this.words[i4];
                while (i5 < 4) {
                    sb2.append(Digits.charAt((i6 >> 12) & 15));
                    i5++;
                    i6 <<= 4;
                }
            }
            return sb2.toString();
        }
        boolean z2 = this.negative;
        if (i != 2) {
            StringBuilder sb3 = new StringBuilder();
            if (z2) {
                sb3.append('-');
            }
            Abs().ToRadixStringGeneral(sb3, i);
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        if (z2) {
            sb4.append('-');
        }
        int i7 = 0;
        int i8 = this.words[this.wordCount - 1];
        while (true) {
            if (i7 >= 16) {
                break;
            }
            if (!z || (i8 & 32768) != 0) {
                sb4.append((i8 & 32768) == 0 ? '0' : '1');
                z = false;
            }
            i7++;
            i8 <<= 1;
        }
        for (int i9 = this.wordCount - 2; i9 >= 0; i9--) {
            int i10 = 0;
            int i11 = this.words[i9];
            while (i10 < 16) {
                sb4.append((i11 & 32768) == 0 ? '0' : '1');
                i10++;
                i11 <<= 1;
            }
        }
        return sb4.toString();
    }

    public EInteger Xor(EInteger eInteger) {
        if (eInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1(CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER);
            return null;
        }
        if (equals(eInteger)) {
            return FromInt32(0);
        }
        int i = this.wordCount;
        if (i == 0) {
            return eInteger;
        }
        int i2 = eInteger.wordCount;
        if (i2 == 0) {
            return this;
        }
        if (!this.negative && !eInteger.negative) {
            int min = Math.min(i, i2);
            int max = Math.max(this.wordCount, eInteger.wordCount);
            int i3 = this.wordCount;
            short[] sArr = i3 == min ? this.words : eInteger.words;
            if (i3 == min) {
                this = eInteger;
            }
            short[] sArr2 = this.words;
            short[] sArr3 = new short[max];
            for (int i4 = 0; i4 < min; i4++) {
                sArr3[i4] = (short) (sArr[i4] ^ sArr2[i4]);
            }
            System.arraycopy(sArr2, min, sArr3, min, max - min);
            if (min == max) {
                max = CountWords(sArr3);
            }
            return max == 0 ? FromInt32(0) : new EInteger(max, sArr3, false);
        }
        short[] sArr4 = new short[i];
        System.arraycopy(this.words, 0, sArr4, 0, i);
        int i5 = eInteger.wordCount;
        short[] sArr5 = new short[i5];
        System.arraycopy(eInteger.words, 0, sArr5, 0, i5);
        boolean z = this.negative;
        boolean z2 = eInteger.negative;
        short[] CleanGrow = CleanGrow(sArr4, Math.max(i, i5));
        short[] CleanGrow2 = CleanGrow(sArr5, Math.max(CleanGrow.length, i5));
        if (z) {
            TwosComplement(CleanGrow, 0, CleanGrow.length);
        }
        if (z2) {
            TwosComplement(CleanGrow2, 0, CleanGrow2.length);
        }
        boolean z3 = z ^ z2;
        XorWords(CleanGrow, CleanGrow, CleanGrow2, CleanGrow.length);
        if (z3) {
            TwosComplement(CleanGrow, 0, CleanGrow.length);
        }
        int CountWords = CountWords(CleanGrow);
        return CountWords == 0 ? FromInt32(0) : new EInteger(CountWords, CleanGrow, z3);
    }

    public EInteger XorNot(EInteger eInteger) {
        if (eInteger != null) {
            return Xor(eInteger.Not());
        }
        Single$$ExternalSyntheticBUOutline0.m$1("second");
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(EInteger eInteger) {
        if (eInteger == null) {
            return 1;
        }
        if (this == eInteger) {
            return 0;
        }
        int i = this.wordCount;
        int i2 = eInteger.wordCount;
        char c = i == 0 ? (char) 0 : this.negative ? (char) 65535 : (char) 1;
        char c2 = i2 == 0 ? (char) 0 : eInteger.negative ? (char) 65535 : (char) 1;
        if (c != c2) {
            return c < c2 ? -1 : 1;
        }
        if (c == 0) {
            return 0;
        }
        if (i != i2) {
            return (i > i2) ^ (c <= 0) ? 1 : -1;
        }
        if (i == 1 && this.words[0] == eInteger.words[0]) {
            return 0;
        }
        short[] sArr = this.words;
        short[] sArr2 = eInteger.words;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return 0;
            }
            int i4 = sArr[i3] & UShort.MAX_VALUE;
            int i5 = 65535 & sArr2[i3];
            if (i4 > i5) {
                return c > 0 ? 1 : -1;
            }
            if (i4 < i5) {
                return c > 0 ? -1 : 1;
            }
            i = i3;
        }
    }

    public boolean equals(Object obj) {
        EInteger eInteger = obj instanceof EInteger ? (EInteger) obj : null;
        if (eInteger == null || this.wordCount != eInteger.wordCount || this.negative != eInteger.negative) {
            return false;
        }
        for (int i = 0; i < this.wordCount; i++) {
            if (this.words[i] != eInteger.words[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int signum = signum() * 1000000007;
        if (this.words != null) {
            for (int i = 0; i < this.wordCount; i++) {
                signum += this.words[i] * 1000000013;
            }
        }
        return signum;
    }

    public final boolean isEven() {
        return !GetUnsignedBit(0);
    }

    public final boolean isPowerOfTwo() {
        int i = this.wordCount;
        if (this.negative || i == 0 || (i > 1 && this.words[0] != 0)) {
            return false;
        }
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            short[] sArr = this.words;
            if (i2 >= i3) {
                int i4 = sArr[i3] & UShort.MAX_VALUE;
                if (i4 == 0) {
                    Duration$$ExternalSyntheticBUOutline0.m$1();
                    return false;
                }
                while ((i4 & 1) == 0) {
                    i4 >>= 1;
                }
                return i4 == 1;
            }
            if (sArr[i2] != 0) {
                return false;
            }
            i2++;
        }
    }

    public final boolean isZero() {
        return this.wordCount == 0;
    }

    public final int signum() {
        if (this.wordCount == 0) {
            return 0;
        }
        return this.negative ? -1 : 1;
    }

    public String toString() {
        return isZero() ? Constants.FEEDBACK_TYPE_DISLIKE : CanFitInInt64() ? FastInteger.LongToString(ToInt64Unchecked()) : ToRadixString(10);
    }

    public static int CountWords(short[] sArr) {
        int length = sArr.length;
        while (length != 0 && sArr[length - 1] == 0) {
            length--;
        }
        return length;
    }

    public static EInteger FromRadixSubstring(char[] cArr, int i, int i2, int i3) {
        if (cArr != null) {
            return EIntegerCharArrayString.FromRadixSubstringImpl(cArr, i, i2, i3, true);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("cs");
        return null;
    }

    public EInteger[] RootRem(int i) {
        return RootRemInternal(FromInt32(i), true);
    }

    public static EInteger FromSubstring(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            return FromRadixSubstring(bArr, 10, i, i2);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("bytes");
        return null;
    }

    public static EInteger FromRadixSubstring(byte[] bArr, int i, int i2, int i3) {
        if (bArr != null) {
            return EIntegerByteArrayString.FromRadixSubstringImpl(bArr, i, i2, i3, true);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("bytes");
        return null;
    }

    public EInteger Root(int i) {
        return RootRemInternal(FromInt32(i), false)[0];
    }

    public static EInteger FromSubstring(String str, int i, int i2) {
        if (str != null) {
            return FromRadixSubstring(str, 10, i, i2);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("str");
        return null;
    }

    public static EInteger FromRadixString(char[] cArr, int i) {
        if (cArr != null) {
            return FromRadixSubstring(cArr, i, 0, cArr.length);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("cs");
        return null;
    }

    public static EInteger FromRadixString(byte[] bArr, int i) {
        if (bArr != null) {
            return FromRadixSubstring(bArr, i, 0, bArr.length);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("bytes");
        return null;
    }

    public EInteger Subtract(long j) {
        return Subtract(FromInt64(j));
    }

    public EInteger Subtract(int i) {
        if (i == Integer.MIN_VALUE) {
            return Subtract(FromInt32(i));
        }
        return i == 0 ? this : Add(-i);
    }

    public EInteger Mod(int i) {
        if (i >= 0) {
            EInteger Remainder = Remainder(i);
            return Remainder.signum() < 0 ? FromInt32(i).Add(Remainder) : Remainder;
        }
        Duration$$ExternalSyntheticBUOutline0.m("Divisor is negative");
        return null;
    }

    public static EInteger FromString(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length == 1) {
                byte b = bArr[0];
                if (b >= 48 && b <= 57) {
                    return FromInt32(b - 48);
                }
                DisplayCompat$$ExternalSyntheticBUOutline0.m7672m();
                return null;
            }
            return FromRadixSubstring(bArr, 10, 0, length);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("bytes");
        return null;
    }

    public static EInteger FromString(char[] cArr) {
        if (cArr != null) {
            int length = cArr.length;
            if (length == 1) {
                char c = cArr[0];
                if (c >= '0' && c <= '9') {
                    return FromInt32(c - '0');
                }
                DisplayCompat$$ExternalSyntheticBUOutline0.m7672m();
                return null;
            }
            return FromRadixSubstring(cArr, 10, 0, length);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("cs");
        return null;
    }

    private static int WordsCompare(short[] sArr, int i, short[] sArr2, int i2) {
        return WordsCompare(sArr, 0, i, sArr2, 0, i2);
    }

    private static long[] SlowSgcd(long j, long j2) {
        long[] jArr = {j, j2, 1, 0, 0, 1};
        int max = (Math.max(LBL(j), LBL(j2)) >> 1) + 1;
        while (LBL(jArr[0] - jArr[1]) > max) {
            LSDivStep(jArr, max);
        }
        return jArr;
    }

    public boolean GetUnsignedBit(int i) {
        if (i >= 0) {
            int i2 = i >> 4;
            short[] sArr = this.words;
            return i2 < sArr.length && ((sArr[i2] >> (i & 15)) & 1) != 0;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "index(", ") is less than 0"));
        return false;
    }

    public EInteger Remainder(long j) {
        return Remainder(FromInt64(j));
    }

    public EInteger Remainder(int i) {
        return Remainder(FromInt32(i));
    }

    public int compareTo(int i) {
        int i2 = this.wordCount;
        if (i2 > 2) {
            return this.negative ? -1 : 1;
        }
        if (i2 == 2) {
            short[] sArr = this.words;
            short s = sArr[1];
            if ((32768 & s) != 0) {
                boolean z = this.negative;
                return (z && s == Short.MIN_VALUE && sArr[0] == 0) ? i == Integer.MIN_VALUE ? 0 : -1 : z ? -1 : 1;
            }
        }
        int ToInt32Unchecked = ToInt32Unchecked();
        if (ToInt32Unchecked == i) {
            return 0;
        }
        return ToInt32Unchecked < i ? -1 : 1;
    }

    public int compareTo(long j) {
        return compareTo(FromInt64(j));
    }

    public boolean GetSignedBit(int i) {
        if (i >= 0) {
            if (this.wordCount == 0) {
                return false;
            }
            if (this.negative) {
                int i2 = i / 16;
                if (i2 >= this.words.length) {
                    return true;
                }
                int i3 = 0;
                while (i3 < i2 && this.words[i3] == 0) {
                    i3++;
                }
                short s = this.words[i2];
                if (i3 == i2) {
                    s = (short) (s - 1);
                }
                return ((((short) (~s)) >> (i & 15)) & 1) != 0;
            }
            return GetUnsignedBit(i);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("index");
        return false;
    }

    public EInteger ShiftRight(EInteger eInteger) {
        if (eInteger != null) {
            if (eInteger.signum() < 0) {
                return ShiftLeft(eInteger.Negate());
            }
            while (!eInteger.CanFitInInt32()) {
                eInteger = eInteger.Subtract(2147483632);
                this = this.ShiftRight(2147483632);
            }
            return this.ShiftRight(eInteger.ToInt32Checked());
        }
        Single$$ExternalSyntheticBUOutline0.m$1("eshift");
        return null;
    }

    public EInteger ShiftLeft(EInteger eInteger) {
        if (eInteger != null) {
            if (eInteger.signum() < 0) {
                return ShiftRight(eInteger.Negate());
            }
            while (!eInteger.CanFitInInt32()) {
                eInteger = eInteger.Subtract(2147483632);
                this = this.ShiftLeft(2147483632);
            }
            return this.ShiftLeft(eInteger.ToInt32Checked());
        }
        Single$$ExternalSyntheticBUOutline0.m$1("eshift");
        return null;
    }

    public EInteger Pow(long j) {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("bigPower is negative");
            return null;
        }
        if (j == 0) {
            return FromInt32(1);
        }
        if (j < SieveCacheKt.NodeLinkMask) {
            return Pow((int) j);
        }
        return Pow(FromInt64(j));
    }

    public EInteger Pow(int i) {
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "powerSmall(", ") is less than 0"));
            return null;
        }
        if (i == 0) {
            return FromInt32(1);
        }
        if (i != 1 && !isZero() && compareTo(1) != 0) {
            if (compareTo(-1) != 0) {
                if (i == 2) {
                    return Multiply(this);
                }
                if (i == 3) {
                    return Multiply(this).Multiply(this);
                }
                EInteger FromInt32 = FromInt32(1);
                while (i != 0) {
                    if ((i & 1) != 0) {
                        FromInt32 = FromInt32.Multiply(this);
                    }
                    i >>= 1;
                    if (i != 0) {
                        this = this.Multiply(this);
                    }
                }
                return FromInt32;
            }
            if ((i & 1) == 0) {
                return FromInt32(1);
            }
        }
        return this;
    }

    public EInteger LowBits(int i) {
        if (i >= 0) {
            if (i != 0 && signum() != 0) {
                if (signum() <= 0 || GetUnsignedBitLengthAsInt64() > i) {
                    if (!this.negative) {
                        long BitsToWords = BitsToWords(i);
                        int i2 = this.wordCount;
                        if (i2 >= BitsToWords) {
                            if (BitsToWords == 0) {
                                return FromInt32(0);
                            }
                            int i3 = (int) BitsToWords;
                            int i4 = i & 15;
                            Math.min(i2, i3);
                            short[] sArr = new short[i3];
                            short[] sArr2 = this.words;
                            if (i4 == 0) {
                                System.arraycopy(sArr2, 0, sArr, 0, i3);
                            } else {
                                int i5 = i3 - 1;
                                System.arraycopy(sArr2, 0, sArr, 0, i5);
                                sArr[i5] = (short) (this.words[i5] & ((short) ((1 << i4) - 1)));
                            }
                            int CountWords = CountWords(sArr);
                            return CountWords == 0 ? FromInt32(0) : new EInteger(CountWords, sArr, false);
                        }
                    } else {
                        return And(FromInt32(1).ShiftLeft(i).Subtract(1));
                    }
                }
                return this;
            }
            return FromInt32(0);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "\"bitCount\" (", ") is not greater or equal to 0"));
        return null;
    }

    public EInteger Divide(int i) {
        return Divide(FromInt32(i));
    }

    public EInteger Divide(long j) {
        return Divide(FromInt64(j));
    }

    public EInteger LowBits(long j) {
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(AppLaunchChecker$$ExternalSyntheticOutline0.m("\"longBitCount\" (", j, ") is not greater or equal to 0"));
            return null;
        }
        if (j <= SieveCacheKt.NodeLinkMask) {
            return LowBits((int) j);
        }
        return LowBits(FromInt64(j));
    }

    public EInteger Multiply(long j) {
        return Multiply(FromInt64(j));
    }

    public EInteger Multiply(int i) {
        return Multiply(FromInt32(i));
    }

    public static EInteger FromBytes(byte[] bArr, boolean z) {
        if (bArr != null) {
            return FromBytes(bArr, 0, bArr.length, z);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("bytes");
        return null;
    }

    public EInteger[] DivRem(long j) {
        return DivRem(FromInt64(j));
    }

    public EInteger[] DivRem(int i) {
        return DivRem(FromInt32(i));
    }

    public EInteger Add(int i) {
        int i2;
        if (i == 0) {
            return this;
        }
        int i3 = this.wordCount;
        if (i3 == 0) {
            return FromInt32(i);
        }
        if (i3 == 1 && i >= -2147352576 && i < 2147352576) {
            boolean z = this.negative;
            short[] sArr = this.words;
            if (z) {
                i2 = i - (sArr[0] & UShort.MAX_VALUE);
            } else {
                i2 = i + (sArr[0] & UShort.MAX_VALUE);
            }
            if (i2 >= CacheFirst && i2 <= 128) {
                return Cache[i2 - CacheFirst];
            }
            int i4 = i2 >> 16;
            if (i4 == 0) {
                return new EInteger(1, new short[]{(short) i2}, false);
            }
            if (i2 > 0) {
                return new EInteger(2, new short[]{(short) i2, (short) i4}, false);
            }
            if (i2 > -65536) {
                return new EInteger(1, new short[]{(short) (-i2)}, true);
            }
            int i5 = -i2;
            return new EInteger(2, new short[]{(short) i5, (short) (i5 >> 16)}, true);
        }
        return Add(FromInt32(i));
    }

    public EInteger Add(long j) {
        return Add(FromInt64(j));
    }
}
