package com.amazon.rtvi.mobile.orchestrator;

import android.graphics.Bitmap;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/rtvi/mobile/orchestrator/MotionDetector;", "", "<init>", "()V", "previousHash", "", "lastSessionId", "", "detectMotion", "", "bitmap", "Landroid/graphics/Bitmap;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "getHammingDistance", "", "calculateAverageBrightness", "computePerceptualHash", "calculateHammingDistance", "hash1", "hash2", "reset", "", "Companion", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MotionDetector {
    private static final int HAMMING_THRESHOLD = 8;
    private static final int HASH_SIZE = 8;
    private static final int MIN_BRIGHTNESS = 15;

    @Nullable
    private String lastSessionId;
    private long previousHash = -1;

    private final int calculateAverageBrightness(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = ((height + 7) / 8) * ((width + 7) / 8);
        if (i == 0) {
            return 0;
        }
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < height && i2 < i; i3 += 8) {
            int i4 = 0;
            while (i4 < width && i2 < i) {
                iArr[i2] = bitmap.getPixel(i4, i3);
                i4 += 8;
                i2++;
            }
        }
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = iArr[i5];
            int i7 = (i6 >> 16) & 255;
            int i8 = ((i6 >> 8) & 255) * 587;
            j += (((i6 & 255) * 114) + (i8 + (i7 * 299))) / 1000;
        }
        return (int) (j / i2);
    }

    private final int calculateHammingDistance(long hash1, long hash2) {
        return Long.bitCount(hash1 ^ hash2);
    }

    private final long computePerceptualHash(Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 8, 8, true);
        createScaledBitmap.getClass();
        int[] iArr = new int[64];
        createScaledBitmap.getPixels(iArr, 0, 8, 0, 0, 8, 8);
        int[] iArr2 = new int[64];
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 64; i++) {
            int i2 = iArr[i];
            int i3 = ((i2 >> 8) & 255) * 587;
            int i4 = (((i2 & 255) * 114) + (i3 + (((i2 >> 16) & 255) * 299))) / 1000;
            iArr2[i] = i4;
            j2 += i4;
        }
        int i5 = (int) (j2 / 64);
        for (int i6 = 0; i6 < 64; i6++) {
            if (iArr2[i6] > i5) {
                j |= 1 << i6;
            }
        }
        createScaledBitmap.recycle();
        return j;
    }

    public final synchronized boolean detectMotion(@NotNull Bitmap bitmap, @NotNull String sessionId) {
        bitmap.getClass();
        sessionId.getClass();
        String str = this.lastSessionId;
        if (str != null && Intrinsics.areEqual(sessionId, str)) {
            if (calculateAverageBrightness(bitmap) < 15) {
                return false;
            }
            long computePerceptualHash = computePerceptualHash(bitmap);
            long j = this.previousHash;
            if (j == -1) {
                this.previousHash = computePerceptualHash;
                return true;
            }
            boolean z = calculateHammingDistance(j, computePerceptualHash) > 8;
            if (z) {
                this.previousHash = computePerceptualHash;
            }
            return z;
        }
        this.lastSessionId = sessionId;
        this.previousHash = -1L;
        return false;
    }

    public final synchronized int getHammingDistance(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        if (calculateAverageBrightness(bitmap) < 15) {
            return -1;
        }
        long computePerceptualHash = computePerceptualHash(bitmap);
        long j = this.previousHash;
        if (j == -1) {
            this.previousHash = computePerceptualHash;
            return -1;
        }
        int calculateHammingDistance = calculateHammingDistance(j, computePerceptualHash);
        if (calculateHammingDistance > 8) {
            this.previousHash = computePerceptualHash;
        }
        return calculateHammingDistance;
    }

    public final synchronized void reset() {
        this.previousHash = -1L;
        this.lastSessionId = null;
    }
}
