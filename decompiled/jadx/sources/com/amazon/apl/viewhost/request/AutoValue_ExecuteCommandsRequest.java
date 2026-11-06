package com.amazon.apl.viewhost.request;

import com.amazon.apl.viewhost.primitives.Decodable;
import com.amazon.apl.viewhost.request.ExecuteCommandsRequest;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ExecuteCommandsRequest extends ExecuteCommandsRequest {
    private final ExecuteCommandsRequest.ExecuteCommandsCallback callback;
    private final Decodable commands;
    private final String token;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ExecuteCommandsRequest.Builder {
        private ExecuteCommandsRequest.ExecuteCommandsCallback callback;
        private Decodable commands;
        private String token;

        @Override // com.amazon.apl.viewhost.request.ExecuteCommandsRequest.Builder
        public ExecuteCommandsRequest build() {
            String str = this.commands == null ? " commands" : "";
            if (str.isEmpty()) {
                return new AutoValue_ExecuteCommandsRequest(this.token, this.commands, this.callback);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.viewhost.request.ExecuteCommandsRequest.Builder
        public ExecuteCommandsRequest.Builder callback(ExecuteCommandsRequest.ExecuteCommandsCallback executeCommandsCallback) {
            this.callback = executeCommandsCallback;
            return this;
        }

        @Override // com.amazon.apl.viewhost.request.ExecuteCommandsRequest.Builder
        public ExecuteCommandsRequest.Builder commands(Decodable decodable) {
            if (decodable != null) {
                this.commands = decodable;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null commands");
            return null;
        }

        @Override // com.amazon.apl.viewhost.request.ExecuteCommandsRequest.Builder
        public ExecuteCommandsRequest.Builder token(String str) {
            this.token = str;
            return this;
        }
    }

    private AutoValue_ExecuteCommandsRequest(@Nullable String str, Decodable decodable, @Nullable ExecuteCommandsRequest.ExecuteCommandsCallback executeCommandsCallback) {
        this.token = str;
        this.commands = decodable;
        this.callback = executeCommandsCallback;
    }

    public boolean equals(Object obj) {
        ExecuteCommandsRequest.ExecuteCommandsCallback executeCommandsCallback;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExecuteCommandsRequest) {
            ExecuteCommandsRequest executeCommandsRequest = (ExecuteCommandsRequest) obj;
            String str = this.token;
            if (str != null ? str.equals(executeCommandsRequest.getToken()) : executeCommandsRequest.getToken() == null) {
                if (this.commands.equals(executeCommandsRequest.getCommands()) && ((executeCommandsCallback = this.callback) != null ? executeCommandsCallback.equals(executeCommandsRequest.getCallback()) : executeCommandsRequest.getCallback() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.amazon.apl.viewhost.request.ExecuteCommandsRequest
    @Nullable
    public ExecuteCommandsRequest.ExecuteCommandsCallback getCallback() {
        return this.callback;
    }

    @Override // com.amazon.apl.viewhost.request.ExecuteCommandsRequest
    public Decodable getCommands() {
        return this.commands;
    }

    @Override // com.amazon.apl.viewhost.request.ExecuteCommandsRequest
    @Nullable
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.commands.hashCode()) * 1000003;
        ExecuteCommandsRequest.ExecuteCommandsCallback executeCommandsCallback = this.callback;
        return hashCode ^ (executeCommandsCallback != null ? executeCommandsCallback.hashCode() : 0);
    }

    public String toString() {
        return "ExecuteCommandsRequest{token=" + this.token + ", commands=" + this.commands + ", callback=" + this.callback + StringSubstitutor.DEFAULT_VAR_END;
    }
}
