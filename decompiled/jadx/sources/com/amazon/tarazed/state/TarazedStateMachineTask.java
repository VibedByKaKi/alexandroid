package com.amazon.tarazed.state;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.tarazed.event.EventMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/tarazed/state/TarazedStateMachineTask;", "", "event", "Lcom/amazon/tarazed/state/TarazedSessionStateEvent;", "metadata", "Lcom/amazon/tarazed/event/EventMetadata;", "(Lcom/amazon/tarazed/state/TarazedSessionStateEvent;Lcom/amazon/tarazed/event/EventMetadata;)V", "getEvent", "()Lcom/amazon/tarazed/state/TarazedSessionStateEvent;", "getMetadata", "()Lcom/amazon/tarazed/event/EventMetadata;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class TarazedStateMachineTask {

    @NotNull
    private final TarazedSessionStateEvent event;

    @NotNull
    private final EventMetadata metadata;

    public TarazedStateMachineTask(@NotNull TarazedSessionStateEvent tarazedSessionStateEvent, @NotNull EventMetadata eventMetadata) {
        tarazedSessionStateEvent.getClass();
        eventMetadata.getClass();
        this.event = tarazedSessionStateEvent;
        this.metadata = eventMetadata;
    }

    public static /* synthetic */ TarazedStateMachineTask copy$default(TarazedStateMachineTask tarazedStateMachineTask, TarazedSessionStateEvent tarazedSessionStateEvent, EventMetadata eventMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            tarazedSessionStateEvent = tarazedStateMachineTask.event;
        }
        if ((i & 2) != 0) {
            eventMetadata = tarazedStateMachineTask.metadata;
        }
        return tarazedStateMachineTask.copy(tarazedSessionStateEvent, eventMetadata);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TarazedSessionStateEvent getEvent() {
        return this.event;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final EventMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final TarazedStateMachineTask copy(@NotNull TarazedSessionStateEvent event, @NotNull EventMetadata metadata) {
        event.getClass();
        metadata.getClass();
        return new TarazedStateMachineTask(event, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarazedStateMachineTask)) {
            return false;
        }
        TarazedStateMachineTask tarazedStateMachineTask = (TarazedStateMachineTask) other;
        return this.event == tarazedStateMachineTask.event && Intrinsics.areEqual(this.metadata, tarazedStateMachineTask.metadata);
    }

    @NotNull
    public final TarazedSessionStateEvent getEvent() {
        return this.event;
    }

    @NotNull
    public final EventMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.event.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TarazedStateMachineTask(event=" + this.event + ", metadata=" + this.metadata + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
