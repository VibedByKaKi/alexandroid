package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.payload.CaptionData;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class SpeakDirectiveReceivedEvent extends Event.NotGated {
    public static SpeakDirectiveReceivedEvent create(DialogRequestIdentifier dialogRequestIdentifier, SpeechToken speechToken, @Nullable CaptionData captionData) {
        return new AutoValue_SpeakDirectiveReceivedEvent(dialogRequestIdentifier, speechToken, captionData);
    }

    @Nullable
    public abstract CaptionData getCaption();

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract SpeechToken getToken();
}
