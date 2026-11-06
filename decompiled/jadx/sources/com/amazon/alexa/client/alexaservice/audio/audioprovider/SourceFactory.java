package com.amazon.alexa.client.alexaservice.audio.audioprovider;

import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.api.AlexaDataSink;
import com.amazon.alexa.api.AudioFormat;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SourceFactory {
    @Inject
    public SourceFactory() {
    }

    public AlexaAudioSource createAlexaAudioSource(AlexaAudioSink alexaAudioSink) {
        return new AlexaAudioSource(alexaAudioSink, AudioFormat.AUDIO_L16_RATE_16000_CHANNELS_1.name());
    }

    public AlexaDataSource createAlexaDataSource(AlexaDataSink alexaDataSink) {
        return new AlexaDataSource(alexaDataSink);
    }

    public AlexaAudioSource createAlexaAudioSource(AlexaAudioSink alexaAudioSink, String str) {
        return new AlexaAudioSource(alexaAudioSink, str);
    }
}
