package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u0007"}, d2 = {"checkLifecycleStateTransition", "", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "current", "Landroidx/lifecycle/Lifecycle$State;", "next", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LifecycleRegistryKt {
    public static final void checkLifecycleStateTransition(@Nullable LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull Lifecycle.State state2) {
        state.getClass();
        state2.getClass();
        if (state == Lifecycle.State.INITIALIZED && state2 == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + state2 + "' in component " + lifecycleOwner).toString());
        }
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state != state3 || state == state2) {
            return;
        }
        throw new IllegalStateException(("State is '" + state3 + "' and cannot be moved to `" + state2 + "` in component " + lifecycleOwner).toString());
    }
}
