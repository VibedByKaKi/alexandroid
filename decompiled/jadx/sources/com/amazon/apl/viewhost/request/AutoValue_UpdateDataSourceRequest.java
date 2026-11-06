package com.amazon.apl.viewhost.request;

import androidx.annotation.NonNull;
import com.amazon.apl.viewhost.primitives.Decodable;
import com.amazon.apl.viewhost.request.UpdateDataSourceRequest;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_UpdateDataSourceRequest extends UpdateDataSourceRequest {
    private final UpdateDataSourceRequest.UpdateDataSourceCallback callback;
    private final Decodable data;
    private final String token;
    private final String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends UpdateDataSourceRequest.Builder {
        private UpdateDataSourceRequest.UpdateDataSourceCallback callback;
        private Decodable data;
        private String token;
        private String type;

        @Override // com.amazon.apl.viewhost.request.UpdateDataSourceRequest.Builder
        public UpdateDataSourceRequest build() {
            String str = this.data == null ? " data" : "";
            if (str.isEmpty()) {
                return new AutoValue_UpdateDataSourceRequest(this.token, this.type, this.data, this.callback);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.viewhost.request.UpdateDataSourceRequest.Builder
        public UpdateDataSourceRequest.Builder callback(UpdateDataSourceRequest.UpdateDataSourceCallback updateDataSourceCallback) {
            this.callback = updateDataSourceCallback;
            return this;
        }

        @Override // com.amazon.apl.viewhost.request.UpdateDataSourceRequest.Builder
        public UpdateDataSourceRequest.Builder data(Decodable decodable) {
            if (decodable != null) {
                this.data = decodable;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null data");
            return null;
        }

        @Override // com.amazon.apl.viewhost.request.UpdateDataSourceRequest.Builder
        public UpdateDataSourceRequest.Builder token(String str) {
            this.token = str;
            return this;
        }

        @Override // com.amazon.apl.viewhost.request.UpdateDataSourceRequest.Builder
        public UpdateDataSourceRequest.Builder type(String str) {
            this.type = str;
            return this;
        }
    }

    private AutoValue_UpdateDataSourceRequest(@Nullable String str, @Nullable String str2, Decodable decodable, @Nullable UpdateDataSourceRequest.UpdateDataSourceCallback updateDataSourceCallback) {
        this.token = str;
        this.type = str2;
        this.data = decodable;
        this.callback = updateDataSourceCallback;
    }

    public boolean equals(Object obj) {
        UpdateDataSourceRequest.UpdateDataSourceCallback updateDataSourceCallback;
        if (obj == this) {
            return true;
        }
        if (obj instanceof UpdateDataSourceRequest) {
            UpdateDataSourceRequest updateDataSourceRequest = (UpdateDataSourceRequest) obj;
            String str = this.token;
            if (str != null ? str.equals(updateDataSourceRequest.getToken()) : updateDataSourceRequest.getToken() == null) {
                String str2 = this.type;
                if (str2 != null ? str2.equals(updateDataSourceRequest.getType()) : updateDataSourceRequest.getType() == null) {
                    if (this.data.equals(updateDataSourceRequest.getData()) && ((updateDataSourceCallback = this.callback) != null ? updateDataSourceCallback.equals(updateDataSourceRequest.getCallback()) : updateDataSourceRequest.getCallback() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.apl.viewhost.request.UpdateDataSourceRequest
    @Nullable
    public UpdateDataSourceRequest.UpdateDataSourceCallback getCallback() {
        return this.callback;
    }

    @Override // com.amazon.apl.viewhost.request.UpdateDataSourceRequest
    @NonNull
    public Decodable getData() {
        return this.data;
    }

    @Override // com.amazon.apl.viewhost.request.UpdateDataSourceRequest
    @Nullable
    public String getToken() {
        return this.token;
    }

    @Override // com.amazon.apl.viewhost.request.UpdateDataSourceRequest
    @Nullable
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.type;
        int hashCode2 = (((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.data.hashCode()) * 1000003;
        UpdateDataSourceRequest.UpdateDataSourceCallback updateDataSourceCallback = this.callback;
        return hashCode2 ^ (updateDataSourceCallback != null ? updateDataSourceCallback.hashCode() : 0);
    }

    public String toString() {
        return "UpdateDataSourceRequest{token=" + this.token + ", type=" + this.type + ", data=" + this.data + ", callback=" + this.callback + StringSubstitutor.DEFAULT_VAR_END;
    }
}
