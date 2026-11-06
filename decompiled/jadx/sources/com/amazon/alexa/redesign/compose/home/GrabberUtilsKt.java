package com.amazon.alexa.redesign.compose.home;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"computeGrabberAlpha", "", "isLastCard", "", "isFullScreen", "collapsedAnchor", "currentOffset", "fadeDistancePx", "(ZZLjava/lang/Float;FF)F", "AlexaMobileAndroidHomeChannel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class GrabberUtilsKt {
    public static final float computeGrabberAlpha(boolean z, boolean z2, @Nullable Float f, float f2, float f3) {
        if (!z || z2 || f == null) {
            return 0.0f;
        }
        return 1.0f - RangesKt.coerceIn((f.floatValue() - f2) / f3, 0.0f, 1.0f);
    }
}
