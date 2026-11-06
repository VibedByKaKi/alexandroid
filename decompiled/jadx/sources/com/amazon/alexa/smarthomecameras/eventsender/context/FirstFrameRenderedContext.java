package com.amazon.alexa.smarthomecameras.eventsender.context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.smarthomecameras.directive.Directive;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.events.FirstFrameRenderedPayload;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.AlexaLatencyMetadata;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.FirstFrameLatencyMetadata;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FirstFrameRenderedContext extends LiveViewControllerEventSenderContext {
    private static final String COUNT_METRIC_NAME = "AppLiveView_v2_firstFrameRendered";

    @NonNull
    private final AlexaLatencyMetadata alexaLatencyMetadata;

    @NonNull
    private final FirstFrameLatencyMetadata firstFrameLatencyMetadata;

    @NonNull
    private final String sessionId;
    private static final String EVENT_NAME = "FirstFrameRendered";
    private static final AlexaHeader ALEXA_HEADER = AlexaHeader.builder().setNamespace(Directive.LIVE_VIEW_CONTROLLER_NAMESPACE).setName(EVENT_NAME).build();

    public FirstFrameRenderedContext(@Nullable String str, @NonNull String str2, @NonNull AlexaLatencyMetadata alexaLatencyMetadata, @NonNull FirstFrameLatencyMetadata firstFrameLatencyMetadata) {
        super(str);
        this.sessionId = str2;
        this.alexaLatencyMetadata = alexaLatencyMetadata;
        this.firstFrameLatencyMetadata = firstFrameLatencyMetadata;
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public Serializable constructEventPayload() {
        return new FirstFrameRenderedPayload(this.sessionId, this.alexaLatencyMetadata, this.firstFrameLatencyMetadata);
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public AlexaHeader getAlexaHeader() {
        return ALEXA_HEADER;
    }

    @NonNull
    public AlexaLatencyMetadata getAlexaLatencyMetadata() {
        return this.alexaLatencyMetadata;
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public String getCountMetricName() {
        return COUNT_METRIC_NAME;
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public String getEventName() {
        return EVENT_NAME;
    }

    @NonNull
    public FirstFrameLatencyMetadata getFirstFrameLatencyMetadata() {
        return this.firstFrameLatencyMetadata;
    }

    @NonNull
    public String getSessionId() {
        return this.sessionId;
    }
}
