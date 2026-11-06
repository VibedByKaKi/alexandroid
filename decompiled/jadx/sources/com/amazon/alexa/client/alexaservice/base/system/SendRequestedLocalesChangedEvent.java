package com.amazon.alexa.client.alexaservice.base.system;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.ApiCallMetadata;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class SendRequestedLocalesChangedEvent extends Event.NotGated {
    private final ApiCallMetadata apiCallMetadata;
    private final SendMessageCallback callback;
    private final List<Locale> locales;

    private SendRequestedLocalesChangedEvent(List<Locale> list, SendMessageCallback sendMessageCallback, ApiCallMetadata apiCallMetadata) {
        this.locales = ErrorUtils$$ExternalSyntheticOutline0.m(list);
        this.callback = sendMessageCallback;
        this.apiCallMetadata = apiCallMetadata;
    }

    public static SendRequestedLocalesChangedEvent create(List<Locale> list, SendMessageCallback sendMessageCallback, ApiCallMetadata apiCallMetadata) {
        return new SendRequestedLocalesChangedEvent(list, sendMessageCallback, apiCallMetadata);
    }

    public ApiCallMetadata getApiCallMetadata() {
        return this.apiCallMetadata;
    }

    public SendMessageCallback getCallback() {
        return this.callback;
    }

    public List<Locale> getLocales() {
        return this.locales;
    }
}
