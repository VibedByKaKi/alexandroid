package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.AlexaAudioSource;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.AlexaDataSource;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentIdentifier;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentStore;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class DialogTurnDataProvider {
    @Inject
    public DialogTurnDataProvider() {
    }

    public DialogTurnData create(AttachmentStore attachmentStore, AlexaAudioSource alexaAudioSource) {
        return new VoiceDialogTurnData(attachmentStore, alexaAudioSource);
    }

    public DialogTurnData createPreVerified(AttachmentStore attachmentStore, AttachmentIdentifier attachmentIdentifier) {
        return new VoiceDialogTurnData(attachmentStore, attachmentIdentifier);
    }

    public DialogTurnData createPreVerifiedWithExtraData(AttachmentStore attachmentStore, AttachmentIdentifier attachmentIdentifier, @Nullable AttachmentIdentifier attachmentIdentifier2) {
        return new VoiceDialogTurnData(attachmentStore, attachmentIdentifier, attachmentIdentifier2);
    }

    public DialogTurnData createText(String str) {
        return new TextDialogTurnData(str);
    }

    public DialogTurnData createWithExtraData(AttachmentStore attachmentStore, AlexaAudioSource alexaAudioSource, @NonNull AlexaDataSource alexaDataSource) {
        return new VoiceDialogTurnData(attachmentStore, alexaAudioSource, alexaDataSource);
    }
}
