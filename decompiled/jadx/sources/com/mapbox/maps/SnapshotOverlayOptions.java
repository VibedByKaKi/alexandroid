package com.mapbox.maps;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mapbox/maps/SnapshotOverlayOptions;", "", "showLogo", "", "showAttributes", "(ZZ)V", "getShowAttributes", "()Z", "getShowLogo", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SnapshotOverlayOptions {
    private final boolean showAttributes;
    private final boolean showLogo;

    public /* synthetic */ SnapshotOverlayOptions(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public static /* synthetic */ SnapshotOverlayOptions copy$default(SnapshotOverlayOptions snapshotOverlayOptions, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = snapshotOverlayOptions.showLogo;
        }
        if ((i & 2) != 0) {
            z2 = snapshotOverlayOptions.showAttributes;
        }
        return snapshotOverlayOptions.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowLogo() {
        return this.showLogo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowAttributes() {
        return this.showAttributes;
    }

    @NotNull
    public final SnapshotOverlayOptions copy(boolean showLogo, boolean showAttributes) {
        return new SnapshotOverlayOptions(showLogo, showAttributes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnapshotOverlayOptions)) {
            return false;
        }
        SnapshotOverlayOptions snapshotOverlayOptions = (SnapshotOverlayOptions) other;
        return this.showLogo == snapshotOverlayOptions.showLogo && this.showAttributes == snapshotOverlayOptions.showAttributes;
    }

    public final boolean getShowAttributes() {
        return this.showAttributes;
    }

    public final boolean getShowLogo() {
        return this.showLogo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.showLogo;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.showAttributes;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SnapshotOverlayOptions(showLogo=");
        sb.append(this.showLogo);
        sb.append(", showAttributes=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.showAttributes, ')');
    }

    @JvmOverloads
    public SnapshotOverlayOptions(boolean z) {
        this(z, false, 2, null);
    }

    @JvmOverloads
    public SnapshotOverlayOptions(boolean z, boolean z2) {
        this.showLogo = z;
        this.showAttributes = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SnapshotOverlayOptions() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.SnapshotOverlayOptions.<init>():void");
    }
}
