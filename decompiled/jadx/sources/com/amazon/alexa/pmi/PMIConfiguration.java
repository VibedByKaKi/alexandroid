package com.amazon.alexa.pmi;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/pmi/PMIConfiguration;", "", "timelineTimeoutMs", "", "defaultEvents", "", "Lcom/amazon/alexa/pmi/TimelineEvent;", "<init>", "(JLjava/util/List;)V", "getTimelineTimeoutMs", "()J", "getDefaultEvents", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PMIConfiguration {
    public static final long DEFAULT_TIMEOUT_MS = 15000;

    @NotNull
    private final List<TimelineEvent> defaultEvents;
    private final long timelineTimeoutMs;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<TimelineEvent> DEFAULT_EVENTS = CollectionsKt.listOf((Object[]) new TimelineEvent[]{TimelineEvent.TTS, TimelineEvent.TTA, TimelineEvent.TTC});

    @JvmField
    @NotNull
    public static final PMIConfiguration DEFAULT = new PMIConfiguration(0, null, 3, null);

    public /* synthetic */ PMIConfiguration(long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 15000L : j, (i & 2) != 0 ? DEFAULT_EVENTS : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PMIConfiguration copy$default(PMIConfiguration pMIConfiguration, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pMIConfiguration.timelineTimeoutMs;
        }
        if ((i & 2) != 0) {
            list = pMIConfiguration.defaultEvents;
        }
        return pMIConfiguration.copy(j, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimelineTimeoutMs() {
        return this.timelineTimeoutMs;
    }

    @NotNull
    public final List<TimelineEvent> component2() {
        return this.defaultEvents;
    }

    @NotNull
    public final PMIConfiguration copy(long timelineTimeoutMs, @NotNull List<? extends TimelineEvent> defaultEvents) {
        defaultEvents.getClass();
        return new PMIConfiguration(timelineTimeoutMs, defaultEvents);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PMIConfiguration)) {
            return false;
        }
        PMIConfiguration pMIConfiguration = (PMIConfiguration) other;
        return this.timelineTimeoutMs == pMIConfiguration.timelineTimeoutMs && Intrinsics.areEqual(this.defaultEvents, pMIConfiguration.defaultEvents);
    }

    @NotNull
    public final List<TimelineEvent> getDefaultEvents() {
        return this.defaultEvents;
    }

    public final long getTimelineTimeoutMs() {
        return this.timelineTimeoutMs;
    }

    public int hashCode() {
        return this.defaultEvents.hashCode() + (Long.hashCode(this.timelineTimeoutMs) * 31);
    }

    @NotNull
    public String toString() {
        return "PMIConfiguration(timelineTimeoutMs=" + this.timelineTimeoutMs + ", defaultEvents=" + this.defaultEvents + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/pmi/PMIConfiguration$Companion;", "", "<init>", "()V", "DEFAULT_TIMEOUT_MS", "", "DEFAULT_EVENTS", "", "Lcom/amazon/alexa/pmi/TimelineEvent;", "getDEFAULT_EVENTS", "()Ljava/util/List;", "DEFAULT", "Lcom/amazon/alexa/pmi/PMIConfiguration;", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<TimelineEvent> getDEFAULT_EVENTS() {
            return PMIConfiguration.DEFAULT_EVENTS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PMIConfiguration(long j, @NotNull List<? extends TimelineEvent> list) {
        list.getClass();
        this.timelineTimeoutMs = j;
        this.defaultEvents = list;
    }

    public PMIConfiguration() {
        this(0L, null, 3, null);
    }
}
