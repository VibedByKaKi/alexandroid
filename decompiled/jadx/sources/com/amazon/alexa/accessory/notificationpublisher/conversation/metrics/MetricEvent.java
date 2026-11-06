package com.amazon.alexa.accessory.notificationpublisher.conversation.metrics;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/MetricEvent;", "", "name", "", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getContext", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MetricEvent {

    @Nullable
    private final String context;

    @NotNull
    private final String name;

    public MetricEvent(@NotNull String str, @Nullable String str2) {
        str.getClass();
        this.name = str;
        this.context = str2;
    }

    public static /* synthetic */ MetricEvent copy$default(MetricEvent metricEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metricEvent.name;
        }
        if ((i & 2) != 0) {
            str2 = metricEvent.context;
        }
        return metricEvent.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final MetricEvent copy(@NotNull String name, @Nullable String context) {
        name.getClass();
        return new MetricEvent(name, context);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricEvent)) {
            return false;
        }
        MetricEvent metricEvent = (MetricEvent) other;
        return Intrinsics.areEqual(this.name, metricEvent.name) && Intrinsics.areEqual(this.context, metricEvent.context);
    }

    @Nullable
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.context;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("MetricEvent(name=", this.name, ", context=", this.context, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ MetricEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
