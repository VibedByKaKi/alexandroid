package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"DefaultDensity", "Landroidx/compose/ui/unit/Density;", "getDefaultDensity", "()Landroidx/compose/ui/unit/Density;", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DrawContextKt {

    @NotNull
    private static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    @NotNull
    public static final Density getDefaultDensity() {
        return DefaultDensity;
    }
}
