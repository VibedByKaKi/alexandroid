package com.amazon.apl.viewhost.internal;

import androidx.annotation.NonNull;
import com.amazon.apl.viewhost.DocumentHandle;
import com.amazon.apl.viewhost.internal.SavedDocument;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_SavedDocument extends SavedDocument {
    private final DocumentHandle documentHandle;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends SavedDocument.Builder {
        private DocumentHandle documentHandle;

        @Override // com.amazon.apl.viewhost.internal.SavedDocument.Builder
        public SavedDocument build() {
            String str = this.documentHandle == null ? " documentHandle" : "";
            if (str.isEmpty()) {
                return new AutoValue_SavedDocument(this.documentHandle);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.viewhost.internal.SavedDocument.Builder
        public SavedDocument.Builder documentHandle(DocumentHandle documentHandle) {
            if (documentHandle != null) {
                this.documentHandle = documentHandle;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null documentHandle");
            return null;
        }
    }

    private AutoValue_SavedDocument(DocumentHandle documentHandle) {
        this.documentHandle = documentHandle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SavedDocument) {
            return this.documentHandle.equals(((SavedDocument) obj).getDocumentHandle());
        }
        return false;
    }

    @Override // com.amazon.apl.viewhost.internal.SavedDocument
    @NonNull
    public DocumentHandle getDocumentHandle() {
        return this.documentHandle;
    }

    public int hashCode() {
        return this.documentHandle.hashCode() ^ 1000003;
    }

    public String toString() {
        return "SavedDocument{documentHandle=" + this.documentHandle + StringSubstitutor.DEFAULT_VAR_END;
    }
}
