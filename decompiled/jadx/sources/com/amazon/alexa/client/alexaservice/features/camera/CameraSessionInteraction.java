package com.amazon.alexa.client.alexaservice.features.camera;

import com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction;
import com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata;
import com.amazon.alexa.client.alexaservice.base.interactions.InteractionInterfaceName;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.ChannelType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CameraSessionInteraction extends AudioInteraction {
    public static final AudioMetadata AUTO_CAPTURE_AUDIO_METADATA;
    public static final ChannelType CHANNEL_TYPE;
    private static final InteractionInterfaceName INTERFACE_NAME = InteractionInterfaceName.create("Alexa.Camera.CameraSessionInteraction");
    private static final String TAG = "CameraSessionInteraction";
    public static final AudioMetadata VIDEO_AUDIO_METADATA;
    private final Runnable onStopCallback;

    static {
        AudioMetadata.AudioFocusStream audioFocusStream = AudioMetadata.AudioFocusStream.MUSIC;
        AudioMetadata.AudioFocusDuration audioFocusDuration = AudioMetadata.AudioFocusDuration.TRANSIENT_MAY_DUCK;
        AudioMetadata.AudioUsage audioUsage = AudioMetadata.AudioUsage.MEDIA;
        AudioMetadata.AudioContentType audioContentType = AudioMetadata.AudioContentType.SPEECH;
        VIDEO_AUDIO_METADATA = AudioMetadata.create(audioFocusStream, audioFocusDuration, audioUsage, audioContentType, false);
        AUTO_CAPTURE_AUDIO_METADATA = AudioMetadata.create(audioFocusStream, audioFocusDuration, audioUsage, audioContentType, false);
        CHANNEL_TYPE = ChannelType.COMMUNICATIONS;
    }

    public CameraSessionInteraction(Runnable runnable) {
        this.onStopCallback = runnable;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.Interaction
    public InteractionInterfaceName getInterfaceName() {
        return INTERFACE_NAME;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.Interaction
    public void onStop() {
        this.onStopCallback.run();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction
    public boolean survivesAudioFocusLoss() {
        return true;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction
    public void onBackground() {
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction
    public void onForeground() {
    }

    @Override // com.amazon.alexa.client.alexaservice.base.interactions.AudioInteraction
    public void onPause() {
    }
}
