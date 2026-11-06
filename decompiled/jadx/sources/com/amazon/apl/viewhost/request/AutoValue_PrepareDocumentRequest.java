package com.amazon.apl.viewhost.request;

import com.amazon.apl.android.DocumentSession;
import com.amazon.apl.viewhost.config.DocumentOptions;
import com.amazon.apl.viewhost.primitives.Decodable;
import com.amazon.apl.viewhost.request.PrepareDocumentRequest;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_PrepareDocumentRequest extends PrepareDocumentRequest {
    private final Decodable data;
    private final Decodable document;
    private final DocumentOptions documentOptions;
    private final DocumentSession documentSession;
    private final String token;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends PrepareDocumentRequest.Builder {
        private Decodable data;
        private Decodable document;
        private DocumentOptions documentOptions;
        private DocumentSession documentSession;
        private String token;

        @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest.Builder
        public PrepareDocumentRequest build() {
            String str = this.document == null ? " document" : "";
            if (this.documentSession == null) {
                str = str.concat(" documentSession");
            }
            if (str.isEmpty()) {
                return new AutoValue_PrepareDocumentRequest(this.token, this.document, this.data, this.documentSession, this.documentOptions);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest.Builder
        public PrepareDocumentRequest.Builder data(Decodable decodable) {
            this.data = decodable;
            return this;
        }

        @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest.Builder
        public PrepareDocumentRequest.Builder document(Decodable decodable) {
            if (decodable != null) {
                this.document = decodable;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null document");
            return null;
        }

        @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest.Builder
        public PrepareDocumentRequest.Builder documentOptions(DocumentOptions documentOptions) {
            this.documentOptions = documentOptions;
            return this;
        }

        @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest.Builder
        public PrepareDocumentRequest.Builder documentSession(DocumentSession documentSession) {
            if (documentSession != null) {
                this.documentSession = documentSession;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null documentSession");
            return null;
        }

        @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest.Builder
        public PrepareDocumentRequest.Builder token(String str) {
            this.token = str;
            return this;
        }
    }

    private AutoValue_PrepareDocumentRequest(@Nullable String str, Decodable decodable, @Nullable Decodable decodable2, DocumentSession documentSession, @Nullable DocumentOptions documentOptions) {
        this.token = str;
        this.document = decodable;
        this.data = decodable2;
        this.documentSession = documentSession;
        this.documentOptions = documentOptions;
    }

    public boolean equals(Object obj) {
        Decodable decodable;
        DocumentOptions documentOptions;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrepareDocumentRequest) {
            PrepareDocumentRequest prepareDocumentRequest = (PrepareDocumentRequest) obj;
            String str = this.token;
            if (str != null ? str.equals(prepareDocumentRequest.getToken()) : prepareDocumentRequest.getToken() == null) {
                if (this.document.equals(prepareDocumentRequest.getDocument()) && ((decodable = this.data) != null ? decodable.equals(prepareDocumentRequest.getData()) : prepareDocumentRequest.getData() == null) && this.documentSession.equals(prepareDocumentRequest.getDocumentSession()) && ((documentOptions = this.documentOptions) != null ? documentOptions.equals(prepareDocumentRequest.getDocumentOptions()) : prepareDocumentRequest.getDocumentOptions() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest
    @Nullable
    public Decodable getData() {
        return this.data;
    }

    @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest
    public Decodable getDocument() {
        return this.document;
    }

    @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest
    @Nullable
    public DocumentOptions getDocumentOptions() {
        return this.documentOptions;
    }

    @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest
    public DocumentSession getDocumentSession() {
        return this.documentSession;
    }

    @Override // com.amazon.apl.viewhost.request.PrepareDocumentRequest
    @Nullable
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.document.hashCode()) * 1000003;
        Decodable decodable = this.data;
        int hashCode2 = (((hashCode ^ (decodable == null ? 0 : decodable.hashCode())) * 1000003) ^ this.documentSession.hashCode()) * 1000003;
        DocumentOptions documentOptions = this.documentOptions;
        return hashCode2 ^ (documentOptions != null ? documentOptions.hashCode() : 0);
    }

    public String toString() {
        return "PrepareDocumentRequest{token=" + this.token + ", document=" + this.document + ", data=" + this.data + ", documentSession=" + this.documentSession + ", documentOptions=" + this.documentOptions + StringSubstitutor.DEFAULT_VAR_END;
    }
}
