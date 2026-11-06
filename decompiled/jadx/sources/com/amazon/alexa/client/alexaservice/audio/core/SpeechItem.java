package com.amazon.alexa.client.alexaservice.audio.core;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.Stream;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SpeechItem extends PlayItem {
    private final String caption;
    private final DialogRequestIdentifier dialogRequestIdentifier;
    private final boolean isInterruptStatusEnabled;

    private SpeechItem(SpeechToken speechToken, Uri uri, @Nullable DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str, boolean z) {
        super(speechToken, uri, 0L, Long.MAX_VALUE, null, null, Stream.InterruptedBehavior.PAUSE, null, false, false);
        this.dialogRequestIdentifier = dialogRequestIdentifier;
        this.caption = str;
        this.isInterruptStatusEnabled = z;
    }

    public static SpeechItem create(SpeechToken speechToken, Uri uri, @Nullable DialogRequestIdentifier dialogRequestIdentifier, @Nullable String str, boolean z) {
        return new SpeechItem(speechToken, uri, dialogRequestIdentifier, str, z);
    }

    @Nullable
    public String getCaption() {
        return this.caption;
    }

    @Nullable
    public DialogRequestIdentifier getDialogRequestIdentifier() {
        return this.dialogRequestIdentifier;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.PlayItem
    public SpeechToken getToken() {
        return (SpeechToken) super.getToken();
    }

    public boolean isInterruptStatusEnabled() {
        return this.isInterruptStatusEnabled;
    }

    @VisibleForTesting
    public static SpeechItem create(SpeechToken speechToken, Uri uri) {
        return create(speechToken, uri, null, null, false);
    }
}
