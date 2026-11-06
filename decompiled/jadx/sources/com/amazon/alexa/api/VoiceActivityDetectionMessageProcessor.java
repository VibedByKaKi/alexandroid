package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class VoiceActivityDetectionMessageProcessor extends MessageProcessor<VoiceActivityDetectionMessageType> {
    private static final String TAG = "VoiceActivityDetectionMessageProcessor";
    private final VoiceActivityDetectionListener listener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.VoiceActivityDetectionMessageProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$VoiceActivityDetectionMessageType;

        static {
            int[] iArr = new int[VoiceActivityDetectionMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$VoiceActivityDetectionMessageType = iArr;
            try {
                iArr[VoiceActivityDetectionMessageType.ON_SPEECH_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$VoiceActivityDetectionMessageType[VoiceActivityDetectionMessageType.ON_SILENCE_DETECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$VoiceActivityDetectionMessageType[VoiceActivityDetectionMessageType.ON_VOICE_CHAT_MODE_STATE_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private VoiceActivityDetectionMessageProcessor(VoiceActivityDetectionListener voiceActivityDetectionListener) {
        this.listener = voiceActivityDetectionListener;
    }

    public static VoiceActivityDetectionMessageProcessor create(VoiceActivityDetectionListener voiceActivityDetectionListener) {
        Preconditions.notNull(voiceActivityDetectionListener, "Listener passed for creation is null!");
        return new VoiceActivityDetectionMessageProcessor(voiceActivityDetectionListener);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public VoiceActivityDetectionMessageType getMessageType(Message message) {
        try {
            return VoiceActivityDetectionMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Unrecognized message type", e);
            return VoiceActivityDetectionMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(VoiceActivityDetectionMessageType voiceActivityDetectionMessageType, Bundle bundle, @Nullable Messenger messenger) {
        VoiceChatModeState voiceChatModeState;
        VoiceChatModeChangeReason voiceChatModeChangeReason;
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$VoiceActivityDetectionMessageType[voiceActivityDetectionMessageType.ordinal()];
        if (i == 1) {
            this.listener.onSpeechDetected(Bundles.getLong(bundle, VoiceActivityDetectionArgumentKey.TIMESTAMP), Bundles.getFloat(bundle, VoiceActivityDetectionArgumentKey.CONFIDENCE_LEVEL));
            return;
        }
        if (i == 2) {
            this.listener.onSilenceDetected(Bundles.getLong(bundle, VoiceActivityDetectionArgumentKey.TIMESTAMP), Bundles.getLong(bundle, VoiceActivityDetectionArgumentKey.DURATION));
            return;
        }
        if (i != 3) {
            Log.w(TAG, "Unsupported message " + voiceActivityDetectionMessageType);
            return;
        }
        String string = Bundles.getString(bundle, VoiceActivityDetectionArgumentKey.STATE);
        try {
            voiceChatModeState = VoiceChatModeState.valueOf(string);
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "Unknown VoiceChatModeState: " + string + ", defaulting to INACTIVE", e);
            voiceChatModeState = VoiceChatModeState.INACTIVE;
        }
        try {
            voiceChatModeChangeReason = VoiceChatModeChangeReason.valueOf(Bundles.getString(bundle, VoiceActivityDetectionArgumentKey.REASON));
        } catch (IllegalArgumentException unused) {
            voiceChatModeChangeReason = VoiceChatModeChangeReason.NONE;
        }
        this.listener.onVoiceChatModeStateChanged(voiceChatModeState, voiceChatModeChangeReason);
    }
}
