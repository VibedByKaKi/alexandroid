package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/PixelTracking;", "", "url", "", "type", "Lcom/amazon/alexa/ra/core/data/fragments/PixelTrackingType;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/fragments/PixelTrackingType;)V", "getUrl", "()Ljava/lang/String;", "getType", "()Lcom/amazon/alexa/ra/core/data/fragments/PixelTrackingType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PixelTracking {
    public static final int $stable = 0;

    @NotNull
    public static final String TYPE = "type";

    @NotNull
    public static final String URL = "url";

    @NotNull
    private final PixelTrackingType type;

    @NotNull
    private final String url;

    public PixelTracking(@NotNull String str, @NotNull PixelTrackingType pixelTrackingType) {
        str.getClass();
        pixelTrackingType.getClass();
        this.url = str;
        this.type = pixelTrackingType;
    }

    public static /* synthetic */ PixelTracking copy$default(PixelTracking pixelTracking, String str, PixelTrackingType pixelTrackingType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pixelTracking.url;
        }
        if ((i & 2) != 0) {
            pixelTrackingType = pixelTracking.type;
        }
        return pixelTracking.copy(str, pixelTrackingType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PixelTrackingType getType() {
        return this.type;
    }

    @NotNull
    public final PixelTracking copy(@NotNull String url, @NotNull PixelTrackingType type) {
        url.getClass();
        type.getClass();
        return new PixelTracking(url, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixelTracking)) {
            return false;
        }
        PixelTracking pixelTracking = (PixelTracking) other;
        return Intrinsics.areEqual(this.url, pixelTracking.url) && this.type == pixelTracking.type;
    }

    @NotNull
    public final PixelTrackingType getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.url.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PixelTracking(url=" + this.url + ", type=" + this.type + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ PixelTracking(String str, PixelTrackingType pixelTrackingType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? PixelTrackingType.IMPRESSION : pixelTrackingType);
    }
}
