package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float f) {
        this.radius = f - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        float sqrt = (float) ((Math.sqrt(2.0d) * this.radius) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.radius, 2.0d) - Math.pow(sqrt, 2.0d));
        shapePath.reset(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * this.radius) - this.radius))) + sqrt2);
        shapePath.lineTo(f2, (float) (-((Math.sqrt(2.0d) * this.radius) - this.radius)));
        shapePath.lineTo(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * this.radius) - this.radius))) + sqrt2);
    }
}
