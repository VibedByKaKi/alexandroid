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
class ResultCallbacksMessageProcessor extends MessageProcessor<ResultCallbackMessageType> {
    private static final String TAG = "ResultCallbacksMessageProcessor";
    private final ResultCallbacks resultCallbacks;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.api.ResultCallbacksMessageProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$ResultCallbackMessageType;

        static {
            int[] iArr = new int[ResultCallbackMessageType.values().length];
            $SwitchMap$com$amazon$alexa$api$ResultCallbackMessageType = iArr;
            try {
                iArr[ResultCallbackMessageType.ON_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$ResultCallbackMessageType[ResultCallbackMessageType.ON_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ResultCallbacksMessageProcessor(ResultCallbacks resultCallbacks) {
        this.resultCallbacks = resultCallbacks;
    }

    public static ResultCallbacksMessageProcessor create(ResultCallbacks resultCallbacks) {
        Preconditions.notNull(resultCallbacks, "null implementation!");
        return new ResultCallbacksMessageProcessor(resultCallbacks);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public ResultCallbackMessageType getMessageType(Message message) {
        try {
            return ResultCallbackMessageType.fromOrdinal(message.what);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Unrecognized message type", e);
            return ResultCallbackMessageType.UNKNOWN;
        }
    }

    @Override // com.amazon.alexa.api.messages.MessageProcessor
    public void processMessage(ResultCallbackMessageType resultCallbackMessageType, Bundle bundle, @Nullable Messenger messenger) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$ResultCallbackMessageType[resultCallbackMessageType.ordinal()];
        if (i == 1) {
            this.resultCallbacks.onSuccess();
            return;
        }
        if (i == 2) {
            this.resultCallbacks.onFailure(Bundles.getString(bundle, ResultCallbacksArgumentKey.FAILURE_MESSAGE));
        } else {
            Log.w(TAG, "Unsupported message " + resultCallbackMessageType);
        }
    }
}
