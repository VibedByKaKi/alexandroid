package com.amazon.alexa.accessory.speechapi.vision;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003JI\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/TemporalVisionCaptureCapabilities;", "", "supportedImageResolutions", "", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameResolution;", "supportedImageTypes", "", "supportedEnrichments", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionEnrichmentType;", "supportedFrameRates", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSupportedEnrichments", "()Ljava/util/List;", "getSupportedFrameRates", "getSupportedImageResolutions", "getSupportedImageTypes", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TemporalVisionCaptureCapabilities {

    @NotNull
    private final List<VisionEnrichmentType> supportedEnrichments;

    @NotNull
    private final List<Float> supportedFrameRates;

    @NotNull
    private final List<VisionFrameResolution> supportedImageResolutions;

    @NotNull
    private final List<String> supportedImageTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public TemporalVisionCaptureCapabilities(@NotNull List<VisionFrameResolution> list, @NotNull List<String> list2, @NotNull List<? extends VisionEnrichmentType> list3, @NotNull List<Float> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.supportedImageResolutions = list;
        this.supportedImageTypes = list2;
        this.supportedEnrichments = list3;
        this.supportedFrameRates = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TemporalVisionCaptureCapabilities copy$default(TemporalVisionCaptureCapabilities temporalVisionCaptureCapabilities, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = temporalVisionCaptureCapabilities.supportedImageResolutions;
        }
        if ((i & 2) != 0) {
            list2 = temporalVisionCaptureCapabilities.supportedImageTypes;
        }
        if ((i & 4) != 0) {
            list3 = temporalVisionCaptureCapabilities.supportedEnrichments;
        }
        if ((i & 8) != 0) {
            list4 = temporalVisionCaptureCapabilities.supportedFrameRates;
        }
        return temporalVisionCaptureCapabilities.copy(list, list2, list3, list4);
    }

    @NotNull
    public final List<VisionFrameResolution> component1() {
        return this.supportedImageResolutions;
    }

    @NotNull
    public final List<String> component2() {
        return this.supportedImageTypes;
    }

    @NotNull
    public final List<VisionEnrichmentType> component3() {
        return this.supportedEnrichments;
    }

    @NotNull
    public final List<Float> component4() {
        return this.supportedFrameRates;
    }

    @NotNull
    public final TemporalVisionCaptureCapabilities copy(@NotNull List<VisionFrameResolution> supportedImageResolutions, @NotNull List<String> supportedImageTypes, @NotNull List<? extends VisionEnrichmentType> supportedEnrichments, @NotNull List<Float> supportedFrameRates) {
        supportedImageResolutions.getClass();
        supportedImageTypes.getClass();
        supportedEnrichments.getClass();
        supportedFrameRates.getClass();
        return new TemporalVisionCaptureCapabilities(supportedImageResolutions, supportedImageTypes, supportedEnrichments, supportedFrameRates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemporalVisionCaptureCapabilities)) {
            return false;
        }
        TemporalVisionCaptureCapabilities temporalVisionCaptureCapabilities = (TemporalVisionCaptureCapabilities) other;
        return Intrinsics.areEqual(this.supportedImageResolutions, temporalVisionCaptureCapabilities.supportedImageResolutions) && Intrinsics.areEqual(this.supportedImageTypes, temporalVisionCaptureCapabilities.supportedImageTypes) && Intrinsics.areEqual(this.supportedEnrichments, temporalVisionCaptureCapabilities.supportedEnrichments) && Intrinsics.areEqual(this.supportedFrameRates, temporalVisionCaptureCapabilities.supportedFrameRates);
    }

    @NotNull
    public final List<VisionEnrichmentType> getSupportedEnrichments() {
        return this.supportedEnrichments;
    }

    @NotNull
    public final List<Float> getSupportedFrameRates() {
        return this.supportedFrameRates;
    }

    @NotNull
    public final List<VisionFrameResolution> getSupportedImageResolutions() {
        return this.supportedImageResolutions;
    }

    @NotNull
    public final List<String> getSupportedImageTypes() {
        return this.supportedImageTypes;
    }

    public int hashCode() {
        return this.supportedFrameRates.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.supportedEnrichments, ArcMode$$ExternalSyntheticOutline0.m(this.supportedImageTypes, this.supportedImageResolutions.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "TemporalVisionCaptureCapabilities(supportedImageResolutions=" + this.supportedImageResolutions + ", supportedImageTypes=" + this.supportedImageTypes + ", supportedEnrichments=" + this.supportedEnrichments + ", supportedFrameRates=" + this.supportedFrameRates + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
