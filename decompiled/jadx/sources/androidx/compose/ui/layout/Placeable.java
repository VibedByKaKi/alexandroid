package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J:\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0019\u0010\u001d\u001a\u0015\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001e¢\u0006\u0002\b H$¢\u0006\u0004\b!\u0010\"J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0014¢\u0006\u0004\b!\u0010%R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f@DX\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010'\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020&@DX\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R \u0010*\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a@BX\u0084\u000e¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b+\u0010\u0012¨\u0006-"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "value", "", "width", "getWidth", "()I", "height", "getHeight", "measuredWidth", "getMeasuredWidth", "measuredHeight", "getMeasuredHeight", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "J", "onMeasuredSizeChanged", "", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", ViewProps.Z_INDEX, "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "PlacementScope", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,586:1\n30#2:587\n80#3:588\n85#3:590\n90#3:592\n85#3:594\n90#3:596\n85#3:598\n90#3:600\n80#3:602\n54#4:589\n59#4:591\n54#4:593\n59#4:595\n54#4:597\n59#4:599\n32#5:601\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable\n*L\n68#1:587\n68#1:588\n61#1:590\n65#1:592\n78#1:594\n83#1:596\n88#1:598\n88#1:600\n88#1:602\n61#1:589\n65#1:591\n78#1:593\n83#1:595\n88#1:597\n88#1:599\n88#1:601\n*E\n"})
/* loaded from: classes13.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private long apparentToRealOffset;
    private int height;
    private long measuredSize;
    private long measurementConstraints;
    private int width;

    public Placeable() {
        long j;
        long j2 = 0;
        this.measuredSize = IntSize.m7534constructorimpl((j2 & 4294967295L) | (j2 << 32));
        j = PlaceableKt.DefaultConstraints;
        this.measurementConstraints = j;
        this.apparentToRealOffset = IntOffset.INSTANCE.m7507getZeronOccac();
    }

    private final void onMeasuredSizeChanged() {
        this.width = RangesKt.coerceIn((int) (this.measuredSize >> 32), Constraints.m7323getMinWidthimpl(this.measurementConstraints), Constraints.m7321getMaxWidthimpl(this.measurementConstraints));
        this.height = RangesKt.coerceIn((int) (this.measuredSize & 4294967295L), Constraints.m7322getMinHeightimpl(this.measurementConstraints), Constraints.m7320getMaxHeightimpl(this.measurementConstraints));
        int i = this.width;
        long j = this.measuredSize;
        this.apparentToRealOffset = IntOffset.m7490constructorimpl((((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2)));
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo6133placeAtf8xVGno(long position, float zIndex, @NotNull GraphicsLayer layer) {
        mo6072placeAtf8xVGno(position, zIndex, (Function1<? super GraphicsLayerScope, Unit>) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo6072placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m6134setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m7537equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m6135setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m7314equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        onMeasuredSizeChanged();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0016\u001a\u00020\u0005*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J#\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J$\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u0005J$\u0010#\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u0005J#\u0010#\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b$\u0010 J>\u0010%\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a0'¢\u0006\u0002\b)¢\u0006\u0004\b*\u0010+J?\u0010%\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a0'¢\u0006\u0002\b)J?\u0010,\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a0'¢\u0006\u0002\b)J>\u0010,\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a0'¢\u0006\u0002\b)¢\u0006\u0004\b-\u0010+J,\u0010,\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001e\u001a\u00020\u0005J+\u0010,\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b-\u00100J,\u0010%\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001e\u001a\u00020\u0005J+\u0010%\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b*\u00100JA\u00101\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u001b\b\b\u0010&\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a\u0018\u00010'¢\u0006\u0002\b)H\u0080\b¢\u0006\u0004\b2\u0010+J,\u00101\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/H\u0080\b¢\u0006\u0004\b2\u00103JA\u00104\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u001b\b\b\u0010&\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a\u0018\u00010'¢\u0006\u0002\b)H\u0080\b¢\u0006\u0004\b5\u0010+J,\u00104\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/H\u0080\b¢\u0006\u0004\b5\u00103J\u001f\u00108\u001a\u00020\u001a2\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001a0'¢\u0006\u0002\b)J\f\u0010:\u001a\u00020\u001a*\u00020\u001bH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u000bX¤\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/unit/Density;", "<init>", "()V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "parentWidth", "", "getParentWidth", "()I", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "current", "Landroidx/compose/ui/layout/Ruler;", "defaultValue", "placeRelative", "", "Landroidx/compose/ui/layout/Placeable;", "position", "Landroidx/compose/ui/unit/IntOffset;", ViewProps.Z_INDEX, "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "place", "place-70tqf50", "placeRelativeWithLayer", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeApparentToRealOffset", "placeApparentToRealOffset-aW-9-wM$ui_release", "motionFrameOfReferencePlacement", "", "withMotionFrameOfReferencePlacement", "block", "handleMotionFrameOfReferencePlacement", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @PlacementScopeMarker
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,586:1\n435#1,2:587\n469#1,3:589\n438#1,2:592\n469#1,3:596\n444#1:599\n435#1,2:602\n469#1,3:604\n438#1,2:607\n469#1,3:609\n444#1:612\n469#1,3:615\n469#1,3:618\n435#1,2:621\n469#1,3:623\n438#1,2:626\n469#1,3:630\n444#1:633\n435#1,2:636\n469#1,3:638\n438#1,2:641\n469#1,3:643\n444#1:646\n469#1,3:649\n469#1,3:652\n479#1,3:657\n479#1,3:660\n452#1,2:665\n479#1,3:667\n455#1,2:670\n479#1,3:672\n461#1:675\n452#1,2:676\n479#1,3:678\n455#1,2:681\n479#1,3:685\n461#1:688\n469#1,3:689\n469#1,3:694\n479#1,3:697\n479#1,3:702\n32#2:594\n32#2:600\n32#2:613\n32#2:628\n32#2:634\n32#2:647\n32#2:655\n32#2:663\n32#2:683\n32#2:692\n32#2:700\n80#3:595\n80#3:601\n80#3:614\n80#3:629\n80#3:635\n80#3:648\n80#3:656\n80#3:664\n80#3:684\n80#3:693\n80#3:701\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n215#1:587,2\n215#1:589,3\n215#1:592,2\n215#1:596,3\n215#1:599\n232#1:602,2\n232#1:604,3\n232#1:607,2\n232#1:609,3\n232#1:612\n246#1:615,3\n259#1:618,3\n281#1:621,2\n281#1:623,3\n281#1:626,2\n281#1:630,3\n281#1:633\n305#1:636,2\n305#1:638,3\n305#1:641,2\n305#1:643,3\n305#1:646\n326#1:649,3\n345#1:652,3\n362#1:657,3\n381#1:660,3\n405#1:665,2\n405#1:667,3\n405#1:670,2\n405#1:672,3\n405#1:675\n427#1:676,2\n427#1:678,3\n427#1:681,2\n427#1:685,3\n427#1:688\n436#1:689,3\n438#1:694,3\n453#1:697,3\n455#1:702,3\n215#1:594\n232#1:600\n246#1:613\n281#1:628\n305#1:634\n326#1:647\n362#1:655\n405#1:663\n427#1:683\n439#1:692\n456#1:700\n215#1:595\n232#1:601\n246#1:614\n281#1:629\n305#1:635\n326#1:648\n362#1:656\n405#1:664\n427#1:684\n439#1:693\n456#1:701\n*E\n"})
    public static abstract class PlacementScope implements Density {
        public static final int $stable = 0;
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: place");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m6136place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: place-70tqf50");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m6142place70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeRelative");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m6137placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m6147placeRelative70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m6138placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m6148placeRelativeWithLayeraW9wM(placeable, j, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeWithLayer");
                return;
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m6140placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m6150placeWithLayeraW9wM(placeable, j, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        @Nullable
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i, int i2, float f) {
            placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((i2 & 4294967295L) | (i << 32))), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m6142place70tqf50(@NotNull Placeable placeable, long j, float f) {
            placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m6143placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeable, long j, float f, @NotNull GraphicsLayer graphicsLayer) {
            placeable.mo6133placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m6146placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeable, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, function1);
                return;
            }
            placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((IntOffset.m7497getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7496getXimpl(j)) << 32))), f, function1);
        }

        public final void placeRelative(@NotNull Placeable placeable, int i, int i2, float f) {
            long m7490constructorimpl = IntOffset.m7490constructorimpl((i << 32) | (i2 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, m7490constructorimpl), f, (Function1<? super GraphicsLayerScope, Unit>) null);
            } else {
                placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m7496getXimpl(m7490constructorimpl)) << 32) | (IntOffset.m7497getYimpl(m7490constructorimpl) & 4294967295L))), f, (Function1<? super GraphicsLayerScope, Unit>) null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m6147placeRelative70tqf50(@NotNull Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, (Function1<? super GraphicsLayerScope, Unit>) null);
                return;
            }
            placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((IntOffset.m7497getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7496getXimpl(j)) << 32))), f, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            long m7490constructorimpl = IntOffset.m7490constructorimpl((i << 32) | (i2 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, m7490constructorimpl), f, function1);
            } else {
                placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m7496getXimpl(m7490constructorimpl)) << 32) | (IntOffset.m7497getYimpl(m7490constructorimpl) & 4294967295L))), f, function1);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m6148placeRelativeWithLayeraW9wM(@NotNull Placeable placeable, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, function1);
                return;
            }
            placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((IntOffset.m7497getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7496getXimpl(j)) << 32))), f, function1);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((i2 & 4294967295L) | (i << 32))), f, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m6150placeWithLayeraW9wM(@NotNull Placeable placeable, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, function1);
        }

        public final void withMotionFrameOfReferencePlacement(@NotNull Function1<? super PlacementScope, Unit> block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m6144placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeable, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            placeable.mo6072placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m6151placeWithLayeraW9wM(@NotNull Placeable placeable, long j, @NotNull GraphicsLayer graphicsLayer, float f) {
            placeable.mo6133placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, graphicsLayer);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i2, @NotNull GraphicsLayer graphicsLayer, float f) {
            placeable.mo6133placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((i2 & 4294967295L) | (i << 32))), f, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m6139placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m6149placeRelativeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m6141placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m6151placeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
                return;
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: placeWithLayer");
                return;
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        public float current(@NotNull Ruler ruler, float f) {
            return f;
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m6145placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeable, long j, float f, @NotNull GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6133placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, graphicsLayer);
                return;
            }
            placeable.mo6133placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((IntOffset.m7497getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7496getXimpl(j)) << 32))), f, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m6149placeRelativeWithLayeraW9wM(@NotNull Placeable placeable, long j, @NotNull GraphicsLayer graphicsLayer, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6133placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, graphicsLayer);
                return;
            }
            placeable.mo6133placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((IntOffset.m7497getYimpl(j) & 4294967295L) | (((getParentWidth() - placeable.getWidth()) - IntOffset.m7496getXimpl(j)) << 32))), f, graphicsLayer);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i2, @NotNull GraphicsLayer graphicsLayer, float f) {
            long m7490constructorimpl = IntOffset.m7490constructorimpl((i << 32) | (i2 & 4294967295L));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo6133placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, m7490constructorimpl), f, graphicsLayer);
            } else {
                placeable.mo6133placeAtf8xVGno(AppLaunchChecker$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m7490constructorimpl((((getParentWidth() - placeable.getWidth()) - IntOffset.m7496getXimpl(m7490constructorimpl)) << 32) | (IntOffset.m7497getYimpl(m7490constructorimpl) & 4294967295L))), f, graphicsLayer);
            }
        }
    }
}
