package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.mosaic.apl.actions.RestoreDocumentAction;
import com.amazon.apl.android.DocumentState;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class AutoValue_RestoreDocumentAction extends RestoreDocumentAction {
    private final DocumentState state;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends RestoreDocumentAction.Builder {
        private DocumentState state;

        @Override // com.amazon.alexa.mosaic.apl.actions.RestoreDocumentAction.Builder
        public RestoreDocumentAction build() {
            DocumentState documentState = this.state;
            if (documentState != null) {
                return new AutoValue_RestoreDocumentAction(documentState, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: state");
            return null;
        }

        @Override // com.amazon.alexa.mosaic.apl.actions.RestoreDocumentAction.Builder
        public RestoreDocumentAction.Builder state(DocumentState documentState) {
            if (documentState != null) {
                this.state = documentState;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null state");
            return null;
        }
    }

    private AutoValue_RestoreDocumentAction(DocumentState documentState) {
        this.state = documentState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RestoreDocumentAction) {
            return this.state.equals(((RestoreDocumentAction) obj).state());
        }
        return false;
    }

    public int hashCode() {
        return this.state.hashCode() ^ 1000003;
    }

    @Override // com.amazon.alexa.mosaic.apl.actions.RestoreDocumentAction
    public DocumentState state() {
        return this.state;
    }

    public String toString() {
        return "RestoreDocumentAction{state=" + this.state + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_RestoreDocumentAction(DocumentState documentState, int i) {
        this(documentState);
    }
}
