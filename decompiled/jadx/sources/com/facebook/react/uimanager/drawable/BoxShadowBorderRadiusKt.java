package com.facebook.react.uimanager.drawable;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"adjustRadiusForSpread", "", "radius", "spread", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BoxShadowBorderRadiusKt {
    public static final float adjustRadiusForSpread(float f, float f2) {
        float f3;
        if (f < Math.abs(f2)) {
            f3 = 1 + ((float) Math.pow((f / Math.abs(f2)) - r0, 3));
        } else {
            f3 = 1.0f;
        }
        return RangesKt.coerceAtLeast((f2 * f3) + f, 0.0f);
    }
}
