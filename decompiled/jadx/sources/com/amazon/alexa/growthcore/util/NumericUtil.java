package com.amazon.alexa.growthcore.util;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class NumericUtil {
    private NumericUtil() {
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static boolean isBetween(int i, int i2, int i3) {
        return i2 <= i && i <= i3;
    }

    public static byte[] md5(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(str.getBytes(StandardCharsets.UTF_8));
    }

    public static Integer sum(Integer[] numArr) {
        Integer num = 0;
        for (Integer num2 : numArr) {
            num = TableInfo$$ExternalSyntheticOutline0.m(num.intValue(), num2);
        }
        return num;
    }

    public static long toLong(@NonNull byte[] bArr, @IntRange(from = 0, to = 8) int i) throws IllegalArgumentException {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Byte array must not be null when converting to long");
            return 0L;
        }
        if (!isBetween(i, 0, 8)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Number of taken bytes must be from 0 to 8when converting to long");
            return 0L;
        }
        long j = 0;
        for (int max = Math.max(bArr.length - i, 0); max < bArr.length; max++) {
            j = (j << 8) | (bArr[max] & 255);
        }
        return j;
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }
}
