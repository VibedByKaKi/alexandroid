package com.amazon.alexa.smarthomecameras.eventsender.context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.smarthomecameras.directive.Directive;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.events.RequestStopLiveViewPayload;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class RequestStopLiveViewContext extends LiveViewControllerEventSenderContext {
    private static final String COUNT_METRIC_NAME = "AppLiveView_v2_requestStopLiveView";

    @Nullable
    private final String sessionId;
    private static final String EVENT_NAME = "RequestStopLiveView";
    private static final AlexaHeader ALEXA_HEADER = AlexaHeader.builder().setNamespace(Directive.LIVE_VIEW_CONTROLLER_NAMESPACE).setName(EVENT_NAME).build();

    private RequestStopLiveViewContext(Builder builder) {
        this(builder.manufacturerName, builder.sessionId);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public Serializable constructEventPayload() {
        return new RequestStopLiveViewPayload(this.sessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestStopLiveViewContext)) {
            return false;
        }
        RequestStopLiveViewContext requestStopLiveViewContext = (RequestStopLiveViewContext) obj;
        return Objects.equals(this.manufacturerName, requestStopLiveViewContext.manufacturerName) && Objects.equals(this.sessionId, requestStopLiveViewContext.sessionId);
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public AlexaHeader getAlexaHeader() {
        return ALEXA_HEADER;
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public String getCountMetricName() {
        return "AppLiveView_v2_requestStopLiveView";
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
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

        public RequestStopLiveViewContext build() {
            return new RequestStopLiveViewContext(this, 0);
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

    private RequestStopLiveViewContext(@Nullable String str, @Nullable String str2) {
        super(str);
        this.sessionId = str2;
    }

    public /* synthetic */ RequestStopLiveViewContext(Builder builder, int i) {
        this(builder);
    }
}
