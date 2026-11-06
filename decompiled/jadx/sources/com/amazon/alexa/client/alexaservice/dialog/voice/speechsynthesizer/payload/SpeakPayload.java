package com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.payload;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.PlayPayload;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.payload.AutoValue_SpeakPayload;
import com.amazon.alexa.client.core.messages.Payload;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class SpeakPayload implements Payload {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Format {
        AUDIO_MPEG
    }

    public static SpeakPayload create(Uri uri, SpeechToken speechToken, Format format, @Nullable String str, @Nullable String str2) {
        return new AutoValue_SpeakPayload(uri, speechToken, format, str != null ? CaptionData.create(str) : null, null, str2);
    }

    public static TypeAdapter<SpeakPayload> typeAdapter(Gson gson) {
        return new AutoValue_SpeakPayload.GsonTypeAdapter(gson);
    }

    @Nullable
    public abstract CaptionData getCaption();

    public abstract Format getFormat();

    @Nullable
    public abstract PlayPayload.PlayBehavior getPlayBehavior();

    @Nullable
    public abstract String getSsml();

    public abstract SpeechToken getToken();

    public abstract Uri getUrl();
}
