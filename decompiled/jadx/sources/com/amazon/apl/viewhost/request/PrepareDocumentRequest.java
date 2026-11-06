package com.amazon.apl.viewhost.request;

import com.amazon.apl.android.DocumentSession;
import com.amazon.apl.viewhost.config.DocumentOptions;
import com.amazon.apl.viewhost.primitives.Decodable;
import com.amazon.apl.viewhost.request.AutoValue_PrepareDocumentRequest;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class PrepareDocumentRequest {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract PrepareDocumentRequest build();

        public abstract Builder data(Decodable decodable);

        public abstract Builder document(Decodable decodable);

        public abstract Builder documentOptions(DocumentOptions documentOptions);

        public abstract Builder documentSession(DocumentSession documentSession);

        public abstract Builder token(String str);
    }

    public static Builder builder() {
        return new AutoValue_PrepareDocumentRequest.Builder();
    }

    @Nullable
    public abstract Decodable getData();

    public abstract Decodable getDocument();

    @Nullable
    public abstract DocumentOptions getDocumentOptions();

    public abstract DocumentSession getDocumentSession();

    @Nullable
    public abstract String getToken();
}
