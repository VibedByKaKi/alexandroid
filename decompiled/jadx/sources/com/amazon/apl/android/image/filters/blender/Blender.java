package com.amazon.apl.android.image.filters.blender;

import android.graphics.Bitmap;
import com.amazon.apl.enums.BlendMode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Blender {
    private static final String TAG = "Blender";
    protected BlendMode mBlendMode;

    public Blender(BlendMode blendMode) {
        this.mBlendMode = blendMode;
    }

    public abstract int blendPixels(int i, int i2);

    public Bitmap performBlending(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        int min = Math.min(bitmap.getWidth(), bitmap2.getWidth());
        int min2 = Math.min(bitmap.getHeight(), bitmap2.getHeight());
        int i = min * min2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        bitmap.getPixels(iArr, 0, min, 0, 0, min, min2);
        bitmap2.getPixels(iArr2, 0, min, 0, 0, min, min2);
        for (int i2 = 0; i2 < min2; i2++) {
            for (int i3 = 0; i3 < min; i3++) {
                int i4 = (i2 * min) + i3;
                iArr3[i4] = blendPixels(iArr[i4], iArr2[i4]);
            }
        }
        bitmap3.setPixels(iArr3, 0, bitmap3.getWidth(), 0, 0, bitmap3.getWidth(), bitmap3.getHeight());
        return bitmap3;
    }
}
