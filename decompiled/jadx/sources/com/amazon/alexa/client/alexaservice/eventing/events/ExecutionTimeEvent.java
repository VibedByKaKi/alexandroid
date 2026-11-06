package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/eventing/events/ExecutionTimeEvent;", "Lcom/amazon/alexa/client/alexaservice/eventing/Event$NotGated;", "eventType", "Lcom/amazon/alexa/client/alexaservice/eventing/events/ExecutionTimeEvent$EventType;", "executionTime", "", "(Lcom/amazon/alexa/client/alexaservice/eventing/events/ExecutionTimeEvent$EventType;J)V", "getEventType", "()Lcom/amazon/alexa/client/alexaservice/eventing/events/ExecutionTimeEvent$EventType;", "getExecutionTime", "()J", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "EventType", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExecutionTimeEvent extends Event.NotGated {

    @NotNull
    private final EventType eventType;
    private final long executionTime;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/eventing/events/ExecutionTimeEvent$EventType;", "", "(Ljava/lang/String;I)V", "REFRESH_INTERNAL_CAPABILITIES_STEP_SUCCESS", "REFRESH_EXTERNAL_CAPABILITIES_STEP_SUCCESS", "REFRESH_EXTERNAL_CAPABILITIES_STEP_FAILURE", "ESTABLISH_DOWNCHANNEL_CONNECTION_STEP_SUCCESS", "ESTABLISH_DOWNCHANNEL_CONNECTION_STEP_FAILURE", "VERIFY_ALEXA_GATEWAY_STEP_SUCCESS", "VERIFY_ALEXA_GATEWAY_STEP_FAILURE", "PUBLISH_DEVICE_CAPABILITIES_STEP_SUCCESS", "PUBLISH_DEVICE_CAPABILITIES_STEP_FAILURE", "SYNCHRONIZE_STATE_STEP_SUCCESS", "SYNCHRONIZE_STATE_STEP_FAILURE", "CHECK_READINESS_STEP_SUCCESS", "DOWNCHANNEL_ESTABLISHED_TO_AVAILABLE", "BACKGROUND_PUBLISH_DEVICE_CAPABILITIES_SUCCESS", "BACKGROUND_PUBLISH_DEVICE_CAPABILITIES_FINAL_FAILURE", "BACKGROUND_SYNCHRONIZE_STATE_SUCCESS", "BACKGROUND_SYNCHRONIZE_STATE_RETRY", "BACKGROUND_SYNCHRONIZE_STATE_EXHAUSTED", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EventType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType REFRESH_INTERNAL_CAPABILITIES_STEP_SUCCESS = new EventType("REFRESH_INTERNAL_CAPABILITIES_STEP_SUCCESS", 0);
        public static final EventType REFRESH_EXTERNAL_CAPABILITIES_STEP_SUCCESS = new EventType("REFRESH_EXTERNAL_CAPABILITIES_STEP_SUCCESS", 1);
        public static final EventType REFRESH_EXTERNAL_CAPABILITIES_STEP_FAILURE = new EventType("REFRESH_EXTERNAL_CAPABILITIES_STEP_FAILURE", 2);
        public static final EventType ESTABLISH_DOWNCHANNEL_CONNECTION_STEP_SUCCESS = new EventType("ESTABLISH_DOWNCHANNEL_CONNECTION_STEP_SUCCESS", 3);
        public static final EventType ESTABLISH_DOWNCHANNEL_CONNECTION_STEP_FAILURE = new EventType("ESTABLISH_DOWNCHANNEL_CONNECTION_STEP_FAILURE", 4);
        public static final EventType VERIFY_ALEXA_GATEWAY_STEP_SUCCESS = new EventType("VERIFY_ALEXA_GATEWAY_STEP_SUCCESS", 5);
        public static final EventType VERIFY_ALEXA_GATEWAY_STEP_FAILURE = new EventType("VERIFY_ALEXA_GATEWAY_STEP_FAILURE", 6);
        public static final EventType PUBLISH_DEVICE_CAPABILITIES_STEP_SUCCESS = new EventType("PUBLISH_DEVICE_CAPABILITIES_STEP_SUCCESS", 7);
        public static final EventType PUBLISH_DEVICE_CAPABILITIES_STEP_FAILURE = new EventType("PUBLISH_DEVICE_CAPABILITIES_STEP_FAILURE", 8);
        public static final EventType SYNCHRONIZE_STATE_STEP_SUCCESS = new EventType("SYNCHRONIZE_STATE_STEP_SUCCESS", 9);
        public static final EventType SYNCHRONIZE_STATE_STEP_FAILURE = new EventType("SYNCHRONIZE_STATE_STEP_FAILURE", 10);
        public static final EventType CHECK_READINESS_STEP_SUCCESS = new EventType("CHECK_READINESS_STEP_SUCCESS", 11);
        public static final EventType DOWNCHANNEL_ESTABLISHED_TO_AVAILABLE = new EventType("DOWNCHANNEL_ESTABLISHED_TO_AVAILABLE", 12);
        public static final EventType BACKGROUND_PUBLISH_DEVICE_CAPABILITIES_SUCCESS = new EventType("BACKGROUND_PUBLISH_DEVICE_CAPABILITIES_SUCCESS", 13);
        public static final EventType BACKGROUND_PUBLISH_DEVICE_CAPABILITIES_FINAL_FAILURE = new EventType("BACKGROUND_PUBLISH_DEVICE_CAPABILITIES_FINAL_FAILURE", 14);
        public static final EventType BACKGROUND_SYNCHRONIZE_STATE_SUCCESS = new EventType("BACKGROUND_SYNCHRONIZE_STATE_SUCCESS", 15);
        public static final EventType BACKGROUND_SYNCHRONIZE_STATE_RETRY = new EventType("BACKGROUND_SYNCHRONIZE_STATE_RETRY", 16);
        public static final EventType BACKGROUND_SYNCHRONIZE_STATE_EXHAUSTED = new EventType("BACKGROUND_SYNCHRONIZE_STATE_EXHAUSTED", 17);

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{REFRESH_INTERNAL_CAPABILITIES_STEP_SUCCESS, REFRESH_EXTERNAL_CAPABILITIES_STEP_SUCCESS, REFRESH_EXTERNAL_CAPABILITIES_STEP_FAILURE, ESTABLISH_DOWNCHANNEL_CONNECTION_STEP_SUCCESS, ESTABLISH_DOWNCHANNEL_CONNECTION_STEP_FAILURE, VERIFY_ALEXA_GATEWAY_STEP_SUCCESS, VERIFY_ALEXA_GATEWAY_STEP_FAILURE, PUBLISH_DEVICE_CAPABILITIES_STEP_SUCCESS, PUBLISH_DEVICE_CAPABILITIES_STEP_FAILURE, SYNCHRONIZE_STATE_STEP_SUCCESS, SYNCHRONIZE_STATE_STEP_FAILURE, CHECK_READINESS_STEP_SUCCESS, DOWNCHANNEL_ESTABLISHED_TO_AVAILABLE, BACKGROUND_PUBLISH_DEVICE_CAPABILITIES_SUCCESS, BACKGROUND_PUBLISH_DEVICE_CAPABILITIES_FINAL_FAILURE, BACKGROUND_SYNCHRONIZE_STATE_SUCCESS, BACKGROUND_SYNCHRONIZE_STATE_RETRY, BACKGROUND_SYNCHRONIZE_STATE_EXHAUSTED};
        }

        static {
            EventType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private EventType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<EventType> getEntries() {
            return $ENTRIES;
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public ExecutionTimeEvent(@NotNull EventType eventType, long j) {
        eventType.getClass();
        this.eventType = eventType;
        this.executionTime = j;
    }

    public static /* synthetic */ ExecutionTimeEvent copy$default(ExecutionTimeEvent executionTimeEvent, EventType eventType, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = executionTimeEvent.eventType;
        }
        if ((i & 2) != 0) {
            j = executionTimeEvent.executionTime;
        }
        return executionTimeEvent.copy(eventType, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EventType getEventType() {
        return this.eventType;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExecutionTime() {
        return this.executionTime;
    }

    @NotNull
    public final ExecutionTimeEvent copy(@NotNull EventType eventType, long executionTime) {
        eventType.getClass();
        return new ExecutionTimeEvent(eventType, executionTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExecutionTimeEvent)) {
            return false;
        }
        ExecutionTimeEvent executionTimeEvent = (ExecutionTimeEvent) other;
        return this.eventType == executionTimeEvent.eventType && this.executionTime == executionTimeEvent.executionTime;
    }

    @NotNull
    public final EventType getEventType() {
        return this.eventType;
    }

    public final long getExecutionTime() {
        return this.executionTime;
    }

    public int hashCode() {
        return Long.hashCode(this.executionTime) + (this.eventType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ExecutionTimeEvent(eventType=" + this.eventType + ", executionTime=" + this.executionTime + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
