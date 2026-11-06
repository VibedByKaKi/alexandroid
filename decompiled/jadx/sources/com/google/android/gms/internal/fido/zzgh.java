package com.google.android.gms.internal.fido;

import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.math.RoundingMode;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzgh {
    public static int zza(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            Duration$$ExternalSyntheticBUOutline0.m("/ by zero");
            return 0;
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (zzgg.zza[roundingMode.ordinal()]) {
            case 1:
                zzgi.zza(false);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i3;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                Buffer$$ExternalSyntheticBUOutline0.m$2();
                return 0;
        }
        return i3 + i5;
    }

    public static int zzb(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("x (0) must be > 0");
            return 0;
        }
        switch (zzgg.zza[roundingMode.ordinal()]) {
            case 1:
                zzgi.zza(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i) >>> 31);
            default:
                Buffer$$ExternalSyntheticBUOutline0.m$2();
                return 0;
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
