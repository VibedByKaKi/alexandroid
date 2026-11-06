package com.amazon.alexa.handsfree.uservoicerecognition.foxtrot.callback;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.fva.IResultCallback;
import com.amazon.alexa.handsfree.foxtrot.FoxtrotAPIConstants;
import com.amazon.alexa.handsfree.foxtrot.FoxtrotAPIDefaultValues;
import com.amazon.alexa.handsfree.protocols.callback.CallbackErrorMetadata;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FoxtrotResponseCallback extends IResultCallback.Stub {

    @VisibleForTesting
    static final String ERROR_MESSAGE_FORMAT = "Error %d: %s.";
    private static final String SERVICE_NOT_CONNECTED = "%s: %s not connected";
    private static final String TAG = "FoxtrotResponseCallback";
    private final ResponseCallback mResponseCallback;

    public FoxtrotResponseCallback(@NonNull ResponseCallback responseCallback) {
        this.mResponseCallback = responseCallback;
    }

    @Override // com.amazon.alexa.fva.IResultCallback
    public void onFailure(@NonNull Bundle bundle) {
        String string = bundle.getString(FoxtrotAPIConstants.RESULT_CALLBACK_ERROR_MESSAGE, FoxtrotAPIDefaultValues.RESULT_CALLBACK_DEFAULT_ERROR_MESSAGE);
        int i = bundle.getInt(FoxtrotAPIConstants.RESULT_CALLBACK_ERROR_CODE, FoxtrotAPIDefaultValues.RESULT_CALLBACK_DEFAULT_ERROR_CODE.intValue());
        Log.d(TAG, "Callback called with Failure state.");
        ResponseCallback responseCallback = this.mResponseCallback;
        if (string != null) {
            responseCallback.onError(new CallbackErrorMetadata(i, string));
        } else {
            responseCallback.onError(new CallbackErrorMetadata(i));
        }
    }

    public void onServiceNotConnected(@NonNull String str, @NonNull String str2) {
        Log.e(TAG, TableInfo$$ExternalSyntheticOutline0.m$1(str, ": ", str2, " not connected"));
        this.mResponseCallback.onError(new CallbackErrorMetadata());
    }

    @Override // com.amazon.alexa.fva.IResultCallback
    public void onSuccess(@NonNull Bundle bundle) {
        Log.d(TAG, "Callback called with Success state.");
        this.mResponseCallback.onSuccess();
    }
}
