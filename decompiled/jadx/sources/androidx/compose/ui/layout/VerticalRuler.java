package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B*\b\u0002\u0012\u001f\u0010\u0002\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ%\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/VerticalRuler;", "Landroidx/compose/ui/layout/Ruler;", "calculation", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "()V", "calculateCoordinate", "coordinate", "sourceCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "targetCoordinates", "calculateCoordinate$ui_release", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRuler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/VerticalRuler\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,164:1\n59#2:165\n90#3:166\n53#3,3:168\n60#3:172\n30#4:167\n65#5:171\n22#6:173\n*S KotlinDebug\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/VerticalRuler\n*L\n60#1:165\n60#1:166\n60#1:168,3\n61#1:172\n60#1:167\n61#1:171\n61#1:173\n*E\n"})
/* loaded from: classes13.dex */
public final class VerticalRuler extends Ruler {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    private VerticalRuler(Function2<? super Placeable.PlacementScope, ? super Float, Float> function2) {
        super(function2, null);
    }

    @Override // androidx.compose.ui.layout.Ruler
    public float calculateCoordinate$ui_release(float coordinate, @NotNull LayoutCoordinates sourceCoordinates, @NotNull LayoutCoordinates targetCoordinates) {
        float mo6079getSizeYbymL2g = ((int) (sourceCoordinates.mo6079getSizeYbymL2g() & 4294967295L)) / 2.0f;
        return Float.intBitsToFloat((int) (targetCoordinates.mo6080localPositionOfR5De75A(sourceCoordinates, Offset.m4392constructorimpl((Float.floatToRawIntBits(mo6079getSizeYbymL2g) & 4294967295L) | (Float.floatToRawIntBits(coordinate) << 32))) >> 32));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0007\"\u00020\u0005¢\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0007\"\u00020\u0005¢\u0006\u0002\u0010\bJ4\u0010\n\u001a\u00020\u00052,\u0010\u000b\u001a(\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/layout/VerticalRuler$Companion;", "", "<init>", "()V", "maxOf", "Landroidx/compose/ui/layout/VerticalRuler;", "rulers", "", "([Landroidx/compose/ui/layout/VerticalRuler;)Landroidx/compose/ui/layout/VerticalRuler;", "minOf", "derived", "calculation", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ParameterName;", "name", "defaultValue", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VerticalRuler derived(@NotNull Function2<? super Placeable.PlacementScope, ? super Float, Float> calculation) {
            return new VerticalRuler(calculation, null);
        }

        @NotNull
        public final VerticalRuler maxOf(@NotNull final VerticalRuler... rulers) {
            return derived(new Function2<Placeable.PlacementScope, Float, Float>() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$maxOf$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Float invoke(Placeable.PlacementScope placementScope, Float f) {
                    return invoke(placementScope, f.floatValue());
                }

                public final Float invoke(Placeable.PlacementScope placementScope, float f) {
                    float mergeRulerValues;
                    mergeRulerValues = RulerKt.mergeRulerValues(placementScope, true, rulers, f);
                    return Float.valueOf(mergeRulerValues);
                }
            });
        }

        @NotNull
        public final VerticalRuler minOf(@NotNull final VerticalRuler... rulers) {
            return derived(new Function2<Placeable.PlacementScope, Float, Float>() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$minOf$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Float invoke(Placeable.PlacementScope placementScope, Float f) {
                    return invoke(placementScope, f.floatValue());
                }

                public final Float invoke(Placeable.PlacementScope placementScope, float f) {
                    float mergeRulerValues;
                    mergeRulerValues = RulerKt.mergeRulerValues(placementScope, false, rulers, f);
                    return Float.valueOf(mergeRulerValues);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ VerticalRuler(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    public VerticalRuler() {
        this(null);
    }
}
