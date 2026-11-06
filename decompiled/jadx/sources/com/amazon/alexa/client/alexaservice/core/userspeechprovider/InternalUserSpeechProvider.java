package com.amazon.alexa.client.alexaservice.core.userspeechprovider;

import com.amazon.alexa.api.AlexaDialogExtras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface InternalUserSpeechProvider extends UserSpeechProvider {
    void clearAlexaDialogExtras();

    void setAlexaDialogExtras(AlexaDialogExtras alexaDialogExtras);
}
