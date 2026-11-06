package com.amazon.apl.viewhost.request;

import androidx.annotation.NonNull;
import com.amazon.apl.viewhost.primitives.Decodable;
import com.amazon.apl.viewhost.request.AutoValue_UpdateDataSourceRequest;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class UpdateDataSourceRequest {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract UpdateDataSourceRequest build();

        public abstract Builder callback(UpdateDataSourceCallback updateDataSourceCallback);

        public abstract Builder data(Decodable decodable);

        public abstract Builder token(String str);

        public abstract Builder type(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UpdateDataSourceCallback {
        void onFailure(String str);

        void onSuccess();
    }

    public static Builder builder() {
        return new AutoValue_UpdateDataSourceRequest.Builder();
    }

    @Nullable
    public abstract UpdateDataSourceCallback getCallback();

    @NonNull
    public abstract Decodable getData();

    @Nullable
    public abstract String getToken();

    @Nullable
    public abstract String getType();
}
