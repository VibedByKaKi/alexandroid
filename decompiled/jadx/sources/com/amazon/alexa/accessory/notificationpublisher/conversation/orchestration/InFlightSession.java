package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/InFlightSession;", "", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "startedAtEpochMs", "", "captureDeviceType", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "getStartedAtEpochMs", "()J", "getCaptureDeviceType", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class InFlightSession {

    @Nullable
    private final String captureDeviceType;

    @NotNull
    private final String sessionId;
    private final long startedAtEpochMs;

    public InFlightSession(@NotNull String str, long j, @Nullable String str2) {
        str.getClass();
        this.sessionId = str;
        this.startedAtEpochMs = j;
        this.captureDeviceType = str2;
    }

    public static /* synthetic */ InFlightSession copy$default(InFlightSession inFlightSession, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inFlightSession.sessionId;
        }
        if ((i & 2) != 0) {
            j = inFlightSession.startedAtEpochMs;
        }
        if ((i & 4) != 0) {
            str2 = inFlightSession.captureDeviceType;
        }
        return inFlightSession.copy(str, j, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartedAtEpochMs() {
        return this.startedAtEpochMs;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCaptureDeviceType() {
        return this.captureDeviceType;
    }

    @NotNull
    public final InFlightSession copy(@NotNull String sessionId, long startedAtEpochMs, @Nullable String captureDeviceType) {
        sessionId.getClass();
        return new InFlightSession(sessionId, startedAtEpochMs, captureDeviceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InFlightSession)) {
            return false;
        }
        InFlightSession inFlightSession = (InFlightSession) other;
        return Intrinsics.areEqual(this.sessionId, inFlightSession.sessionId) && this.startedAtEpochMs == inFlightSession.startedAtEpochMs && Intrinsics.areEqual(this.captureDeviceType, inFlightSession.captureDeviceType);
    }

    @Nullable
    public final String getCaptureDeviceType() {
        return this.captureDeviceType;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getStartedAtEpochMs() {
        return this.startedAtEpochMs;
    }

    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.startedAtEpochMs, this.sessionId.hashCode() * 31, 31);
        String str = this.captureDeviceType;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        long j = this.startedAtEpochMs;
        return ErrorUtils$$ExternalSyntheticOutline0.m(Automotive$$ExternalSyntheticOutline0.m("InFlightSession(sessionId=", str, ", startedAtEpochMs=", j), ", captureDeviceType=", this.captureDeviceType, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
