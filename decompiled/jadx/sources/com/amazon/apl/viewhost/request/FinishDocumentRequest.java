package com.amazon.apl.viewhost.request;

import com.amazon.apl.viewhost.request.AutoValue_FinishDocumentRequest;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class FinishDocumentRequest {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract FinishDocumentRequest build();

        public abstract Builder token(String str);
    }

    public static Builder builder() {
        return new AutoValue_FinishDocumentRequest.Builder();
    }

    @Nullable
    public abstract String getToken();
}
