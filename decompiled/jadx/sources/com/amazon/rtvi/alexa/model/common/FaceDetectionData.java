package com.amazon.rtvi.alexa.model.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/FaceDetectionData;", "", "confidenceScore", "", "coordinates", "", "Lcom/amazon/rtvi/alexa/model/common/CoordinatePoint;", "<init>", "(Ljava/lang/Double;Ljava/util/List;)V", "getConfidenceScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCoordinates", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/util/List;)Lcom/amazon/rtvi/alexa/model/common/FaceDetectionData;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FaceDetectionData {

    @Nullable
    private final Double confidenceScore;

    @NotNull
    private final List<CoordinatePoint> coordinates;

    public FaceDetectionData(@JsonProperty("confidenceScore") @Nullable Double d, @JsonProperty("coordinates") @NotNull List<CoordinatePoint> list) {
        list.getClass();
        this.confidenceScore = d;
        this.coordinates = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaceDetectionData copy$default(FaceDetectionData faceDetectionData, Double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = faceDetectionData.confidenceScore;
        }
        if ((i & 2) != 0) {
            list = faceDetectionData.coordinates;
        }
        return faceDetectionData.copy(d, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getConfidenceScore() {
        return this.confidenceScore;
    }

    @NotNull
    public final List<CoordinatePoint> component2() {
        return this.coordinates;
    }

    @NotNull
    public final FaceDetectionData copy(@JsonProperty("confidenceScore") @Nullable Double confidenceScore, @JsonProperty("coordinates") @NotNull List<CoordinatePoint> coordinates) {
        coordinates.getClass();
        return new FaceDetectionData(confidenceScore, coordinates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceDetectionData)) {
            return false;
        }
        FaceDetectionData faceDetectionData = (FaceDetectionData) other;
        return Intrinsics.areEqual((Object) this.confidenceScore, (Object) faceDetectionData.confidenceScore) && Intrinsics.areEqual(this.coordinates, faceDetectionData.coordinates);
    }

    @Nullable
    public final Double getConfidenceScore() {
        return this.confidenceScore;
    }

    @NotNull
    public final List<CoordinatePoint> getCoordinates() {
        return this.coordinates;
    }

    public int hashCode() {
        Double d = this.confidenceScore;
        return this.coordinates.hashCode() + ((d == null ? 0 : d.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "FaceDetectionData(confidenceScore=" + this.confidenceScore + ", coordinates=" + this.coordinates + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ FaceDetectionData(Double d, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, list);
    }
}
