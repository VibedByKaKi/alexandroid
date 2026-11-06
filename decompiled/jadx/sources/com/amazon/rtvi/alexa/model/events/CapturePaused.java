package com.amazon.rtvi.alexa.model.events;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.enums.PauseReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/amazon/rtvi/alexa/model/events/CapturePaused;", "Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "pauseReason", "Lcom/amazon/rtvi/alexa/model/enums/PauseReason;", "capturePausedEpochMilliseconds", "", "<init>", "(Ljava/lang/String;Lcom/amazon/rtvi/alexa/model/enums/PauseReason;J)V", "getSessionId", "()Ljava/lang/String;", "getPauseReason", "()Lcom/amazon/rtvi/alexa/model/enums/PauseReason;", "getCapturePausedEpochMilliseconds", "()J", "eventName", "getEventName", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CapturePaused implements RTVIEvent {
    private final long capturePausedEpochMilliseconds;

    @Nullable
    private final String eventName;

    @NotNull
    private final PauseReason pauseReason;

    @NotNull
    private final String sessionId;

    public CapturePaused(@JsonProperty("sessionId") @NotNull String str, @JsonProperty("pauseReason") @NotNull PauseReason pauseReason, @JsonProperty("capturePausedEpochMilliseconds") long j) {
        str.getClass();
        pauseReason.getClass();
        this.sessionId = str;
        this.pauseReason = pauseReason;
        this.capturePausedEpochMilliseconds = j;
        this.eventName = "CapturePaused";
    }

    public static /* synthetic */ CapturePaused copy$default(CapturePaused capturePaused, String str, PauseReason pauseReason, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = capturePaused.sessionId;
        }
        if ((i & 2) != 0) {
            pauseReason = capturePaused.pauseReason;
        }
        if ((i & 4) != 0) {
            j = capturePaused.capturePausedEpochMilliseconds;
        }
        return capturePaused.copy(str, pauseReason, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PauseReason getPauseReason() {
        return this.pauseReason;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCapturePausedEpochMilliseconds() {
        return this.capturePausedEpochMilliseconds;
    }

    @NotNull
    public final CapturePaused copy(@JsonProperty("sessionId") @NotNull String sessionId, @JsonProperty("pauseReason") @NotNull PauseReason pauseReason, @JsonProperty("capturePausedEpochMilliseconds") long capturePausedEpochMilliseconds) {
        sessionId.getClass();
        pauseReason.getClass();
        return new CapturePaused(sessionId, pauseReason, capturePausedEpochMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapturePaused)) {
            return false;
        }
        CapturePaused capturePaused = (CapturePaused) other;
        return Intrinsics.areEqual(this.sessionId, capturePaused.sessionId) && this.pauseReason == capturePaused.pauseReason && this.capturePausedEpochMilliseconds == capturePaused.capturePausedEpochMilliseconds;
    }

    public final long getCapturePausedEpochMilliseconds() {
        return this.capturePausedEpochMilliseconds;
    }

    @Override // com.amazon.rtvi.alexa.model.events.RTVIEvent
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final PauseReason getPauseReason() {
        return this.pauseReason;
    }

    @Override // com.amazon.rtvi.alexa.model.events.RTVIEvent
    @NotNull
    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return Long.hashCode(this.capturePausedEpochMilliseconds) + ((this.pauseReason.hashCode() + (this.sessionId.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        PauseReason pauseReason = this.pauseReason;
        long j = this.capturePausedEpochMilliseconds;
        StringBuilder sb = new StringBuilder("CapturePaused(sessionId=");
        sb.append(str);
        sb.append(", pauseReason=");
        sb.append(pauseReason);
        sb.append(", capturePausedEpochMilliseconds=");
        return a$$ExternalSyntheticOutline0.m(j, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
