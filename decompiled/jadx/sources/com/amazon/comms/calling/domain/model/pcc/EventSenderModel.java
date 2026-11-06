package com.amazon.comms.calling.domain.model.pcc;

import com.amazon.alexa.api.compat.model.AlexaContextsProvider;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/amazon/comms/calling/domain/model/pcc/EventSenderModel;", "", "eventType", "Lcom/amazon/comms/calling/domain/model/pcc/EventType;", "alexaContextProvider", "Lcom/amazon/alexa/api/compat/model/AlexaContextsProvider;", "eventModel", "Lcom/amazon/comms/calling/domain/model/pcc/EventModel;", "deviceContext", "", "<init>", "(Lcom/amazon/comms/calling/domain/model/pcc/EventType;Lcom/amazon/alexa/api/compat/model/AlexaContextsProvider;Lcom/amazon/comms/calling/domain/model/pcc/EventModel;Ljava/lang/String;)V", "getEventType", "()Lcom/amazon/comms/calling/domain/model/pcc/EventType;", "getAlexaContextProvider", "()Lcom/amazon/alexa/api/compat/model/AlexaContextsProvider;", "getEventModel", "()Lcom/amazon/comms/calling/domain/model/pcc/EventModel;", "getDeviceContext", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class EventSenderModel {

    @SerializedName("alexaContextProvider")
    @NotNull
    private final AlexaContextsProvider alexaContextProvider;

    @SerializedName("deviceContext")
    @Nullable
    private final String deviceContext;

    @SerializedName("eventModel")
    @NotNull
    private final EventModel eventModel;

    @SerializedName("eventType")
    @NotNull
    private final EventType eventType;

    public EventSenderModel(@NotNull EventType eventType, @NotNull AlexaContextsProvider alexaContextsProvider, @NotNull EventModel eventModel, @Nullable String str) {
        eventType.getClass();
        alexaContextsProvider.getClass();
        eventModel.getClass();
        this.eventType = eventType;
        this.alexaContextProvider = alexaContextsProvider;
        this.eventModel = eventModel;
        this.deviceContext = str;
    }

    public static /* synthetic */ EventSenderModel copy$default(EventSenderModel eventSenderModel, EventType eventType, AlexaContextsProvider alexaContextsProvider, EventModel eventModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = eventSenderModel.eventType;
        }
        if ((i & 2) != 0) {
            alexaContextsProvider = eventSenderModel.alexaContextProvider;
        }
        if ((i & 4) != 0) {
            eventModel = eventSenderModel.eventModel;
        }
        if ((i & 8) != 0) {
            str = eventSenderModel.deviceContext;
        }
        return eventSenderModel.copy(eventType, alexaContextsProvider, eventModel, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EventType getEventType() {
        return this.eventType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AlexaContextsProvider getAlexaContextProvider() {
        return this.alexaContextProvider;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final EventModel getEventModel() {
        return this.eventModel;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDeviceContext() {
        return this.deviceContext;
    }

    @NotNull
    public final EventSenderModel copy(@NotNull EventType eventType, @NotNull AlexaContextsProvider alexaContextProvider, @NotNull EventModel eventModel, @Nullable String deviceContext) {
        eventType.getClass();
        alexaContextProvider.getClass();
        eventModel.getClass();
        return new EventSenderModel(eventType, alexaContextProvider, eventModel, deviceContext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSenderModel)) {
            return false;
        }
        EventSenderModel eventSenderModel = (EventSenderModel) other;
        return this.eventType == eventSenderModel.eventType && Intrinsics.areEqual(this.alexaContextProvider, eventSenderModel.alexaContextProvider) && Intrinsics.areEqual(this.eventModel, eventSenderModel.eventModel) && Intrinsics.areEqual(this.deviceContext, eventSenderModel.deviceContext);
    }

    @NotNull
    public final AlexaContextsProvider getAlexaContextProvider() {
        return this.alexaContextProvider;
    }

    @Nullable
    public final String getDeviceContext() {
        return this.deviceContext;
    }

    @NotNull
    public final EventModel getEventModel() {
        return this.eventModel;
    }

    @NotNull
    public final EventType getEventType() {
        return this.eventType;
    }

    public int hashCode() {
        int hashCode = (this.eventModel.hashCode() + ((this.alexaContextProvider.hashCode() + (this.eventType.hashCode() * 31)) * 31)) * 31;
        String str = this.deviceContext;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "EventSenderModel(eventType=" + this.eventType + ", alexaContextProvider=" + this.alexaContextProvider + ", eventModel=" + this.eventModel + ", deviceContext=" + this.deviceContext + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ EventSenderModel(EventType eventType, AlexaContextsProvider alexaContextsProvider, EventModel eventModel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, alexaContextsProvider, eventModel, (i & 8) != 0 ? null : str);
    }
}
