package com.amazon.alexa.pmi.implementation.taplatency;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 *2\u00020\u0001:\u0001*BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0000J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006+"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/PixelChange;", "", "changedPx", "", "left", "top", "right", "bottom", "tiles", "Lcom/amazon/alexa/pmi/implementation/taplatency/TileSet;", "tinyTiles", "<init>", "(IIIIILcom/amazon/alexa/pmi/implementation/taplatency/TileSet;Lcom/amazon/alexa/pmi/implementation/taplatency/TileSet;)V", "getChangedPx", "()I", "getLeft", "getTop", "getRight", "getBottom", "getTiles", "()Lcom/amazon/alexa/pmi/implementation/taplatency/TileSet;", "getTinyTiles", "area", "", "getArea", "()J", "iou", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "hashCode", "toString", "", "Companion", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PixelChange {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PixelChange NEW_WINDOW;

    @NotNull
    private static final PixelChange UNKNOWN;
    private final int bottom;
    private final int changedPx;
    private final int left;
    private final int right;

    @NotNull
    private final TileSet tiles;

    @NotNull
    private final TileSet tinyTiles;
    private final int top;

    static {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        TileSet tileSet = null;
        NEW_WINDOW = new PixelChange(Integer.MAX_VALUE, i, i2, i3, i4, null, tileSet, 96, null);
        UNKNOWN = new PixelChange(i, i2, i3, i4, 0, tileSet, null, 96, null);
    }

    public /* synthetic */ PixelChange(int i, int i2, int i3, int i4, int i5, TileSet tileSet, TileSet tileSet2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, (i6 & 32) != 0 ? TileSet.INSTANCE.getNONE() : tileSet, (i6 & 64) != 0 ? TileSet.INSTANCE.getNONE() : tileSet2);
    }

    public static /* synthetic */ PixelChange copy$default(PixelChange pixelChange, int i, int i2, int i3, int i4, int i5, TileSet tileSet, TileSet tileSet2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = pixelChange.changedPx;
        }
        if ((i6 & 2) != 0) {
            i2 = pixelChange.left;
        }
        if ((i6 & 4) != 0) {
            i3 = pixelChange.top;
        }
        if ((i6 & 8) != 0) {
            i4 = pixelChange.right;
        }
        if ((i6 & 16) != 0) {
            i5 = pixelChange.bottom;
        }
        if ((i6 & 32) != 0) {
            tileSet = pixelChange.tiles;
        }
        if ((i6 & 64) != 0) {
            tileSet2 = pixelChange.tinyTiles;
        }
        TileSet tileSet3 = tileSet;
        TileSet tileSet4 = tileSet2;
        int i7 = i5;
        int i8 = i3;
        return pixelChange.copy(i, i2, i8, i4, i7, tileSet3, tileSet4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getChangedPx() {
        return this.changedPx;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TileSet getTiles() {
        return this.tiles;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TileSet getTinyTiles() {
        return this.tinyTiles;
    }

    @NotNull
    public final PixelChange copy(int changedPx, int left, int top, int right, int bottom, @NotNull TileSet tiles, @NotNull TileSet tinyTiles) {
        tiles.getClass();
        tinyTiles.getClass();
        return new PixelChange(changedPx, left, top, right, bottom, tiles, tinyTiles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixelChange)) {
            return false;
        }
        PixelChange pixelChange = (PixelChange) other;
        return this.changedPx == pixelChange.changedPx && this.left == pixelChange.left && this.top == pixelChange.top && this.right == pixelChange.right && this.bottom == pixelChange.bottom && Intrinsics.areEqual(this.tiles, pixelChange.tiles) && Intrinsics.areEqual(this.tinyTiles, pixelChange.tinyTiles);
    }

    public final long getArea() {
        return RangesKt.coerceAtLeast(this.bottom - this.top, 0L) * RangesKt.coerceAtLeast(this.right - this.left, 0L);
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getChangedPx() {
        return this.changedPx;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    @NotNull
    public final TileSet getTiles() {
        return this.tiles;
    }

    @NotNull
    public final TileSet getTinyTiles() {
        return this.tinyTiles;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.tinyTiles.hashCode() + ((this.tiles.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.bottom, ArcMode$$ExternalSyntheticOutline0.m(this.right, ArcMode$$ExternalSyntheticOutline0.m(this.top, ArcMode$$ExternalSyntheticOutline0.m(this.left, Integer.hashCode(this.changedPx) * 31, 31), 31), 31), 31)) * 31);
    }

    public final double iou(@NotNull PixelChange other) {
        other.getClass();
        long coerceAtLeast = RangesKt.coerceAtLeast(Math.min(this.right, other.right) - Math.max(this.left, other.left), 0) * RangesKt.coerceAtLeast(Math.min(this.bottom, other.bottom) - Math.max(this.top, other.top), 0);
        long area = (other.getArea() + getArea()) - coerceAtLeast;
        if (area <= 0) {
            return 0.0d;
        }
        return coerceAtLeast / area;
    }

    @NotNull
    public String toString() {
        int i = this.changedPx;
        int i2 = this.left;
        int i3 = this.top;
        int i4 = this.right;
        int i5 = this.bottom;
        TileSet tileSet = this.tiles;
        TileSet tileSet2 = this.tinyTiles;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "PixelChange(changedPx=", ", left=", ", top=");
        TableInfo$$ExternalSyntheticOutline0.m(m29m, i3, ", right=", i4, ", bottom=");
        m29m.append(i5);
        m29m.append(", tiles=");
        m29m.append(tileSet);
        m29m.append(", tinyTiles=");
        m29m.append(tileSet2);
        m29m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m29m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/PixelChange$Companion;", "", "<init>", "()V", "NEW_WINDOW", "Lcom/amazon/alexa/pmi/implementation/taplatency/PixelChange;", "getNEW_WINDOW", "()Lcom/amazon/alexa/pmi/implementation/taplatency/PixelChange;", "UNKNOWN", "getUNKNOWN", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PixelChange getNEW_WINDOW() {
            return PixelChange.NEW_WINDOW;
        }

        @NotNull
        public final PixelChange getUNKNOWN() {
            return PixelChange.UNKNOWN;
        }

        private Companion() {
        }
    }

    public PixelChange(int i, int i2, int i3, int i4, int i5, @NotNull TileSet tileSet, @NotNull TileSet tileSet2) {
        tileSet.getClass();
        tileSet2.getClass();
        this.changedPx = i;
        this.left = i2;
        this.top = i3;
        this.right = i4;
        this.bottom = i5;
        this.tiles = tileSet;
        this.tinyTiles = tileSet2;
    }
}
