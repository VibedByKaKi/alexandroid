package com.amazon.apl.viewhost.request;

import com.amazon.apl.viewhost.primitives.DisplayState;
import com.amazon.apl.viewhost.request.AutoValue_UpdateViewStateRequest;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class UpdateViewStateRequest {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract UpdateViewStateRequest build();

        public abstract Builder callback(UpdateViewStateCallback updateViewStateCallback);

        public abstract Builder displayState(DisplayState displayState);

        public abstract Builder processingRate(Double d);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UpdateViewStateCallback {
        void onComplete();
    }

    public static Builder builder() {
        return new AutoValue_UpdateViewStateRequest.Builder();
    }

    @Nullable
    public abstract UpdateViewStateCallback getCallback();

    @Nullable
    public abstract DisplayState getDisplayState();

    @Nullable
    public abstract Double getProcessingRate();
}
