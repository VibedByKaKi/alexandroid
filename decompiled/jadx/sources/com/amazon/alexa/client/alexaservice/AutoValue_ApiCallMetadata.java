package com.amazon.alexa.client.alexaservice;

import com.amazon.alexa.api.ApiName;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ApiCallMetadata extends ApiCallMetadata {
    private final ApiCallIdentifier apiCallIdentifier;
    private final ApiName apiName;

    public AutoValue_ApiCallMetadata(ApiCallIdentifier apiCallIdentifier, ApiName apiName) {
        if (apiCallIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null apiCallIdentifier");
            throw null;
        }
        this.apiCallIdentifier = apiCallIdentifier;
        if (apiName != null) {
            this.apiName = apiName;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null apiName");
            throw null;
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.ApiCallMetadata
    public ApiCallIdentifier getApiCallIdentifier() {
        return this.apiCallIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.ApiCallMetadata
    public ApiName getApiName() {
        return this.apiName;
    }

    public String toString() {
        return "ApiCallMetadata{apiCallIdentifier=" + this.apiCallIdentifier + ", apiName=" + this.apiName + StringSubstitutor.DEFAULT_VAR_END;
    }
}
