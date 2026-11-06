package com.amazon.alexa.handsfree.uservoicerecognition.foxtrot.callback;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.fva.IResultCallback;
import com.amazon.alexa.handsfree.foxtrot.FoxtrotAPIConstants;
import com.amazon.alexa.handsfree.foxtrot.FoxtrotAPIDefaultValues;
import com.amazon.alexa.handsfree.protocols.callback.CallbackErrorMetadata;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FoxtrotResultCallback extends IResultCallback.Stub {

    @VisibleForTesting
    static final String ERROR_MESSAGE_FORMAT = "Error %d: %s.";

    @VisibleForTesting
    static final String ERROR_RESULT_KEY_MESSAGE = "Result key missing";
    private static final String TAG = "FoxtrotResultCallback";

    @VisibleForTesting
    static final String UNSUPPORTED_RESULT_KEY_MESSAGE = "Unsupported key";
    private final ResultCallback mResultCallback;
    private final String mResultKey;

    public FoxtrotResultCallback(@NonNull ResultCallback resultCallback, @NonNull String str) {
        this.mResultCallback = resultCallback;
        this.mResultKey = str;
    }

    private void sendResult(@NonNull Bundle bundle) {
        String str = TAG;
        Log.d(str, "Attempting to deserialize Bundle: " + bundle.toString());
        boolean containsKey = bundle.containsKey(this.mResultKey);
        String str2 = this.mResultKey;
        if (!containsKey) {
            Log.e(str, "onResult: Bundle doesn't contain callback result with key: " + str2);
            this.mResultCallback.onError(new CallbackErrorMetadata(FoxtrotAPIDefaultValues.RESULT_CALLBACK_DEFAULT_ERROR_CODE.intValue(), ERROR_RESULT_KEY_MESSAGE));
            return;
        }
        boolean equals = FoxtrotAPIConstants.UVR_ENROLLMENT_QUALITY_SCORE.equals(str2);
        String str3 = this.mResultKey;
        if (equals) {
            this.mResultCallback.onResult(Double.valueOf(bundle.getInt(str3, FoxtrotAPIDefaultValues.UVR_INVALID_QUALITY_SCORE.intValue())));
        } else {
            Log.e(str, "onResult: Unsupported key: " + str3);
            this.mResultCallback.onError(new CallbackErrorMetadata(FoxtrotAPIDefaultValues.RESULT_CALLBACK_DEFAULT_ERROR_CODE.intValue(), UNSUPPORTED_RESULT_KEY_MESSAGE));
        }
    }

    @Override // com.amazon.alexa.fva.IResultCallback
    public void onFailure(@NonNull Bundle bundle) {
        String string = bundle.getString(FoxtrotAPIConstants.RESULT_CALLBACK_ERROR_MESSAGE, FoxtrotAPIDefaultValues.RESULT_CALLBACK_DEFAULT_ERROR_MESSAGE);
        int i = bundle.getInt(FoxtrotAPIConstants.RESULT_CALLBACK_ERROR_CODE, FoxtrotAPIDefaultValues.RESULT_CALLBACK_DEFAULT_ERROR_CODE.intValue());
        Log.d(TAG, "Callback called with Failure state.");
        ResultCallback resultCallback = this.mResultCallback;
        if (string != null) {
            resultCallback.onError(new CallbackErrorMetadata(i, string));
        } else {
            resultCallback.onError(new CallbackErrorMetadata(i));
        }
    }

    @Override // com.amazon.alexa.fva.IResultCallback
    public void onSuccess(@NonNull Bundle bundle) {
        sendResult(bundle);
    }
}
