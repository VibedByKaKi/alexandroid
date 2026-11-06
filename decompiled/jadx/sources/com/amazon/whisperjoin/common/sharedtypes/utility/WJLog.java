package com.amazon.whisperjoin.common.sharedtypes.utility;

import android.util.Log;
import com.google.common.base.Splitter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WJLog {
    private static final int ASCII_PRINTABLE_CHAR_LOWER_BOUND = 32;
    private static final int ASCII_PRINTABLE_CHAR_UPPER_BOUND = 127;
    private static final int HEX_CHARS_PER_LINE = 32;
    private static final String PREFIX = "WJ.";
    private static final String TAG = "WJLog";
    private static final AtomicBoolean DEBUG_ENABLED = new AtomicBoolean(false);
    private static final char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static void byteStruct(String str, String str2, byte[] bArr) {
        if (bArr == null) {
            d(str, "Null");
            return;
        }
        List<String> splitToList = Splitter.fixedLength(32).splitToList(bytesToHex(bArr));
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Byte Structure: ", str2, " size: ");
        m2m.append(bArr.length);
        m2m.append(" bytes");
        d(str, m2m.toString());
        int i = 0;
        for (String str3 : splitToList) {
            String hexToPrintableAscii = hexToPrintableAscii(str3);
            d(str, String.format(Locale.ENGLISH, "Part %04d\t Hex: %s\t Ascii: %s", Integer.valueOf(i), str3.replaceAll("..(?!$)", "$0 "), hexToPrintableAscii));
            i++;
        }
    }

    private static String bytesToHex(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = hexArray;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static int d(String str, String str2) {
        if (!DEBUG_ENABLED.get()) {
            return 0;
        }
        return Log.d("WJ." + str, str2);
    }

    public static int e(String str, String str2, Throwable th) {
        if (DEBUG_ENABLED.get()) {
            return Log.e("WJ." + str, str2, th);
        }
        return Log.e("WJ." + str, str2);
    }

    private static String hexToPrintableAscii(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 2;
            String substring = str.substring(i, i2);
            int parseInt = Integer.parseInt(substring, 16);
            if (parseInt <= 32 || parseInt >= 127) {
                sb.append(".");
            } else {
                sb.append((char) Integer.parseInt(substring, 16));
            }
            i = i2;
        }
        return sb.toString();
    }

    public static int i(String str, String str2, Throwable th) {
        if (DEBUG_ENABLED.get()) {
            return Log.i("WJ." + str, str2, th);
        }
        return Log.i("WJ." + str, str2);
    }

    public static synchronized void setDebug(boolean z) {
        synchronized (WJLog.class) {
            DEBUG_ENABLED.set(z);
            i(TAG, "Setting Debug: " + z);
        }
    }

    public static int v(String str, String str2) {
        if (!DEBUG_ENABLED.get()) {
            return 0;
        }
        return Log.v("WJ." + str, str2);
    }

    public static int w(String str, String str2, Throwable th) {
        if (DEBUG_ENABLED.get()) {
            return Log.w("WJ." + str, str2, th);
        }
        return Log.w("WJ." + str, str2);
    }

    public static int wtf(String str, String str2, Throwable th) {
        if (DEBUG_ENABLED.get()) {
            return Log.wtf("WJ." + str, str2, th);
        }
        return Log.wtf("WJ." + str, str2);
    }

    public static int d(String str, String str2, Throwable th) {
        if (!DEBUG_ENABLED.get()) {
            return 0;
        }
        return Log.d("WJ." + str, str2, th);
    }

    public static int v(String str, String str2, Throwable th) {
        if (!DEBUG_ENABLED.get()) {
            return 0;
        }
        return Log.v("WJ." + str, str2, th);
    }

    public static int e(String str, String str2) {
        return Log.e("WJ." + str, str2);
    }

    public static int i(String str, String str2) {
        return Log.i("WJ." + str, str2);
    }

    public static int w(String str, String str2) {
        return Log.w("WJ." + str, str2);
    }

    public static int wtf(String str, Throwable th) {
        if (!DEBUG_ENABLED.get()) {
            return 0;
        }
        return Log.wtf("WJ." + str, th);
    }

    public static int w(String str, Throwable th) {
        if (!DEBUG_ENABLED.get()) {
            return 0;
        }
        return Log.w("WJ." + str, th);
    }

    public static int wtf(String str, String str2) {
        return Log.wtf("WJ." + str, str2);
    }
}
