package androidx.compose.runtime;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/Invalidation;", "", PermissionsResponse.SCOPE_KEY, "Landroidx/compose/runtime/RecomposeScopeImpl;", "location", "", "instances", "<init>", "(Landroidx/compose/runtime/RecomposeScopeImpl;ILjava/lang/Object;)V", "getScope", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "getLocation", "()I", "setLocation", "(I)V", "getInstances", "()Ljava/lang/Object;", "setInstances", "(Ljava/lang/Object;)V", "isInvalid", "", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Invalidation {

    @Nullable
    private Object instances;
    private int location;

    @NotNull
    private final RecomposeScopeImpl scope;

    public Invalidation(@NotNull RecomposeScopeImpl recomposeScopeImpl, int i, @Nullable Object obj) {
        this.scope = recomposeScopeImpl;
        this.location = i;
        this.instances = obj;
    }

    @Nullable
    public final Object getInstances() {
        return this.instances;
    }

    public final int getLocation() {
        return this.location;
    }

    @NotNull
    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isInvalid() {
        return this.scope.isInvalidFor(this.instances);
    }

    public final void setInstances(@Nullable Object obj) {
        this.instances = obj;
    }

    public final void setLocation(int i) {
        this.location = i;
    }
}
