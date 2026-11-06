package com.amazon.apl.viewhost.request;

import com.amazon.apl.viewhost.request.FinishDocumentRequest;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_FinishDocumentRequest extends FinishDocumentRequest {
    private final String token;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends FinishDocumentRequest.Builder {
        private String token;

        @Override // com.amazon.apl.viewhost.request.FinishDocumentRequest.Builder
        public FinishDocumentRequest build() {
            return new AutoValue_FinishDocumentRequest(this.token);
        }

        @Override // com.amazon.apl.viewhost.request.FinishDocumentRequest.Builder
        public FinishDocumentRequest.Builder token(String str) {
            this.token = str;
            return this;
        }
    }

    private AutoValue_FinishDocumentRequest(@Nullable String str) {
        this.token = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FinishDocumentRequest)) {
            return false;
        }
        FinishDocumentRequest finishDocumentRequest = (FinishDocumentRequest) obj;
        String str = this.token;
        return str == null ? finishDocumentRequest.getToken() == null : str.equals(finishDocumentRequest.getToken());
    }

    @Override // com.amazon.apl.viewhost.request.FinishDocumentRequest
    @Nullable
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("FinishDocumentRequest{token="), this.token, StringSubstitutor.DEFAULT_VAR_END);
    }
}
