package com.amazon.alexa.sharing.api.exceptions;

import androidx.annotation.NonNull;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaSharingResponseParseException extends AlexaSharingException {
    static final String TYPE = "ResponseParseException";

    @NonNull
    final String endpointKey;

    @NonNull
    final String requestId;

    @NonNull
    final String type;

    public AlexaSharingResponseParseException(@NonNull BridgeError bridgeError, @NonNull String str, @NonNull String str2) {
        super(bridgeError.message(), bridgeError.code());
        this.endpointKey = str;
        this.requestId = str2;
        this.type = TYPE;
    }

    @NonNull
    public String getEndpointKey() {
        return this.endpointKey;
    }

    @Override // com.amazon.alexa.sharing.api.exceptions.AlexaSharingException
    public HashMap<String, String> getMetadata() {
        HashMap<String, String> m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("type", TYPE);
        m.put("message", getErrorMessage());
        m.put("code", getCode());
        m.put("endpointKey", getEndpointKey());
        m.put("requestId", getRequestId());
        return m;
    }

    @NonNull
    public String getRequestId() {
        return this.requestId;
    }

    public AlexaSharingResponseParseException(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        super(str, str2);
        this.endpointKey = str3;
        this.requestId = str4;
        this.type = TYPE;
    }
}
