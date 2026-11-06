package com.amazon.alexa.client.alexaservice;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.ApiName;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ApiCallMetadata {
    public static final ApiCallMetadata NONE = create(ApiCallIdentifier.NONE, ApiName.NONE);

    public static ApiCallMetadata create(ApiCallIdentifier apiCallIdentifier, ApiName apiName) {
        return new AutoValue_ApiCallMetadata(apiCallIdentifier, apiName);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ApiCallMetadata) {
            return getApiCallIdentifier().equals(((ApiCallMetadata) obj).getApiCallIdentifier());
        }
        return false;
    }

    public abstract ApiCallIdentifier getApiCallIdentifier();

    public abstract ApiName getApiName();

    public int hashCode() {
        return getApiCallIdentifier().hashCode();
    }

    public boolean isEmpty() {
        return getApiCallIdentifier() == null || getApiName() == null;
    }
}
