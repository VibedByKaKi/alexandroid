package org.bouncycastle.pqc.crypto.newhope;

import com.amazon.alexa.sensor.location.LocationSensorException;
import kotlin.UShort;

/* loaded from: classes11.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    public static short barrett(short s) {
        int i = s & UShort.MAX_VALUE;
        return (short) (i - (((i * 5) >>> 16) * LocationSensorException.ERROR_CODE_MISSING_DEVICE_PERMISSION_GENERAL_LOCATION));
    }

    public static short montgomery(int i) {
        return (short) (((((i * QInv) & RMask) * LocationSensorException.ERROR_CODE_MISSING_DEVICE_PERMISSION_GENERAL_LOCATION) + i) >>> 18);
    }
}
