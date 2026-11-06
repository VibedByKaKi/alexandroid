package com.amazon.alexa.api;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.amazon.alexa.api.messages.MessageProcessor;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.ApiThreadHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaCardListenerMessageProcessor extends MessageProcessor<AlexaCardListenerMessageType> {
    private static final String TAG = "AlexaCardListenerMessageProcessor";
    private final AlexaCardListener cardListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.AlexaCardListenerMessageProcessor$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$AlexaCardListenerMessageType;

        static {
            int[] iArr = new int[AlexaCardListenerMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$AlexaCardListenerMessageType = iArr;
            try {
                iArr[AlexaCardListenerMessageType.ON_RECEIVED_RENDER_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaCardListenerMessageType[AlexaCardListenerMessageType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private AlexaCardListenerMessageProcessor(AlexaCardListener alexaCardListener) {
        this.cardListener = alexaCardListener;
    }

    public static AlexaCardListenerMessageProcessor create(AlexaCardListener alexaCardListener) {
        return new AlexaCardListenerMessageProcessor(alexaCardListener);
    }

    private void handleOnReceivedRenderCard(Bundle bundle) {
        final String string = Bundles.getString(bundle, AlexaCardListenerArgumentKey.CARD_DATA);
        final AlexaCardExtras alexaCardExtras = new AlexaCardExtras(Bundles.getBundle(bundle, AlexaCardListenerArgumentKey.CARD_EXTRAS));
        ApiThreadHelper.runOnUiThread(new Runnable() { // from class: com.amazon.alexa.api.AlexaCardListenerMessageProcessor.1
            @Override // java.lang.Runnable
            public void run() {
                AlexaCardListenerMessageProcessor.this.cardListener.onReceivedRenderCard(string, alexaCardExtras);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public AlexaCardListenerMessageType getMessageType(Message message) {
        AlexaCardListenerMessageType alexaCardListenerMessageType = AlexaCardListenerMessageType.ON_RECEIVED_RENDER_CARD;
        if (alexaCardListenerMessageType.ordinal() == message.what) {
            return alexaCardListenerMessageType;
        }
        Log.e(TAG, "Unrecognized message type");
        return AlexaCardListenerMessageType.UNKNOWN;
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(AlexaCardListenerMessageType alexaCardListenerMessageType, Bundle bundle, @Nullable Messenger messenger) {
        if (AnonymousClass2.$SwitchMap$com$amazon$alexa$api$AlexaCardListenerMessageType[alexaCardListenerMessageType.ordinal()] == 1) {
            handleOnReceivedRenderCard(bundle);
            return;
        }
        Log.w(TAG, "Unsupported message " + alexaCardListenerMessageType);
    }
}
