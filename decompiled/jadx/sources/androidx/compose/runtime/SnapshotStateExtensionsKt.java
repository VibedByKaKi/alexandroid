package androidx.compose.runtime;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\t0\u0002H\u0007\u001a\u0012\u0010\n\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\f0\u0002H\u0007¨\u0006\r"}, d2 = {"asIntState", "Landroidx/compose/runtime/IntState;", "Landroidx/compose/runtime/State;", "", "asLongState", "Landroidx/compose/runtime/LongState;", "", "asFloatState", "Landroidx/compose/runtime/FloatState;", "", "asDoubleState", "Landroidx/compose/runtime/DoubleState;", "", SmartFragmentContent.RUNTIME}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SnapshotStateExtensionsKt {
    @Stable
    @NotNull
    public static final DoubleState asDoubleState(@NotNull State<Double> state) {
        return state instanceof DoubleState ? (DoubleState) state : new UnboxedDoubleState(state);
    }

    @Stable
    @NotNull
    public static final FloatState asFloatState(@NotNull State<Float> state) {
        return state instanceof FloatState ? (FloatState) state : new UnboxedFloatState(state);
    }

    @Stable
    @NotNull
    public static final IntState asIntState(@NotNull State<Integer> state) {
        return state instanceof IntState ? (IntState) state : new UnboxedIntState(state);
    }

    @Stable
    @NotNull
    public static final LongState asLongState(@NotNull State<Long> state) {
        return state instanceof LongState ? (LongState) state : new UnboxedLongState(state);
    }
}
