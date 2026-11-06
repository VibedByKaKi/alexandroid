package com.amazon.tarazed.event;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.tarazed.state.TarazedSessionState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/amazon/tarazed/event/TarazedStateUpdatedEvent;", "Lcom/amazon/tarazed/event/TarazedEvent;", "currentState", "Lcom/amazon/tarazed/state/TarazedSessionState;", "previousState", "metadata", "Lcom/amazon/tarazed/event/EventMetadata;", "(Lcom/amazon/tarazed/state/TarazedSessionState;Lcom/amazon/tarazed/state/TarazedSessionState;Lcom/amazon/tarazed/event/EventMetadata;)V", "getCurrentState", "()Lcom/amazon/tarazed/state/TarazedSessionState;", "getMetadata", "()Lcom/amazon/tarazed/event/EventMetadata;", "getPreviousState", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TarazedStateUpdatedEvent extends TarazedEvent {

    @NotNull
    private final TarazedSessionState currentState;

    @NotNull
    private final EventMetadata metadata;

    @NotNull
    private final TarazedSessionState previousState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarazedStateUpdatedEvent(@NotNull TarazedSessionState tarazedSessionState, @NotNull TarazedSessionState tarazedSessionState2, @NotNull EventMetadata eventMetadata) {
        super(null);
        tarazedSessionState.getClass();
        tarazedSessionState2.getClass();
        eventMetadata.getClass();
        this.currentState = tarazedSessionState;
        this.previousState = tarazedSessionState2;
        this.metadata = eventMetadata;
    }

    public static /* synthetic */ TarazedStateUpdatedEvent copy$default(TarazedStateUpdatedEvent tarazedStateUpdatedEvent, TarazedSessionState tarazedSessionState, TarazedSessionState tarazedSessionState2, EventMetadata eventMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            tarazedSessionState = tarazedStateUpdatedEvent.currentState;
        }
        if ((i & 2) != 0) {
            tarazedSessionState2 = tarazedStateUpdatedEvent.previousState;
        }
        if ((i & 4) != 0) {
            eventMetadata = tarazedStateUpdatedEvent.metadata;
        }
        return tarazedStateUpdatedEvent.copy(tarazedSessionState, tarazedSessionState2, eventMetadata);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TarazedSessionState getCurrentState() {
        return this.currentState;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TarazedSessionState getPreviousState() {
        return this.previousState;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final EventMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final TarazedStateUpdatedEvent copy(@NotNull TarazedSessionState currentState, @NotNull TarazedSessionState previousState, @NotNull EventMetadata metadata) {
        currentState.getClass();
        previousState.getClass();
        metadata.getClass();
        return new TarazedStateUpdatedEvent(currentState, previousState, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarazedStateUpdatedEvent)) {
            return false;
        }
        TarazedStateUpdatedEvent tarazedStateUpdatedEvent = (TarazedStateUpdatedEvent) other;
        return this.currentState == tarazedStateUpdatedEvent.currentState && this.previousState == tarazedStateUpdatedEvent.previousState && Intrinsics.areEqual(this.metadata, tarazedStateUpdatedEvent.metadata);
    }

    @NotNull
    public final TarazedSessionState getCurrentState() {
        return this.currentState;
    }

    @NotNull
    public final EventMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final TarazedSessionState getPreviousState() {
        return this.previousState;
    }

    public int hashCode() {
        return this.metadata.hashCode() + ((this.previousState.hashCode() + (this.currentState.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TarazedStateUpdatedEvent(currentState=" + this.currentState + ", previousState=" + this.previousState + ", metadata=" + this.metadata + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
