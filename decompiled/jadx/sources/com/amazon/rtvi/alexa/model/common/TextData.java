package com.amazon.rtvi.alexa.model.common;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J6\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/TextData;", "", "text", "", "confidenceScore", "", "coordinates", "", "Lcom/amazon/rtvi/alexa/model/common/CoordinatePoint;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "getConfidenceScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCoordinates", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)Lcom/amazon/rtvi/alexa/model/common/TextData;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TextData {

    @Nullable
    private final Double confidenceScore;

    @Nullable
    private final List<CoordinatePoint> coordinates;

    @NotNull
    private final String text;

    public /* synthetic */ TextData(String str, Double d, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextData copy$default(TextData textData, String str, Double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textData.text;
        }
        if ((i & 2) != 0) {
            d = textData.confidenceScore;
        }
        if ((i & 4) != 0) {
            list = textData.coordinates;
        }
        return textData.copy(str, d, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getConfidenceScore() {
        return this.confidenceScore;
    }

    @Nullable
    public final List<CoordinatePoint> component3() {
        return this.coordinates;
    }

    @NotNull
    public final TextData copy(@JsonProperty("text") @NotNull String text, @JsonProperty("confidenceScore") @Nullable Double confidenceScore, @JsonProperty("coordinates") @Nullable List<CoordinatePoint> coordinates) {
        text.getClass();
        return new TextData(text, confidenceScore, coordinates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextData)) {
            return false;
        }
        TextData textData = (TextData) other;
        return Intrinsics.areEqual(this.text, textData.text) && Intrinsics.areEqual((Object) this.confidenceScore, (Object) textData.confidenceScore) && Intrinsics.areEqual(this.coordinates, textData.coordinates);
    }

    @Nullable
    public final Double getConfidenceScore() {
        return this.confidenceScore;
    }

    @Nullable
    public final List<CoordinatePoint> getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Double d = this.confidenceScore;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        List<CoordinatePoint> list = this.coordinates;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        Double d = this.confidenceScore;
        List<CoordinatePoint> list = this.coordinates;
        StringBuilder sb = new StringBuilder("TextData(text=");
        sb.append(str);
        sb.append(", confidenceScore=");
        sb.append(d);
        sb.append(", coordinates=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, sb);
    }

    public TextData(@JsonProperty("text") @NotNull String str, @JsonProperty("confidenceScore") @Nullable Double d, @JsonProperty("coordinates") @Nullable List<CoordinatePoint> list) {
        str.getClass();
        this.text = str;
        this.confidenceScore = d;
        this.coordinates = list;
    }
}
