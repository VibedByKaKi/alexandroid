package androidx.compose.foundation.interaction;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"MutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InteractionSourceKt {
    @NotNull
    public static final MutableInteractionSource MutableInteractionSource() {
        return new MutableInteractionSourceImpl();
    }
}
