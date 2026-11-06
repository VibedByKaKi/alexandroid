package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u001b\u0010\u0015\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bHÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR(\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/RankedContentItemMetadata;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "upc", "", "topicId", "", "selectedReasons", "additionalProperties", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getUpc", "()Ljava/lang/String;", "getTopicId", "()Ljava/util/List;", "getSelectedReasons", "getAdditionalProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class RankedContentItemMetadata implements JSONConvertible {
    public static final int $stable = 8;

    @SerializedName("additionalProperties")
    @Nullable
    private final Map<String, String> additionalProperties;

    @SerializedName("selectedReasons")
    @Nullable
    private final List<String> selectedReasons;

    @SerializedName("topicIds")
    @Nullable
    private final List<String> topicId;

    @SerializedName("upc")
    @Nullable
    private final String upc;

    public /* synthetic */ RankedContentItemMetadata(String str, List list, List list2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankedContentItemMetadata copy$default(RankedContentItemMetadata rankedContentItemMetadata, String str, List list, List list2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rankedContentItemMetadata.upc;
        }
        if ((i & 2) != 0) {
            list = rankedContentItemMetadata.topicId;
        }
        if ((i & 4) != 0) {
            list2 = rankedContentItemMetadata.selectedReasons;
        }
        if ((i & 8) != 0) {
            map = rankedContentItemMetadata.additionalProperties;
        }
        return rankedContentItemMetadata.copy(str, list, list2, map);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUpc() {
        return this.upc;
    }

    @Nullable
    public final List<String> component2() {
        return this.topicId;
    }

    @Nullable
    public final List<String> component3() {
        return this.selectedReasons;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.additionalProperties;
    }

    @NotNull
    public final RankedContentItemMetadata copy(@Nullable String upc, @Nullable List<String> topicId, @Nullable List<String> selectedReasons, @Nullable Map<String, String> additionalProperties) {
        return new RankedContentItemMetadata(upc, topicId, selectedReasons, additionalProperties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankedContentItemMetadata)) {
            return false;
        }
        RankedContentItemMetadata rankedContentItemMetadata = (RankedContentItemMetadata) other;
        return Intrinsics.areEqual(this.upc, rankedContentItemMetadata.upc) && Intrinsics.areEqual(this.topicId, rankedContentItemMetadata.topicId) && Intrinsics.areEqual(this.selectedReasons, rankedContentItemMetadata.selectedReasons) && Intrinsics.areEqual(this.additionalProperties, rankedContentItemMetadata.additionalProperties);
    }

    @Nullable
    public final Map<String, String> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Nullable
    public final List<String> getSelectedReasons() {
        return this.selectedReasons;
    }

    @Nullable
    public final List<String> getTopicId() {
        return this.topicId;
    }

    @Nullable
    public final String getUpc() {
        return this.upc;
    }

    public int hashCode() {
        String str = this.upc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.topicId;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.selectedReasons;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, String> map = this.additionalProperties;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.upc;
        List<String> list = this.topicId;
        List<String> list2 = this.selectedReasons;
        Map<String, String> map = this.additionalProperties;
        StringBuilder m14724m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("RankedContentItemMetadata(upc=", str, ", topicId=", (List) list, ", selectedReasons=");
        m14724m.append(list2);
        m14724m.append(", additionalProperties=");
        m14724m.append(map);
        m14724m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m14724m.toString();
    }

    public RankedContentItemMetadata(@Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable Map<String, String> map) {
        this.upc = str;
        this.topicId = list;
        this.selectedReasons = list2;
        this.additionalProperties = map;
    }

    public RankedContentItemMetadata() {
        this(null, null, null, null, 15, null);
    }
}
