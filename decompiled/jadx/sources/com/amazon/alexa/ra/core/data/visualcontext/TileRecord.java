package com.amazon.alexa.ra.core.data.visualcontext;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0010\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/data/visualcontext/TileRecord;", "", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "<init>", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setCoordinates", "windowOrigin", "Landroidx/compose/ui/geometry/Offset;", "J", "size", "Landroidx/compose/ui/unit/IntSize;", "matches", "", "origin", "matches-CowoxoA", "(JJ)Z", "update", "", "update-CowoxoA", "(JJ)V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class TileRecord {

    @NotNull
    private LayoutCoordinates coordinates;
    private long size;
    private long windowOrigin;

    public TileRecord(@NotNull LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        this.coordinates = layoutCoordinates;
        this.windowOrigin = Offset.INSTANCE.m4415getUnspecifiedF1C5BW0();
        this.size = IntSize.INSTANCE.m7544getZeroYbymL2g();
    }

    @NotNull
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    /* renamed from: matches-CowoxoA, reason: not valid java name */
    public final boolean m17779matchesCowoxoA(long origin, long size) {
        return Offset.m4397equalsimpl0(origin, this.windowOrigin) && IntSize.m7537equalsimpl0(size, this.size);
    }

    public final void setCoordinates(@NotNull LayoutCoordinates layoutCoordinates) {
        layoutCoordinates.getClass();
        this.coordinates = layoutCoordinates;
    }

    /* renamed from: update-CowoxoA, reason: not valid java name */
    public final void m17780updateCowoxoA(long origin, long size) {
        this.windowOrigin = origin;
        this.size = size;
    }
}
