package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0002\b\rJ!\u0010\u0013\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0002\b\u001eJ\u001f\u0010\u000e\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u0002H\u0014H\u0004¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0015H\u0004J\u0018\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0001H\u0002J\u0018\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&H\u0002J\"\u0010'\u001a\u00020\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0)H\u0080\b¢\u0006\u0002\b*J\r\u0010+\u001a\u00020\nH\u0010¢\u0006\u0002\b,J\r\u0010-\u001a\u00020\nH\u0010¢\u0006\u0002\b.J\r\u0010/\u001a\u00020\nH\u0010¢\u0006\u0002\b0J\r\u00101\u001a\u00020\nH\u0010¢\u0006\u0002\b2J\r\u00103\u001a\u00020\nH\u0010¢\u0006\u0002\b4R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u00065"}, d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "selfKindSet", "", "getSelfKindSet$ui_release$annotations", "getSelfKindSet$ui_release", "()I", "updateCoordinator", "", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "updateCoordinator$ui_release", "delegate", "getDelegate$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "setDelegate$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "delegateUnprotected", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/DelegatableNode;", "delegatableNode", "delegateUnprotected$ui_release", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;", "undelegateUnprotected", AlexaEventBundleKeys.INSTANCE, "undelegateUnprotected$ui_release", "setAsDelegateTo", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "setAsDelegateTo$ui_release", "undelegate", "validateDelegateKindSet", "delegateKindSet", "delegateNode", "updateNodeKindSet", "newKindSet", "recalculateOwner", "", "forEachImmediateDelegate", "block", "Lkotlin/Function1;", "forEachImmediateDelegate$ui_release", "markAsAttached", "markAsAttached$ui_release", "runAttachLifecycle", "runAttachLifecycle$ui_release", "runDetachLifecycle", "runDetachLifecycle$ui_release", "markAsDetached", "markAsDetached$ui_release", "reset", "reset$ui_release", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,279:1\n240#1,6:280\n240#1,6:286\n240#1,6:306\n240#1,6:312\n240#1,6:318\n240#1,6:324\n240#1,6:330\n57#2,4:292\n57#2,4:302\n82#3:296\n82#3:298\n82#3:300\n63#4:297\n63#4:299\n63#4:301\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n44#1:280,6\n61#1:286,6\n249#1:306,6\n260#1:312,6\n266#1:318,6\n270#1:324,6\n276#1:330,6\n90#1:292,4\n187#1:302,4\n112#1:296\n168#1:298\n182#1:300\n112#1:297\n168#1:299\n182#1:301\n*E\n"})
/* loaded from: classes13.dex */
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;

    @Nullable
    private Modifier.Node delegate;
    private final int selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    private final void updateNodeKindSet(int newKindSet, boolean recalculateOwner) {
        Modifier.Node child;
        int kindSet = getKindSet();
        setKindSet$ui_release(newKindSet);
        if (kindSet != newKindSet) {
            if (DelegatableNodeKt.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui_release(newKindSet);
            }
            if (getIsAttached()) {
                Modifier.Node node = getNode();
                ?? r2 = this;
                while (r2 != 0) {
                    newKindSet |= r2.getKindSet();
                    r2.setKindSet$ui_release(newKindSet);
                    if (r2 == node) {
                        break;
                    } else {
                        r2 = r2.getParent();
                    }
                }
                if (recalculateOwner && r2 == node) {
                    newKindSet = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui_release(newKindSet);
                }
                int aggregateChildKindSet = newKindSet | ((r2 == 0 || (child = r2.getChild()) == null) ? 0 : child.getAggregateChildKindSet());
                for (Modifier.Node node2 = r2; node2 != null; node2 = node2.getParent()) {
                    aggregateChildKindSet |= node2.getKindSet();
                    node2.setAggregateChildKindSet$ui_release(aggregateChildKindSet);
                }
            }
        }
    }

    private final void validateDelegateKindSet(int delegateKindSet, Modifier.Node delegateNode) {
        int kindSet = getKindSet();
        if ((delegateKindSet & NodeKind.m6362constructorimpl(2)) == 0 || (NodeKind.m6362constructorimpl(2) & kindSet) == 0 || (this instanceof LayoutModifierNode)) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + delegateNode);
    }

    @NotNull
    public final <T extends DelegatableNode> T delegate(@NotNull T delegatableNode) {
        Modifier.Node node = delegatableNode.getNode();
        if (node != delegatableNode) {
            Modifier.Node node2 = delegatableNode instanceof Modifier.Node ? (Modifier.Node) delegatableNode : null;
            Modifier.Node parent = node2 != null ? node2.getParent() : null;
            if (node == getNode() && Intrinsics.areEqual(parent, this)) {
                return delegatableNode;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot delegate to an already delegated node");
            return null;
        }
        if (node.getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet = getKindSet();
        int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
        node.setKindSet$ui_release(calculateNodeKindSetFromIncludingDelegates);
        validateDelegateKindSet(calculateNodeKindSetFromIncludingDelegates, node);
        node.setChild$ui_release(this.delegate);
        this.delegate = node;
        node.setParent$ui_release(this);
        updateNodeKindSet(getKindSet() | calculateNodeKindSetFromIncludingDelegates, false);
        if (getIsAttached()) {
            if ((calculateNodeKindSetFromIncludingDelegates & NodeKind.m6362constructorimpl(2)) == 0 || (kindSet & NodeKind.m6362constructorimpl(2)) != 0) {
                updateCoordinator$ui_release(getCoordinator());
            } else {
                NodeChain nodes = DelegatableNodeKt.requireLayoutNode(this).getNodes();
                getNode().updateCoordinator$ui_release(null);
                nodes.syncCoordinators();
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(node);
        }
        return delegatableNode;
    }

    @NotNull
    public final <T extends DelegatableNode> T delegateUnprotected$ui_release(@NotNull T delegatableNode) {
        return (T) delegate(delegatableNode);
    }

    public final void forEachImmediateDelegate$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            block.invoke(delegate);
        }
    }

    @Nullable
    /* renamed from: getDelegate$ui_release, reason: from getter */
    public final Modifier.Node getDelegate() {
        return this.delegate;
    }

    /* renamed from: getSelfKindSet$ui_release, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.updateCoordinator$ui_release(getCoordinator());
            if (!delegate.getIsAttached()) {
                delegate.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsDetached$ui_release() {
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui_release() {
        super.reset$ui_release();
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.reset$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runAttachLifecycle$ui_release() {
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.runDetachLifecycle$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void setAsDelegateTo$ui_release(@NotNull Modifier.Node owner) {
        super.setAsDelegateTo$ui_release(owner);
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.setAsDelegateTo$ui_release(owner);
        }
    }

    public final void setDelegate$ui_release(@Nullable Modifier.Node node) {
        this.delegate = node;
    }

    public final void undelegate(@NotNull DelegatableNode instance) {
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.delegate; node2 != null; node2 = node2.getChild()) {
            if (node2 == instance) {
                if (node2.getIsAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(node2);
                    node2.runDetachLifecycle$ui_release();
                    node2.markAsDetached$ui_release();
                }
                node2.setAsDelegateTo$ui_release(node2);
                node2.setAggregateChildKindSet$ui_release(0);
                if (node == null) {
                    this.delegate = node2.getChild();
                } else {
                    node.setChild$ui_release(node2.getChild());
                }
                node2.setChild$ui_release(null);
                node2.setParent$ui_release(null);
                int kindSet = getKindSet();
                int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                updateNodeKindSet(calculateNodeKindSetFromIncludingDelegates, true);
                if (getIsAttached() && (kindSet & NodeKind.m6362constructorimpl(2)) != 0 && (NodeKind.m6362constructorimpl(2) & calculateNodeKindSetFromIncludingDelegates) == 0) {
                    NodeChain nodes = DelegatableNodeKt.requireLayoutNode(this).getNodes();
                    getNode().updateCoordinator$ui_release(null);
                    nodes.syncCoordinators();
                    return;
                }
                return;
            }
            node = node2;
        }
        PathKt$$ExternalSyntheticBUOutline0.m$3(instance, "Could not find delegate: ");
    }

    public final void undelegateUnprotected$ui_release(@NotNull DelegatableNode instance) {
        undelegate(instance);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui_release(@Nullable NodeCoordinator coordinator) {
        super.updateCoordinator$ui_release(coordinator);
        for (Modifier.Node delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.updateCoordinator$ui_release(coordinator);
        }
    }

    public static /* synthetic */ void getSelfKindSet$ui_release$annotations() {
    }
}
