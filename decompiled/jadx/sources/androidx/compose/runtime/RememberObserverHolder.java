package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/RememberObserverHolder;", "", "wrapped", "Landroidx/compose/runtime/RememberObserver;", "after", "Landroidx/compose/runtime/Anchor;", "<init>", "(Landroidx/compose/runtime/RememberObserver;Landroidx/compose/runtime/Anchor;)V", "getWrapped", "()Landroidx/compose/runtime/RememberObserver;", "setWrapped", "(Landroidx/compose/runtime/RememberObserver;)V", "getAfter", "()Landroidx/compose/runtime/Anchor;", "setAfter", "(Landroidx/compose/runtime/Anchor;)V", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RememberObserverHolder {
    public static final int $stable = 8;

    @Nullable
    private Anchor after;

    @NotNull
    private RememberObserver wrapped;

    public RememberObserverHolder(@NotNull RememberObserver rememberObserver, @Nullable Anchor anchor) {
        this.wrapped = rememberObserver;
        this.after = anchor;
    }

    @Nullable
    public final Anchor getAfter() {
        return this.after;
    }

    @NotNull
    public final RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setAfter(@Nullable Anchor anchor) {
        this.after = anchor;
    }

    public final void setWrapped(@NotNull RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
