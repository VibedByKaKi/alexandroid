package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\nH\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/drawee/drawable/OrientedDrawable;", "Lcom/facebook/drawee/drawable/ForwardingDrawable;", "drawable", "Landroid/graphics/drawable/Drawable;", "rotationAngle", "", "exifOrientation", "<init>", "(Landroid/graphics/drawable/Drawable;II)V", "mRotationMatrix", "Landroid/graphics/Matrix;", "getMRotationMatrix$annotations", "()V", "tempMatrix", "tempRectF", "Landroid/graphics/RectF;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicWidth", "getIntrinsicHeight", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "getTransform", ViewProps.TRANSFORM, "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrientedDrawable extends ForwardingDrawable {
    private final int exifOrientation;

    @JvmField
    @NotNull
    public final Matrix mRotationMatrix;
    private final int rotationAngle;

    @NotNull
    private final Matrix tempMatrix;

    @NotNull
    private final RectF tempRectF;

    @JvmOverloads
    public OrientedDrawable(@Nullable Drawable drawable, int i, int i2) {
        super(drawable);
        this.mRotationMatrix = new Matrix();
        this.rotationAngle = i - (i % 90);
        this.exifOrientation = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.tempMatrix = new Matrix();
        this.tempRectF = new RectF();
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        int i;
        canvas.getClass();
        if (this.rotationAngle <= 0 && ((i = this.exifOrientation) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.mRotationMatrix);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.exifOrientation;
        return (i == 5 || i == 7 || this.rotationAngle % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.exifOrientation;
        return (i == 5 || i == 7 || this.rotationAngle % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(@NotNull Matrix transform) {
        transform.getClass();
        getParentTransform(transform);
        if (this.mRotationMatrix.isIdentity()) {
            return;
        }
        transform.preConcat(this.mRotationMatrix);
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        int i;
        bounds.getClass();
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i2 = this.rotationAngle;
        if (i2 <= 0 && ((i = this.exifOrientation) == 0 || i == 1)) {
            current.setBounds(bounds);
            return;
        }
        int i3 = this.exifOrientation;
        if (i3 == 2) {
            this.mRotationMatrix.setScale(-1.0f, 1.0f);
        } else if (i3 == 7) {
            this.mRotationMatrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.mRotationMatrix.postScale(-1.0f, 1.0f);
        } else if (i3 != 4) {
            Matrix matrix = this.mRotationMatrix;
            if (i3 != 5) {
                matrix.setRotate(i2, bounds.centerX(), bounds.centerY());
            } else {
                matrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
                this.mRotationMatrix.postScale(1.0f, -1.0f);
            }
        } else {
            this.mRotationMatrix.setScale(1.0f, -1.0f);
        }
        this.tempMatrix.reset();
        this.mRotationMatrix.invert(this.tempMatrix);
        this.tempRectF.set(bounds);
        this.tempMatrix.mapRect(this.tempRectF);
        RectF rectF = this.tempRectF;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMRotationMatrix$annotations() {
    }

    public /* synthetic */ OrientedDrawable(Drawable drawable, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, i, (i3 & 4) != 0 ? 0 : i2);
    }

    @JvmOverloads
    public OrientedDrawable(@Nullable Drawable drawable, int i) {
        this(drawable, i, 0, 4, null);
    }
}
