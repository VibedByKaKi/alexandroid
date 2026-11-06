package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetProperties;", "", "shouldDismissOnBackPress", "", "(Z)V", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isFocusable", "(Landroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "(Landroidx/compose/ui/window/SecureFlagPolicy;Z)V", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getShouldDismissOnBackPress", "()Z", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalBottomSheetProperties {
    public static final int $stable = 0;

    @NotNull
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    public /* synthetic */ ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 2) != 0 ? true : z);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ModalBottomSheetProperties) && this.securePolicy == ((ModalBottomSheetProperties) other).securePolicy;
    }

    @NotNull
    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldDismissOnBackPress) + (this.securePolicy.hashCode() * 31);
    }

    public ModalBottomSheetProperties(@NotNull SecureFlagPolicy secureFlagPolicy, boolean z) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetProperties() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public ModalBottomSheetProperties(boolean z) {
        this(SecureFlagPolicy.Inherit, z);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "'isFocusable' param is no longer used. Use constructor without this parameter.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetProperties(securePolicy, shouldDismissOnBackPress)", imports = {}))
    public ModalBottomSheetProperties(@NotNull SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2) {
        this(secureFlagPolicy, z2);
    }
}
