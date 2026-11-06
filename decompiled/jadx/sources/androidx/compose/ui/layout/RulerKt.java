package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"mergeRulerValues", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "useGreater", "", "rulers", "", "Landroidx/compose/ui/layout/Ruler;", "defaultValue", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Z[Landroidx/compose/ui/layout/Ruler;F)F", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRuler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/RulerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,164:1\n13409#2,2:165\n*S KotlinDebug\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/RulerKt\n*L\n156#1:165,2\n*E\n"})
/* loaded from: classes13.dex */
public final class RulerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float mergeRulerValues(Placeable.PlacementScope placementScope, boolean z, Ruler[] rulerArr, float f) {
        float f2 = Float.NaN;
        for (Ruler ruler : rulerArr) {
            float current = placementScope.current(ruler, Float.NaN);
            if (!Float.isNaN(f2)) {
                int i = z != (current > f2) ? i + 1 : 0;
            }
            f2 = current;
        }
        return Float.isNaN(f2) ? f : f2;
    }
}
