package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SnapshotIntStateKt {
    public static final int getValue(@NotNull IntState intState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return SnapshotIntStateKt__SnapshotIntStateKt.getValue(intState, obj, kProperty);
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableIntState mutableIntStateOf(int i) {
        return SnapshotIntStateKt__SnapshotIntStateKt.mutableIntStateOf(i);
    }

    public static final void setValue(@NotNull MutableIntState mutableIntState, @Nullable Object obj, @NotNull KProperty<?> kProperty, int i) {
        SnapshotIntStateKt__SnapshotIntStateKt.setValue(mutableIntState, obj, kProperty, i);
    }
}
