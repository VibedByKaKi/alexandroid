package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJb\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ContentLayoutVariables;", "", ContentLayoutVariables.SIGNIFICANT_IMAGE_COUNT, "", ContentLayoutVariables.ACTION_COUNT, ContentLayoutVariables.TEXT_BLOCK_COUNT, ContentLayoutVariables.TEXT_LENGTH, ContentLayoutVariables.STRUCTURED_DATA_KEYS, "", "", ContentLayoutVariables.CLUSTER_COUNT, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;)V", "getSignificantImageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getActionCount", "getTextBlockCount", "getTextLength", "getStructuredDataKeys", "()Ljava/util/Map;", "getClusterCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/Integer;)Lcom/amazon/alexa/ra/core/data/fragments/ContentLayoutVariables;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ContentLayoutVariables {

    @NotNull
    public static final String ACTION_COUNT = "actionCount";

    @NotNull
    public static final String CLUSTER_COUNT = "clusterCount";

    @NotNull
    public static final String SIGNIFICANT_IMAGE_COUNT = "significantImageCount";

    @NotNull
    public static final String STRUCTURED_DATA_KEYS = "structuredDataKeys";

    @NotNull
    public static final String TEXT_BLOCK_COUNT = "textBlockCount";

    @NotNull
    public static final String TEXT_LENGTH = "textLength";

    @Nullable
    private final Integer actionCount;

    @Nullable
    private final Integer clusterCount;

    @Nullable
    private final Integer significantImageCount;

    @Nullable
    private final Map<String, Integer> structuredDataKeys;

    @Nullable
    private final Integer textBlockCount;

    @Nullable
    private final Integer textLength;
    public static final int $stable = 8;

    public /* synthetic */ ContentLayoutVariables(Integer num, Integer num2, Integer num3, Integer num4, Map map, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : num5);
    }

    public static /* synthetic */ ContentLayoutVariables copy$default(ContentLayoutVariables contentLayoutVariables, Integer num, Integer num2, Integer num3, Integer num4, Map map, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = contentLayoutVariables.significantImageCount;
        }
        if ((i & 2) != 0) {
            num2 = contentLayoutVariables.actionCount;
        }
        if ((i & 4) != 0) {
            num3 = contentLayoutVariables.textBlockCount;
        }
        if ((i & 8) != 0) {
            num4 = contentLayoutVariables.textLength;
        }
        if ((i & 16) != 0) {
            map = contentLayoutVariables.structuredDataKeys;
        }
        if ((i & 32) != 0) {
            num5 = contentLayoutVariables.clusterCount;
        }
        Map map2 = map;
        Integer num6 = num5;
        return contentLayoutVariables.copy(num, num2, num3, num4, map2, num6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getSignificantImageCount() {
        return this.significantImageCount;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getActionCount() {
        return this.actionCount;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getTextBlockCount() {
        return this.textBlockCount;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTextLength() {
        return this.textLength;
    }

    @Nullable
    public final Map<String, Integer> component5() {
        return this.structuredDataKeys;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getClusterCount() {
        return this.clusterCount;
    }

    @NotNull
    public final ContentLayoutVariables copy(@Nullable Integer significantImageCount, @Nullable Integer actionCount, @Nullable Integer textBlockCount, @Nullable Integer textLength, @Nullable Map<String, Integer> structuredDataKeys, @Nullable Integer clusterCount) {
        return new ContentLayoutVariables(significantImageCount, actionCount, textBlockCount, textLength, structuredDataKeys, clusterCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentLayoutVariables)) {
            return false;
        }
        ContentLayoutVariables contentLayoutVariables = (ContentLayoutVariables) other;
        return Intrinsics.areEqual(this.significantImageCount, contentLayoutVariables.significantImageCount) && Intrinsics.areEqual(this.actionCount, contentLayoutVariables.actionCount) && Intrinsics.areEqual(this.textBlockCount, contentLayoutVariables.textBlockCount) && Intrinsics.areEqual(this.textLength, contentLayoutVariables.textLength) && Intrinsics.areEqual(this.structuredDataKeys, contentLayoutVariables.structuredDataKeys) && Intrinsics.areEqual(this.clusterCount, contentLayoutVariables.clusterCount);
    }

    @Nullable
    public final Integer getActionCount() {
        return this.actionCount;
    }

    @Nullable
    public final Integer getClusterCount() {
        return this.clusterCount;
    }

    @Nullable
    public final Integer getSignificantImageCount() {
        return this.significantImageCount;
    }

    @Nullable
    public final Map<String, Integer> getStructuredDataKeys() {
        return this.structuredDataKeys;
    }

    @Nullable
    public final Integer getTextBlockCount() {
        return this.textBlockCount;
    }

    @Nullable
    public final Integer getTextLength() {
        return this.textLength;
    }

    public int hashCode() {
        Integer num = this.significantImageCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.actionCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.textBlockCount;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.textLength;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Map<String, Integer> map = this.structuredDataKeys;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num5 = this.clusterCount;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ContentLayoutVariables(significantImageCount=" + this.significantImageCount + ", actionCount=" + this.actionCount + ", textBlockCount=" + this.textBlockCount + ", textLength=" + this.textLength + ", structuredDataKeys=" + this.structuredDataKeys + ", clusterCount=" + this.clusterCount + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ContentLayoutVariables(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Map<String, Integer> map, @Nullable Integer num5) {
        this.significantImageCount = num;
        this.actionCount = num2;
        this.textBlockCount = num3;
        this.textLength = num4;
        this.structuredDataKeys = map;
        this.clusterCount = num5;
    }

    public ContentLayoutVariables() {
        this(null, null, null, null, null, null, 63, null);
    }
}
