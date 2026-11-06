package androidx.compose.runtime.tooling;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"findCompositionInstance", "Landroidx/compose/runtime/tooling/CompositionInstance;", "Landroidx/compose/runtime/tooling/CompositionData;", SmartFragmentContent.RUNTIME}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompositionDataKt {
    @Nullable
    public static final CompositionInstance findCompositionInstance(@NotNull CompositionData compositionData) {
        if (compositionData instanceof CompositionInstance) {
            return (CompositionInstance) compositionData;
        }
        return null;
    }
}
