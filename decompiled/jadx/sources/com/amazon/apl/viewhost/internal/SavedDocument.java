package com.amazon.apl.viewhost.internal;

import androidx.annotation.NonNull;
import com.amazon.apl.viewhost.DocumentHandle;
import com.amazon.apl.viewhost.internal.AutoValue_SavedDocument;
import com.amazon.apl.viewhost.request.FinishDocumentRequest;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class SavedDocument {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract SavedDocument build();

        public abstract Builder documentHandle(DocumentHandle documentHandle);
    }

    public static Builder builder() {
        return new AutoValue_SavedDocument.Builder();
    }

    public void finish() {
        getDocumentHandle().finish(FinishDocumentRequest.builder().token(getDocumentHandle().getToken()).build());
    }

    @NonNull
    public abstract DocumentHandle getDocumentHandle();
}
