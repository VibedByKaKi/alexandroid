package com.amazon.alexa.assistant.foundation.voicechat.model;

import com.amazon.alexa.assistant.foundation.model.SDKError;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent;", "", "<init>", "()V", "SpeechDetected", "SilenceDetected", "Error", "Stopped", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent$Error;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent$SilenceDetected;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent$SpeechDetected;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent$Stopped;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class VoiceChatModeEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent$Error;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent;", "error", "Lcom/amazon/alexa/assistant/foundation/model/SDKError;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/SDKError;)V", "getError", "()Lcom/amazon/alexa/assistant/foundation/model/SDKError;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends VoiceChatModeEvent {

        @NotNull
        private final SDKError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull SDKError sDKError) {
            super(null);
            sDKError.getClass();
            this.error = sDKError;
        }

        public static /* synthetic */ Error copy$default(Error error, SDKError sDKError, int i, Object obj) {
            if ((i & 1) != 0) {
                sDKError = error.error;
            }
            return error.copy(sDKError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SDKError getError() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull SDKError error) {
            error.getClass();
            return new Error(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        @NotNull
        public final SDKError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent$SilenceDetected;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent;", "timestampMs", "", "durationMs", "<init>", "(JJ)V", "getTimestampMs", "()J", "getDurationMs", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SilenceDetected extends VoiceChatModeEvent {
        private final long durationMs;
        private final long timestampMs;

        public SilenceDetected(long j, long j2) {
            super(null);
            this.timestampMs = j;
            this.durationMs = j2;
        }

        public static /* synthetic */ SilenceDetected copy$default(SilenceDetected silenceDetected, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = silenceDetected.timestampMs;
            }
            if ((i & 2) != 0) {
                j2 = silenceDetected.durationMs;
            }
            return silenceDetected.copy(j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampMs() {
            return this.timestampMs;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        @NotNull
        public final SilenceDetected copy(long timestampMs, long durationMs) {
            return new SilenceDetected(timestampMs, durationMs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SilenceDetected)) {
                return false;
            }
            SilenceDetected silenceDetected = (SilenceDetected) other;
            return this.timestampMs == silenceDetected.timestampMs && this.durationMs == silenceDetected.durationMs;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            return Long.hashCode(this.durationMs) + (Long.hashCode(this.timestampMs) * 31);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(this.durationMs, MarkdownConstants.RIGHT_PARENTHESIS, a$$ExternalSyntheticOutline0.m("SilenceDetected(timestampMs=", this.timestampMs, ", durationMs="));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent$SpeechDetected;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent;", "timestampMs", "", "confidence", "", "<init>", "(JF)V", "getTimestampMs", "()J", "getConfidence", "()F", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SpeechDetected extends VoiceChatModeEvent {
        private final float confidence;
        private final long timestampMs;

        public SpeechDetected(long j, float f) {
            super(null);
            this.timestampMs = j;
            this.confidence = f;
        }

        public static /* synthetic */ SpeechDetected copy$default(SpeechDetected speechDetected, long j, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                j = speechDetected.timestampMs;
            }
            if ((i & 2) != 0) {
                f = speechDetected.confidence;
            }
            return speechDetected.copy(j, f);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestampMs() {
            return this.timestampMs;
        }

        /* renamed from: component2, reason: from getter */
        public final float getConfidence() {
            return this.confidence;
        }

        @NotNull
        public final SpeechDetected copy(long timestampMs, float confidence) {
            return new SpeechDetected(timestampMs, confidence);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpeechDetected)) {
                return false;
            }
            SpeechDetected speechDetected = (SpeechDetected) other;
            return this.timestampMs == speechDetected.timestampMs && Float.compare(this.confidence, speechDetected.confidence) == 0;
        }

        public final float getConfidence() {
            return this.confidence;
        }

        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            return Float.hashCode(this.confidence) + (Long.hashCode(this.timestampMs) * 31);
        }

        @NotNull
        public String toString() {
            return "SpeechDetected(timestampMs=" + this.timestampMs + ", confidence=" + this.confidence + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent$Stopped;", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeEvent;", "reason", "Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeStopReason;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeStopReason;)V", "getReason", "()Lcom/amazon/alexa/assistant/foundation/voicechat/model/VoiceChatModeStopReason;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stopped extends VoiceChatModeEvent {

        @NotNull
        private final VoiceChatModeStopReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stopped(@NotNull VoiceChatModeStopReason voiceChatModeStopReason) {
            super(null);
            voiceChatModeStopReason.getClass();
            this.reason = voiceChatModeStopReason;
        }

        public static /* synthetic */ Stopped copy$default(Stopped stopped, VoiceChatModeStopReason voiceChatModeStopReason, int i, Object obj) {
            if ((i & 1) != 0) {
                voiceChatModeStopReason = stopped.reason;
            }
            return stopped.copy(voiceChatModeStopReason);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final VoiceChatModeStopReason getReason() {
            return this.reason;
        }

        @NotNull
        public final Stopped copy(@NotNull VoiceChatModeStopReason reason) {
            reason.getClass();
            return new Stopped(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stopped) && this.reason == ((Stopped) other).reason;
        }

        @NotNull
        public final VoiceChatModeStopReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Stopped(reason=" + this.reason + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ VoiceChatModeEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VoiceChatModeEvent() {
    }
}
