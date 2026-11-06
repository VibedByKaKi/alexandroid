package com.amazon.alexa.perfusermonitoring.api;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpanOptions;", "", "startTime", "", "parentSpan", "Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpan;", "isFirstClass", "", "(Ljava/lang/Long;Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpan;Z)V", "storeInMap", "(Ljava/lang/Long;Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpan;ZZ)V", "()Z", "getParentSpan", "()Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpan;", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStoreInMap", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpan;ZZ)Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpanOptions;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidPerformanceUserMonitoringAPI_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PerformanceSpanOptions {
    private final boolean isFirstClass;

    @Nullable
    private final PerformanceSpan parentSpan;

    @Nullable
    private final Long startTime;
    private final boolean storeInMap;

    public /* synthetic */ PerformanceSpanOptions(Long l, PerformanceSpan performanceSpan, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : performanceSpan, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }

    public static /* synthetic */ PerformanceSpanOptions copy$default(PerformanceSpanOptions performanceSpanOptions, Long l, PerformanceSpan performanceSpan, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = performanceSpanOptions.startTime;
        }
        if ((i & 2) != 0) {
            performanceSpan = performanceSpanOptions.parentSpan;
        }
        if ((i & 4) != 0) {
            z = performanceSpanOptions.isFirstClass;
        }
        if ((i & 8) != 0) {
            z2 = performanceSpanOptions.storeInMap;
        }
        return performanceSpanOptions.copy(l, performanceSpan, z, z2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final PerformanceSpan getParentSpan() {
        return this.parentSpan;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFirstClass() {
        return this.isFirstClass;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getStoreInMap() {
        return this.storeInMap;
    }

    @NotNull
    public final PerformanceSpanOptions copy(@Nullable Long startTime, @Nullable PerformanceSpan parentSpan, boolean isFirstClass, boolean storeInMap) {
        return new PerformanceSpanOptions(startTime, parentSpan, isFirstClass, storeInMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformanceSpanOptions)) {
            return false;
        }
        PerformanceSpanOptions performanceSpanOptions = (PerformanceSpanOptions) other;
        return Intrinsics.areEqual(this.startTime, performanceSpanOptions.startTime) && Intrinsics.areEqual(this.parentSpan, performanceSpanOptions.parentSpan) && this.isFirstClass == performanceSpanOptions.isFirstClass && this.storeInMap == performanceSpanOptions.storeInMap;
    }

    @Nullable
    public final PerformanceSpan getParentSpan() {
        return this.parentSpan;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    public final boolean getStoreInMap() {
        return this.storeInMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Long l = this.startTime;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        PerformanceSpan performanceSpan = this.parentSpan;
        int hashCode2 = (hashCode + (performanceSpan != null ? performanceSpan.hashCode() : 0)) * 31;
        boolean z = this.isFirstClass;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.storeInMap;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isFirstClass() {
        return this.isFirstClass;
    }

    @NotNull
    public String toString() {
        Long l = this.startTime;
        PerformanceSpan performanceSpan = this.parentSpan;
        boolean z = this.isFirstClass;
        boolean z2 = this.storeInMap;
        StringBuilder sb = new StringBuilder("PerformanceSpanOptions(startTime=");
        sb.append(l);
        sb.append(", parentSpan=");
        sb.append(performanceSpan);
        sb.append(", isFirstClass=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(sb, z, ", storeInMap=", z2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public PerformanceSpanOptions(@Nullable Long l, @Nullable PerformanceSpan performanceSpan, boolean z, boolean z2) {
        this.startTime = l;
        this.parentSpan = performanceSpan;
        this.isFirstClass = z;
        this.storeInMap = z2;
    }

    public PerformanceSpanOptions() {
        this(null, null, false, false, 15, null);
    }

    public /* synthetic */ PerformanceSpanOptions(Long l, PerformanceSpan performanceSpan, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : performanceSpan, (i & 4) != 0 ? true : z);
    }

    public PerformanceSpanOptions(@Nullable Long l, @Nullable PerformanceSpan performanceSpan, boolean z) {
        this(l, performanceSpan, z, true);
    }
}
