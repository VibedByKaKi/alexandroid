package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J.\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/MathUtils;", "", "<init>", "()V", "lerp", "", "start", "stop", "amount", "lerpInv", "a", "b", "value", "constrainedMap", "rangeMin", "rangeMax", "valueMin", "valueMax", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes13.dex */
public final class MathUtils {
    public static final int $stable = 0;

    @NotNull
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    public final float constrainedMap(float rangeMin, float rangeMax, float valueMin, float valueMax, float value) {
        return lerp(rangeMin, rangeMax, Math.max(0.0f, Math.min(1.0f, lerpInv(valueMin, valueMax, value))));
    }

    public final float lerp(float start, float stop, float amount) {
        return ErrorUtils$$ExternalSyntheticOutline0.m(stop, start, amount, start);
    }

    public final float lerpInv(float a2, float b, float value) {
        if (a2 == b) {
            return 0.0f;
        }
        return (value - a2) / (b - a2);
    }
}
