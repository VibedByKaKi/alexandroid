package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@InternalComposeApi
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0000\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010%\u001a\u00020&H\u0000¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR.\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001f¨\u0006("}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "content", "Landroidx/compose/runtime/MovableContent;", "parameter", "composition", "Landroidx/compose/runtime/ControlledComposition;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "anchor", "Landroidx/compose/runtime/Anchor;", "invalidations", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "locals", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "nestedReferences", "<init>", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/util/List;)V", "getContent$runtime", "()Landroidx/compose/runtime/MovableContent;", "getParameter$runtime", "()Ljava/lang/Object;", "getComposition$runtime", "()Landroidx/compose/runtime/ControlledComposition;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "getAnchor$runtime", "()Landroidx/compose/runtime/Anchor;", "getInvalidations$runtime", "()Ljava/util/List;", "setInvalidations$runtime", "(Ljava/util/List;)V", "getLocals$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getNestedReferences$runtime", "transferPendingInvalidations", "", "transferPendingInvalidations$runtime", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MovableContentStateReference {
    public static final int $stable = 8;

    @NotNull
    private final Anchor anchor;

    @NotNull
    private final ControlledComposition composition;

    @NotNull
    private final MovableContent<Object> content;

    @NotNull
    private List<? extends Pair<RecomposeScopeImpl, ? extends Object>> invalidations;

    @NotNull
    private final PersistentCompositionLocalMap locals;

    @Nullable
    private final List<MovableContentStateReference> nestedReferences;

    @Nullable
    private final Object parameter;

    @NotNull
    private final SlotTable slotTable;

    public MovableContentStateReference(@NotNull MovableContent<Object> movableContent, @Nullable Object obj, @NotNull ControlledComposition controlledComposition, @NotNull SlotTable slotTable, @NotNull Anchor anchor, @NotNull List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list, @NotNull PersistentCompositionLocalMap persistentCompositionLocalMap, @Nullable List<MovableContentStateReference> list2) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
        this.nestedReferences = list2;
    }

    @NotNull
    /* renamed from: getAnchor$runtime, reason: from getter */
    public final Anchor getAnchor() {
        return this.anchor;
    }

    @NotNull
    /* renamed from: getComposition$runtime, reason: from getter */
    public final ControlledComposition getComposition() {
        return this.composition;
    }

    @NotNull
    public final MovableContent<Object> getContent$runtime() {
        return this.content;
    }

    @NotNull
    public final List<Pair<RecomposeScopeImpl, Object>> getInvalidations$runtime() {
        return this.invalidations;
    }

    @NotNull
    /* renamed from: getLocals$runtime, reason: from getter */
    public final PersistentCompositionLocalMap getLocals() {
        return this.locals;
    }

    @Nullable
    public final List<MovableContentStateReference> getNestedReferences$runtime() {
        return this.nestedReferences;
    }

    @Nullable
    /* renamed from: getParameter$runtime, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    @NotNull
    /* renamed from: getSlotTable$runtime, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    public final void setInvalidations$runtime(@NotNull List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list) {
        this.invalidations = list;
    }

    public final void transferPendingInvalidations$runtime() {
        List<? extends Pair<RecomposeScopeImpl, ? extends Object>> list = this.invalidations;
        ControlledComposition controlledComposition = this.composition;
        controlledComposition.getClass();
        this.invalidations = CollectionsKt.plus((Collection) list, (Iterable) ((CompositionImpl) controlledComposition).extractInvalidationsOf$runtime(this.anchor));
    }
}
