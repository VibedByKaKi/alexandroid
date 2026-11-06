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
class AlexaApiCallbacksMessageProcessor extends MessageProcessor<AlexaApiCallbacksMessageType> {
    private static final String TAG = "AlexaApiCallbacksMessageProcessor";
    private final AlexaApiCallbacks callbacks;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.AlexaApiCallbacksMessageProcessor$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$AlexaApiCallbacksMessageType;

        static {
            int[] iArr = new int[AlexaApiCallbacksMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$AlexaApiCallbacksMessageType = iArr;
            try {
                iArr[AlexaApiCallbacksMessageType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaApiCallbacksMessageType[AlexaApiCallbacksMessageType.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaApiCallbacksMessageType[AlexaApiCallbacksMessageType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private AlexaApiCallbacksMessageProcessor(AlexaApiCallbacks alexaApiCallbacks) {
        this.callbacks = alexaApiCallbacks;
    }

    public static AlexaApiCallbacksMessageProcessor create(AlexaApiCallbacks alexaApiCallbacks) {
        return new AlexaApiCallbacksMessageProcessor(alexaApiCallbacks);
    }

    private void handleFailure(Bundle bundle) {
        final ApiCallFailure createFromBundle = ApiCallFailure.createFromBundle(Bundles.getOptionalBundle(bundle, AlexaApiCallbacksArgumentKey.API_CALL_FAILURE));
        ApiThreadHelper.runOnUiThread(new Runnable() { // from class: com.amazon.alexa.api.AlexaApiCallbacksMessageProcessor.2
            @Override // java.lang.Runnable
            public void run() {
                AlexaApiCallbacksMessageProcessor.this.callbacks.doOnFailure(createFromBundle);
            }
        });
    }

    private void handleSuccess(Bundle bundle) {
        ApiThreadHelper.runOnUiThread(new Runnable() { // from class: com.amazon.alexa.api.AlexaApiCallbacksMessageProcessor.1
            @Override // java.lang.Runnable
            public void run() {
                AlexaApiCallbacksMessageProcessor.this.callbacks.doOnSuccess();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public AlexaApiCallbacksMessageType getMessageType(Message message) {
        try {
            return AlexaApiCallbacksMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException unused) {
            Log.e(TAG, "Unrecognized message type");
            return AlexaApiCallbacksMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(AlexaApiCallbacksMessageType alexaApiCallbacksMessageType, Bundle bundle, @Nullable Messenger messenger) {
        int i = AnonymousClass3.$SwitchMap$com$amazon$alexa$api$AlexaApiCallbacksMessageType[alexaApiCallbacksMessageType.ordinal()];
        if (i == 1) {
            handleSuccess(bundle);
            return;
        }
        if (i == 2) {
            handleFailure(bundle);
            return;
        }
        Log.w(TAG, "Unsupported message " + alexaApiCallbacksMessageType);
    }
}
