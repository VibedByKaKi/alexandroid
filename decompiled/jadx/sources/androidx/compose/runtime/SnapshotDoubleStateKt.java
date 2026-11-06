package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotDoubleStateKt__SnapshotDoubleStateKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SnapshotDoubleStateKt {
    public static final double getValue(@NotNull DoubleState doubleState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.getValue(doubleState, obj, kProperty);
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableDoubleState mutableDoubleStateOf(double d) {
        return SnapshotDoubleStateKt__SnapshotDoubleStateKt.mutableDoubleStateOf(d);
    }

    public static final void setValue(@NotNull MutableDoubleState mutableDoubleState, @Nullable Object obj, @NotNull KProperty<?> kProperty, double d) {
        SnapshotDoubleStateKt__SnapshotDoubleStateKt.setValue(mutableDoubleState, obj, kProperty, d);
    }
}
