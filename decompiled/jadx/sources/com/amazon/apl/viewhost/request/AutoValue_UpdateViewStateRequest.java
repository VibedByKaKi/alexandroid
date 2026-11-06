package com.amazon.apl.viewhost.request;

import com.amazon.apl.viewhost.primitives.DisplayState;
import com.amazon.apl.viewhost.request.UpdateViewStateRequest;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_UpdateViewStateRequest extends UpdateViewStateRequest {
    private final UpdateViewStateRequest.UpdateViewStateCallback callback;
    private final DisplayState displayState;
    private final Double processingRate;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends UpdateViewStateRequest.Builder {
        private UpdateViewStateRequest.UpdateViewStateCallback callback;
        private DisplayState displayState;
        private Double processingRate;

        @Override // com.amazon.apl.viewhost.request.UpdateViewStateRequest.Builder
        public UpdateViewStateRequest build() {
            return new AutoValue_UpdateViewStateRequest(this.displayState, this.processingRate, this.callback);
        }

        @Override // com.amazon.apl.viewhost.request.UpdateViewStateRequest.Builder
        public UpdateViewStateRequest.Builder callback(UpdateViewStateRequest.UpdateViewStateCallback updateViewStateCallback) {
            this.callback = updateViewStateCallback;
            return this;
        }

        @Override // com.amazon.apl.viewhost.request.UpdateViewStateRequest.Builder
        public UpdateViewStateRequest.Builder displayState(DisplayState displayState) {
            this.displayState = displayState;
            return this;
        }

        @Override // com.amazon.apl.viewhost.request.UpdateViewStateRequest.Builder
        public UpdateViewStateRequest.Builder processingRate(Double d) {
            this.processingRate = d;
            return this;
        }
    }

    private AutoValue_UpdateViewStateRequest(@Nullable DisplayState displayState, @Nullable Double d, @Nullable UpdateViewStateRequest.UpdateViewStateCallback updateViewStateCallback) {
        this.displayState = displayState;
        this.processingRate = d;
        this.callback = updateViewStateCallback;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateViewStateRequest) {
            UpdateViewStateRequest updateViewStateRequest = (UpdateViewStateRequest) obj;
            DisplayState displayState = this.displayState;
            if (displayState != null ? displayState.equals(updateViewStateRequest.getDisplayState()) : updateViewStateRequest.getDisplayState() == null) {
                Double d = this.processingRate;
                if (d != null ? d.equals(updateViewStateRequest.getProcessingRate()) : updateViewStateRequest.getProcessingRate() == null) {
                    UpdateViewStateRequest.UpdateViewStateCallback updateViewStateCallback = this.callback;
                    if (updateViewStateCallback != null ? updateViewStateCallback.equals(updateViewStateRequest.getCallback()) : updateViewStateRequest.getCallback() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.apl.viewhost.request.UpdateViewStateRequest
    @Nullable
    public UpdateViewStateRequest.UpdateViewStateCallback getCallback() {
        return this.callback;
    }

    @Override // com.amazon.apl.viewhost.request.UpdateViewStateRequest
    @Nullable
    public DisplayState getDisplayState() {
        return this.displayState;
    }

    @Override // com.amazon.apl.viewhost.request.UpdateViewStateRequest
    @Nullable
    public Double getProcessingRate() {
        return this.processingRate;
    }

    public int hashCode() {
        DisplayState displayState = this.displayState;
        int hashCode = ((displayState == null ? 0 : displayState.hashCode()) ^ 1000003) * 1000003;
        Double d = this.processingRate;
        int hashCode2 = (hashCode ^ (d == null ? 0 : d.hashCode())) * 1000003;
        UpdateViewStateRequest.UpdateViewStateCallback updateViewStateCallback = this.callback;
        return hashCode2 ^ (updateViewStateCallback != null ? updateViewStateCallback.hashCode() : 0);
    }

    public String toString() {
        return "UpdateViewStateRequest{displayState=" + this.displayState + ", processingRate=" + this.processingRate + ", callback=" + this.callback + StringSubstitutor.DEFAULT_VAR_END;
    }
}
