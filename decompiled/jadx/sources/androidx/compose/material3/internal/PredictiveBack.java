package androidx.compose.material3.internal;

import androidx.compose.animation.core.Easing;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/internal/PredictiveBack;", "", "()V", ViewProps.TRANSFORM, "", "progress", "transform$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PredictiveBack {
    public static final int $stable = 0;

    @NotNull
    public static final PredictiveBack INSTANCE = new PredictiveBack();

    private PredictiveBack() {
    }

    public final float transform$material3_release(float progress) {
        Easing easing;
        easing = PredictiveBack_androidKt.PredictiveBackEasing;
        return easing.transform(progress);
    }
}
