package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_SealedCaption extends SealedCaption {
    private final String concatenatedCaption;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final SpeechToken firstToken;
    private final Long playbackEndedAt;
    private final long playbackStartedAt;
    private final int wordCount;

    public AutoValue_SealedCaption(DialogRequestIdentifier dialogRequestIdentifier, SpeechToken speechToken, String str, int i, long j, @Nullable Long l) {
        if (dialogRequestIdentifier == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null dialogRequestIdentifier");
            throw null;
        }
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        if (speechToken == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null firstToken");
            throw null;
        }
        this.firstToken = speechToken;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null concatenatedCaption");
            throw null;
        }
        this.concatenatedCaption = str;
        this.wordCount = i;
        this.playbackStartedAt = j;
        this.playbackEndedAt = l;
    }

    public boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SealedCaption) {
            SealedCaption sealedCaption = (SealedCaption) obj;
            if (this.dialogRequestIdentifier.equals(sealedCaption.getDialogRequestIdentifier()) && this.firstToken.equals(sealedCaption.getFirstToken()) && this.concatenatedCaption.equals(sealedCaption.getConcatenatedCaption()) && this.wordCount == sealedCaption.getWordCount() && this.playbackStartedAt == sealedCaption.getPlaybackStartedAt() && ((l = this.playbackEndedAt) != null ? l.equals(sealedCaption.getPlaybackEndedAt()) : sealedCaption.getPlaybackEndedAt() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.selfbargein.SealedCaption
    @NonNull
    public String getConcatenatedCaption() {
        return this.concatenatedCaption;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.selfbargein.SealedCaption
    @NonNull
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.selfbargein.SealedCaption
    @NonNull
    public SpeechToken getFirstToken() {
        return this.firstToken;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.selfbargein.SealedCaption
    @Nullable
    public Long getPlaybackEndedAt() {
        return this.playbackEndedAt;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.selfbargein.SealedCaption
    public long getPlaybackStartedAt() {
        return this.playbackStartedAt;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.selfbargein.SealedCaption
    public int getWordCount() {
        return this.wordCount;
    }

    public int hashCode() {
        int hashCode = (((((((this.dialogRequestIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.firstToken.hashCode()) * 1000003) ^ this.concatenatedCaption.hashCode()) * 1000003) ^ this.wordCount) * 1000003;
        long j = this.playbackStartedAt;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.playbackEndedAt;
        return (l == null ? 0 : l.hashCode()) ^ i;
    }

    public String toString() {
        return "SealedCaption{dialogRequestIdentifier=" + this.dialogRequestIdentifier + ", firstToken=" + this.firstToken + ", concatenatedCaption=" + this.concatenatedCaption + ", wordCount=" + this.wordCount + ", playbackStartedAt=" + this.playbackStartedAt + ", playbackEndedAt=" + this.playbackEndedAt + StringSubstitutor.DEFAULT_VAR_END;
    }
}
