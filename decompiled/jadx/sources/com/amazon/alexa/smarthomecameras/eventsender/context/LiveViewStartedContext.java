package com.amazon.alexa.smarthomecameras.eventsender.context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.smarthomecameras.directive.Directive;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.events.LiveViewStartedEventPayload;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview.LiveViewLayout;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LiveViewStartedContext extends LiveViewControllerEventSenderContext {
    private static final String COUNT_METRIC_NAME = "AppLiveView_v2_liveViewStarted";

    @Nullable
    private final LiveViewLayout layout;
    private final String sessionId;
    private static final String EVENT_NAME = "LiveViewStarted";
    private static final AlexaHeader ALEXA_HEADER = AlexaHeader.builder().setNamespace(Directive.LIVE_VIEW_CONTROLLER_NAMESPACE).setName(EVENT_NAME).build();

    private LiveViewStartedContext(Builder builder) {
        this(builder.manufacturerName, builder.sessionId, builder.layout);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public Serializable constructEventPayload() {
        return new LiveViewStartedEventPayload(this.sessionId, this.layout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveViewStartedContext)) {
            return false;
        }
        LiveViewStartedContext liveViewStartedContext = (LiveViewStartedContext) obj;
        return Objects.equals(this.manufacturerName, liveViewStartedContext.manufacturerName) && Objects.equals(this.sessionId, liveViewStartedContext.sessionId) && Objects.equals(this.layout, liveViewStartedContext.layout);
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public AlexaHeader getAlexaHeader() {
        return ALEXA_HEADER;
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public String getCountMetricName() {
        return "AppLiveView_v2_liveViewStarted";
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public String getEventName() {
        return EVENT_NAME;
    }

    @Nullable
    public LiveViewLayout getLayout() {
        return this.layout;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {

        @Nullable
        private LiveViewLayout layout;

        @Nullable
        private String manufacturerName;
        private String sessionId;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public LiveViewStartedContext build() {
            return new LiveViewStartedContext(this, 0);
        }

        public Builder setLayout(LiveViewLayout liveViewLayout) {
            this.layout = liveViewLayout;
            return this;
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

    private LiveViewStartedContext(@Nullable String str, String str2, @Nullable LiveViewLayout liveViewLayout) {
        super(str);
        this.sessionId = str2;
        this.layout = liveViewLayout;
    }

    public /* synthetic */ LiveViewStartedContext(Builder builder, int i) {
        this(builder);
    }
}
