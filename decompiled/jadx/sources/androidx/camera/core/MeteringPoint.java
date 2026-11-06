package androidx.camera.core;

import android.util.Rational;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class MeteringPoint {
    private float mNormalizedX;
    private float mNormalizedY;
    private float mSize;

    @Nullable
    private Rational mSurfaceAspectRatio;

    public MeteringPoint(float f, float f2, float f3, @Nullable Rational rational) {
        this.mNormalizedX = f;
        this.mNormalizedY = f2;
        this.mSize = f3;
        this.mSurfaceAspectRatio = rational;
    }

    public float getSize() {
        return this.mSize;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Rational getSurfaceAspectRatio() {
        return this.mSurfaceAspectRatio;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getX() {
        return this.mNormalizedX;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getY() {
        return this.mNormalizedY;
    }
}
