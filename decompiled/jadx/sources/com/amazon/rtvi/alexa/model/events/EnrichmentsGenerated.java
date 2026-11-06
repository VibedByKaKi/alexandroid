package com.amazon.rtvi.alexa.model.events;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.common.EnrichmentData;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/amazon/rtvi/alexa/model/events/EnrichmentsGenerated;", "Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "enrichmentData", "", "Lcom/amazon/rtvi/alexa/model/common/EnrichmentData;", "eventTimestampEpochMilliseconds", "", "<init>", "(Ljava/lang/String;Ljava/util/List;J)V", "getSessionId", "()Ljava/lang/String;", "getEnrichmentData", "()Ljava/util/List;", "getEventTimestampEpochMilliseconds", "()J", "eventName", "getEventName", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EnrichmentsGenerated implements RTVIEvent {

    @NotNull
    private final List<EnrichmentData> enrichmentData;

    @Nullable
    private final String eventName;
    private final long eventTimestampEpochMilliseconds;

    @NotNull
    private final String sessionId;

    /* JADX WARN: Multi-variable type inference failed */
    public EnrichmentsGenerated(@JsonProperty("sessionId") @NotNull String str, @JsonProperty("enrichmentData") @NotNull List<? extends EnrichmentData> list, @JsonProperty("eventTimestampEpochMilliseconds") long j) {
        str.getClass();
        list.getClass();
        this.sessionId = str;
        this.enrichmentData = list;
        this.eventTimestampEpochMilliseconds = j;
        this.eventName = "EnrichmentsGenerated";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnrichmentsGenerated copy$default(EnrichmentsGenerated enrichmentsGenerated, String str, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enrichmentsGenerated.sessionId;
        }
        if ((i & 2) != 0) {
            list = enrichmentsGenerated.enrichmentData;
        }
        if ((i & 4) != 0) {
            j = enrichmentsGenerated.eventTimestampEpochMilliseconds;
        }
        return enrichmentsGenerated.copy(str, list, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final List<EnrichmentData> component2() {
        return this.enrichmentData;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEventTimestampEpochMilliseconds() {
        return this.eventTimestampEpochMilliseconds;
    }

    @NotNull
    public final EnrichmentsGenerated copy(@JsonProperty("sessionId") @NotNull String sessionId, @JsonProperty("enrichmentData") @NotNull List<? extends EnrichmentData> enrichmentData, @JsonProperty("eventTimestampEpochMilliseconds") long eventTimestampEpochMilliseconds) {
        sessionId.getClass();
        enrichmentData.getClass();
        return new EnrichmentsGenerated(sessionId, enrichmentData, eventTimestampEpochMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrichmentsGenerated)) {
            return false;
        }
        EnrichmentsGenerated enrichmentsGenerated = (EnrichmentsGenerated) other;
        return Intrinsics.areEqual(this.sessionId, enrichmentsGenerated.sessionId) && Intrinsics.areEqual(this.enrichmentData, enrichmentsGenerated.enrichmentData) && this.eventTimestampEpochMilliseconds == enrichmentsGenerated.eventTimestampEpochMilliseconds;
    }

    @NotNull
    public final List<EnrichmentData> getEnrichmentData() {
        return this.enrichmentData;
    }

    @Override // com.amazon.rtvi.alexa.model.events.RTVIEvent
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    public final long getEventTimestampEpochMilliseconds() {
        return this.eventTimestampEpochMilliseconds;
    }

    @Override // com.amazon.rtvi.alexa.model.events.RTVIEvent
    @NotNull
    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return Long.hashCode(this.eventTimestampEpochMilliseconds) + ArcMode$$ExternalSyntheticOutline0.m(this.enrichmentData, this.sessionId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.eventTimestampEpochMilliseconds, MarkdownConstants.RIGHT_PARENTHESIS, AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("EnrichmentsGenerated(sessionId=", this.sessionId, ", enrichmentData=", (List) this.enrichmentData, ", eventTimestampEpochMilliseconds="));
    }
}
