package com.amazon.alexa.ra.sdk.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaApiCallbacks;
import com.amazon.alexa.api.compat.model.ApiCallFailure;
import com.amazon.alexa.ra.core.data.api.ApiCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/ra/sdk/api/ApiCallbackAdapter;", "Lcom/amazon/alexa/api/compat/model/AlexaApiCallbacks;", "apiCallback", "Lcom/amazon/alexa/ra/core/data/api/ApiCallback;", "<init>", "(Lcom/amazon/alexa/ra/core/data/api/ApiCallback;)V", "apiCallbackId", "", "getApiCallbackId", "()Ljava/lang/String;", "onSuccess", "", "onFailure", "apiCallFailure", "Lcom/amazon/alexa/api/compat/model/ApiCallFailure;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ApiCallbackAdapter extends AlexaApiCallbacks {
    public static final int $stable = 8;

    @NotNull
    private final ApiCallback apiCallback;

    @NotNull
    private final String apiCallbackId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiCallbackAdapter(@NotNull ApiCallback apiCallback) {
        super(apiCallback.getTimeoutValue(), apiCallback.getTimeoutUnit());
        apiCallback.getClass();
        this.apiCallback = apiCallback;
        this.apiCallbackId = apiCallback.getId();
    }

    @NotNull
    public final String getApiCallbackId() {
        return this.apiCallbackId;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaApiCallbacks
    public void onFailure(@Nullable ApiCallFailure apiCallFailure) {
        super.onFailure(apiCallFailure);
        this.apiCallback.onFailure(apiCallFailure != null ? ApiCallbackAdapterKt.toApiFailure(apiCallFailure) : null);
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaApiCallbacks
    public void onSuccess() {
        super.onSuccess();
        this.apiCallback.onSuccess();
    }
}
