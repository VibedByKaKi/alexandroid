package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.ApiCallMetadata;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.networking.adapters.MessageCallbackAdapter;
import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback;
import com.google.auto.value.AutoValue;
import okhttp3.Response;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ResponseReceivedEvent extends Event.NotGated {
    @VisibleForTesting
    public static ResponseReceivedEvent create(Response response, ResponseInfo responseInfo, ApiCallMetadata apiCallMetadata, @Nullable SendMessageCallback sendMessageCallback) {
        if (sendMessageCallback == null) {
            sendMessageCallback = MessageCallbackAdapter.getInstance();
        }
        return new AutoValue_ResponseReceivedEvent(responseInfo, response, apiCallMetadata, sendMessageCallback);
    }

    public static ResponseReceivedEvent createDownchannelResponse(Response response, ResponseInfo responseInfo) {
        return create(response, responseInfo, ApiCallMetadata.NONE, null);
    }

    public static ResponseReceivedEvent createEventResponse(Response response, ApiCallMetadata apiCallMetadata, boolean z, @Nullable SendMessageCallback sendMessageCallback) {
        return create(response, ResponseInfo.create(false, z), apiCallMetadata, sendMessageCallback);
    }

    public abstract ApiCallMetadata getApiCallMetadata();

    public abstract Response getResponse();

    public abstract ResponseInfo getResponseInfo();

    public abstract SendMessageCallback getSendMessageCallback();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ResponseInfo {
        public static ResponseInfo create(boolean z) {
            return create(z, false);
        }

        public abstract boolean isAsynchronousResponse();

        public abstract boolean isGuaranteedDelivery();

        public static ResponseInfo create(boolean z, boolean z2) {
            return new AutoValue_ResponseReceivedEvent_ResponseInfo(z, z2);
        }
    }
}
