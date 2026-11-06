package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AttentionSystemSettingsMessageProcessor extends MessageProcessor<AlexaAttentionSystemSettingsMessageType> {
    private static final String TAG = "AlexaReadinessMessageProcessor";
    private final AlexaAttentionSystemSettingsListener alexaAttentionSystemSettingsListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.AttentionSystemSettingsMessageProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$AlexaAttentionSystemSettingsMessageType;

        static {
            int[] iArr = new int[AlexaAttentionSystemSettingsMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$AlexaAttentionSystemSettingsMessageType = iArr;
            try {
                iArr[AlexaAttentionSystemSettingsMessageType.ON_WAKE_SOUND_ENABLED_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaAttentionSystemSettingsMessageType[AlexaAttentionSystemSettingsMessageType.ON_ENDPOINT_SOUND_ENABLED_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AttentionSystemSettingsMessageProcessor(AlexaAttentionSystemSettingsListener alexaAttentionSystemSettingsListener) {
        this.alexaAttentionSystemSettingsListener = alexaAttentionSystemSettingsListener;
    }

    public static AttentionSystemSettingsMessageProcessor create(AlexaAttentionSystemSettingsListener alexaAttentionSystemSettingsListener) {
        return new AttentionSystemSettingsMessageProcessor(alexaAttentionSystemSettingsListener);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public AlexaAttentionSystemSettingsMessageType getMessageType(Message message) {
        try {
            return AlexaAttentionSystemSettingsMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Unrecognized message type", e);
            return AlexaAttentionSystemSettingsMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(AlexaAttentionSystemSettingsMessageType alexaAttentionSystemSettingsMessageType, Bundle bundle, @Nullable Messenger messenger) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$AlexaAttentionSystemSettingsMessageType[alexaAttentionSystemSettingsMessageType.ordinal()];
        if (i == 1) {
            this.alexaAttentionSystemSettingsListener.onWakeSoundEnabledChanged(Bundles.getBoolean(bundle, AlexaServicesArgumentKey.IS_WAKE_SOUND_ENABLED));
            return;
        }
        if (i == 2) {
            this.alexaAttentionSystemSettingsListener.onEndpointSoundEnabledChanged(Bundles.getBoolean(bundle, AlexaServicesArgumentKey.IS_ENDPOINT_SOUND_ENABLED));
            return;
        }
        Log.w(TAG, "Unsupported message " + alexaAttentionSystemSettingsMessageType);
    }
}
