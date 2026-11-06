package com.amazon.alexa.accessory.speechapi.vision;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionTextDetection;", "", "text", "", "confidenceScore", "", "location", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;", "(Ljava/lang/String;FLcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;)V", "getConfidenceScore", "()F", "getLocation", "()Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameLocation;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisionTextDetection {
    private final float confidenceScore;

    @NotNull
    private final VisionFrameLocation location;

    @NotNull
    private final String text;

    public VisionTextDetection(@NotNull String str, float f, @NotNull VisionFrameLocation visionFrameLocation) {
        str.getClass();
        visionFrameLocation.getClass();
        this.text = str;
        this.confidenceScore = f;
        this.location = visionFrameLocation;
    }

    public static /* synthetic */ VisionTextDetection copy$default(VisionTextDetection visionTextDetection, String str, float f, VisionFrameLocation visionFrameLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = visionTextDetection.text;
        }
        if ((i & 2) != 0) {
            f = visionTextDetection.confidenceScore;
        }
        if ((i & 4) != 0) {
            visionFrameLocation = visionTextDetection.location;
        }
        return visionTextDetection.copy(str, f, visionFrameLocation);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final float getConfidenceScore() {
        return this.confidenceScore;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final VisionFrameLocation getLocation() {
        return this.location;
    }

    @NotNull
    public final VisionTextDetection copy(@NotNull String text, float confidenceScore, @NotNull VisionFrameLocation location) {
        text.getClass();
        location.getClass();
        return new VisionTextDetection(text, confidenceScore, location);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionTextDetection)) {
            return false;
        }
        VisionTextDetection visionTextDetection = (VisionTextDetection) other;
        return Intrinsics.areEqual(this.text, visionTextDetection.text) && Float.compare(this.confidenceScore, visionTextDetection.confidenceScore) == 0 && Intrinsics.areEqual(this.location, visionTextDetection.location);
    }

    public final float getConfidenceScore() {
        return this.confidenceScore;
    }

    @NotNull
    public final VisionFrameLocation getLocation() {
        return this.location;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.location.hashCode() + DoubleList$$ExternalSyntheticOutline0.m(this.confidenceScore, this.text.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "VisionTextDetection(text=" + this.text + ", confidenceScore=" + this.confidenceScore + ", location=" + this.location + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
