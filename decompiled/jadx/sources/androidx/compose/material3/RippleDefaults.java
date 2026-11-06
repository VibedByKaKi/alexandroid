package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/RippleDefaults;", "", "()V", "RippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "getRippleAlpha", "()Landroidx/compose/material/ripple/RippleAlpha;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RippleDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final RippleDefaults INSTANCE = new RippleDefaults();

    @NotNull
    private static final RippleAlpha RippleAlpha = new RippleAlpha(0.16f, 0.1f, 0.08f, 0.1f);

    private RippleDefaults() {
    }

    @NotNull
    public final RippleAlpha getRippleAlpha() {
        return RippleAlpha;
    }
}
