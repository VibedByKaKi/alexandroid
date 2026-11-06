package com.amazon.alexa.accessory.speechapi.vision;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionFaceDetection;", "", "confidenceScore", "", "location", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;", "(FLcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;)V", "getConfidenceScore", "()F", "getLocation", "()Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisionFaceDetection {
    private final float confidenceScore;

    @NotNull
    private final VisionFrameLocation location;

    public VisionFaceDetection(float f, @NotNull VisionFrameLocation visionFrameLocation) {
        visionFrameLocation.getClass();
        this.confidenceScore = f;
        this.location = visionFrameLocation;
    }

    public static /* synthetic */ VisionFaceDetection copy$default(VisionFaceDetection visionFaceDetection, float f, VisionFrameLocation visionFrameLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            f = visionFaceDetection.confidenceScore;
        }
        if ((i & 2) != 0) {
            visionFrameLocation = visionFaceDetection.location;
        }
        return visionFaceDetection.copy(f, visionFrameLocation);
    }

    /* renamed from: component1, reason: from getter */
    public final float getConfidenceScore() {
        return this.confidenceScore;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final VisionFrameLocation getLocation() {
        return this.location;
    }

    @NotNull
    public final VisionFaceDetection copy(float confidenceScore, @NotNull VisionFrameLocation location) {
        location.getClass();
        return new VisionFaceDetection(confidenceScore, location);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionFaceDetection)) {
            return false;
        }
        VisionFaceDetection visionFaceDetection = (VisionFaceDetection) other;
        return Float.compare(this.confidenceScore, visionFaceDetection.confidenceScore) == 0 && Intrinsics.areEqual(this.location, visionFaceDetection.location);
    }

    public final float getConfidenceScore() {
        return this.confidenceScore;
    }

    @NotNull
    public final VisionFrameLocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        return this.location.hashCode() + (Float.hashCode(this.confidenceScore) * 31);
    }

    @NotNull
    public String toString() {
        return "VisionFaceDetection(confidenceScore=" + this.confidenceScore + ", location=" + this.location + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
