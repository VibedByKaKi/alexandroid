package com.amazon.alexa.assistant.foundation.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/VadEvent;", "", "<init>", "()V", "None", "SpeechStarted", "SpeechEnded", "Lcom/amazon/alexa/assistant/foundation/model/VadEvent$None;", "Lcom/amazon/alexa/assistant/foundation/model/VadEvent$SpeechEnded;", "Lcom/amazon/alexa/assistant/foundation/model/VadEvent$SpeechStarted;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class VadEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/VadEvent$None;", "Lcom/amazon/alexa/assistant/foundation/model/VadEvent;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None extends VadEvent {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return -945224867;
        }

        @NotNull
        public String toString() {
            return "None";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/VadEvent$SpeechEnded;", "Lcom/amazon/alexa/assistant/foundation/model/VadEvent;", "timestampMs", "", "durationMs", "<init>", "(JJ)V", "getTimestampMs", "()J", "getDurationMs", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SpeechEnded extends VadEvent {
        private final long durationMs;
        private final long timestampMs;

        public SpeechEnded(long j, long j2) {
            super(null);
            this.timestampMs = j;
            this.durationMs = j2;
        }

        public static /* synthetic */ SpeechEnded copy$default(SpeechEnded speechEnded, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = speechEnded.timestampMs;
            }
            if ((i & 2) != 0) {
                j2 = speechEnded.durationMs;
            }
            return speechEnded.copy(j, j2);
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
        public final SpeechEnded copy(long timestampMs, long durationMs) {
            return new SpeechEnded(timestampMs, durationMs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpeechEnded)) {
                return false;
            }
            SpeechEnded speechEnded = (SpeechEnded) other;
            return this.timestampMs == speechEnded.timestampMs && this.durationMs == speechEnded.durationMs;
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
            return a$$ExternalSyntheticOutline0.m(this.durationMs, MarkdownConstants.RIGHT_PARENTHESIS, a$$ExternalSyntheticOutline0.m("SpeechEnded(timestampMs=", this.timestampMs, ", durationMs="));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/VadEvent$SpeechStarted;", "Lcom/amazon/alexa/assistant/foundation/model/VadEvent;", "preroll", "", "confidence", "", "timestampMs", "", "<init>", "([BFJ)V", "getPreroll", "()[B", "getConfidence", "()F", "getTimestampMs", "()J", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "component1", "component2", "component3", "copy", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SpeechStarted extends VadEvent {
        private final float confidence;

        @NotNull
        private final byte[] preroll;
        private final long timestampMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpeechStarted(@NotNull byte[] bArr, float f, long j) {
            super(null);
            bArr.getClass();
            this.preroll = bArr;
            this.confidence = f;
            this.timestampMs = j;
        }

        public static /* synthetic */ SpeechStarted copy$default(SpeechStarted speechStarted, byte[] bArr, float f, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = speechStarted.preroll;
            }
            if ((i & 2) != 0) {
                f = speechStarted.confidence;
            }
            if ((i & 4) != 0) {
                j = speechStarted.timestampMs;
            }
            return speechStarted.copy(bArr, f, j);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final byte[] getPreroll() {
            return this.preroll;
        }

        /* renamed from: component2, reason: from getter */
        public final float getConfidence() {
            return this.confidence;
        }

        /* renamed from: component3, reason: from getter */
        public final long getTimestampMs() {
            return this.timestampMs;
        }

        @NotNull
        public final SpeechStarted copy(@NotNull byte[] preroll, float confidence, long timestampMs) {
            preroll.getClass();
            return new SpeechStarted(preroll, confidence, timestampMs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpeechStarted)) {
                return false;
            }
            SpeechStarted speechStarted = (SpeechStarted) other;
            return this.confidence == speechStarted.confidence && this.timestampMs == speechStarted.timestampMs && Arrays.equals(this.preroll, speechStarted.preroll);
        }

        public final float getConfidence() {
            return this.confidence;
        }

        @NotNull
        public final byte[] getPreroll() {
            return this.preroll;
        }

        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            return Long.hashCode(this.timestampMs) + DoubleList$$ExternalSyntheticOutline0.m(this.confidence, Arrays.hashCode(this.preroll) * 31, 31);
        }

        @NotNull
        public String toString() {
            String arrays = Arrays.toString(this.preroll);
            float f = this.confidence;
            long j = this.timestampMs;
            StringBuilder sb = new StringBuilder("SpeechStarted(preroll=");
            sb.append(arrays);
            sb.append(", confidence=");
            sb.append(f);
            sb.append(", timestampMs=");
            return a$$ExternalSyntheticOutline0.m(j, MarkdownConstants.RIGHT_PARENTHESIS, sb);
        }
    }

    public /* synthetic */ VadEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VadEvent() {
    }
}
