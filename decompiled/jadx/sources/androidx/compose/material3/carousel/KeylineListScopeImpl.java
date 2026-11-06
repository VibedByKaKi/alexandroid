package androidx.compose.material3.carousel;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.material3.carousel.CarouselAlignment;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016JT\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002J(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\b\u0010\u001f\u001a\u00020\u0004H\u0002J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002J \u0010\"\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl;", "Landroidx/compose/material3/carousel/KeylineListScope;", "()V", "firstFocalIndex", "", "focalItemSize", "", "pivotIndex", "pivotOffset", "tmpKeylines", "", "Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", BulkOperationType.add, "", "size", "isAnchor", "", "createKeylinesWithPivot", "", "Landroidx/compose/material3/carousel/Keyline;", "lastFocalIndex", "itemMainAxisSize", "carouselMainAxisSize", "itemSpacing", "createWithAlignment", "Landroidx/compose/material3/carousel/KeylineList;", "carouselAlignment", "Landroidx/compose/material3/carousel/CarouselAlignment;", "createWithAlignment-waks0t8", "(FFI)Landroidx/compose/material3/carousel/KeylineList;", "createWithPivot", "findLastFocalIndex", "isCutoffLeft", "offset", "isCutoffRight", "TmpKeyline", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeylineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,566:1\n1855#2,2:567\n1855#2,2:569\n*S KotlinDebug\n*F\n+ 1 KeylineList.kt\nandroidx/compose/material3/carousel/KeylineListScopeImpl\n*L\n455#1:567,2\n483#1:569,2\n*E\n"})
/* loaded from: classes13.dex */
final class KeylineListScopeImpl implements KeylineListScope {
    private float focalItemSize;
    private float pivotOffset;
    private int firstFocalIndex = -1;
    private int pivotIndex = -1;

    @NotNull
    private final List<TmpKeyline> tmpKeylines = new ArrayList();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "", "size", "", "isAnchor", "", "(FZ)V", "()Z", "getSize", "()F", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TmpKeyline {
        private final boolean isAnchor;
        private final float size;

        public TmpKeyline(float f, boolean z) {
            this.size = f;
            this.isAnchor = z;
        }

        public static /* synthetic */ TmpKeyline copy$default(TmpKeyline tmpKeyline, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                f = tmpKeyline.size;
            }
            if ((i & 2) != 0) {
                z = tmpKeyline.isAnchor;
            }
            return tmpKeyline.copy(f, z);
        }

        /* renamed from: component1, reason: from getter */
        public final float getSize() {
            return this.size;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAnchor() {
            return this.isAnchor;
        }

        @NotNull
        public final TmpKeyline copy(float size, boolean isAnchor) {
            return new TmpKeyline(size, isAnchor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) other;
            return Float.compare(this.size, tmpKeyline.size) == 0 && this.isAnchor == tmpKeyline.isAnchor;
        }

        public final float getSize() {
            return this.size;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAnchor) + (Float.hashCode(this.size) * 31);
        }

        public final boolean isAnchor() {
            return this.isAnchor;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("TmpKeyline(size=");
            sb.append(this.size);
            sb.append(", isAnchor=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.isAnchor, ')');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<androidx.compose.material3.carousel.Keyline> createKeylinesWithPivot(int r28, float r29, int r30, int r31, float r32, float r33, float r34, java.util.List<androidx.compose.material3.carousel.KeylineListScopeImpl.TmpKeyline> r35) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.KeylineListScopeImpl.createKeylinesWithPivot(int, float, int, int, float, float, float, java.util.List):java.util.List");
    }

    private final int findLastFocalIndex() {
        int i = this.firstFocalIndex;
        while (i < CollectionsKt.getLastIndex(this.tmpKeylines)) {
            int i2 = i + 1;
            if (this.tmpKeylines.get(i2).getSize() != this.focalItemSize) {
                break;
            }
            i = i2;
        }
        return i;
    }

    private final boolean isCutoffLeft(float size, float offset) {
        float f = size / 2;
        return offset - f < 0.0f && offset + f > 0.0f;
    }

    private final boolean isCutoffRight(float size, float offset, float carouselMainAxisSize) {
        float f = size / 2;
        return offset - f < carouselMainAxisSize && offset + f > carouselMainAxisSize;
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public void add(float size, boolean isAnchor) {
        this.tmpKeylines.add(new TmpKeyline(size, isAnchor));
        if (size > this.focalItemSize) {
            this.firstFocalIndex = CollectionsKt.getLastIndex(this.tmpKeylines);
            this.focalItemSize = size;
        }
    }

    @NotNull
    /* renamed from: createWithAlignment-waks0t8, reason: not valid java name */
    public final KeylineList m3138createWithAlignmentwaks0t8(float carouselMainAxisSize, float itemSpacing, int carouselAlignment) {
        float f;
        int findLastFocalIndex = findLastFocalIndex();
        int i = this.firstFocalIndex;
        int i2 = findLastFocalIndex - i;
        this.pivotIndex = i;
        CarouselAlignment.Companion companion = CarouselAlignment.INSTANCE;
        if (CarouselAlignment.m3122equalsimpl0(carouselAlignment, companion.m3126getCenterNUL3oTo())) {
            float f2 = 0.0f;
            if (itemSpacing != 0.0f) {
                int i3 = i2 % 2;
                if (i3 + ((((i3 ^ 2) & ((-i3) | i3)) >> 31) & 2) != 0) {
                    f2 = itemSpacing / 2.0f;
                }
            }
            float f3 = 2;
            f = ((carouselMainAxisSize / f3) - ((this.focalItemSize / f3) * i2)) - f2;
        } else {
            boolean m3122equalsimpl0 = CarouselAlignment.m3122equalsimpl0(carouselAlignment, companion.m3127getEndNUL3oTo());
            float f4 = this.focalItemSize;
            f = m3122equalsimpl0 ? carouselMainAxisSize - (f4 / 2) : f4 / 2;
        }
        this.pivotOffset = f;
        return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f, this.firstFocalIndex, findLastFocalIndex, this.focalItemSize, carouselMainAxisSize, itemSpacing, this.tmpKeylines));
    }

    @NotNull
    public final KeylineList createWithPivot(float carouselMainAxisSize, float itemSpacing, int pivotIndex, float pivotOffset) {
        return new KeylineList(createKeylinesWithPivot(pivotIndex, pivotOffset, this.firstFocalIndex, findLastFocalIndex(), this.focalItemSize, carouselMainAxisSize, itemSpacing, this.tmpKeylines));
    }
}
