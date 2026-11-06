package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserver;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.alexa.routing.api.RouteParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/CompositionObserverHolder;", "", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "root", "", RouteParameter.PARENT, "Landroidx/compose/runtime/CompositionContext;", "<init>", "(Landroidx/compose/runtime/tooling/CompositionObserver;ZLandroidx/compose/runtime/CompositionContext;)V", "getObserver", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "setObserver", "(Landroidx/compose/runtime/tooling/CompositionObserver;)V", "getRoot", "()Z", "setRoot", "(Z)V", "current", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompositionObserverHolder {
    public static final int $stable = 8;

    @Nullable
    private CompositionObserver observer;

    @NotNull
    private final CompositionContext parent;
    private boolean root;

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z, CompositionContext compositionContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : compositionObserver, (i & 2) != 0 ? false : z, compositionContext);
    }

    @Nullable
    public final CompositionObserver current() {
        if (this.root) {
            return this.observer;
        }
        CompositionObserverHolder observerHolder = this.parent.getObserverHolder();
        CompositionObserver compositionObserver = observerHolder != null ? observerHolder.observer : null;
        if (!Intrinsics.areEqual(compositionObserver, this.observer)) {
            this.observer = compositionObserver;
        }
        return compositionObserver;
    }

    @Nullable
    public final CompositionObserver getObserver() {
        return this.observer;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setObserver(@Nullable CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public final void setRoot(boolean z) {
        this.root = z;
    }

    public CompositionObserverHolder(@Nullable CompositionObserver compositionObserver, boolean z, @NotNull CompositionContext compositionContext) {
        this.observer = compositionObserver;
        this.root = z;
        this.parent = compositionContext;
    }
}
