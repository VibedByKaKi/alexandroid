package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client;

import com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.model.ClassifyIntentResult;
import com.amazon.identity.auth.device.api.MAPActorManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentClientCallback;", "", "onTurnStarted", "", "onInputClosing", "reason", "", "onResult", "result", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/model/ClassifyIntentResult;", "onError", "code", "message", MAPActorManager.KEY_RETRYABLE, "", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ClassifyIntentClientCallback {
    void onError(@NotNull String code, @NotNull String message, boolean retryable);

    void onInputClosing(@Nullable String reason);

    void onResult(@NotNull ClassifyIntentResult result);

    void onTurnStarted();
}
