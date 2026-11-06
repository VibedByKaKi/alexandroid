package com.amazon.alexa.accessory.speechapi.vision;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureCapabilities;", "", "detailCapabilities", "Lcom/amazon/alexa/accessory/speechapi/vision/DetailVisionCaptureCapabilities;", "temporalCapabilities", "Lcom/amazon/alexa/accessory/speechapi/vision/TemporalVisionCaptureCapabilities;", "(Lcom/amazon/alexa/accessory/speechapi/vision/DetailVisionCaptureCapabilities;Lcom/amazon/alexa/accessory/speechapi/vision/TemporalVisionCaptureCapabilities;)V", "getDetailCapabilities", "()Lcom/amazon/alexa/accessory/speechapi/vision/DetailVisionCaptureCapabilities;", "getTemporalCapabilities", "()Lcom/amazon/alexa/accessory/speechapi/vision/TemporalVisionCaptureCapabilities;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisionCaptureCapabilities {

    @Nullable
    private final DetailVisionCaptureCapabilities detailCapabilities;

    @Nullable
    private final TemporalVisionCaptureCapabilities temporalCapabilities;

    public VisionCaptureCapabilities(@Nullable DetailVisionCaptureCapabilities detailVisionCaptureCapabilities, @Nullable TemporalVisionCaptureCapabilities temporalVisionCaptureCapabilities) {
        this.detailCapabilities = detailVisionCaptureCapabilities;
        this.temporalCapabilities = temporalVisionCaptureCapabilities;
    }

    public static /* synthetic */ VisionCaptureCapabilities copy$default(VisionCaptureCapabilities visionCaptureCapabilities, DetailVisionCaptureCapabilities detailVisionCaptureCapabilities, TemporalVisionCaptureCapabilities temporalVisionCaptureCapabilities, int i, Object obj) {
        if ((i & 1) != 0) {
            detailVisionCaptureCapabilities = visionCaptureCapabilities.detailCapabilities;
        }
        if ((i & 2) != 0) {
            temporalVisionCaptureCapabilities = visionCaptureCapabilities.temporalCapabilities;
        }
        return visionCaptureCapabilities.copy(detailVisionCaptureCapabilities, temporalVisionCaptureCapabilities);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final DetailVisionCaptureCapabilities getDetailCapabilities() {
        return this.detailCapabilities;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final TemporalVisionCaptureCapabilities getTemporalCapabilities() {
        return this.temporalCapabilities;
    }

    @NotNull
    public final VisionCaptureCapabilities copy(@Nullable DetailVisionCaptureCapabilities detailCapabilities, @Nullable TemporalVisionCaptureCapabilities temporalCapabilities) {
        return new VisionCaptureCapabilities(detailCapabilities, temporalCapabilities);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionCaptureCapabilities)) {
            return false;
        }
        VisionCaptureCapabilities visionCaptureCapabilities = (VisionCaptureCapabilities) other;
        return Intrinsics.areEqual(this.detailCapabilities, visionCaptureCapabilities.detailCapabilities) && Intrinsics.areEqual(this.temporalCapabilities, visionCaptureCapabilities.temporalCapabilities);
    }

    @Nullable
    public final DetailVisionCaptureCapabilities getDetailCapabilities() {
        return this.detailCapabilities;
    }

    @Nullable
    public final TemporalVisionCaptureCapabilities getTemporalCapabilities() {
        return this.temporalCapabilities;
    }

    public int hashCode() {
        DetailVisionCaptureCapabilities detailVisionCaptureCapabilities = this.detailCapabilities;
        int hashCode = (detailVisionCaptureCapabilities == null ? 0 : detailVisionCaptureCapabilities.hashCode()) * 31;
        TemporalVisionCaptureCapabilities temporalVisionCaptureCapabilities = this.temporalCapabilities;
        return hashCode + (temporalVisionCaptureCapabilities != null ? temporalVisionCaptureCapabilities.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VisionCaptureCapabilities(detailCapabilities=" + this.detailCapabilities + ", temporalCapabilities=" + this.temporalCapabilities + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
