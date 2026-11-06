package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class SealedCaption {
    public static SealedCaption create(@NonNull DialogRequestIdentifier dialogRequestIdentifier, @NonNull SpeechToken speechToken, @NonNull String str, int i, long j, @Nullable Long l) {
        return new AutoValue_SealedCaption(dialogRequestIdentifier, speechToken, str, i, j, l);
    }

    @NonNull
    public abstract String getConcatenatedCaption();

    @NonNull
    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    @NonNull
    public abstract SpeechToken getFirstToken();

    @Nullable
    public abstract Long getPlaybackEndedAt();

    public abstract long getPlaybackStartedAt();

    public abstract int getWordCount();
}
