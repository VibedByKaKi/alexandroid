package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"androidx/compose/foundation/relocation/ScrollIntoView__ScrollIntoViewRequesterKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollIntoView {
    @Nullable
    public static final Object scrollIntoView(@NotNull DelegatableNode delegatableNode, @Nullable Rect rect, @NotNull Continuation<? super Unit> continuation) {
        return ScrollIntoView__ScrollIntoViewRequesterKt.scrollIntoView(delegatableNode, rect, continuation);
    }
}
