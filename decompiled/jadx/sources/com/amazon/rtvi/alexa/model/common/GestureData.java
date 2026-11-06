package com.amazon.rtvi.alexa.model.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.enums.GestureType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/GestureData;", "", "gestureType", "Lcom/amazon/rtvi/alexa/model/enums/GestureType;", "gestureDescription", "", "confidenceScore", "", "coordinates", "", "Lcom/amazon/rtvi/alexa/model/common/CoordinatePoint;", "<init>", "(Lcom/amazon/rtvi/alexa/model/enums/GestureType;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)V", "getGestureType", "()Lcom/amazon/rtvi/alexa/model/enums/GestureType;", "getGestureDescription", "()Ljava/lang/String;", "getConfidenceScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCoordinates", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Lcom/amazon/rtvi/alexa/model/enums/GestureType;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)Lcom/amazon/rtvi/alexa/model/common/GestureData;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GestureData {

    @Nullable
    private final Double confidenceScore;

    @Nullable
    private final List<CoordinatePoint> coordinates;

    @Nullable
    private final String gestureDescription;

    @NotNull
    private final GestureType gestureType;

    public /* synthetic */ GestureData(GestureType gestureType, String str, Double d, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gestureType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GestureData copy$default(GestureData gestureData, GestureType gestureType, String str, Double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            gestureType = gestureData.gestureType;
        }
        if ((i & 2) != 0) {
            str = gestureData.gestureDescription;
        }
        if ((i & 4) != 0) {
            d = gestureData.confidenceScore;
        }
        if ((i & 8) != 0) {
            list = gestureData.coordinates;
        }
        return gestureData.copy(gestureType, str, d, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final GestureType getGestureType() {
        return this.gestureType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getGestureDescription() {
        return this.gestureDescription;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getConfidenceScore() {
        return this.confidenceScore;
    }

    @Nullable
    public final List<CoordinatePoint> component4() {
        return this.coordinates;
    }

    @NotNull
    public final GestureData copy(@JsonProperty("gestureType") @NotNull GestureType gestureType, @JsonProperty("gestureDescription") @Nullable String gestureDescription, @JsonProperty("confidenceScore") @Nullable Double confidenceScore, @JsonProperty("coordinates") @Nullable List<CoordinatePoint> coordinates) {
        gestureType.getClass();
        return new GestureData(gestureType, gestureDescription, confidenceScore, coordinates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GestureData)) {
            return false;
        }
        GestureData gestureData = (GestureData) other;
        return this.gestureType == gestureData.gestureType && Intrinsics.areEqual(this.gestureDescription, gestureData.gestureDescription) && Intrinsics.areEqual((Object) this.confidenceScore, (Object) gestureData.confidenceScore) && Intrinsics.areEqual(this.coordinates, gestureData.coordinates);
    }

    @Nullable
    public final Double getConfidenceScore() {
        return this.confidenceScore;
    }

    @Nullable
    public final List<CoordinatePoint> getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final String getGestureDescription() {
        return this.gestureDescription;
    }

    @NotNull
    public final GestureType getGestureType() {
        return this.gestureType;
    }

    public int hashCode() {
        int hashCode = this.gestureType.hashCode() * 31;
        String str = this.gestureDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.confidenceScore;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        List<CoordinatePoint> list = this.coordinates;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GestureData(gestureType=" + this.gestureType + ", gestureDescription=" + this.gestureDescription + ", confidenceScore=" + this.confidenceScore + ", coordinates=" + this.coordinates + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public GestureData(@JsonProperty("gestureType") @NotNull GestureType gestureType, @JsonProperty("gestureDescription") @Nullable String str, @JsonProperty("confidenceScore") @Nullable Double d, @JsonProperty("coordinates") @Nullable List<CoordinatePoint> list) {
        gestureType.getClass();
        this.gestureType = gestureType;
        this.gestureDescription = str;
        this.confidenceScore = d;
        this.coordinates = list;
    }
}
