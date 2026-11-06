package com.amazon.alexa.client.alexaservice.base.interactions;

import android.media.AudioAttributes;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.android.exoplayer2.audio.AudioAttributes;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AudioAttributesProvider {
    private final SpecialCaseOverrideAuthority specialCaseOverrideAuthority;

    @Inject
    public AudioAttributesProvider(SpecialCaseOverrideAuthority specialCaseOverrideAuthority) {
        this.specialCaseOverrideAuthority = specialCaseOverrideAuthority;
    }

    @VisibleForTesting
    public AudioAttributes provideAndroidAudioAttributes(AudioMetadata audioMetadata, DialogRequestIdentifier dialogRequestIdentifier) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        if (this.specialCaseOverrideAuthority.requiresSco(dialogRequestIdentifier)) {
            builder.setUsage(2);
            builder.setContentType(1);
        } else {
            builder.setUsage(audioMetadata.getAudioUsage().getValue());
            builder.setContentType(audioMetadata.getAudioContentType().getValue());
        }
        return builder.build();
    }

    public AudioAttributesPair provideAudioAttributesPair(AudioMetadata audioMetadata, DialogRequestIdentifier dialogRequestIdentifier) {
        return new AudioAttributesPair(provideExoPlayerAttributes(audioMetadata, dialogRequestIdentifier), provideAndroidAudioAttributes(audioMetadata, dialogRequestIdentifier));
    }

    @VisibleForTesting
    public com.google.android.exoplayer2.audio.AudioAttributes provideExoPlayerAttributes(AudioMetadata audioMetadata, DialogRequestIdentifier dialogRequestIdentifier) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        if (this.specialCaseOverrideAuthority.requiresSco(dialogRequestIdentifier)) {
            builder.setUsage(2);
            builder.setContentType(1);
        } else {
            builder.setUsage(audioMetadata.getAudioUsage().getValue());
            builder.setContentType(audioMetadata.getAudioContentType().getValue());
        }
        return builder.build();
    }

    public static android.media.AudioAttributes provideAndroidAudioAttributes(AudioMetadata audioMetadata) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(audioMetadata.getAudioUsage().getValue());
        builder.setContentType(audioMetadata.getAudioContentType().getValue());
        return builder.build();
    }
}
