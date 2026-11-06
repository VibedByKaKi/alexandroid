package com.amazon.alexa.accessory.speechapi.vision;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/DetailVisionCaptureCapabilities;", "", "supportedImageResolutions", "", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameResolution;", "supportedImageTypes", "", "supportedEnrichments", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionEnrichmentType;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSupportedEnrichments", "()Ljava/util/List;", "getSupportedImageResolutions", "getSupportedImageTypes", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DetailVisionCaptureCapabilities {

    @NotNull
    private final List<VisionEnrichmentType> supportedEnrichments;

    @NotNull
    private final List<VisionFrameResolution> supportedImageResolutions;

    @NotNull
    private final List<String> supportedImageTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public DetailVisionCaptureCapabilities(@NotNull List<VisionFrameResolution> list, @NotNull List<String> list2, @NotNull List<? extends VisionEnrichmentType> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.supportedImageResolutions = list;
        this.supportedImageTypes = list2;
        this.supportedEnrichments = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailVisionCaptureCapabilities copy$default(DetailVisionCaptureCapabilities detailVisionCaptureCapabilities, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = detailVisionCaptureCapabilities.supportedImageResolutions;
        }
        if ((i & 2) != 0) {
            list2 = detailVisionCaptureCapabilities.supportedImageTypes;
        }
        if ((i & 4) != 0) {
            list3 = detailVisionCaptureCapabilities.supportedEnrichments;
        }
        return detailVisionCaptureCapabilities.copy(list, list2, list3);
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
    public final DetailVisionCaptureCapabilities copy(@NotNull List<VisionFrameResolution> supportedImageResolutions, @NotNull List<String> supportedImageTypes, @NotNull List<? extends VisionEnrichmentType> supportedEnrichments) {
        supportedImageResolutions.getClass();
        supportedImageTypes.getClass();
        supportedEnrichments.getClass();
        return new DetailVisionCaptureCapabilities(supportedImageResolutions, supportedImageTypes, supportedEnrichments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailVisionCaptureCapabilities)) {
            return false;
        }
        DetailVisionCaptureCapabilities detailVisionCaptureCapabilities = (DetailVisionCaptureCapabilities) other;
        return Intrinsics.areEqual(this.supportedImageResolutions, detailVisionCaptureCapabilities.supportedImageResolutions) && Intrinsics.areEqual(this.supportedImageTypes, detailVisionCaptureCapabilities.supportedImageTypes) && Intrinsics.areEqual(this.supportedEnrichments, detailVisionCaptureCapabilities.supportedEnrichments);
    }

    @NotNull
    public final List<VisionEnrichmentType> getSupportedEnrichments() {
        return this.supportedEnrichments;
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
        return this.supportedEnrichments.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.supportedImageTypes, this.supportedImageResolutions.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        List<VisionFrameResolution> list = this.supportedImageResolutions;
        List<String> list2 = this.supportedImageTypes;
        List<VisionEnrichmentType> list3 = this.supportedEnrichments;
        StringBuilder sb = new StringBuilder("DetailVisionCaptureCapabilities(supportedImageResolutions=");
        sb.append(list);
        sb.append(", supportedImageTypes=");
        sb.append(list2);
        sb.append(", supportedEnrichments=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list3, sb);
    }
}
