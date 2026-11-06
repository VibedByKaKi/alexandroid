package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080\b¨\u0006\u0005"}, d2 = {"measureNanoTime", "", "doMeasure", "Lkotlin/Function0;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetchState.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.jvm.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState_jvmKt\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,22:1\n31#2,6:23\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.jvm.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState_jvmKt\n*L\n20#1:23,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState_jvmKt {
    public static final long measureNanoTime(@NotNull Function0<Unit> function0) {
        long nanoTime = System.nanoTime();
        function0.invoke();
        return System.nanoTime() - nanoTime;
    }
}
