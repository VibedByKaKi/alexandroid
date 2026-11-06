package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaAudioPlaybackStatusListenerProcessor extends MessageProcessor<AlexaAudioPlaybackStatusListenerMessageType> {
    private static final String TAG = "AlexaAudioPlaybackStatusListenerProcessor";
    private final AlexaAudioPlaybackStatusListener alexaAudioPlaybackStatusListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.AlexaAudioPlaybackStatusListenerProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$AlexaAudioPlaybackStatusListenerMessageType;

        static {
            int[] iArr = new int[AlexaAudioPlaybackStatusListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$AlexaAudioPlaybackStatusListenerMessageType = iArr;
            try {
                iArr[AlexaAudioPlaybackStatusListenerMessageType.AUDIO_PLAYBACK_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public AlexaAudioPlaybackStatusListenerProcessor(AlexaAudioPlaybackStatusListener alexaAudioPlaybackStatusListener) {
        this.alexaAudioPlaybackStatusListener = alexaAudioPlaybackStatusListener;
    }

    public static AlexaAudioPlaybackStatusListenerProcessor create(AlexaAudioPlaybackStatusListener alexaAudioPlaybackStatusListener) {
        return new AlexaAudioPlaybackStatusListenerProcessor(alexaAudioPlaybackStatusListener);
    }

    private void processAudioPlaybackStatus(Bundle bundle) {
        this.alexaAudioPlaybackStatusListener.onAudioPlaybackStatusChanged((HashMap) Bundles.getOptionalSerializable(bundle, AlexaAudioPlaybackStatusListenerArgumentKey.AUDIO_PLAYBACK_STATUS_KEY, HashMap.class));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public AlexaAudioPlaybackStatusListenerMessageType getMessageType(Message message) {
        try {
            return AlexaAudioPlaybackStatusListenerMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException unused) {
            return AlexaAudioPlaybackStatusListenerMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(AlexaAudioPlaybackStatusListenerMessageType alexaAudioPlaybackStatusListenerMessageType, Bundle bundle, Messenger messenger) {
        if (AnonymousClass1.$SwitchMap$com$amazon$alexa$api$AlexaAudioPlaybackStatusListenerMessageType[alexaAudioPlaybackStatusListenerMessageType.ordinal()] == 1) {
            processAudioPlaybackStatus(bundle);
            return;
        }
        Log.w(TAG, "Unsupported message: " + alexaAudioPlaybackStatusListenerMessageType);
    }
}
