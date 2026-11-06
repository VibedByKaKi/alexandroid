package com.amazon.apl.android.shadow;

import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.amazon.apl.android.Component;
import com.amazon.apl.android.bitmap.BitmapKey;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ShadowBitmapKey implements BitmapKey {
    int blurRadius;
    int color;
    private final float[] cornerRadius;
    int height;
    int offX;
    int offY;
    int width;

    public ShadowBitmapKey(Component component) {
        RectF shadowRect = component.getShadowRect();
        this.height = (int) shadowRect.height();
        this.width = (int) shadowRect.width();
        this.offX = component.getShadowOffsetHorizontal();
        this.offY = component.getShadowOffsetVertical();
        this.color = component.getShadowColor();
        this.blurRadius = component.getShadowRadius();
        this.cornerRadius = component.getShadowCornerRadius();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ShadowBitmapKey)) {
            return false;
        }
        ShadowBitmapKey shadowBitmapKey = (ShadowBitmapKey) obj;
        return this.height == shadowBitmapKey.height && this.width == shadowBitmapKey.width && this.offX == shadowBitmapKey.offX && this.offY == shadowBitmapKey.offY && this.color == shadowBitmapKey.color && this.blurRadius == shadowBitmapKey.blurRadius && Math.round(this.cornerRadius[0]) == Math.round(shadowBitmapKey.cornerRadius[0]) && Math.round(this.cornerRadius[1]) == Math.round(shadowBitmapKey.cornerRadius[1]) && Math.round(this.cornerRadius[2]) == Math.round(shadowBitmapKey.cornerRadius[2]) && Math.round(this.cornerRadius[3]) == Math.round(shadowBitmapKey.cornerRadius[3]);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.height), Integer.valueOf(this.width), Integer.valueOf(this.offX), Integer.valueOf(this.offY), Integer.valueOf(this.color), Integer.valueOf(this.blurRadius), Float.valueOf(this.cornerRadius[0]), Float.valueOf(this.cornerRadius[1]), Float.valueOf(this.cornerRadius[2]), Float.valueOf(this.cornerRadius[3]));
    }
}
