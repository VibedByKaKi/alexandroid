package com.amazon.apl.viewhost.request;

import com.amazon.apl.viewhost.primitives.Decodable;
import com.amazon.apl.viewhost.request.AutoValue_ExecuteCommandsRequest;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class ExecuteCommandsRequest {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ExecuteCommandsRequest build();

        public abstract Builder callback(ExecuteCommandsCallback executeCommandsCallback);

        public abstract Builder commands(Decodable decodable);

        public abstract Builder token(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ExecuteCommandsCallback {
        void onComplete();

        void onTerminated();
    }

    public static Builder builder() {
        return new AutoValue_ExecuteCommandsRequest.Builder();
    }

    @Nullable
    public abstract ExecuteCommandsCallback getCallback();

    public abstract Decodable getCommands();

    @Nullable
    public abstract String getToken();
}
