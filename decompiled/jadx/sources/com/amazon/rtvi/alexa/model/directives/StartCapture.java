package com.amazon.rtvi.alexa.model.directives;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.common.CaptureConfigParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/amazon/rtvi/alexa/model/directives/StartCapture;", "Lcom/amazon/rtvi/alexa/model/directives/RTVIDirective;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "captureConfigParameters", "Lcom/amazon/rtvi/alexa/model/common/CaptureConfigParameters;", "timeoutInMilliseconds", "", "<init>", "(Ljava/lang/String;Lcom/amazon/rtvi/alexa/model/common/CaptureConfigParameters;Ljava/lang/Long;)V", "getSessionId", "()Ljava/lang/String;", "getCaptureConfigParameters", "()Lcom/amazon/rtvi/alexa/model/common/CaptureConfigParameters;", "getTimeoutInMilliseconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/amazon/rtvi/alexa/model/common/CaptureConfigParameters;Ljava/lang/Long;)Lcom/amazon/rtvi/alexa/model/directives/StartCapture;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StartCapture implements RTVIDirective {

    @NotNull
    private final CaptureConfigParameters captureConfigParameters;

    @NotNull
    private final String sessionId;

    @Nullable
    private final Long timeoutInMilliseconds;

    public StartCapture(@JsonProperty("sessionId") @NotNull String str, @JsonProperty("captureConfigParameters") @NotNull CaptureConfigParameters captureConfigParameters, @JsonProperty("timeoutInMilliseconds") @Nullable Long l) {
        str.getClass();
        captureConfigParameters.getClass();
        this.sessionId = str;
        this.captureConfigParameters = captureConfigParameters;
        this.timeoutInMilliseconds = l;
    }

    public static /* synthetic */ StartCapture copy$default(StartCapture startCapture, String str, CaptureConfigParameters captureConfigParameters, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startCapture.sessionId;
        }
        if ((i & 2) != 0) {
            captureConfigParameters = startCapture.captureConfigParameters;
        }
        if ((i & 4) != 0) {
            l = startCapture.timeoutInMilliseconds;
        }
        return startCapture.copy(str, captureConfigParameters, l);
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

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    @NotNull
    public final StartCapture copy(@JsonProperty("sessionId") @NotNull String sessionId, @JsonProperty("captureConfigParameters") @NotNull CaptureConfigParameters captureConfigParameters, @JsonProperty("timeoutInMilliseconds") @Nullable Long timeoutInMilliseconds) {
        sessionId.getClass();
        captureConfigParameters.getClass();
        return new StartCapture(sessionId, captureConfigParameters, timeoutInMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartCapture)) {
            return false;
        }
        StartCapture startCapture = (StartCapture) other;
        return Intrinsics.areEqual(this.sessionId, startCapture.sessionId) && Intrinsics.areEqual(this.captureConfigParameters, startCapture.captureConfigParameters) && Intrinsics.areEqual(this.timeoutInMilliseconds, startCapture.timeoutInMilliseconds);
    }

    @NotNull
    public final CaptureConfigParameters getCaptureConfigParameters() {
        return this.captureConfigParameters;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final Long getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    public int hashCode() {
        int hashCode = (this.captureConfigParameters.hashCode() + (this.sessionId.hashCode() * 31)) * 31;
        Long l = this.timeoutInMilliseconds;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "StartCapture(sessionId=" + this.sessionId + ", captureConfigParameters=" + this.captureConfigParameters + ", timeoutInMilliseconds=" + this.timeoutInMilliseconds + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ StartCapture(String str, CaptureConfigParameters captureConfigParameters, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, captureConfigParameters, (i & 4) != 0 ? null : l);
    }
}
