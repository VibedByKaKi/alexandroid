package com.amazon.alexa.ra.apl.fragments.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mosaic.apl.events.UserEvent;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentUserEvent;", "Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentEvent;", "event", "Lcom/amazon/alexa/mosaic/apl/events/UserEvent;", "fragment", "Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;", "<init>", "(Lcom/amazon/alexa/mosaic/apl/events/UserEvent;Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;)V", "getEvent", "()Lcom/amazon/alexa/mosaic/apl/events/UserEvent;", "getFragment", "()Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class APLFragmentUserEvent implements APLFragmentEvent {
    public static final int $stable = 8;

    @NotNull
    private final UserEvent event;

    @NotNull
    private final APLFragmentData fragment;

    public APLFragmentUserEvent(@NotNull UserEvent userEvent, @NotNull APLFragmentData aPLFragmentData) {
        userEvent.getClass();
        aPLFragmentData.getClass();
        this.event = userEvent;
        this.fragment = aPLFragmentData;
    }

    public static /* synthetic */ APLFragmentUserEvent copy$default(APLFragmentUserEvent aPLFragmentUserEvent, UserEvent userEvent, APLFragmentData aPLFragmentData, int i, Object obj) {
        if ((i & 1) != 0) {
            userEvent = aPLFragmentUserEvent.event;
        }
        if ((i & 2) != 0) {
            aPLFragmentData = aPLFragmentUserEvent.fragment;
        }
        return aPLFragmentUserEvent.copy(userEvent, aPLFragmentData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UserEvent getEvent() {
        return this.event;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final APLFragmentData getFragment() {
        return this.fragment;
    }

    @NotNull
    public final APLFragmentUserEvent copy(@NotNull UserEvent event, @NotNull APLFragmentData fragment) {
        event.getClass();
        fragment.getClass();
        return new APLFragmentUserEvent(event, fragment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APLFragmentUserEvent)) {
            return false;
        }
        APLFragmentUserEvent aPLFragmentUserEvent = (APLFragmentUserEvent) other;
        return Intrinsics.areEqual(this.event, aPLFragmentUserEvent.event) && Intrinsics.areEqual(this.fragment, aPLFragmentUserEvent.fragment);
    }

    @NotNull
    public final UserEvent getEvent() {
        return this.event;
    }

    @NotNull
    public final APLFragmentData getFragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.fragment.hashCode() + (this.event.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "APLFragmentUserEvent(event=" + this.event + ", fragment=" + this.fragment + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
