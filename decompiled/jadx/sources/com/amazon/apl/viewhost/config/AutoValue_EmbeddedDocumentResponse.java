package com.amazon.apl.viewhost.config;

import com.amazon.apl.viewhost.PreparedDocument;
import com.amazon.apl.viewhost.config.EmbeddedDocumentResponse;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_EmbeddedDocumentResponse extends EmbeddedDocumentResponse {
    private final PreparedDocument preparedDocument;
    private final boolean visualContextAttached;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends EmbeddedDocumentResponse.Builder {
        private PreparedDocument preparedDocument;
        private Boolean visualContextAttached;

        @Override // com.amazon.apl.viewhost.config.EmbeddedDocumentResponse.Builder
        public EmbeddedDocumentResponse build() {
            String str = this.preparedDocument == null ? " preparedDocument" : "";
            if (this.visualContextAttached == null) {
                str = str.concat(" visualContextAttached");
            }
            if (str.isEmpty()) {
                return new AutoValue_EmbeddedDocumentResponse(this.preparedDocument, this.visualContextAttached.booleanValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.viewhost.config.EmbeddedDocumentResponse.Builder
        public EmbeddedDocumentResponse.Builder preparedDocument(PreparedDocument preparedDocument) {
            if (preparedDocument != null) {
                this.preparedDocument = preparedDocument;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null preparedDocument");
            return null;
        }

        @Override // com.amazon.apl.viewhost.config.EmbeddedDocumentResponse.Builder
        public EmbeddedDocumentResponse.Builder visualContextAttached(boolean z) {
            this.visualContextAttached = Boolean.valueOf(z);
            return this;
        }
    }

    private AutoValue_EmbeddedDocumentResponse(PreparedDocument preparedDocument, boolean z) {
        this.preparedDocument = preparedDocument;
        this.visualContextAttached = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EmbeddedDocumentResponse) {
            EmbeddedDocumentResponse embeddedDocumentResponse = (EmbeddedDocumentResponse) obj;
            if (this.preparedDocument.equals(embeddedDocumentResponse.getPreparedDocument()) && this.visualContextAttached == embeddedDocumentResponse.isVisualContextAttached()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.viewhost.config.EmbeddedDocumentResponse
    public PreparedDocument getPreparedDocument() {
        return this.preparedDocument;
    }

    public int hashCode() {
        return (this.visualContextAttached ? 1231 : 1237) ^ ((this.preparedDocument.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.apl.viewhost.config.EmbeddedDocumentResponse
    public boolean isVisualContextAttached() {
        return this.visualContextAttached;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EmbeddedDocumentResponse{preparedDocument=");
        sb.append(this.preparedDocument);
        sb.append(", visualContextAttached=");
        return a$$ExternalSyntheticOutline0.m(sb, this.visualContextAttached, StringSubstitutor.DEFAULT_VAR_END);
    }
}
