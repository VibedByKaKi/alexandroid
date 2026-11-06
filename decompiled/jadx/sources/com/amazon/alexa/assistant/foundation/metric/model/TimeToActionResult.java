package com.amazon.alexa.assistant.foundation.metric.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/TimeToActionResult;", "", "latency", "", "metadata", "", "", "<init>", "(DLjava/util/Map;)V", "getLatency", "()D", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TimeToActionResult {
    private final double latency;

    @Nullable
    private final Map<String, Object> metadata;

    public TimeToActionResult(double d, @Nullable Map<String, ? extends Object> map) {
        this.latency = d;
        this.metadata = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeToActionResult copy$default(TimeToActionResult timeToActionResult, double d, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            d = timeToActionResult.latency;
        }
        if ((i & 2) != 0) {
            map = timeToActionResult.metadata;
        }
        return timeToActionResult.copy(d, map);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatency() {
        return this.latency;
    }

    @Nullable
    public final Map<String, Object> component2() {
        return this.metadata;
    }

    @NotNull
    public final TimeToActionResult copy(double latency, @Nullable Map<String, ? extends Object> metadata) {
        return new TimeToActionResult(latency, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeToActionResult)) {
            return false;
        }
        TimeToActionResult timeToActionResult = (TimeToActionResult) other;
        return Double.compare(this.latency, timeToActionResult.latency) == 0 && Intrinsics.areEqual(this.metadata, timeToActionResult.metadata);
    }

    public final double getLatency() {
        return this.latency;
    }

    @Nullable
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.latency) * 31;
        Map<String, Object> map = this.metadata;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "TimeToActionResult(latency=" + this.latency + ", metadata=" + this.metadata + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
