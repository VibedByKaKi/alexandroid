package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class ColorProtection extends Protection {

    @ColorInt
    private int mColor;
    private final ColorDrawable mDrawable;
    private boolean mHasColor;

    public ColorProtection(int i) {
        super(i);
        this.mDrawable = new ColorDrawable();
        this.mColor = 0;
    }

    private void setColorInner(@ColorInt int i) {
        if (this.mColor != i) {
            this.mColor = i;
            this.mDrawable.setColor(i);
            setDrawable(this.mDrawable);
        }
    }

    @Override // androidx.core.view.insets.Protection
    public void dispatchColorHint(@ColorInt int i) {
        if (this.mHasColor) {
            return;
        }
        setColorInner(i);
    }

    @ColorInt
    public int getColor() {
        return this.mColor;
    }

    @Override // androidx.core.view.insets.Protection
    public boolean occupiesCorners() {
        return true;
    }

    public void setColor(@ColorInt int i) {
        this.mHasColor = true;
        setColorInner(i);
    }

    public ColorProtection(int i, @ColorInt int i2) {
        this(i);
        setColor(i2);
    }
}
