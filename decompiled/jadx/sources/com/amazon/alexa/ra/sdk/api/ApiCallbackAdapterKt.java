package com.amazon.alexa.ra.sdk.api;

import com.amazon.alexa.api.compat.model.AlexaApiCallbacks;
import com.amazon.alexa.api.compat.model.ApiCallFailure;
import com.amazon.alexa.ra.core.data.api.ApiCallback;
import com.amazon.alexa.ra.core.data.api.ApiFailure;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"toApiFailure", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "toAlexaApiCallbacks", "Lcom/amazon/alexa/api/compat/model/AlexaApiCallbacks;", "Lcom/amazon/alexa/ra/core/data/api/ApiCallback;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ApiCallbackAdapterKt {
    @NotNull
    public static final AlexaApiCallbacks toAlexaApiCallbacks(@NotNull ApiCallback apiCallback) {
        apiCallback.getClass();
        return new ApiCallbackAdapter(apiCallback);
    }

    @NotNull
    public static final ApiFailure toApiFailure(@NotNull ApiCallFailure apiCallFailure) {
        apiCallFailure.getClass();
        if (apiCallFailure instanceof ApiCallFailure.UnknownFailure) {
            return new ApiFailure.UnknownFailure(apiCallFailure.getMessage(), apiCallFailure.getException());
        }
        if (apiCallFailure instanceof ApiCallFailure.TimeoutFailure) {
            return new ApiFailure.TimeoutFailure(apiCallFailure.getMessage(), apiCallFailure.getException());
        }
        if (apiCallFailure instanceof ApiCallFailure.MessagingFailure) {
            return new ApiFailure.MessagingFailure(apiCallFailure.getMessage(), apiCallFailure.getException());
        }
        if (apiCallFailure instanceof ApiCallFailure.InternalFailure) {
            return new ApiFailure.InternalFailure(apiCallFailure.getMessage(), apiCallFailure.getException());
        }
        if (apiCallFailure instanceof ApiCallFailure.NetworkFailure) {
            return new ApiFailure.NetworkFailure(apiCallFailure.getMessage(), apiCallFailure.getException());
        }
        if (apiCallFailure instanceof ApiCallFailure.ServerErrorFailure) {
            return new ApiFailure.ServerErrorFailure(apiCallFailure.getMessage(), apiCallFailure.getException(), ((ApiCallFailure.ServerErrorFailure) apiCallFailure).getHttpErrorCode());
        }
        if (apiCallFailure instanceof ApiCallFailure.AuthorizationFailure) {
            return new ApiFailure.AuthorizationFailure(apiCallFailure.getMessage(), apiCallFailure.getException());
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
