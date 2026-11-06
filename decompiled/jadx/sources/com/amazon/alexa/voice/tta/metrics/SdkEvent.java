package com.amazon.alexa.voice.tta.metrics;

import com.amazon.alexa.api.UiEventName;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.tta.metrics.EventTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/voice/tta/metrics/SdkEvent;", "", "name", "Lcom/amazon/alexa/api/UiEventName;", "source", "", "latency", "Lcom/amazon/alexa/voice/tta/metrics/EventTime$Interval;", "<init>", "(Lcom/amazon/alexa/api/UiEventName;Ljava/lang/String;Lcom/amazon/alexa/voice/tta/metrics/EventTime$Interval;)V", "getName", "()Lcom/amazon/alexa/api/UiEventName;", "getSource", "()Ljava/lang/String;", "getLatency", "()Lcom/amazon/alexa/voice/tta/metrics/EventTime$Interval;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class SdkEvent {

    @Nullable
    private final EventTime.Interval latency;

    @NotNull
    private final UiEventName name;

    @Nullable
    private final String source;

    public /* synthetic */ SdkEvent(UiEventName uiEventName, String str, EventTime.Interval interval, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiEventName, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : interval);
    }

    public static /* synthetic */ SdkEvent copy$default(SdkEvent sdkEvent, UiEventName uiEventName, String str, EventTime.Interval interval, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEventName = sdkEvent.name;
        }
        if ((i & 2) != 0) {
            str = sdkEvent.source;
        }
        if ((i & 4) != 0) {
            interval = sdkEvent.latency;
        }
        return sdkEvent.copy(uiEventName, str, interval);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UiEventName getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final EventTime.Interval getLatency() {
        return this.latency;
    }

    @NotNull
    public final SdkEvent copy(@NotNull UiEventName name, @Nullable String source, @Nullable EventTime.Interval latency) {
        name.getClass();
        return new SdkEvent(name, source, latency);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkEvent)) {
            return false;
        }
        SdkEvent sdkEvent = (SdkEvent) other;
        return this.name == sdkEvent.name && Intrinsics.areEqual(this.source, sdkEvent.source) && Intrinsics.areEqual(this.latency, sdkEvent.latency);
    }

    @Nullable
    public final EventTime.Interval getLatency() {
        return this.latency;
    }

    @NotNull
    public final UiEventName getName() {
        return this.name;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.source;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EventTime.Interval interval = this.latency;
        return hashCode2 + (interval != null ? interval.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SdkEvent(name=" + this.name + ", source=" + this.source + ", latency=" + this.latency + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public SdkEvent(@NotNull UiEventName uiEventName, @Nullable String str, @Nullable EventTime.Interval interval) {
        uiEventName.getClass();
        this.name = uiEventName;
        this.source = str;
        this.latency = interval;
    }
}
