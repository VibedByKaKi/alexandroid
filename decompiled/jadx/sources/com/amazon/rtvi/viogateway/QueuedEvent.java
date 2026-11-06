package com.amazon.rtvi.viogateway;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.enums.CaptureMode;
import com.amazon.rtvi.alexa.model.events.RTVIEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/amazon/rtvi/viogateway/QueuedEvent;", "", "event", "Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", "payload", "", "enqueuedAtMs", "", AmazonPhotosConstants.CAPTURE_MODE_KEY, "Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;", "<init>", "(Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;Ljava/lang/String;JLcom/amazon/rtvi/alexa/model/enums/CaptureMode;)V", "getEvent", "()Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", "getPayload", "()Ljava/lang/String;", "getEnqueuedAtMs", "()J", "getCaptureMode", "()Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;", "frameKey", "Lcom/amazon/rtvi/viogateway/FrameKey;", "getFrameKey", "()Lcom/amazon/rtvi/viogateway/FrameKey;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "RTVIAndroidAlexaAvsSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QueuedEvent {

    @Nullable
    private final CaptureMode captureMode;
    private final long enqueuedAtMs;

    @NotNull
    private final RTVIEvent event;

    @Nullable
    private final FrameKey frameKey;

    @Nullable
    private final String payload;

    public QueuedEvent(@NotNull RTVIEvent rTVIEvent, @Nullable String str, long j, @Nullable CaptureMode captureMode) {
        FrameKey frameKeyOf;
        rTVIEvent.getClass();
        this.event = rTVIEvent;
        this.payload = str;
        this.enqueuedAtMs = j;
        this.captureMode = captureMode;
        frameKeyOf = EventUploadQueueKt.frameKeyOf(rTVIEvent);
        this.frameKey = frameKeyOf;
    }

    public static /* synthetic */ QueuedEvent copy$default(QueuedEvent queuedEvent, RTVIEvent rTVIEvent, String str, long j, CaptureMode captureMode, int i, Object obj) {
        if ((i & 1) != 0) {
            rTVIEvent = queuedEvent.event;
        }
        if ((i & 2) != 0) {
            str = queuedEvent.payload;
        }
        if ((i & 4) != 0) {
            j = queuedEvent.enqueuedAtMs;
        }
        if ((i & 8) != 0) {
            captureMode = queuedEvent.captureMode;
        }
        CaptureMode captureMode2 = captureMode;
        return queuedEvent.copy(rTVIEvent, str, j, captureMode2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RTVIEvent getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEnqueuedAtMs() {
        return this.enqueuedAtMs;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    @NotNull
    public final QueuedEvent copy(@NotNull RTVIEvent event, @Nullable String payload, long enqueuedAtMs, @Nullable CaptureMode captureMode) {
        event.getClass();
        return new QueuedEvent(event, payload, enqueuedAtMs, captureMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueuedEvent)) {
            return false;
        }
        QueuedEvent queuedEvent = (QueuedEvent) other;
        return Intrinsics.areEqual(this.event, queuedEvent.event) && Intrinsics.areEqual(this.payload, queuedEvent.payload) && this.enqueuedAtMs == queuedEvent.enqueuedAtMs && this.captureMode == queuedEvent.captureMode;
    }

    @Nullable
    public final CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    public final long getEnqueuedAtMs() {
        return this.enqueuedAtMs;
    }

    @NotNull
    public final RTVIEvent getEvent() {
        return this.event;
    }

    @Nullable
    public final FrameKey getFrameKey() {
        return this.frameKey;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        String str = this.payload;
        int m = BitVector$$ExternalSyntheticOutline0.m(this.enqueuedAtMs, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        CaptureMode captureMode = this.captureMode;
        return m + (captureMode != null ? captureMode.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "QueuedEvent(event=" + this.event + ", payload=" + this.payload + ", enqueuedAtMs=" + this.enqueuedAtMs + ", captureMode=" + this.captureMode + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ QueuedEvent(RTVIEvent rTVIEvent, String str, long j, CaptureMode captureMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rTVIEvent, str, j, (i & 8) != 0 ? null : captureMode);
    }
}
