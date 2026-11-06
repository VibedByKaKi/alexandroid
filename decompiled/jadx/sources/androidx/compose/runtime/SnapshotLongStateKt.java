package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SnapshotLongStateKt {
    public static final long getValue(@NotNull LongState longState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return SnapshotLongStateKt__SnapshotLongStateKt.getValue(longState, obj, kProperty);
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableLongState mutableLongStateOf(long j) {
        return SnapshotLongStateKt__SnapshotLongStateKt.mutableLongStateOf(j);
    }

    public static final void setValue(@NotNull MutableLongState mutableLongState, @Nullable Object obj, @NotNull KProperty<?> kProperty, long j) {
        SnapshotLongStateKt__SnapshotLongStateKt.setValue(mutableLongState, obj, kProperty, j);
    }
}
