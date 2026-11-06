package com.amazon.alexa.sharing.api.exceptions;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.commsnetworking.api.INetworkResponse;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AlexaSharingNetworkException extends AlexaSharingException {
    static final String TYPE = "NetworkException";

    @NonNull
    final String endpointKey;

    @NonNull
    final String requestId;

    @Nullable
    final transient INetworkResponse response;

    @NonNull
    final String responseCode;

    @Nullable
    final String responseId;

    @NonNull
    final String type;

    public AlexaSharingNetworkException(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull INetworkResponse iNetworkResponse) {
        super(str, str2);
        this.endpointKey = str3;
        this.requestId = iNetworkResponse.getAmazonRequestID();
        this.responseId = iNetworkResponse.getAmazonRID();
        this.response = iNetworkResponse;
        this.responseCode = Integer.toString(iNetworkResponse.getStatusCode());
        this.type = "NetworkException";
    }

    @NonNull
    public String getEndpointKey() {
        return this.endpointKey;
    }

    @Override // com.amazon.alexa.sharing.api.exceptions.AlexaSharingException
    public HashMap<String, String> getMetadata() {
        HashMap<String, String> m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("type", "NetworkException");
        m.put("message", getErrorMessage());
        m.put("code", getCode());
        m.put("endpointKey", getEndpointKey());
        m.put("requestId", getRequestId());
        m.put("responseId", getResponseId());
        m.put("responseCode", getResponseCode());
        return m;
    }

    @NonNull
    public String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public INetworkResponse getResponse() {
        return this.response;
    }

    @Nullable
    public String getResponseCode() {
        return this.responseCode;
    }

    @Nullable
    public String getResponseId() {
        return this.responseId;
    }
}
