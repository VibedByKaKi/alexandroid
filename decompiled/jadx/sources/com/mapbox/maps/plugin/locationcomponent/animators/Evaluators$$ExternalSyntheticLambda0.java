package com.mapbox.maps.plugin.locationcomponent.animators;

import android.animation.TypeEvaluator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.mapbox.geojson.Point;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class Evaluators$$ExternalSyntheticLambda0 implements TypeEvaluator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Evaluators$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        Object lambda$createCornerAnimator$0;
        switch (this.$r8$classId) {
            case 0:
                return Evaluators.POINT$lambda$0(f, (Point) obj, (Point) obj2);
            case 1:
                lambda$createCornerAnimator$0 = MaterialMainContainerBackHelper.lambda$createCornerAnimator$0(f, obj, obj2);
                return lambda$createCornerAnimator$0;
            default:
                return Evaluators.DOUBLE$lambda$1(f, (Double) obj, (Double) obj2);
        }
    }
}
