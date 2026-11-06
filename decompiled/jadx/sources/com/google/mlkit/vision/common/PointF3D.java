package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public abstract class PointF3D {
    @NonNull
    public static PointF3D from(float f, float f2, float f3) {
        return new zza(f, f2, f3);
    }

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();
}
