package com.amazon.rtvi.alexa.model.events;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.common.CaptureConfig;
import com.amazon.rtvi.alexa.model.enums.StartReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/amazon/rtvi/alexa/model/events/CaptureStarted;", "Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "selectedCaptureConfig", "Lcom/amazon/rtvi/alexa/model/common/CaptureConfig;", "startReason", "Lcom/amazon/rtvi/alexa/model/enums/StartReason;", "captureStartedEpochMilliseconds", "", "<init>", "(Ljava/lang/String;Lcom/amazon/rtvi/alexa/model/common/CaptureConfig;Lcom/amazon/rtvi/alexa/model/enums/StartReason;J)V", "getSessionId", "()Ljava/lang/String;", "getSelectedCaptureConfig", "()Lcom/amazon/rtvi/alexa/model/common/CaptureConfig;", "getStartReason", "()Lcom/amazon/rtvi/alexa/model/enums/StartReason;", "getCaptureStartedEpochMilliseconds", "()J", "eventName", "getEventName", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CaptureStarted implements RTVIEvent {
    private final long captureStartedEpochMilliseconds;

    @Nullable
    private final String eventName;

    @NotNull
    private final CaptureConfig selectedCaptureConfig;

    @NotNull
    private final String sessionId;

    @NotNull
    private final StartReason startReason;

    public CaptureStarted(@JsonProperty("sessionId") @NotNull String str, @JsonProperty("selectedCaptureConfig") @NotNull CaptureConfig captureConfig, @JsonProperty("startReason") @NotNull StartReason startReason, @JsonProperty("captureStartedEpochMilliseconds") long j) {
        str.getClass();
        captureConfig.getClass();
        startReason.getClass();
        this.sessionId = str;
        this.selectedCaptureConfig = captureConfig;
        this.startReason = startReason;
        this.captureStartedEpochMilliseconds = j;
        this.eventName = "CaptureStarted";
    }

    public static /* synthetic */ CaptureStarted copy$default(CaptureStarted captureStarted, String str, CaptureConfig captureConfig, StartReason startReason, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captureStarted.sessionId;
        }
        if ((i & 2) != 0) {
            captureConfig = captureStarted.selectedCaptureConfig;
        }
        if ((i & 4) != 0) {
            startReason = captureStarted.startReason;
        }
        if ((i & 8) != 0) {
            j = captureStarted.captureStartedEpochMilliseconds;
        }
        StartReason startReason2 = startReason;
        return captureStarted.copy(str, captureConfig, startReason2, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CaptureConfig getSelectedCaptureConfig() {
        return this.selectedCaptureConfig;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final StartReason getStartReason() {
        return this.startReason;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCaptureStartedEpochMilliseconds() {
        return this.captureStartedEpochMilliseconds;
    }

    @NotNull
    public final CaptureStarted copy(@JsonProperty("sessionId") @NotNull String sessionId, @JsonProperty("selectedCaptureConfig") @NotNull CaptureConfig selectedCaptureConfig, @JsonProperty("startReason") @NotNull StartReason startReason, @JsonProperty("captureStartedEpochMilliseconds") long captureStartedEpochMilliseconds) {
        sessionId.getClass();
        selectedCaptureConfig.getClass();
        startReason.getClass();
        return new CaptureStarted(sessionId, selectedCaptureConfig, startReason, captureStartedEpochMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureStarted)) {
            return false;
        }
        CaptureStarted captureStarted = (CaptureStarted) other;
        return Intrinsics.areEqual(this.sessionId, captureStarted.sessionId) && Intrinsics.areEqual(this.selectedCaptureConfig, captureStarted.selectedCaptureConfig) && this.startReason == captureStarted.startReason && this.captureStartedEpochMilliseconds == captureStarted.captureStartedEpochMilliseconds;
    }

    public final long getCaptureStartedEpochMilliseconds() {
        return this.captureStartedEpochMilliseconds;
    }

    @Override // com.amazon.rtvi.alexa.model.events.RTVIEvent
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final CaptureConfig getSelectedCaptureConfig() {
        return this.selectedCaptureConfig;
    }

    @Override // com.amazon.rtvi.alexa.model.events.RTVIEvent
    @NotNull
    public String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final StartReason getStartReason() {
        return this.startReason;
    }

    public int hashCode() {
        return Long.hashCode(this.captureStartedEpochMilliseconds) + ((this.startReason.hashCode() + ((this.selectedCaptureConfig.hashCode() + (this.sessionId.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CaptureStarted(sessionId=" + this.sessionId + ", selectedCaptureConfig=" + this.selectedCaptureConfig + ", startReason=" + this.startReason + ", captureStartedEpochMilliseconds=" + this.captureStartedEpochMilliseconds + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
