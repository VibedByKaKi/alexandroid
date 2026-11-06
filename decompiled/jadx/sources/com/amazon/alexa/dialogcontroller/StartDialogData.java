package com.amazon.alexa.dialogcontroller;

import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaAudioMetadata;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.api.AlexaDialogExtras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class StartDialogData {
    private final AlexaAudioMetadata alexaAudioMetadata;
    private final AlexaAudioSink audioSink;
    private final AlexaDialogExtras dialogExtras;

    public StartDialogData(AlexaDialogExtras alexaDialogExtras, @Nullable AlexaAudioSink alexaAudioSink, AlexaAudioMetadata alexaAudioMetadata) {
        this.dialogExtras = alexaDialogExtras;
        this.audioSink = alexaAudioSink;
        this.alexaAudioMetadata = alexaAudioMetadata;
    }

    public AlexaAudioMetadata getAlexaAudioMetadata() {
        return this.alexaAudioMetadata;
    }

    @Nullable
    public AlexaAudioSink getAudioSink() {
        return this.audioSink;
    }

    public AlexaDialogExtras getDialogExtras() {
        return this.dialogExtras;
    }
}
