package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 \u00132\u00020\u0001:\u0003\u0011\u0012\u0013J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ5\u0010\t\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\rH&J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\rH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", Languages.ANY, "", "predicate", "Lkotlin/Function1;", "all", "then", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "Element", "Node", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Modifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Modifier then(@NotNull Modifier modifier, @NotNull Modifier modifier2) {
            return Modifier.super.then(modifier2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007J5\u0010\b\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007J\u001c\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\fH\u0016J\u001c\u0010\r\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\fH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", Languages.ANY, "", "predicate", "Lkotlin/Function1;", "all", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Element extends Modifier {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(@NotNull Element element, @NotNull Function1<? super Element, Boolean> function1) {
                return Element.super.all(function1);
            }

            @Deprecated
            public static boolean any(@NotNull Element element, @NotNull Function1<? super Element, Boolean> function1) {
                return Element.super.any(function1);
            }

            @Deprecated
            public static <R> R foldIn(@NotNull Element element, R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2) {
                return (R) Element.super.foldIn(r, function2);
            }

            @Deprecated
            public static <R> R foldOut(@NotNull Element element, R r, @NotNull Function2<? super Element, ? super R, ? extends R> function2) {
                return (R) Element.super.foldOut(r, function2);
            }

            @Deprecated
            @NotNull
            public static Modifier then(@NotNull Element element, @NotNull Modifier modifier) {
                return Element.super.then(modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(@NotNull Function1<? super Element, Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(@NotNull Function1<? super Element, Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
            return operation.invoke(initial, this);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldOut(R initial, @NotNull Function2<? super Element, ? super R, ? extends R> operation) {
            return operation.invoke(this, initial);
        }
    }

    boolean all(@NotNull Function1<? super Element, Boolean> predicate);

    boolean any(@NotNull Function1<? super Element, Boolean> predicate);

    <R> R foldIn(R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation);

    <R> R foldOut(R initial, @NotNull Function2<? super Element, ? super R, ? extends R> operation);

    @NotNull
    default Modifier then(@NotNull Modifier other) {
        return other == INSTANCE ? this : new CombinedModifier(this, other);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010>\u001a\u0002052\b\u0010%\u001a\u0004\u0018\u00010$H\u0010¢\u0006\u0002\b?J\u001c\u0010@\u001a\u00020)2\n\u0010A\u001a\u0006\u0012\u0002\b\u00030BH\u0080\b¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u000205H\u0010¢\u0006\u0002\bFJ\r\u0010G\u001a\u000205H\u0010¢\u0006\u0002\bHJ\r\u0010I\u001a\u000205H\u0010¢\u0006\u0002\bJJ\r\u0010K\u001a\u000205H\u0010¢\u0006\u0002\bLJ\r\u0010M\u001a\u000205H\u0010¢\u0006\u0002\bNJ\b\u0010O\u001a\u000205H\u0016J\b\u0010P\u001a\u000205H\u0016J\b\u0010Q\u001a\u000205H\u0016J\u0014\u0010R\u001a\u0002052\f\u0010S\u001a\b\u0012\u0004\u0012\u00020504J\u0015\u0010T\u001a\u0002052\u0006\u0010U\u001a\u00020\u0000H\u0010¢\u0006\u0002\bVR$\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0004\u001a\u0004\u0018\u00010$@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u000e\u00101\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020)@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u001a\u0010;\u001a\u00020)8VX\u0096\u0004¢\u0006\f\u0012\u0004\b<\u0010\u0003\u001a\u0004\b=\u0010+¨\u0006W"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "<init>", "()V", "value", "node", "getNode$annotations", "getNode", "()Landroidx/compose/ui/Modifier$Node;", PermissionsResponse.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "kindSet", "", "getKindSet$ui_release", "()I", "setKindSet$ui_release", "(I)V", "aggregateChildKindSet", "getAggregateChildKindSet$ui_release", "setAggregateChildKindSet$ui_release", RouteParameter.PARENT, "getParent$ui_release", "setParent$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", MetricKeys.VALUE_IS_CHILD, "getChild$ui_release", "setChild$ui_release", "ownerScope", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "getOwnerScope$ui_release", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "setOwnerScope$ui_release", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "getCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "insertedNodeAwaitingAttachForInvalidation", "", "getInsertedNodeAwaitingAttachForInvalidation$ui_release", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui_release", "(Z)V", "updatedNodeAwaitingAttachForInvalidation", "getUpdatedNodeAwaitingAttachForInvalidation$ui_release", "setUpdatedNodeAwaitingAttachForInvalidation$ui_release", "onAttachRunExpected", "onDetachRunExpected", "detachedListener", "Lkotlin/Function0;", "", "getDetachedListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "setDetachedListener$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "isAttached", "shouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "getShouldAutoInvalidate", "updateCoordinator", "updateCoordinator$ui_release", "isKind", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "Landroidx/compose/ui/node/NodeKind;", "isKind-H91voCI$ui_release", "(I)Z", "markAsAttached", "markAsAttached$ui_release", "runAttachLifecycle", "runAttachLifecycle$ui_release", "runDetachLifecycle", "runDetachLifecycle$ui_release", "markAsDetached", "markAsDetached$ui_release", "reset", "reset$ui_release", "onAttach", "onDetach", "onReset", "sideEffect", "effect", "setAsDelegateTo", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "setAsDelegateTo$ui_release", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,416:1\n1#2:417\n57#3,4:418\n57#3,4:422\n57#3,4:426\n57#3,4:430\n57#3,4:434\n57#3,4:438\n57#3,4:442\n57#3,4:446\n57#3,4:450\n57#3,4:454\n57#3,4:458\n*S KotlinDebug\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n250#1:418,4\n251#1:422,4\n259#1:426,4\n262#1:430,4\n271#1:434,4\n272#1:438,4\n275#1:442,4\n285#1:446,4\n286#1:450,4\n289#1:454,4\n301#1:458,4\n*E\n"})
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;

        @Nullable
        private Node child;

        @Nullable
        private NodeCoordinator coordinator;

        @Nullable
        private Function0<Unit> detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;

        @Nullable
        private ObserverNodeOwnerScope ownerScope;

        @Nullable
        private Node parent;

        @Nullable
        private CoroutineScope scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;

        @NotNull
        private Node node = this;
        private int aggregateChildKindSet = -1;

        /* renamed from: getAggregateChildKindSet$ui_release, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        @Nullable
        /* renamed from: getChild$ui_release, reason: from getter */
        public final Node getChild() {
            return this.child;
        }

        @Nullable
        /* renamed from: getCoordinator$ui_release, reason: from getter */
        public final NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        @NotNull
        public final CoroutineScope getCoroutineScope() {
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                return coroutineScope;
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(JobKt.Job((Job) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(Job.INSTANCE))));
            this.scope = CoroutineScope;
            return CoroutineScope;
        }

        @Nullable
        public final Function0<Unit> getDetachedListener$ui_release() {
            return this.detachedListener;
        }

        /* renamed from: getInsertedNodeAwaitingAttachForInvalidation$ui_release, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: getKindSet$ui_release, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        @NotNull
        public final Node getNode() {
            return this.node;
        }

        @Nullable
        /* renamed from: getOwnerScope$ui_release, reason: from getter */
        public final ObserverNodeOwnerScope getOwnerScope() {
            return this.ownerScope;
        }

        @Nullable
        /* renamed from: getParent$ui_release, reason: from getter */
        public final Node getParent() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        /* renamed from: getUpdatedNodeAwaitingAttachForInvalidation$ui_release, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: isAttached, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
        public final boolean m4135isKindH91voCI$ui_release(int kind) {
            return (getKindSet() & kind) != 0;
        }

        public void markAsAttached$ui_release() {
            if (this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            CoroutineScope coroutineScope = this.scope;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel(coroutineScope, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            Function0<Unit> function0 = this.detachedListener;
            if (function0 != null) {
                function0.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui_release(int i) {
            this.aggregateChildKindSet = i;
        }

        public void setAsDelegateTo$ui_release(@NotNull Node owner) {
            this.node = owner;
        }

        public final void setChild$ui_release(@Nullable Node node) {
            this.child = node;
        }

        public final void setDetachedListener$ui_release(@Nullable Function0<Unit> function0) {
            this.detachedListener = function0;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void setKindSet$ui_release(int i) {
            this.kindSet = i;
        }

        public final void setOwnerScope$ui_release(@Nullable ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui_release(@Nullable Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public final void sideEffect(@NotNull Function0<Unit> effect) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(effect);
        }

        public void updateCoordinator$ui_release(@Nullable NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u00050\bH\u0016¢\u0006\u0002\u0010\nJ5\u0010\u000b\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\bH\u0016¢\u0006\u0002\u0010\nJ\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u000fH\u0016J\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "<init>", "()V", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", Languages.ANY, "", "predicate", "Lkotlin/Function1;", "all", "then", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "toString", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(@NotNull Function1<? super Element, Boolean> predicate) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(@NotNull Function1<? super Element, Boolean> predicate) {
            return false;
        }

        @NotNull
        public String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.Modifier
        @NotNull
        public Modifier then(@NotNull Modifier other) {
            return other;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R initial, @NotNull Function2<? super Element, ? super R, ? extends R> operation) {
            return initial;
        }
    }
}
