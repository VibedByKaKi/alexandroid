package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.mosaic.apl.actions.AutoValue_RestoreDocumentAction;
import com.amazon.apl.android.DocumentState;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class RestoreDocumentAction {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract RestoreDocumentAction build();

        public abstract Builder state(DocumentState documentState);
    }

    public static Builder builder() {
        return new AutoValue_RestoreDocumentAction.Builder();
    }

    public abstract DocumentState state();
}
