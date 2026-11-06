package androidx.compose.ui.layout;

import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ModifierLocalBeyondBoundsLayout", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getModifierLocalBeyondBoundsLayout", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BeyondBoundsLayoutKt {

    @NotNull
    private static final ProvidableModifierLocal<BeyondBoundsLayout> ModifierLocalBeyondBoundsLayout = ModifierLocalKt.modifierLocalOf(new Function0<BeyondBoundsLayout>() { // from class: androidx.compose.ui.layout.BeyondBoundsLayoutKt$ModifierLocalBeyondBoundsLayout$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final BeyondBoundsLayout invoke() {
            return null;
        }
    });

    @NotNull
    public static final ProvidableModifierLocal<BeyondBoundsLayout> getModifierLocalBeyondBoundsLayout() {
        return ModifierLocalBeyondBoundsLayout;
    }
}
