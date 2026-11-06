package com.amazon.alexa.assistant.capability.speechrecognizer.model;

import com.amazon.alexa.assistant.ui.conversation.text.TextStreamingTimerKt;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/SpeechRecognitionTimeouts;", "", "firstTurnTimeoutMs", "", "multiTurnTimeoutMs", "<init>", "(JJ)V", "getFirstTurnTimeoutMs", "()J", "getMultiTurnTimeoutMs", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SpeechRecognitionTimeouts {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SpeechRecognitionTimeouts DEFAULT = new SpeechRecognitionTimeouts(10000, TextStreamingTimerKt.TEXT_STREAM_LIFETIME_MS);
    private final long firstTurnTimeoutMs;
    private final long multiTurnTimeoutMs;

    public SpeechRecognitionTimeouts(long j, long j2) {
        this.firstTurnTimeoutMs = j;
        this.multiTurnTimeoutMs = j2;
    }

    public static /* synthetic */ SpeechRecognitionTimeouts copy$default(SpeechRecognitionTimeouts speechRecognitionTimeouts, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = speechRecognitionTimeouts.firstTurnTimeoutMs;
        }
        if ((i & 2) != 0) {
            j2 = speechRecognitionTimeouts.multiTurnTimeoutMs;
        }
        return speechRecognitionTimeouts.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFirstTurnTimeoutMs() {
        return this.firstTurnTimeoutMs;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMultiTurnTimeoutMs() {
        return this.multiTurnTimeoutMs;
    }

    @NotNull
    public final SpeechRecognitionTimeouts copy(long firstTurnTimeoutMs, long multiTurnTimeoutMs) {
        return new SpeechRecognitionTimeouts(firstTurnTimeoutMs, multiTurnTimeoutMs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeechRecognitionTimeouts)) {
            return false;
        }
        SpeechRecognitionTimeouts speechRecognitionTimeouts = (SpeechRecognitionTimeouts) other;
        return this.firstTurnTimeoutMs == speechRecognitionTimeouts.firstTurnTimeoutMs && this.multiTurnTimeoutMs == speechRecognitionTimeouts.multiTurnTimeoutMs;
    }

    public final long getFirstTurnTimeoutMs() {
        return this.firstTurnTimeoutMs;
    }

    public final long getMultiTurnTimeoutMs() {
        return this.multiTurnTimeoutMs;
    }

    public int hashCode() {
        return Long.hashCode(this.multiTurnTimeoutMs) + (Long.hashCode(this.firstTurnTimeoutMs) * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.multiTurnTimeoutMs, MarkdownConstants.RIGHT_PARENTHESIS, a$$ExternalSyntheticOutline0.m("SpeechRecognitionTimeouts(firstTurnTimeoutMs=", this.firstTurnTimeoutMs, ", multiTurnTimeoutMs="));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/SpeechRecognitionTimeouts$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/SpeechRecognitionTimeouts;", "getDEFAULT", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/SpeechRecognitionTimeouts;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SpeechRecognitionTimeouts getDEFAULT() {
            return SpeechRecognitionTimeouts.DEFAULT;
        }

        private Companion() {
        }
    }
}
