package com.amazon.apl.viewhost.config;

import com.amazon.apl.viewhost.PreparedDocument;
import com.amazon.apl.viewhost.config.AutoValue_EmbeddedDocumentResponse;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class EmbeddedDocumentResponse {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract EmbeddedDocumentResponse build();

        public abstract Builder preparedDocument(PreparedDocument preparedDocument);

        public abstract Builder visualContextAttached(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_EmbeddedDocumentResponse.Builder();
    }

    public abstract PreparedDocument getPreparedDocument();

    public abstract boolean isVisualContextAttached();
}
