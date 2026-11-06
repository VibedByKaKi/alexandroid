package com.amazon.apl.android;

import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.primitive.Radii;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLGradientDrawable extends GradientDrawable {
    private int mBorderWidth = 0;
    private int mBorderColor = 0;

    @Nullable
    private Radii mRadii = null;
    private int lastSetColor = 0;

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public int getBorderWidth() {
        return this.mBorderWidth;
    }

    @VisibleForTesting
    public int getDefaultColor() {
        return super.getColor().getDefaultColor();
    }

    @Nullable
    public Radii getRadii() {
        return this.mRadii;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setColor(int i) {
        super.setColor(i);
        this.lastSetColor = i;
    }

    public void setCornerRadii(@NonNull Radii radii) {
        this.mRadii = radii;
        setCornerRadii(radii.toFloatArray());
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setStroke(int i, int i2) {
        this.mBorderWidth = i;
        this.mBorderColor = i2;
        super.setStroke(i, i2);
    }
}
