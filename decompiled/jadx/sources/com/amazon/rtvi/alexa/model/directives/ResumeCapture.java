package com.amazon.rtvi.alexa.model.directives;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.common.CaptureConfigParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/rtvi/alexa/model/directives/ResumeCapture;", "Lcom/amazon/rtvi/alexa/model/directives/RTVIDirective;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "captureConfigParameters", "Lcom/amazon/rtvi/alexa/model/common/CaptureConfigParameters;", "<init>", "(Ljava/lang/String;Lcom/amazon/rtvi/alexa/model/common/CaptureConfigParameters;)V", "getSessionId", "()Ljava/lang/String;", "getCaptureConfigParameters", "()Lcom/amazon/rtvi/alexa/model/common/CaptureConfigParameters;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ResumeCapture implements RTVIDirective {

    @NotNull
    private final CaptureConfigParameters captureConfigParameters;

    @NotNull
    private final String sessionId;

    public ResumeCapture(@JsonProperty("sessionId") @NotNull String str, @JsonProperty("captureConfigParameters") @NotNull CaptureConfigParameters captureConfigParameters) {
        str.getClass();
        captureConfigParameters.getClass();
        this.sessionId = str;
        this.captureConfigParameters = captureConfigParameters;
    }

    public static /* synthetic */ ResumeCapture copy$default(ResumeCapture resumeCapture, String str, CaptureConfigParameters captureConfigParameters, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resumeCapture.sessionId;
        }
        if ((i & 2) != 0) {
            captureConfigParameters = resumeCapture.captureConfigParameters;
        }
        return resumeCapture.copy(str, captureConfigParameters);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CaptureConfigParameters getCaptureConfigParameters() {
        return this.captureConfigParameters;
    }

    @NotNull
    public final ResumeCapture copy(@JsonProperty("sessionId") @NotNull String sessionId, @JsonProperty("captureConfigParameters") @NotNull CaptureConfigParameters captureConfigParameters) {
        sessionId.getClass();
        captureConfigParameters.getClass();
        return new ResumeCapture(sessionId, captureConfigParameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResumeCapture)) {
            return false;
        }
        ResumeCapture resumeCapture = (ResumeCapture) other;
        return Intrinsics.areEqual(this.sessionId, resumeCapture.sessionId) && Intrinsics.areEqual(this.captureConfigParameters, resumeCapture.captureConfigParameters);
    }

    @NotNull
    public final CaptureConfigParameters getCaptureConfigParameters() {
        return this.captureConfigParameters;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.captureConfigParameters.hashCode() + (this.sessionId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ResumeCapture(sessionId=" + this.sessionId + ", captureConfigParameters=" + this.captureConfigParameters + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
