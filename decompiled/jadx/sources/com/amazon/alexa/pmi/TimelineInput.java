package com.amazon.alexa.pmi;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/pmi/TimelineInput;", "", "name", "", "registeredEvents", "", "Lcom/amazon/alexa/pmi/TimelineEvent;", "ownerIdentifier", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getRegisteredEvents", "()Ljava/util/List;", "getOwnerIdentifier", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class TimelineInput {

    @NotNull
    private final String name;

    @NotNull
    private final String ownerIdentifier;

    @NotNull
    private final List<TimelineEvent> registeredEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public TimelineInput(@NotNull String str, @NotNull List<? extends TimelineEvent> list, @NotNull String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.name = str;
        this.registeredEvents = list;
        this.ownerIdentifier = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimelineInput copy$default(TimelineInput timelineInput, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timelineInput.name;
        }
        if ((i & 2) != 0) {
            list = timelineInput.registeredEvents;
        }
        if ((i & 4) != 0) {
            str2 = timelineInput.ownerIdentifier;
        }
        return timelineInput.copy(str, list, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<TimelineEvent> component2() {
        return this.registeredEvents;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOwnerIdentifier() {
        return this.ownerIdentifier;
    }

    @NotNull
    public final TimelineInput copy(@NotNull String name, @NotNull List<? extends TimelineEvent> registeredEvents, @NotNull String ownerIdentifier) {
        name.getClass();
        registeredEvents.getClass();
        ownerIdentifier.getClass();
        return new TimelineInput(name, registeredEvents, ownerIdentifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimelineInput)) {
            return false;
        }
        TimelineInput timelineInput = (TimelineInput) other;
        return Intrinsics.areEqual(this.name, timelineInput.name) && Intrinsics.areEqual(this.registeredEvents, timelineInput.registeredEvents) && Intrinsics.areEqual(this.ownerIdentifier, timelineInput.ownerIdentifier);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getOwnerIdentifier() {
        return this.ownerIdentifier;
    }

    @NotNull
    public final List<TimelineEvent> getRegisteredEvents() {
        return this.registeredEvents;
    }

    public int hashCode() {
        return this.ownerIdentifier.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.registeredEvents, this.name.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        List<TimelineEvent> list = this.registeredEvents;
        return a$$ExternalSyntheticOutline0.m(AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("TimelineInput(name=", str, ", registeredEvents=", (List) list, ", ownerIdentifier="), this.ownerIdentifier, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ TimelineInput(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? PMIConfiguration.DEFAULT.getDefaultEvents() : list, str2);
    }
}
