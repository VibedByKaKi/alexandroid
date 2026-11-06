package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"requireView", "Landroid/view/View;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDelegatableNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,34:1\n57#2,4:35\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n*L\n29#1:35,4\n*E\n"})
/* loaded from: classes13.dex */
public final class DelegatableNode_androidKt {
    @NotNull
    public static final View requireView(@NotNull DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get View because the Modifier node is not currently attached.");
        }
        Object requireOwner = LayoutNodeKt.requireOwner(DelegatableNodeKt.requireLayoutNode(delegatableNode));
        requireOwner.getClass();
        return (View) requireOwner;
    }
}
