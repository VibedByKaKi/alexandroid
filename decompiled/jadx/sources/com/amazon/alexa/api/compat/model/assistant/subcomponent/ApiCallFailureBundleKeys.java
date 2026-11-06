package com.amazon.alexa.api.compat.model.assistant.subcomponent;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/api/compat/model/assistant/subcomponent/ApiCallFailureBundleKeys;", "", "<init>", "()V", "FAILURE_TYPE", "", "MESSAGE", CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, "HTTP_ERROR_CODE", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ApiCallFailureBundleKeys {
    public static final int $stable = 0;

    @NotNull
    public static final String EXCEPTION_MESSAGE = "exceptionMessage";

    @NotNull
    public static final String FAILURE_TYPE = "failureType";

    @NotNull
    public static final String HTTP_ERROR_CODE = "httpErrorCode";

    @NotNull
    public static final ApiCallFailureBundleKeys INSTANCE = new ApiCallFailureBundleKeys();

    @NotNull
    public static final String MESSAGE = "message";

    private ApiCallFailureBundleKeys() {
    }
}
