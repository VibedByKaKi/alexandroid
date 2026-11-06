package org.apache.thrift.orig.utils;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.text.Regex$$ExternalSyntheticBUOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class StringUtils {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private StringUtils() {
    }

    public static String bytesToHexString(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i2, "Negative length "));
            return null;
        }
        if (i < 0) {
            XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(i, "Negative start offset "));
            return null;
        }
        if (i2 > bArr.length - i) {
            StringBuilder sb = new StringBuilder("Invalid range, bytes.length: ");
            TableInfo$$ExternalSyntheticOutline0.m(sb, bArr.length, " offset: ", i, " length: ");
            Regex$$ExternalSyntheticBUOutline0.m(i2, sb);
            return null;
        }
        char[] cArr = new char[i2 * 2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3 + i];
            int i4 = i3 * 2;
            char[] cArr2 = HEX_CHARS;
            cArr[i4] = cArr2[(b & 255) >>> 4];
            cArr[i4 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String bytesToHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bytesToHexString(bArr, 0, bArr.length);
    }
}
