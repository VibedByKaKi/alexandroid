package com.mapbox.maps.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionLayout;", "", "logo", "Landroid/graphics/Bitmap;", "anchorPoint", "Landroid/graphics/PointF;", "isShortText", "", "(Landroid/graphics/Bitmap;Landroid/graphics/PointF;Z)V", "getAnchorPoint", "()Landroid/graphics/PointF;", "()Z", "getLogo", "()Landroid/graphics/Bitmap;", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AttributionLayout {

    @Nullable
    private final PointF anchorPoint;
    private final boolean isShortText;

    @Nullable
    private final Bitmap logo;

    public AttributionLayout(@Nullable Bitmap bitmap, @Nullable PointF pointF, boolean z) {
        this.logo = bitmap;
        this.anchorPoint = pointF;
        this.isShortText = z;
    }

    public static /* synthetic */ AttributionLayout copy$default(AttributionLayout attributionLayout, Bitmap bitmap, PointF pointF, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = attributionLayout.logo;
        }
        if ((i & 2) != 0) {
            pointF = attributionLayout.anchorPoint;
        }
        if ((i & 4) != 0) {
            z = attributionLayout.isShortText;
        }
        return attributionLayout.copy(bitmap, pointF, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getLogo() {
        return this.logo;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final PointF getAnchorPoint() {
        return this.anchorPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsShortText() {
        return this.isShortText;
    }

    @NotNull
    public final AttributionLayout copy(@Nullable Bitmap logo, @Nullable PointF anchorPoint, boolean isShortText) {
        return new AttributionLayout(logo, anchorPoint, isShortText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributionLayout)) {
            return false;
        }
        AttributionLayout attributionLayout = (AttributionLayout) other;
        return Intrinsics.areEqual(this.logo, attributionLayout.logo) && Intrinsics.areEqual(this.anchorPoint, attributionLayout.anchorPoint) && this.isShortText == attributionLayout.isShortText;
    }

    @Nullable
    public final PointF getAnchorPoint() {
        return this.anchorPoint;
    }

    @Nullable
    public final Bitmap getLogo() {
        return this.logo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Bitmap bitmap = this.logo;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        PointF pointF = this.anchorPoint;
        int hashCode2 = (hashCode + (pointF != null ? pointF.hashCode() : 0)) * 31;
        boolean z = this.isShortText;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final boolean isShortText() {
        return this.isShortText;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AttributionLayout(logo=");
        sb.append(this.logo);
        sb.append(", anchorPoint=");
        sb.append(this.anchorPoint);
        sb.append(", isShortText=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.isShortText, ')');
    }
}
