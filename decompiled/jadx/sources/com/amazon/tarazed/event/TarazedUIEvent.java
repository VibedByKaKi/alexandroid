package com.amazon.tarazed.event;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/amazon/tarazed/event/TarazedUIEvent;", "Lcom/amazon/tarazed/event/TarazedEvent;", "eventType", "Lcom/amazon/tarazed/event/TarazedUIEventType;", "metadata", "Lcom/amazon/tarazed/event/EventMetadata;", "(Lcom/amazon/tarazed/event/TarazedUIEventType;Lcom/amazon/tarazed/event/EventMetadata;)V", "getEventType", "()Lcom/amazon/tarazed/event/TarazedUIEventType;", "getMetadata", "()Lcom/amazon/tarazed/event/EventMetadata;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TarazedUIEvent extends TarazedEvent {

    @NotNull
    private final TarazedUIEventType eventType;

    @NotNull
    private final EventMetadata metadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarazedUIEvent(@NotNull TarazedUIEventType tarazedUIEventType, @NotNull EventMetadata eventMetadata) {
        super(null);
        tarazedUIEventType.getClass();
        eventMetadata.getClass();
        this.eventType = tarazedUIEventType;
        this.metadata = eventMetadata;
    }

    public static /* synthetic */ TarazedUIEvent copy$default(TarazedUIEvent tarazedUIEvent, TarazedUIEventType tarazedUIEventType, EventMetadata eventMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            tarazedUIEventType = tarazedUIEvent.eventType;
        }
        if ((i & 2) != 0) {
            eventMetadata = tarazedUIEvent.metadata;
        }
        return tarazedUIEvent.copy(tarazedUIEventType, eventMetadata);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TarazedUIEventType getEventType() {
        return this.eventType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final EventMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final TarazedUIEvent copy(@NotNull TarazedUIEventType eventType, @NotNull EventMetadata metadata) {
        eventType.getClass();
        metadata.getClass();
        return new TarazedUIEvent(eventType, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarazedUIEvent)) {
            return false;
        }
        TarazedUIEvent tarazedUIEvent = (TarazedUIEvent) other;
        return this.eventType == tarazedUIEvent.eventType && Intrinsics.areEqual(this.metadata, tarazedUIEvent.metadata);
    }

    @NotNull
    public final TarazedUIEventType getEventType() {
        return this.eventType;
    }

    @NotNull
    public final EventMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.eventType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TarazedUIEvent(eventType=" + this.eventType + ", metadata=" + this.metadata + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
