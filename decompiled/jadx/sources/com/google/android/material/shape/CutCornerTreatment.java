package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f, float f2, float f3) {
        float f4 = f3 * f2;
        shapePath.reset(0.0f, f4, 180.0f, 180.0f - f);
        double d = f4;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f)) * d), (float) (Math.sin(Math.toRadians(90.0f - f)) * d));
    }

    @Deprecated
    public CutCornerTreatment(float f) {
        this.size = f;
    }
}
