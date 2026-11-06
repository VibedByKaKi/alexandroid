package com.amazon.alexa.smarthomecameras.eventsender.context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.smarthomecameras.directive.Directive;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.events.UpdateLiveViewPayload;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.LvcTimestamp;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.multiview.enums.UpdateLiveViewType;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UpdateLiveViewContext extends LiveViewControllerEventSenderContext {
    private static final String COUNT_METRIC_NAME = "AppLiveView_v2_updateLiveView";
    private final String requestId;
    private final String sessionId;

    @Nullable
    private final List<String> targets;
    private final UpdateLiveViewType updateType;
    private static final String EVENT_NAME = "UpdateLiveView";
    private static final AlexaHeader ALEXA_HEADER = AlexaHeader.builder().setNamespace(Directive.LIVE_VIEW_CONTROLLER_NAMESPACE).setName(EVENT_NAME).build();

    private UpdateLiveViewContext(@Nullable String str, String str2, @Nullable String str3, @Nullable UpdateLiveViewType updateLiveViewType, @Nullable List<String> list) {
        super(str);
        this.sessionId = str2;
        this.requestId = str3 == null ? UUID.randomUUID().toString() : str3;
        this.updateType = updateLiveViewType == null ? UpdateLiveViewType.CLEAR_CAMERA_MAGNIFICATION : updateLiveViewType;
        this.targets = list;
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public Serializable constructEventPayload() {
        return new UpdateLiveViewPayload(this.sessionId, this.requestId, this.updateType, this.targets, LvcTimestamp.now());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateLiveViewContext)) {
            return false;
        }
        UpdateLiveViewContext updateLiveViewContext = (UpdateLiveViewContext) obj;
        return Objects.equals(this.manufacturerName, updateLiveViewContext.manufacturerName) && Objects.equals(this.sessionId, updateLiveViewContext.sessionId) && Objects.equals(this.requestId, updateLiveViewContext.requestId) && Objects.equals(this.updateType, updateLiveViewContext.updateType) && Objects.equals(this.targets, updateLiveViewContext.targets);
    }

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.EventSenderContext
    @NonNull
    public AlexaHeader getAlexaHeader() {
        return ALEXA_HEADER;
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

    @Override // com.amazon.alexa.smarthomecameras.eventsender.context.LiveViewControllerEventSenderContext
    public String getManufacturerName() {
        return this.manufacturerName;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public List<String> getTargets() {
        return this.targets;
    }

    public UpdateLiveViewType getUpdateType() {
        return this.updateType;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {

        @Nullable
        private String manufacturerName;

        @Nullable
        private String requestId;
        private String sessionId;

        @Nullable
        private List<String> targets;
        private UpdateLiveViewType updateType;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public UpdateLiveViewContext build() {
            return new UpdateLiveViewContext(this, 0);
        }

        public Builder setManufacturerName(String str) {
            this.manufacturerName = str;
            return this;
        }

        public Builder setRequestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder setSessionId(String str) {
            this.sessionId = str;
            return this;
        }

        public Builder setTargets(List<String> list) {
            this.targets = list;
            return this;
        }

        public Builder setUpdateType(UpdateLiveViewType updateLiveViewType) {
            this.updateType = updateLiveViewType;
            return this;
        }

        private Builder() {
        }
    }

    public /* synthetic */ UpdateLiveViewContext(Builder builder, int i) {
        this(builder);
    }

    private UpdateLiveViewContext(Builder builder) {
        this(builder.manufacturerName, builder.sessionId, builder.requestId, builder.updateType, builder.targets);
    }
}
