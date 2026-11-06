package com.amazon.alexa.handsfree.protocols.uservoicerecognition.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ScaledVolumeProcessor {
    private static final float RMS_WINDOW_SIZE = 3000.0f;
    private double mRmsWindowStart = 0.0d;

    private double computeArrayRms(@NonNull ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        double d = 0.0d;
        while (shortBuffer.remaining() != 0) {
            short s = shortBuffer.get();
            d += s * s;
        }
        return Math.sqrt(d / remaining);
    }

    public float computeScaledVolume(@Nullable ShortBuffer shortBuffer) {
        if (shortBuffer == null || shortBuffer.remaining() == 0) {
            return 0.0f;
        }
        double computeArrayRms = computeArrayRms(shortBuffer);
        double d = this.mRmsWindowStart;
        if (computeArrayRms < d) {
            this.mRmsWindowStart = computeArrayRms;
        } else if (computeArrayRms > d + 3000.0d) {
            this.mRmsWindowStart = computeArrayRms - 3000.0d;
        }
        double d2 = this.mRmsWindowStart;
        return (float) Math.min(1.0d, Math.max(0.0d, (computeArrayRms - d2) / ((3000.0d + d2) - d2)));
    }

    public float computeScaledVolume(@Nullable byte[] bArr, int i) {
        if (bArr == null || i <= 0) {
            return 0.0f;
        }
        if (i <= bArr.length) {
            return computeScaledVolume(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer());
        }
        Single$$ExternalSyntheticBUOutline0.m$3("dataSize must be less than or equal to the byte array length");
        return 0.0f;
    }
}
