package com.amazon.rtvi.alexa.model.events;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.common.CaptureConfig;
import com.amazon.rtvi.alexa.model.enums.ResumeReason;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/amazon/rtvi/alexa/model/events/CaptureResumed;", "Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "selectedCaptureConfig", "Lcom/amazon/rtvi/alexa/model/common/CaptureConfig;", "resumeReason", "Lcom/amazon/rtvi/alexa/model/enums/ResumeReason;", "captureResumedEpochMilliseconds", "", "<init>", "(Ljava/lang/String;Lcom/amazon/rtvi/alexa/model/common/CaptureConfig;Lcom/amazon/rtvi/alexa/model/enums/ResumeReason;J)V", "getSessionId", "()Ljava/lang/String;", "getSelectedCaptureConfig", "()Lcom/amazon/rtvi/alexa/model/common/CaptureConfig;", "getResumeReason", "()Lcom/amazon/rtvi/alexa/model/enums/ResumeReason;", "getCaptureResumedEpochMilliseconds", "()J", "eventName", "getEventName", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CaptureResumed implements RTVIEvent {
    private final long captureResumedEpochMilliseconds;

    @Nullable
    private final String eventName;

    @NotNull
    private final ResumeReason resumeReason;

    @NotNull
    private final CaptureConfig selectedCaptureConfig;

    @NotNull
    private final String sessionId;

    public CaptureResumed(@JsonProperty("sessionId") @NotNull String str, @JsonProperty("selectedCaptureConfig") @NotNull CaptureConfig captureConfig, @JsonProperty("resumeReason") @NotNull ResumeReason resumeReason, @JsonProperty("captureResumedEpochMilliseconds") long j) {
        str.getClass();
        captureConfig.getClass();
        resumeReason.getClass();
        this.sessionId = str;
        this.selectedCaptureConfig = captureConfig;
        this.resumeReason = resumeReason;
        this.captureResumedEpochMilliseconds = j;
        this.eventName = "CaptureResumed";
    }

    public static /* synthetic */ CaptureResumed copy$default(CaptureResumed captureResumed, String str, CaptureConfig captureConfig, ResumeReason resumeReason, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captureResumed.sessionId;
        }
        if ((i & 2) != 0) {
            captureConfig = captureResumed.selectedCaptureConfig;
        }
        if ((i & 4) != 0) {
            resumeReason = captureResumed.resumeReason;
        }
        if ((i & 8) != 0) {
            j = captureResumed.captureResumedEpochMilliseconds;
        }
        ResumeReason resumeReason2 = resumeReason;
        return captureResumed.copy(str, captureConfig, resumeReason2, j);
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
    public final ResumeReason getResumeReason() {
        return this.resumeReason;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCaptureResumedEpochMilliseconds() {
        return this.captureResumedEpochMilliseconds;
    }

    @NotNull
    public final CaptureResumed copy(@JsonProperty("sessionId") @NotNull String sessionId, @JsonProperty("selectedCaptureConfig") @NotNull CaptureConfig selectedCaptureConfig, @JsonProperty("resumeReason") @NotNull ResumeReason resumeReason, @JsonProperty("captureResumedEpochMilliseconds") long captureResumedEpochMilliseconds) {
        sessionId.getClass();
        selectedCaptureConfig.getClass();
        resumeReason.getClass();
        return new CaptureResumed(sessionId, selectedCaptureConfig, resumeReason, captureResumedEpochMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureResumed)) {
            return false;
        }
        CaptureResumed captureResumed = (CaptureResumed) other;
        return Intrinsics.areEqual(this.sessionId, captureResumed.sessionId) && Intrinsics.areEqual(this.selectedCaptureConfig, captureResumed.selectedCaptureConfig) && this.resumeReason == captureResumed.resumeReason && this.captureResumedEpochMilliseconds == captureResumed.captureResumedEpochMilliseconds;
    }

    public final long getCaptureResumedEpochMilliseconds() {
        return this.captureResumedEpochMilliseconds;
    }

    @Override // com.amazon.rtvi.alexa.model.events.RTVIEvent
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final ResumeReason getResumeReason() {
        return this.resumeReason;
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

    public int hashCode() {
        return Long.hashCode(this.captureResumedEpochMilliseconds) + ((this.resumeReason.hashCode() + ((this.selectedCaptureConfig.hashCode() + (this.sessionId.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CaptureResumed(sessionId=" + this.sessionId + ", selectedCaptureConfig=" + this.selectedCaptureConfig + ", resumeReason=" + this.resumeReason + ", captureResumedEpochMilliseconds=" + this.captureResumedEpochMilliseconds + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
