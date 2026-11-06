package com.amazon.alexa.client.alexaservice.dialog.text;

import com.amazon.alexa.api.ResponseType;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class UserPerceivedLatencyTextTrackerProvider {
    @Inject
    public UserPerceivedLatencyTextTrackerProvider() {
    }

    public UserPerceivedLatencyTextTracker create(AlexaClientEventBus alexaClientEventBus, String str, long j, DialogRequestIdentifier dialogRequestIdentifier, String str2, ResponseType responseType, String str3) {
        return new UserPerceivedLatencyTextTracker(alexaClientEventBus, str, j, dialogRequestIdentifier, str2, responseType, str3);
    }

    public EnhancedUserPerceivedLatencyTextTracker createEnhanced(AlexaClientEventBus alexaClientEventBus, String str, long j, DialogRequestIdentifier dialogRequestIdentifier, String str2, ResponseType responseType, String str3) {
        return new EnhancedUserPerceivedLatencyTextTracker(alexaClientEventBus, str, j, dialogRequestIdentifier, str2, responseType, str3);
    }
}
