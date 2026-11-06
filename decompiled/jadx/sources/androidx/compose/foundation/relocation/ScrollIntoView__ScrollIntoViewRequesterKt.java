package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0080@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"scrollIntoView", "", "Landroidx/compose/ui/node/DelegatableNode;", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/ScrollIntoView")
/* loaded from: classes.dex */
public final /* synthetic */ class ScrollIntoView__ScrollIntoViewRequesterKt {
    @Nullable
    public static final Object scrollIntoView(@NotNull DelegatableNode delegatableNode, @Nullable final Rect rect, @NotNull Continuation<? super Unit> continuation) {
        if (!delegatableNode.getNode().getIsAttached()) {
            return Unit.INSTANCE;
        }
        final LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(delegatableNode);
        BringIntoViewParent findBringIntoViewParent = BringIntoViewRequesterKt.findBringIntoViewParent(delegatableNode);
        if (findBringIntoViewParent == null) {
            return Unit.INSTANCE;
        }
        Object bringChildIntoView = findBringIntoViewParent.bringChildIntoView(requireLayoutCoordinates, new Function0<Rect>() { // from class: androidx.compose.foundation.relocation.ScrollIntoView__ScrollIntoViewRequesterKt$scrollIntoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Rect invoke() {
                Rect rect2 = Rect.this;
                if (rect2 != null) {
                    return rect2;
                }
                LayoutCoordinates layoutCoordinates = requireLayoutCoordinates;
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return SizeKt.m4490toRectuvyYCjk(IntSizeKt.m7551toSizeozmzZPI(layoutCoordinates.mo6079getSizeYbymL2g()));
                }
                return null;
            }
        }, continuation);
        return bringChildIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringChildIntoView : Unit.INSTANCE;
    }

    public static /* synthetic */ Object scrollIntoView$default(DelegatableNode delegatableNode, Rect rect, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return ScrollIntoView.scrollIntoView(delegatableNode, rect, continuation);
    }
}
