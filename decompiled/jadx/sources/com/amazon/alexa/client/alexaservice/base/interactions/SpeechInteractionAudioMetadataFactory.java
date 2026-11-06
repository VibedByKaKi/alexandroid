package com.amazon.alexa.client.alexaservice.base.interactions;

import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.VoiceChatModeState;
import com.amazon.alexa.client.alexaservice.VoiceActivityDetectionAuthority;
import com.amazon.alexa.client.alexaservice.base.interactions.AudioMetadata;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.ChannelType;
import com.amazon.alexa.client.alexaservice.base.interactions.events.ChannelUpdatedEvent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.VoiceChatModeStateChangedEvent;
import com.amazon.alexa.client.alexaservice.vad.VoiceChatAudioFlow;
import com.amazon.alexa.client.alexaservice.vad.VoiceChatAudioFlowResolver;
import com.amazon.alexa.utils.device.FireTabletUtils;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SpeechInteractionAudioMetadataFactory {
    private static final int ANDROID_17_SDK_VERSION = 37;
    private static final AudioMetadata ASSISTANT_AUDIO_METADATA;
    private static final AudioMetadata COMMUNICATIONS_AUDIO_METADATA;
    private static final AudioMetadata DEFAULT_AUDIO_METADATA;
    private static final AudioMetadata NO_AUDIOFOCUS_METADATA;
    private static final String TAG = "SpeechAudioMetadata";
    private static final AudioMetadata VOICE_CHAT_MODE_AUDIO_METADATA;

    @Nullable
    private final VoiceChatAudioFlowResolver audioFlowResolver;
    private AudioMetadata currentAudioMetadata;
    private boolean inAppVoiceChatActive;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class CommunicationsMonitor {
        public CommunicationsMonitor() {
        }

        @Subscribe
        public void on(ChannelUpdatedEvent channelUpdatedEvent) {
            if (ChannelType.COMMUNICATIONS == channelUpdatedEvent.getChannelType()) {
                boolean isActive = channelUpdatedEvent.isActive();
                SpeechInteractionAudioMetadataFactory speechInteractionAudioMetadataFactory = SpeechInteractionAudioMetadataFactory.this;
                if (isActive) {
                    speechInteractionAudioMetadataFactory.setCurrentAudioMetadata(SpeechInteractionAudioMetadataFactory.COMMUNICATIONS_AUDIO_METADATA);
                } else {
                    speechInteractionAudioMetadataFactory.setCurrentAudioMetadata(SpeechInteractionAudioMetadataFactory.DEFAULT_AUDIO_METADATA);
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class VoiceChatModeMonitor {
        public VoiceChatModeMonitor() {
        }

        @Subscribe
        public void on(VoiceChatModeStateChangedEvent voiceChatModeStateChangedEvent) {
            VoiceChatModeState state = voiceChatModeStateChangedEvent.getState();
            boolean z = SpeechInteractionAudioMetadataFactory.this.inAppVoiceChatActive;
            SpeechInteractionAudioMetadataFactory.this.inAppVoiceChatActive = voiceChatModeStateChangedEvent.getSource() == VoiceActivityDetectionAuthority.Source.APP && (state == VoiceChatModeState.ACTIVE || state == VoiceChatModeState.MUTED);
            if (z != SpeechInteractionAudioMetadataFactory.this.inAppVoiceChatActive) {
                boolean unused = SpeechInteractionAudioMetadataFactory.this.inAppVoiceChatActive;
                boolean unused2 = SpeechInteractionAudioMetadataFactory.this.inAppVoiceChatActive;
            }
        }
    }

    static {
        AudioMetadata.AudioFocusStream audioFocusStream = AudioMetadata.AudioFocusStream.MUSIC;
        AudioMetadata.AudioFocusDuration audioFocusDuration = AudioMetadata.AudioFocusDuration.TRANSIENT_EXCLUSIVE;
        AudioMetadata.AudioUsage audioUsage = AudioMetadata.AudioUsage.MEDIA;
        AudioMetadata.AudioContentType audioContentType = AudioMetadata.AudioContentType.MUSIC;
        DEFAULT_AUDIO_METADATA = AudioMetadata.create(audioFocusStream, audioFocusDuration, audioUsage, audioContentType);
        AudioMetadata.AudioUsage audioUsage2 = AudioMetadata.AudioUsage.ASSISTANT;
        AudioMetadata.AudioContentType audioContentType2 = AudioMetadata.AudioContentType.SPEECH;
        ASSISTANT_AUDIO_METADATA = AudioMetadata.create(audioFocusStream, audioFocusDuration, audioUsage2, audioContentType2);
        AudioMetadata.AudioFocusDuration audioFocusDuration2 = AudioMetadata.AudioFocusDuration.NO_AUDIOFOCUS;
        COMMUNICATIONS_AUDIO_METADATA = AudioMetadata.create(audioFocusStream, audioFocusDuration2, audioUsage, audioContentType);
        VOICE_CHAT_MODE_AUDIO_METADATA = AudioMetadata.create(AudioMetadata.AudioFocusStream.VOICE_CALL, audioFocusDuration, AudioMetadata.AudioUsage.VOICE, audioContentType2);
        NO_AUDIOFOCUS_METADATA = AudioMetadata.create(audioFocusStream, audioFocusDuration2);
    }

    @Inject
    public SpeechInteractionAudioMetadataFactory(AlexaClientEventBus alexaClientEventBus, VoiceChatAudioFlowResolver voiceChatAudioFlowResolver) {
        this.audioFlowResolver = voiceChatAudioFlowResolver;
        alexaClientEventBus.register(new CommunicationsMonitor());
        alexaClientEventBus.register(new VoiceChatModeMonitor());
        setCurrentAudioMetadata(DEFAULT_AUDIO_METADATA);
    }

    public static AudioMetadata audioMetadataForVoiceChatModeHold(VoiceChatAudioFlow voiceChatAudioFlow) {
        AudioMetadata audioMetadata = voiceChatAudioFlow == VoiceChatAudioFlow.PREFER_AUDIO_MODE_NORMAL ? DEFAULT_AUDIO_METADATA : VOICE_CHAT_MODE_AUDIO_METADATA;
        return AudioMetadata.create(audioMetadata.getStream(), AudioMetadata.AudioFocusDuration.TRANSIENT_EXCLUSIVE, audioMetadata.getAudioUsage(), audioMetadata.getAudioContentType(), false);
    }

    private boolean isCommunicationsInactive() {
        return DEFAULT_AUDIO_METADATA.equals(this.currentAudioMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentAudioMetadata(AudioMetadata audioMetadata) {
        this.currentAudioMetadata = audioMetadata;
    }

    public AudioMetadata createAudioMetadataForSpeech(boolean z) {
        if (z) {
            return NO_AUDIOFOCUS_METADATA;
        }
        if (!this.inAppVoiceChatActive) {
            return (isAssistantStreamSupported() && isCommunicationsInactive()) ? ASSISTANT_AUDIO_METADATA : this.currentAudioMetadata;
        }
        VoiceChatAudioFlowResolver voiceChatAudioFlowResolver = this.audioFlowResolver;
        return (voiceChatAudioFlowResolver == null || voiceChatAudioFlowResolver.resolveFlow() != VoiceChatAudioFlow.PREFER_AUDIO_MODE_NORMAL) ? VOICE_CHAT_MODE_AUDIO_METADATA : this.currentAudioMetadata;
    }

    @VisibleForTesting
    public boolean isAssistantStreamSupported() {
        return FireTabletUtils.isKHTablet() && Build.VERSION.SDK_INT >= 37;
    }

    public SpeechInteractionAudioMetadataFactory(AlexaClientEventBus alexaClientEventBus) {
        this(alexaClientEventBus, null);
    }

    public AudioMetadata createAudioMetadataForSpeech() {
        return createAudioMetadataForSpeech(false);
    }
}
