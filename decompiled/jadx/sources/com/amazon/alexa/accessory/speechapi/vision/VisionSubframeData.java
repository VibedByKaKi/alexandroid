package com.amazon.alexa.accessory.speechapi.vision;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\tHÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionSubframeData;", "", "processingTimestampMillis", "", "imageLocation", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;", "confidenceScore", "", "imageData", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionImageData;", "(JLcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;Ljava/lang/Float;Lcom/amazon/alexa/accessory/speechapi/vision/VisionImageData;)V", "getConfidenceScore", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getImageData", "()Lcom/amazon/alexa/accessory/speechapi/vision/VisionImageData;", "getImageLocation", "()Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;", "getProcessingTimestampMillis", "()J", "component1", "component2", "component3", "component4", "copy", "(JLcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;Ljava/lang/Float;Lcom/amazon/alexa/accessory/speechapi/vision/VisionImageData;)Lcom/amazon/alexa/accessory/speechapi/vision/VisionSubframeData;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisionSubframeData {

    @Nullable
    private final Float confidenceScore;

    @NotNull
    private final VisionImageData imageData;

    @NotNull
    private final VisionFrameLocation imageLocation;
    private final long processingTimestampMillis;

    public VisionSubframeData(long j, @NotNull VisionFrameLocation visionFrameLocation, @Nullable Float f, @NotNull VisionImageData visionImageData) {
        visionFrameLocation.getClass();
        visionImageData.getClass();
        this.processingTimestampMillis = j;
        this.imageLocation = visionFrameLocation;
        this.confidenceScore = f;
        this.imageData = visionImageData;
    }

    public static /* synthetic */ VisionSubframeData copy$default(VisionSubframeData visionSubframeData, long j, VisionFrameLocation visionFrameLocation, Float f, VisionImageData visionImageData, int i, Object obj) {
        if ((i & 1) != 0) {
            j = visionSubframeData.processingTimestampMillis;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            visionFrameLocation = visionSubframeData.imageLocation;
        }
        VisionFrameLocation visionFrameLocation2 = visionFrameLocation;
        if ((i & 4) != 0) {
            f = visionSubframeData.confidenceScore;
        }
        Float f2 = f;
        if ((i & 8) != 0) {
            visionImageData = visionSubframeData.imageData;
        }
        return visionSubframeData.copy(j2, visionFrameLocation2, f2, visionImageData);
    }

    /* renamed from: component1, reason: from getter */
    public final long getProcessingTimestampMillis() {
        return this.processingTimestampMillis;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final VisionFrameLocation getImageLocation() {
        return this.imageLocation;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getConfidenceScore() {
        return this.confidenceScore;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final VisionImageData getImageData() {
        return this.imageData;
    }

    @NotNull
    public final VisionSubframeData copy(long processingTimestampMillis, @NotNull VisionFrameLocation imageLocation, @Nullable Float confidenceScore, @NotNull VisionImageData imageData) {
        imageLocation.getClass();
        imageData.getClass();
        return new VisionSubframeData(processingTimestampMillis, imageLocation, confidenceScore, imageData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionSubframeData)) {
            return false;
        }
        VisionSubframeData visionSubframeData = (VisionSubframeData) other;
        return this.processingTimestampMillis == visionSubframeData.processingTimestampMillis && Intrinsics.areEqual(this.imageLocation, visionSubframeData.imageLocation) && Intrinsics.areEqual((Object) this.confidenceScore, (Object) visionSubframeData.confidenceScore) && Intrinsics.areEqual(this.imageData, visionSubframeData.imageData);
    }

    @Nullable
    public final Float getConfidenceScore() {
        return this.confidenceScore;
    }

    @NotNull
    public final VisionImageData getImageData() {
        return this.imageData;
    }

    @NotNull
    public final VisionFrameLocation getImageLocation() {
        return this.imageLocation;
    }

    public final long getProcessingTimestampMillis() {
        return this.processingTimestampMillis;
    }

    public int hashCode() {
        int hashCode = (this.imageLocation.hashCode() + (Long.hashCode(this.processingTimestampMillis) * 31)) * 31;
        Float f = this.confidenceScore;
        return this.imageData.hashCode() + ((hashCode + (f == null ? 0 : f.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "VisionSubframeData(processingTimestampMillis=" + this.processingTimestampMillis + ", imageLocation=" + this.imageLocation + ", confidenceScore=" + this.confidenceScore + ", imageData=" + this.imageData + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ VisionSubframeData(long j, VisionFrameLocation visionFrameLocation, Float f, VisionImageData visionImageData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, visionFrameLocation, (i & 4) != 0 ? null : f, visionImageData);
    }
}
