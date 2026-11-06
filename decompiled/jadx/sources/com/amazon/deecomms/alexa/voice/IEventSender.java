package com.amazon.deecomms.alexa.voice;

import com.amazon.alexa.api.compat.model.AlexaApiCallbacks;
import com.amazon.alexa.api.compat.model.AlexaEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IEventSender {
    void sendEvent(AlexaEvent alexaEvent);

    void sendEvent(AlexaEvent alexaEvent, boolean z);

    void sendEvent(AlexaEvent alexaEvent, boolean z, AlexaApiCallbacks alexaApiCallbacks);
}
