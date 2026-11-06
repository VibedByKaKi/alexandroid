package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"androidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(@NotNull FloatState floatState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.getValue(floatState, obj, kProperty);
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableFloatState mutableFloatStateOf(float f) {
        return PrimitiveSnapshotStateKt__SnapshotFloatStateKt.mutableFloatStateOf(f);
    }

    public static final void setValue(@NotNull MutableFloatState mutableFloatState, @Nullable Object obj, @NotNull KProperty<?> kProperty, float f) {
        PrimitiveSnapshotStateKt__SnapshotFloatStateKt.setValue(mutableFloatState, obj, kProperty, f);
    }
}
