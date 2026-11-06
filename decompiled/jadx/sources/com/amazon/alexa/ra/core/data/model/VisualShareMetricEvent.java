package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.common.metrics.CoreUiEventMetadataKey;
import com.amazon.alexa.ra.common.metrics.CoreUiEventName;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/VisualShareMetricEvent;", "", "name", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;", "metadata", "", "Lcom/amazon/alexa/ra/common/metrics/CoreUiEventMetadataKey;", "<init>", "(Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;Ljava/util/Map;)V", "getName", "()Lcom/amazon/alexa/ra/common/metrics/CoreUiEventName;", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class VisualShareMetricEvent {
    public static final int $stable = 8;

    @NotNull
    private final Map<CoreUiEventMetadataKey, Object> metadata;

    @NotNull
    private final CoreUiEventName name;

    public VisualShareMetricEvent(@NotNull CoreUiEventName coreUiEventName, @NotNull Map<CoreUiEventMetadataKey, ? extends Object> map) {
        coreUiEventName.getClass();
        map.getClass();
        this.name = coreUiEventName;
        this.metadata = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisualShareMetricEvent copy$default(VisualShareMetricEvent visualShareMetricEvent, CoreUiEventName coreUiEventName, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            coreUiEventName = visualShareMetricEvent.name;
        }
        if ((i & 2) != 0) {
            map = visualShareMetricEvent.metadata;
        }
        return visualShareMetricEvent.copy(coreUiEventName, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CoreUiEventName getName() {
        return this.name;
    }

    @NotNull
    public final Map<CoreUiEventMetadataKey, Object> component2() {
        return this.metadata;
    }

    @NotNull
    public final VisualShareMetricEvent copy(@NotNull CoreUiEventName name, @NotNull Map<CoreUiEventMetadataKey, ? extends Object> metadata) {
        name.getClass();
        metadata.getClass();
        return new VisualShareMetricEvent(name, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualShareMetricEvent)) {
            return false;
        }
        VisualShareMetricEvent visualShareMetricEvent = (VisualShareMetricEvent) other;
        return this.name == visualShareMetricEvent.name && Intrinsics.areEqual(this.metadata, visualShareMetricEvent.metadata);
    }

    @NotNull
    public final Map<CoreUiEventMetadataKey, Object> getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final CoreUiEventName getName() {
        return this.name;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VisualShareMetricEvent(name=" + this.name + ", metadata=" + this.metadata + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ VisualShareMetricEvent(CoreUiEventName coreUiEventName, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coreUiEventName, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }
}
