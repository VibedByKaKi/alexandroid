package androidx.compose.foundation.lazy.grid;

import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"GridItemSpan", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "currentLineSpan", "", "(I)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpan.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridSpanKt {
    public static final long GridItemSpan(@IntRange(from = 1) int i) {
        if (i > 0) {
            return GridItemSpan.m985constructorimpl(i);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The span value should be higher than 0");
        return 0L;
    }
}
