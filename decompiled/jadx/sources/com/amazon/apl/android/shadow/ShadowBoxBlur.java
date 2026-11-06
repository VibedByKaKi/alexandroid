package com.amazon.apl.android.shadow;

import android.graphics.Bitmap;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ShadowBoxBlur {
    private static final String TAG = ShadowBoxBlur.class.toString();

    public static void blur(Bitmap bitmap, int i) {
        if (i <= 0) {
            ArcMode$$ExternalSyntheticOutline0.m(i, "blurRadius must be > 0, was given ", TAG);
        } else {
            nativeBoxBlur(bitmap, i);
        }
    }

    private static native void nativeBoxBlur(Bitmap bitmap, int i);
}
