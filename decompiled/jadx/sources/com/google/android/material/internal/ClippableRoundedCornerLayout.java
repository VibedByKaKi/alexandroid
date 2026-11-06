package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    @NonNull
    private float[] cornerRadii;

    @Nullable
    private Path path;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
        this.cornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @NonNull
    public float[] getCornerRadii() {
        return this.cornerRadii;
    }

    public void resetClipBoundsAndCornerRadii() {
        this.path = null;
        this.cornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        invalidate();
    }

    public void updateClipBoundsAndCornerRadii(@NonNull RectF rectF, @NonNull float[] fArr) {
        if (this.path == null) {
            this.path = new Path();
        }
        this.cornerRadii = fArr;
        this.path.reset();
        this.path.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.path.close();
        invalidate();
    }

    public void updateCornerRadii(@NonNull float[] fArr) {
        updateClipBoundsAndCornerRadii(getLeft(), getTop(), getRight(), getBottom(), fArr);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void updateClipBoundsAndCornerRadii(float f, float f2, float f3, float f4, @NonNull float[] fArr) {
        updateClipBoundsAndCornerRadii(new RectF(f, f2, f3, f4), fArr);
    }

    public void updateClipBoundsAndCornerRadii(@NonNull Rect rect, @NonNull float[] fArr) {
        updateClipBoundsAndCornerRadii(rect.left, rect.top, rect.right, rect.bottom, fArr);
    }
}
