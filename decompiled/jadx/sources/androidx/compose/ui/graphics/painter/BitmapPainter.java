package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0014J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010 \u001a\u00020\u001f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u001f\u0010!\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u001c\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I$ui_graphics_release", "()I", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "I", "size", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "applyAlpha", "", "applyColorFilter", "validateSize", "validateSize-N5eqBDc", "(JJ)J", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,155:1\n30#2:156\n30#2:172\n80#3:157\n60#3:159\n70#3:166\n80#3:173\n85#3:175\n90#3:177\n85#3:179\n90#3:181\n57#4:158\n61#4:165\n22#5,5:160\n22#5,5:167\n54#6:174\n59#6:176\n54#6:178\n59#6:180\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n*L\n70#1:156\n94#1:172\n70#1:157\n95#1:159\n96#1:166\n94#1:173\n123#1:175\n124#1:177\n125#1:179\n126#1:181\n95#1:158\n96#1:165\n95#1:160,5\n96#1:167,5\n123#1:174\n124#1:176\n125#1:178\n126#1:180\n*E\n"})
/* loaded from: classes13.dex */
public final class BitmapPainter extends Painter {
    private float alpha;

    @Nullable
    private ColorFilter colorFilter;
    private int filterQuality;

    @NotNull
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.INSTANCE.m7507getZeronOccac() : j, (i & 4) != 0 ? IntSize.m7534constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j2, null);
    }

    /* renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m5350validateSizeN5eqBDc(long srcOffset, long srcSize) {
        int i;
        int i2;
        if (IntOffset.m7496getXimpl(srcOffset) >= 0 && IntOffset.m7497getYimpl(srcOffset) >= 0 && (i = (int) (srcSize >> 32)) >= 0 && (i2 = (int) (4294967295L & srcSize)) >= 0 && i <= this.image.getWidth() && i2 <= this.image.getHeight()) {
            return srcSize;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        return 0L;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) other;
        return Intrinsics.areEqual(this.image, bitmapPainter.image) && IntOffset.m7495equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m7537equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m4740equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name and from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo5352getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m7551toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return FilterQuality.m4741hashCodeimpl(this.filterQuality) + ((IntSize.m7540hashCodeimpl(this.srcSize) + ((IntOffset.m7498hashCodeimpl(this.srcOffset) + (this.image.hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        DrawScope.m5215drawImageAZ2fEMs$default(drawScope, this.image, this.srcOffset, this.srcSize, 0L, IntSize.m7534constructorimpl((Math.round(Float.intBitsToFloat((int) (drawScope.mo5232getSizeNHjbRc() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (drawScope.mo5232getSizeNHjbRc() >> 32))) << 32)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m5353setFilterQualityvDHp3xo$ui_graphics_release(int i) {
        this.filterQuality = i;
    }

    @NotNull
    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m7503toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m7542toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m4742toStringimpl(this.filterQuality)) + ')';
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j, j2);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j, long j2) {
        this.image = imageBitmap;
        this.srcOffset = j;
        this.srcSize = j2;
        this.filterQuality = FilterQuality.INSTANCE.m4745getLowfv9h1I();
        this.size = m5350validateSizeN5eqBDc(j, j2);
        this.alpha = 1.0f;
    }
}
