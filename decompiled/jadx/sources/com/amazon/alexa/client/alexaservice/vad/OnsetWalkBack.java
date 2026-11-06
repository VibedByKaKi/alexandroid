package com.amazon.alexa.client.alexaservice.vad;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class OnsetWalkBack {
    public static final int MAX_GAP_MS = 512;
    public static final int MAX_LEAD_MS = 1500;
    public static final float THRESHOLD = 0.7f;

    private OnsetWalkBack() {
    }

    public static int leadFrames(@NonNull float[] fArr, int i, float f, int i2, int i3) {
        int min = Math.min(i, fArr.length);
        int i4 = min - 1;
        if (i4 <= 0) {
            return 0;
        }
        int i5 = i4;
        int i6 = 0;
        for (int i7 = min - 2; i7 >= 0 && i4 - i7 <= i3; i7--) {
            if (fArr[i7] < f) {
                i6++;
                if (i6 > i2) {
                    break;
                }
            } else {
                i5 = i7;
                i6 = 0;
            }
        }
        return i4 - i5;
    }
}
