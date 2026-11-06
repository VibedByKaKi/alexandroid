package com.amazon.alexa.assistant.foundation.metric.model;

import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/RenderSignalEvent;", "", "dialogRequestId", "", "signal", "Lcom/amazon/alexa/assistant/foundation/metric/model/RenderSignal;", "timestampMs", "", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/foundation/metric/model/RenderSignal;J)V", "getDialogRequestId", "()Ljava/lang/String;", "getSignal", "()Lcom/amazon/alexa/assistant/foundation/metric/model/RenderSignal;", "getTimestampMs", "()J", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RenderSignalEvent {

    @Nullable
    private final String dialogRequestId;

    @NotNull
    private final RenderSignal signal;
    private final long timestampMs;

    public RenderSignalEvent(@Nullable String str, @NotNull RenderSignal renderSignal, long j) {
        renderSignal.getClass();
        this.dialogRequestId = str;
        this.signal = renderSignal;
        this.timestampMs = j;
    }

    public static /* synthetic */ RenderSignalEvent copy$default(RenderSignalEvent renderSignalEvent, String str, RenderSignal renderSignal, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = renderSignalEvent.dialogRequestId;
        }
        if ((i & 2) != 0) {
            renderSignal = renderSignalEvent.signal;
        }
        if ((i & 4) != 0) {
            j = renderSignalEvent.timestampMs;
        }
        return renderSignalEvent.copy(str, renderSignal, j);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RenderSignal getSignal() {
        return this.signal;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    @NotNull
    public final RenderSignalEvent copy(@Nullable String dialogRequestId, @NotNull RenderSignal signal, long timestampMs) {
        signal.getClass();
        return new RenderSignalEvent(dialogRequestId, signal, timestampMs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderSignalEvent)) {
            return false;
        }
        RenderSignalEvent renderSignalEvent = (RenderSignalEvent) other;
        return Intrinsics.areEqual(this.dialogRequestId, renderSignalEvent.dialogRequestId) && this.signal == renderSignalEvent.signal && this.timestampMs == renderSignalEvent.timestampMs;
    }

    @Nullable
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @NotNull
    public final RenderSignal getSignal() {
        return this.signal;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public int hashCode() {
        String str = this.dialogRequestId;
        int hashCode = str == null ? 0 : str.hashCode();
        return Long.hashCode(this.timestampMs) + ((this.signal.hashCode() + (hashCode * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.dialogRequestId;
        RenderSignal renderSignal = this.signal;
        long j = this.timestampMs;
        StringBuilder sb = new StringBuilder("RenderSignalEvent(dialogRequestId=");
        sb.append(str);
        sb.append(", signal=");
        sb.append(renderSignal);
        sb.append(", timestampMs=");
        return a$$ExternalSyntheticOutline0.m(j, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
