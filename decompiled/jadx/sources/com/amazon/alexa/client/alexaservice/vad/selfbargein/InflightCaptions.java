package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class InflightCaptions {

    @NonNull
    private final DialogRequestIdentifier drid;

    @NonNull
    private final SpeechToken firstToken;

    @Nullable
    private Long playbackEndedAt;
    private final long playbackStartedAt;
    private int wordCount;

    @NonNull
    private final List<SpeechToken> tokens = new ArrayList();

    @NonNull
    private final StringBuilder concatenated = new StringBuilder();

    public InflightCaptions(@NonNull DialogRequestIdentifier dialogRequestIdentifier, @NonNull SpeechToken speechToken, long j) {
        this.drid = dialogRequestIdentifier;
        this.firstToken = speechToken;
        this.playbackStartedAt = j;
    }

    private static int countWords(@NonNull CharSequence charSequence) {
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!Character.isWhitespace(charSequence.charAt(i2))) {
                z = true;
            } else if (z) {
                i++;
                z = false;
            }
        }
        return z ? i + 1 : i;
    }

    public void appendCaption(@NonNull SpeechToken speechToken, @NonNull String str) {
        this.tokens.add(speechToken);
        if (this.concatenated.length() > 0) {
            this.concatenated.append(' ');
        }
        this.concatenated.append(str);
        this.wordCount = countWords(this.concatenated);
        this.playbackEndedAt = null;
    }

    public boolean containsToken(@NonNull SpeechToken speechToken) {
        return this.tokens.contains(speechToken);
    }

    @NonNull
    public String getConcatenatedCaption() {
        return this.concatenated.toString();
    }

    @NonNull
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.drid;
    }

    @NonNull
    public SpeechToken getFirstToken() {
        return this.firstToken;
    }

    @Nullable
    public Long getPlaybackEndedAt() {
        return this.playbackEndedAt;
    }

    public long getPlaybackStartedAt() {
        return this.playbackStartedAt;
    }

    @NonNull
    public List<SpeechToken> getTokens() {
        return Collections.unmodifiableList(this.tokens);
    }

    public int getWordCount() {
        return this.wordCount;
    }

    public void setPlaybackEndedAt(long j) {
        this.playbackEndedAt = Long.valueOf(j);
    }

    @NonNull
    public SealedCaption toSealedCaption() {
        return SealedCaption.create(this.drid, this.firstToken, this.concatenated.toString(), this.wordCount, this.playbackStartedAt, this.playbackEndedAt);
    }
}
