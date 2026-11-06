package com.amazon.alexa.accessory.speechapi.vision;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;", "", "boundingPolygon", "", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionPoint;", "(Ljava/util/List;)V", "getBoundingPolygon", "()Ljava/util/List;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisionFrameLocation {

    @NotNull
    private final List<VisionPoint> boundingPolygon;

    public VisionFrameLocation(@NotNull List<VisionPoint> list) {
        list.getClass();
        this.boundingPolygon = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisionFrameLocation copy$default(VisionFrameLocation visionFrameLocation, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = visionFrameLocation.boundingPolygon;
        }
        return visionFrameLocation.copy(list);
    }

    @NotNull
    public final List<VisionPoint> component1() {
        return this.boundingPolygon;
    }

    @NotNull
    public final VisionFrameLocation copy(@NotNull List<VisionPoint> boundingPolygon) {
        boundingPolygon.getClass();
        return new VisionFrameLocation(boundingPolygon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VisionFrameLocation) && Intrinsics.areEqual(this.boundingPolygon, ((VisionFrameLocation) other).boundingPolygon);
    }

    @NotNull
    public final List<VisionPoint> getBoundingPolygon() {
        return this.boundingPolygon;
    }

    public int hashCode() {
        return this.boundingPolygon.hashCode();
    }

    @NotNull
    public String toString() {
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("VisionFrameLocation(boundingPolygon=", MarkdownConstants.RIGHT_PARENTHESIS, this.boundingPolygon);
    }
}
