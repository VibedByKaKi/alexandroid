package com.amazon.alexa.smarthomecameras.eventsender.context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.smarthomecameras.directive.Directive;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.events.LiveViewStoppedEventPayload;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewStoppedContext extends LiveViewControllerEventSenderContext {
    private static final String COUNT_METRIC_NAME = "AppLiveView_v2_liveViewStopped";

    @Nullable
    private final String sessionId;
    private static final String EVENT_NAME = "LiveViewStopped";
    private static final AlexaHeader ALEXA_HEADER = AlexaHeader.builder().setNamespace(Directive.LIVE_VIEW_CONTROLLER_NAMESPACE).setName(EVENT_NAME).build();

    private LiveViewStoppedContext(Builder builder) {
        this(builder.manufacturerName, builder.sessionId);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public Serializable constructEventPayload() {
        return new LiveViewStoppedEventPayload(this.sessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveViewStoppedContext)) {
            return false;
        }
        LiveViewStoppedContext liveViewStoppedContext = (LiveViewStoppedContext) obj;
        return Objects.equals(this.manufacturerName, liveViewStoppedContext.manufacturerName) && Objects.equals(this.sessionId, liveViewStoppedContext.sessionId);
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public AlexaHeader getAlexaHeader() {
        return ALEXA_HEADER;
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public String getCountMetricName() {
        return "AppLiveView_v2_liveViewStopped";
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public String getEventName() {
        return EVENT_NAME;
    }

    @Nullable
    public String getSessionId() {
        return this.sessionId;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {

        @Nullable
        private String manufacturerName;

        @Nullable
        private String sessionId;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public LiveViewStoppedContext build() {
            return new LiveViewStoppedContext(this, 0);
        }

        public Builder setManufacturerName(String str) {
            this.manufacturerName = str;
            return this;
        }

        public Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        private Builder() {
        }
    }

    private LiveViewStoppedContext(@Nullable String str, @Nullable String str2) {
        super(str);
        this.sessionId = str2;
    }

    public /* synthetic */ LiveViewStoppedContext(Builder builder, int i) {
        this(builder);
    }
}
