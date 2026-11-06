package com.amazon.apl.android.primitive;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.android.primitive.UrlRequests;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_UrlRequests_UrlRequest extends UrlRequests.UrlRequest {
    private final Map<String, String> headers;
    private final String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends UrlRequests.UrlRequest.Builder {
        private Map<String, String> headers;
        private String url;

        @Override // com.amazon.apl.android.primitive.UrlRequests.UrlRequest.Builder
        public UrlRequests.UrlRequest build() {
            String str = this.url == null ? " url" : "";
            if (this.headers == null) {
                str = str.concat(" headers");
            }
            if (str.isEmpty()) {
                return new AutoValue_UrlRequests_UrlRequest(this.url, this.headers);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.primitive.UrlRequests.UrlRequest.Builder
        public UrlRequests.UrlRequest.Builder headers(Map<String, String> map) {
            if (map != null) {
                this.headers = map;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null headers");
            return null;
        }

        @Override // com.amazon.apl.android.primitive.UrlRequests.UrlRequest.Builder
        public UrlRequests.UrlRequest.Builder url(String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null url");
            return null;
        }
    }

    private AutoValue_UrlRequests_UrlRequest(String str, Map<String, String> map) {
        this.url = str;
        this.headers = map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UrlRequests.UrlRequest) {
            UrlRequests.UrlRequest urlRequest = (UrlRequests.UrlRequest) obj;
            if (this.url.equals(urlRequest.url()) && this.headers.equals(urlRequest.headers())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.headers.hashCode() ^ ((this.url.hashCode() ^ 1000003) * 1000003);
    }

    @Override // com.amazon.apl.android.primitive.UrlRequests.UrlRequest
    public Map<String, String> headers() {
        return this.headers;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UrlRequest{url=");
        sb.append(this.url);
        sb.append(", headers=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.headers, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.apl.android.primitive.UrlRequests.UrlRequest
    public String url() {
        return this.url;
    }
}
